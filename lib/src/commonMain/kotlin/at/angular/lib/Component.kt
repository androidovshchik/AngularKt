package at.angular.lib

@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Component(
    val selector: String = "",
    val templateUrl: String = "",
    val template: String = "",
    val styleUrls: Array<String> = arrayOf(),
    val styles: Array<String> = arrayOf()
)