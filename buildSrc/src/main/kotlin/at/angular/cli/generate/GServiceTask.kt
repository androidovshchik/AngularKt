package at.angular.cli.generate

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

/**
 * @see: https://angular.io/cli/generate#service
 */
// todo other options
@Suppress("UnstableApiUsage")
open class GServiceTask : GenerateTask() {

    @set:Option(
        option = "name", description = """
          The name of the service.
        """
    )
    @get:Input
    override var className: String? = null

    @set:Option(
        option = "flat", description = """
          When true (the default), creates files at the top level of the project.
          Default: true
        """
    )
    @get:Input
    var flat = "true"

    @TaskAction
    override fun generate() {
        println("className $className")
    }
}