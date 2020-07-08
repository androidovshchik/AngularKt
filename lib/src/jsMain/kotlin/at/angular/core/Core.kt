@file:JsModule("@angular/core")

package at.angular.core

import kotlin.js.Promise

external fun enableProdMode()

external interface PlatformRef {

    fun <T : Any> bootstrapModule(
        moduleType: JsClass<T>,
        compilerOptions: dynamic
    ): Promise<dynamic>
}

external interface Component {
    val selector: String
    val templateUrl: String
    val template: String
    val styleUrls: Array<String>
    val styles: Array<String>
}

external interface Module

external interface Directive