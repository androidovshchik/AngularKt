package at.angular.cli.generate

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

open class GenerateTask : DefaultTask() {

    //private val log = LoggerFactory.getLogger(this::class.java)!!

    init {
        group = "node"
        description = "Attach Kotlin JAR files to node_modules"
    }

    @TaskAction
    open fun generate() {
        //log.info("Starting jar2npm")
        println("inlineStyle 1")
    }
}