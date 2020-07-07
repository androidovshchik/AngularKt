package at.angular.lib

@Target(AnnotationTarget.CLASS)
annotation class Directive(
    val selector: String = ""
)
