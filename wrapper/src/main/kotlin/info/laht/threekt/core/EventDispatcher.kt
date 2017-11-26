@file:JsQualifier("THREE")

package info.laht.threekt.core

open external class EventDispatcher {

    fun addEventListener(type: String, listener: (dynamic) -> Unit)
    fun hasEventListner(type: String, listener: (dynamic) -> Unit)
    fun removeEventListener(type: String, listener: (dynamic) -> Unit)
    fun dispatchEvent(event: dynamic)

}