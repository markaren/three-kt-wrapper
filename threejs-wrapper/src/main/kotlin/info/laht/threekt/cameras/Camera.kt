/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

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
    fun getWorldDirection(): Vector3

    /**
     * Returns a Vector3 representing the world space direction in which the camera is looking.
     *
     * Note: This is not the camera’s positive, but its negative z-axis, in contrast to getWorldDirection of the base class (Object3D).
     *
     * If an optionalTarget vector is specified, the result will be copied into this vector (which can be reused in this way),
     * otherwise a new vector will be created.
     */
    override fun getWorldDirection(optionalTarget: Vector3): Vector3

    override fun updateMatrixWorld(force: Boolean)

    fun clone(): Camera
    fun copy(source: Camera, recursive: Boolean)

}