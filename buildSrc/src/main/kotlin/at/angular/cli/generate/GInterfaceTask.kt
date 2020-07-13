package at.angular.cli.generate

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

// todo other options
@Suppress("UnstableApiUsage")
open class GInterfaceTask : GenerateTask() {

    @set:Option(
        option = "prefix", description = """
          A prefix to apply to generated selectors.
          Default:
        """
    )
    @get:Input
    var prefix = ""

    @TaskAction
    override fun generate() {

    }
}