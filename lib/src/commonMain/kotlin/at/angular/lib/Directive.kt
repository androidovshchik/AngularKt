package at.angular.lib

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Directive(
    val selector: String = ""
)
