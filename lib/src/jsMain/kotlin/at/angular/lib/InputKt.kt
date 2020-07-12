package at.angular.lib

import at.angular.core.NgModule

object InputKt {

    fun <T : Any> create(ngModule: NgModule): JsClass<out T> {
        return NgModule(
            InputKt(
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