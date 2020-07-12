package at.angular.lib

import at.angular.lib.core.ClassDefinition
import kotlin.reflect.KClass

abstract class Module<T : Any>(
    type: KClass<out T>,
    providers: Array<out Reference<Any>> = emptyArray(),
    declarations: Array<out Reference<out Any>> = emptyArray(),
    imports: Array<out Reference<*>> = emptyArray(),
    exports: Array<out Reference<*>> = emptyArray(),
    entryComponents: Array<out Reference<*>> = emptyArray(),
    bootstrap: Array<out Reference<*>> = emptyArray()
) : Reference<T> {

    init {
    }

    override val target: JsClass<out T> = create(
        type = type.js,
        providers = providers.toTarget(),
        declarations = declarations.toTarget(),
        imports = imports.toTarget(),
        exports = exports.toTarget(),
        entryComponents = entryComponents.toTarget(),
        bootstrap = bootstrap.toTarget()
    )

    companion object {

        inline fun <reified T : Any> create(
            type: JsClass<out T>,
            providers: Array<out JsClass<out Any>> = emptyArray(),
            declarations: Array<out JsClass<out Any>> = emptyArray(),
            imports: Array<out JsClass<out Any>> = emptyArray(),
            exports: Array<out JsClass<out Any>> = emptyArray(),
            entryComponents: Array<out JsClass<out Any>> = emptyArray(),
            bootstrap: Array<out JsClass<out Any>> = emptyArray()
        ): JsClass<out T> {
            return NgModule(
                NgModule(
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
}