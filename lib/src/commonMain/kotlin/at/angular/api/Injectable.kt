package at.angular.api

/**
 * @see: https://angular.io/api/core/Injectable
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.SOURCE)
annotation class Injectable(
    val providedIn: String = ""
)
