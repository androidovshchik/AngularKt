@file:JsModule(MODULE_CORE)

package at.angular.core

import at.angular.MODULE_CORE

open external class ChangeDetectorRef {
    fun markForCheck()
    fun detach()
    fun detectChanges()
    fun checkNoChanges()
    fun reattach()
}