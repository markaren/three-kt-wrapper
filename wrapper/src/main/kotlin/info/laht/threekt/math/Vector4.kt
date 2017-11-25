@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Vector4(
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        w: Number = definedExternally
) {

    var x: Double
    var y: Double
    var z: Double
    var w: Double

    fun set(x: Number, y: Number, z: Number, w: Number): Vector4

    fun clone() : Vector4
    fun copy(source: Vector4) : Vector4

}