@file:JsModule(at.angular.MODULE_CORE)

package at.angular.core

abstract external class ViewRef : ChangeDetectorRef {
    val destroyed: Boolean
    fun destroy()
    fun onDestroy(callback: () -> Unit): Any
}