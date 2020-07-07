package at.angular.compiler

import com.google.auto.service.AutoService
import de.jensklingenberg.mpapt.common.MpAptProject
import org.jetbrains.kotlin.codegen.extensions.ClassBuilderInterceptorExtension
import org.jetbrains.kotlin.com.intellij.mock.MockProject
import org.jetbrains.kotlin.compiler.plugin.ComponentRegistrar
import org.jetbrains.kotlin.config.CompilerConfiguration
import org.jetbrains.kotlin.extensions.StorageComponentContainerContributor
import org.jetbrains.kotlin.js.translate.extensions.JsSyntheticTranslateExtension

@AutoService(ComponentRegistrar::class)
class CommonComponentRegistrar : ComponentRegistrar {

    override fun registerProjectComponents(
        project: MockProject,
        configuration: CompilerConfiguration
    ) {
        val processor = AngularKtProcessor()
        val mpApt = MpAptProject(processor, configuration)
        StorageComponentContainerContributor.registerExtension(project, mpApt)
        ClassBuilderInterceptorExtension.registerExtension(project, mpApt)
        JsSyntheticTranslateExtension.registerExtension(project, mpApt)
    }
}
