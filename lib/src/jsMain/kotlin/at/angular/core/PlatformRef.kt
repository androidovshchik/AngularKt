package kt.angular.core

import kotlin.js.Promise
import kotlin.reflect.KClass

external interface PlatformRef {

    fun <T : Any> bootstrapModule(moduleType: KClass<T>, compilerOptions: dynamic): Promise<dynamic>
}
