package at.angular.lib

import at.angular.core.Component

object Components : Collection<Component>() {

    override fun add(item: Pair<String, Component>) {

    }

    override fun <T> of(): dynamic {
        return null
    }
}