package at.angular.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class AngularKtPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            // todo other copies of cli tasks
            tasks.register("generate", GenerateTask::class.java)
            tasks.register("g", GenerateTask::class.java)
        }
    }
}
