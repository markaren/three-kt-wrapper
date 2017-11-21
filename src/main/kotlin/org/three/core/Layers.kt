@file:JsQualifier("THREE")

package org.three.core

open external class Layers {

    var mask: Int

    fun enable(channel: Int)
    fun toggle ( channel: Int )
    fun disable ( channel: Int )
    fun test ( layers: Int )
}