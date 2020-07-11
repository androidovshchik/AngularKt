@file:JsModule(at.angular.MODULE_CORE)

package at.angular.core

external interface Injectable {
    val providedIn: dynamic
}

external fun Injectable(options: Injectable): ClassBuilder