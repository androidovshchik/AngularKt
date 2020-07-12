@file:JsModule("@angular/forms")

package at.angular.forms

/**
 * @see: https://angular.io/api/forms/FormsModule
 */
external class FormsModule

/**
 * @see: https://angular.io/api/forms/ReactiveFormsModule
 */
external class ReactiveFormsModule {

    companion object {
        // todo more details
        fun withConfig(opts: dynamic): dynamic
    }
}