@file:JsQualifier("THREE")

package info.laht.threekt.lights

import info.laht.threekt.cameras.Camera
import info.laht.threekt.math.Matrix4
import info.laht.threekt.math.Vector2

open external class LightShadow {

    constructor(camera: Camera)

    var camera: Camera

    var bias: Double
    var radius: Double

    var mapSize: Vector2

    var matrix: Matrix4

    fun clone() : LightShadow
    fun copy(source: LightShadow) : LightShadow
    fun toJSON() : String
}