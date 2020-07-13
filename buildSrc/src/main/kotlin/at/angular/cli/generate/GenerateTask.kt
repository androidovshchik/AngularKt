package at.angular.cli.generate

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * @see: https://angular.io/cli/generate
 */
abstract class GenerateTask : DefaultTask() {

    protected abstract var className: String

    init {
        group = project.property("group").toString()
        description = "Generates and/or modifies files based on a schematic."
    }

    private val classParts: List<String>
        get() = className.split("[\\\\/]".toRegex())

    private val filePath: String
        get() = classParts.dropLast(1).joinToString("/")

    protected val fileName: String?
        get() = classParts.lastOrNull()?.decapitalize()

    @TaskAction
    open fun generate() {
    }

    protected fun getClassDir(flat: Boolean): File {
        return File(project.projectDir, "src/app/${if (flat) "" else filePath}").apply { mkdir() }
    }

    protected fun readTemplate(name: String): String {
        return javaClass.getResourceAsStream("/$name").reader().use { it.readText() }
    }
}