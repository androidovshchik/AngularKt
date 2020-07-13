package at.angular.cli.generate

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

/**
 * @see: https://angular.io/cli/generate
 */
abstract class GenerateTask : DefaultTask() {

    abstract var className: String?

    init {
        group = project.property("group").toString()
        description = "Generates and/or modifies files based on a schematic."
    }

    @TaskAction
    open fun generate() {
    }

    protected val appDir: File
        get() = File(project.projectDir, "src/app").apply { mkdir() }

    val fileName: String?
        get() = className?.split("[/.\\\\]".toRegex())?.lastOrNull()?.decapitalize()

    val packages: List<String>
        get() = className?.split("[/.\\\\]".toRegex())?.dropLast(1).orEmpty()

    protected fun readTemplate(name: String): String {
        return javaClass.getResourceAsStream("/$name").reader().use { it.readText() }
    }
}