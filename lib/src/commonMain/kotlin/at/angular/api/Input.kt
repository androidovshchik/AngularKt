package at.angular.api

/**
 * @see: https://angular.io/api/core/Input
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.SOURCE)
annotation class Input(
    val bindingPropertyName: String = ""
)