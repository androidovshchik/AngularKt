package app.at.angular.lib

import at.angular.lib.Modules
import at.angular.platformBrowserDynamic.platformBrowserDynamic

fun <T : Any> bootstrapModule() {
    platformBrowserDynamic().bootstrapModule(Modules.of<T>())
}