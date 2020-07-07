package at.angular.extension

inline fun <T> jsObject(init: T.() -> Unit): T {
    // todo Any?
    val obj = js("{}") as T
    init(obj)
    return obj
}