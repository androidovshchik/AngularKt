@file:JsModule("@angular/core")

package at.angular.core

import kotlin.js.Promise
import kotlin.reflect.KClass

external fun enableProdMode()

external interface PlatformRef {

    fun <T : Any> bootstrapModule(moduleType: KClass<T>, compilerOptions: dynamic): Promise<dynamic>
}

external interface Component {
    val selector: String
    val templateUrl: String
    val template: String
    val styleUrls: Array<String>
    val styles: Array<String>
}