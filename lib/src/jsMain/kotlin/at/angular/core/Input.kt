@file:JsModule("@angular/core")

package at.angular.core

external interface Input {
    val name: String
    val pure: Boolean
}

external fun Input(options: Input): (JsClass<*>) -> JsClass<*>