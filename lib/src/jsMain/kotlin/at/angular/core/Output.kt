@file:JsModule("@angular/core")

package at.angular.core

external interface Output {
    val bindingPropertyName: String
}

external fun Output(options: Output): (JsClass<*>) -> JsClass<*>