package at.angular.lib.extension

import at.angular.core.PlatformRef
import at.angular.lib.Modules
import kotlin.js.Promise

fun <T : Any> PlatformRef.bootstrapModule(): Promise<dynamic> {
    return bootstrapModule(Modules.of<T>())
}