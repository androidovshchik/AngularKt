package at.angular.cli.generate

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction
import java.io.File

abstract class GenerateTask : DefaultTask() {

    abstract var className: String?

    val srcDir: File
        get() = File(project.projectDir, "src").apply { mkdir() }

    init {
        group = "node"
        description = "Generates and/or modifies files based on a schematic."
    }

    @TaskAction
    open fun generate() {
    }
}