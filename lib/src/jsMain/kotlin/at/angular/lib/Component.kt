package at.angular.lib

import at.angular.core.Component

object Components : Collection() {

    private val map = mapOf<String, Component>()

    private val map2 = mapOf<String, Boolean>()

    fun add(item: Pair<String, Component>) {

    }

    override fun <T> of(): dynamic {
        return null
    }
}