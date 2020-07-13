package at.angular.plugin.generate

import org.gradle.api.tasks.TaskAction

// todo other options
@Suppress("UnstableApiUsage")
open class GServiceTask : GenerateTask() {

    @TaskAction
    override fun generate() {
        //log.info("Starting jar2npm")
    }
}