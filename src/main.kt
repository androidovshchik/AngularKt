import app.AppModule
import at.angular.core.enableProdMode
import at.angular.platformBrowserDynamic.platformBrowserDynamic
import environments.environment

fun main() {
    if (environment.production as Boolean) {
        enableProdMode()
    }
    platformBrowserDynamic(undefined).bootstrapModule(AppModule::class, null).catch {
        console.error(it)
    }
}
