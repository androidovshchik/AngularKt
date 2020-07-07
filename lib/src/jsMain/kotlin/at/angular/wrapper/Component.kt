package app.at.angular.wrapper

import at.angular.core.Component

object Components : Decorators() {

    private val map = mapOf<String, Component>()

    private val map2 = mapOf<String, Boolean>()

    override fun <T> of(): dynamic {
        return null
    }
}