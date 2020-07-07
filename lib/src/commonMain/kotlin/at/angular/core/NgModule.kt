package at.angular.core

@Target(AnnotationTarget.CLASS, AnnotationTarget.VALUE_PARAMETER)
@Retention(AnnotationRetention.BINARY)
@MustBeDocumented
annotation class NgModule(
    val declarations: Array<String> = arrayOf()
)
