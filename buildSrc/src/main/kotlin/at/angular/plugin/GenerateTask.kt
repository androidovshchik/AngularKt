package at.angular.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.Input
import org.gradle.api.tasks.TaskAction
import org.gradle.api.tasks.options.Option

@Suppress("UnstableApiUsage")
open class GenerateTask : DefaultTask() {

    //private val log = LoggerFactory.getLogger(this::class.java)!!

    @set:Option(
        option = "selector", description = """
          The HTML selector to use for this component
        """
    )
    @get:Input
    var selector: String? = null

    @set:Option(
        option = "inlineTemplate", description = """
          When true, includes template inline in the component.kt file. By default, an external template file is created and referenced in the component.kt file.
          Default: false
          Aliases: -t
        """
    )
    @get:Input
    var inlineTemplate = false

    @set:Option(
        option = "inlineStyle", description = """
          When true, includes styles inline in the component.kt file. Only CSS styles can be included inline. By default, an external styles file is created and referenced in the component.kt file.
          Default: false
          Aliases: -s
        """
    )
    @get:Input
    var inlineStyle = false

    @set:Option(
        option = "style", description = """
          The file extension or preprocessor to use for style files.
          Default: css
        """
    )
    @get:Input
    var style = "css"

    init {
        group = "node"
        description = "Attach Kotlin JAR files to node_modules"
    }

    @TaskAction
    fun jar2npm() {
        //log.info("Starting jar2npm")
        println("inlineStyle $inlineStyle")
    }
}