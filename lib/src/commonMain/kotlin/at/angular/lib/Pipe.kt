package at.angular.lib

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Pipe(
    val name: String = "",
    val pure: Boolean = true
)
