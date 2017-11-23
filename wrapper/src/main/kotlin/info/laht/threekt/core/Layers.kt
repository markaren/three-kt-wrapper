@file:JsQualifier("THREE")

package info.laht.threekt.core

open external class Layers {

    var mask: Int

    fun enable(channel: Int)
    fun toggle ( channel: Int )
    fun disable ( channel: Int )
    fun test ( layers: Int )
}