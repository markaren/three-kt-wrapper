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


/**
 * Creates a new Camera. Note that this class is not intended to be called directly;
 * you probably want a PerspectiveCamera or OrthographicCamera instead.
 */
open external class Camera : Object3D {


    /**
     * This is the inverse of matrixWorld. MatrixWorld contains the Matrix which has the world transform of the Camera.
     */
    var matrixWorldInverse: Matrix4
    /**
     *     /**
     * This is the matrix which contains the projection.
    */
     */
    var projectionMatrix: Matrix4



    /**
     * Returns a Vector3 representing the world space direction in which the camera is looking.
     *
     * Note: This is not the camera’s positive, but its negative z-axis, in contrast to getWorldDirection of the base class (Object3D).
     *
     */
    fun getWorldDirection() : Vector3

    /**
     * Returns a Vector3 representing the world space direction in which the camera is looking.
     *
     * Note: This is not the camera’s positive, but its negative z-axis, in contrast to getWorldDirection of the base class (Object3D).
     *
     * If an optionalTarget vector is specified, the result will be copied into this vector (which can be reused in this way),
     * otherwise a new vector will be created.
     */
    override fun getWorldDirection(optionalTarget: Vector3) : Vector3

    override fun updateMatrixWorld(force: Boolean)

    fun clone(): Camera
    fun copy(source: Camera, recursive: Boolean)

}