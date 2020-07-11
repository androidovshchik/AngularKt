@file:JsModule(at.angular.MODULE_CORE)

package at.angular.core

external interface Component : Directive {
    val templateUrl: String?
    val template: String?
    val styleUrls: Array<String>?
    val styles: Array<String>?
}

external fun Component(options: Component)