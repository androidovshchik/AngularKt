package at.angular.lib

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Injectable(
    val providedIn: String = ""
)
