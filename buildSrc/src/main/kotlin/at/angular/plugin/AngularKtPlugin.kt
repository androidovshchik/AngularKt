package at.angular.plugin

import at.angular.plugin.generate.GComponentTask
import at.angular.plugin.generate.GenerateTask
import org.gradle.api.InvalidUserDataException
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task

class AngularKtPlugin : Plugin<Project> {

    override fun apply(project: Project) {
        with(project) {
            // todo other cli tasks
            registerTask<GenerateTask>("generate", "g")
            registerTask<GComponentTask>("component")
        }
    }

    private inline fun <reified T : Task> Project.registerTask(vararg names: String) {
        names.forEach {
            try {
                tasks.register(it, T::class.java)
            } catch (e: InvalidUserDataException) {
                e.printStackTrace()
            }
        }
    }
}
