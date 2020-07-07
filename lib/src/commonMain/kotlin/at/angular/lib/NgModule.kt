package at.angular.lib

@Target(AnnotationTarget.CLASS)
annotation class NgModule(
    val declarations: Array<String> = arrayOf()
)
