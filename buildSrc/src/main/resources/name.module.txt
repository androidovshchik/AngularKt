import at.angular.common.CommonModule
import at.angular.lib.NgModule
import at.angular.lib.NgModuleKt

@NgModule
class Module {

    companion object : NgModuleKt(
        declarations = emptyArray(),
        imports = arrayOf(
            CommonModule::class.js
        )
    )
}