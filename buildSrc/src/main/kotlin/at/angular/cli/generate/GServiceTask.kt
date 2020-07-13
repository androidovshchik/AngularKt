package at.angular.cli.generate

import org.gradle.api.tasks.Input
import org.gradle.api.tasks.options.Option
import java.io.File

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

    init {
        description = "Creates a new, generic service definition in the given or default project."
    }

    override fun generate() {
        val code = readTemplate("name.service.txt")
            .replace("NameService", "${className?.capitalize()}Service")
        if (flat.toBoolean()) {
            File(appDir, "a").writeText(readTemplate("name.service.txt"))
        } else {

        }
        println("group ${readTemplate("/name.service.txt")}")
    }
}