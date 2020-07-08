package at.angular.lib

abstract class Collection<V> {

    protected val map = mutableMapOf<String, V?>()

    open fun add(item: Pair<String, V>) {
        map[item.first] = item.second
    }

    open fun <T> of(): dynamic {

    }
}