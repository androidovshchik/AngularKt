package at.angular.lib

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class Directive(
    val selector: String = ""
)
