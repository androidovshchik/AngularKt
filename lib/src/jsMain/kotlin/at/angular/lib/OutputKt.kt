package at.angular.lib

import at.angular.core.NgModule

object OutputKt {

    fun <T : Any> create(ngModule: NgModule): JsClass<out T> {
        return NgModule(
            OutputKt(
                providers = providers,
                declarations = declarations,
                imports = imports,
                exports = exports,
                entryComponents = entryComponents,
                bootstrap = bootstrap
            )
        ).Class(ClassDefinition(type))
    }
}