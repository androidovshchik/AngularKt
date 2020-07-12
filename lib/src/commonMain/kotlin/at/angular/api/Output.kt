package at.angular.api

/**
 * @see: https://angular.io/api/core/Output
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class Output(
    val bindingPropertyName: String = ""
)