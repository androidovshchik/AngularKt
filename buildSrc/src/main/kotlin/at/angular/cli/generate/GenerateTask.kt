package at.angular.cli.generate

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

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

    protected fun readTemplate(name: String): String {
        return javaClass.getResourceAsStream(name).reader().use { it.readText() }
    }
}