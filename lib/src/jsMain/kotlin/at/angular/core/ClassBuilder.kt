package at.angular.core

import at.angular.lib.core.ClassDefinition

external interface ClassBuilder {
    fun <T : Any> Class(definition: ClassDefinition): JsClass<out T>
}
