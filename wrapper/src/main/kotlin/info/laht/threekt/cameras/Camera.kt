@file:JsQualifier("THREE")

package info.laht.threekt.cameras

import info.laht.threekt.core.Object3D
import info.laht.threekt.math.Matrix4
import info.laht.threekt.math.Vector3

external interface View {
    var enabled: Boolean
    var fullwidth: Int
    var fullHeight: Int
    var offsetX: Int
    var offsetY: Int
    var width: Int
    var height: Int
}


open external class Camera : Object3D {

    var matrixWorldInverse: Matrix4
    var projectionMatrix: Matrix4

    fun copy(source: Camera, recursive: Boolean)

    override fun getWorldDirection(optionalTarget: Vector3) : Vector3

    override fun updateMatrixWorld(force: Boolean)

    fun clone(): Camera

}