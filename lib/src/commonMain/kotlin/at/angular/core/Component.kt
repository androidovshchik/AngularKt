package at.angular.core

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class Component(
    val selector: String = "",
    val templateUrl: String = "",
    val template: String = "",
    val styleUrls: Array<String> = arrayOf(),
    val styles: Array<String> = arrayOf()
)