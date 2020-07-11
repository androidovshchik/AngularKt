@file:JsModule(at.angular.MODULE_CORE)

package at.angular.core

external interface Directive {
    val selector: String?
}

external fun Directive(options: Directive)

