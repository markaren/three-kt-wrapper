
@file:JsQualifier("THREE")

package org.three.loaders

external object Cache {

    var enabled: Boolean

    var files: dynamic

    fun add(key: String, file: dynamic)

    fun get(key: String): dynamic

    fun remove(key: String)

    fun clear()

}