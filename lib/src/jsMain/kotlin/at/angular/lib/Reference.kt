package at.angular.lib

import kotlin.reflect.KClass

interface Reference<T : Any> {

    val target: JsClass<out T>

    companion object {

        fun <T : Any> of(target: JsClass<out T>): Reference<T> {
            return object : Reference<T> {
                override val target = target
            }
        }

        fun <T : Any> of(target: KClass<out T>): Reference<T> = of(target.js)
    }
}

fun <R : Reference<Any>> Array<out R>.toTarget(): Array<out JsClass<out Any>> =
    map { reference -> reference.target }.toTypedArray()