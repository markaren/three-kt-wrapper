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

package info.laht.threekt.math

import info.laht.threekt.core.BufferGeometry

/**
 * A class representing a 4x4 matrix.
 *
 * The most common use of a 4x4 matrix in 3D computer graphics is as a Transformation Matrix. For an introduction to transformation matrices as used in WebGL, check out this tutorial.
 *
 * This allows a Vector3 representing a point in 3D space to undergo transformations such as translation, rotation, shear, scale, reflection, orthogonal or perspective projection and so on, by being multiplied by the matrix. This is known as	applying the matrix to the vector.
 *
 * Every Object3D has three associated Matrix4s:
 * Object3D.matrix: This stores the local transform of the object.
 * Object3D.matrixWorld: The global or world transform of the object. This is the object's transformation relative to its parent. If the object has no parent, then this is identical to the local transform.
 * Object3D.modelViewMatrix: This represents the object's transformation relative to the camera's coordinate system. An object's modelViewMatrix is the object's matrixWorld pre-multiplied by the camera's matrixWorldInverse.
 * Cameras have two additional Matrix4s:
 * Camera.matrixWorldInverse: The view matrix - the inverse of the Camera's matrixWorld.
 * Camera.projectionMatrix: Represents the information how to project the scene to clip space.
 * Note: Object3D.normalMatrix is not a Matrix4, but a Matrix3.
 */
external class Matrix4 {

    /**
     * A column-major list of matrix values.
     */
    val elements: DoubleArray

    /**
     * Creates and initializes the Matrix4 to the 4x4 identity matrix.
     */
    constructor()

    fun set(
        n11: Number, n12: Number, n13: Number, n14: Number,
        n21: Number, n22: Number, n23: Number, n24: Number,
        n31: Number, n32: Number, n33: Number, n34: Number,
        n41: Number, n42: Number, n43: Number, n44: Number
    )

    /**
     * Resets this matrix to the identity matrix.
     */
    fun identity(): Matrix4

    /**
     * Creates a new Matrix4 with identical elements to this one.
     */
    fun clone(): Matrix4

    /**
     * Copies the elements of matrix m into this matrix.
     */
    fun copy(m: Matrix4): Matrix4

    /**
     * Copies the translation component of the supplied matrix m into this matrix's translation component.
     */
    fun copyPosition(m: Matrix4): Matrix4

    fun extractBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4

    /**
     * Set this to the basis matrix consisting of the three provided basis vectors
     */
    fun makeBasis(xAxis: Vector3, yAxis: Vector3, zAxis: Vector3): Matrix4

    fun extractRotation(m: Matrix4): Matrix4

    fun makeRotationFromEuler(euler: Euler): Matrix4

    fun makeRotationFromQuaternion(q: Quaternion): Quaternion

    fun lookAt(eye: Vector3, target: Vector3, up: Vector3): Matrix4

    /**
     * Post-multiplies this matrix by m.
     */
    fun multiply(m: Matrix4): Matrix4

    /**
     * Pre-multiplies this matrix by m.
     */
    fun premultiply(m: Matrix4): Matrix4

    /**
     * Sets this matrix to a x b.
     */
    fun multiplyMatrices(a: Matrix4, b: Matrix4): Matrix4

    /**
     * Multiplies every component of the matrix by a scalar value s.
     */
    fun multiplyScalar(s: Double): Matrix4

    fun applyToBufferAttribute(attribute: BufferGeometry)

    fun determinant(): Double

    fun transpose(): Matrix4

    fun setPosition(v: Vector3): Matrix4

    /**
     * Set this matrix to the inverse of the passed matrix m, using the method outlined here.
     * If throwOnDegenerate is not set and the matrix is not invertible, set this to the 4x4 identity matrix.
     *
     * @m the matrix to take the inverse of.
     * @param throwOnDegenerate (optional) If true, throw an error if the matrix is degenerate (not invertible).
     */
    fun getInverse(m: Matrix4, throwOnDegenerate: Boolean = definedExternally)

    /**
     * Multiplies the columns of this matrix by vector v.
     */
    fun scale(v: Vector3): Matrix4

    /**
     * Gets the maximum scale value of the 3 axes.
     */
    fun getMaxScaleOnAxis(): Double

    fun makeTranslation(x: Double, y: Double, z: Double): Matrix4

    fun makeRotationX(theta: Double): Matrix4

    fun makeRotationY(theta: Double): Matrix4

    fun makeRotationZ(theta: Double): Matrix4

    fun makeRotationAxis(axis: Vector3, angle: Double): Matrix4

    fun makeScale(x: Double, y: Double, z: Double): Matrix4

    fun makeShear(x: Double, y: Double, z: Double): Matrix4

    fun compose(position: Vector3, quaternion: Vector3, scale: Vector3): Matrix4

    fun decompose(position: Vector3, quaternion: Vector3, scale: Vector3): Matrix4

    fun makePerspective(left: Int, right: Int, top: Int, bottom: Int, near: Double, far: Double): Matrix4

    fun makeOrthographic(left: Int, right: Int, top: Int, bottom: Int, near: Double, far: Double): Matrix4

    fun equals(matrix: Matrix4): Boolean

    fun fromArray(array: DoubleArray, offset: Int = definedExternally): Matrix4

    fun toArray(array: DoubleArray, offset: Int = definedExternally): DoubleArray

}

