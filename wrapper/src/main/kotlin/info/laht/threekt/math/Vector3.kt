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

@file:JsQualifier("THREE")

package info.laht.threekt.math

import info.laht.threekt.cameras.Camera

/**
 * Class representing a 3D vector. A 3D vector is an ordered triplet of numbers (labeled x, y, and z), which can be used to represent a number of things, such as:
 * A point in 3D space.
 * A direction and length in 3D space. In three.js the length will always be the Euclidean distance (straight-line distance) from (0, 0, 0) to (x, y, z) and the direction is also measured from (0, 0, 0) towards (x, y, z).
 * Any arbitrary ordered triplet of numbers.
 * There are other things a 3D vector can be used to represent, such as momentum vectors and so on, however these are the most common uses in three.js.
 *
 * @param x the x value of the vector. Default is 0.
 * @param y the y value of the vector. Default is 0.
 * @param z the z value of the vector. Default is 0.
 */

external class Vector3(
    x: Number = definedExternally,
    y: Number = definedExternally,
    z: Number = definedExternally
) {

    var x: Double
    var y: Double
    var z: Double

    val isVector3: Boolean

    /**
     * Sets the x, y and z components of this vector.
     */
    fun set(x: Number, y: Number, z: Number)

    /**
     * Set the x, y and z values of this vector both equal to scalar.
     */
    fun setScalar(scalar: Number): Vector3

    /**
     * Replace this vector's x value with x.
     */
    fun setX(x: Number): Vector3

    /**
     * Replace this vector's y value with y.
     */
    fun setY(y: Number): Vector3

    /**
     * Replace this vector's z value with z.
     */
    fun setZ(z: Number): Vector3

    /**
     * If index equals 0 set x to value.
     * If index equals 1 set y to value.
     * If index equals 2 set z to value
     * @param index 0, 1 or 2.
     * @param value number
     */
    fun setComponent(index: Int, value: Number): Vector3

    fun getComponent(index: Int): Double

    /**
     * Adds v to this vector.
     */
    fun add(v: Vector3): Vector3

    /**
     * Adds the scalar value s to this vector's x, y and z values.
     */
    fun addScalar(s: Number): Vector3

    /**
     * Sets this vector to a + b.
     */
    fun addVectors(a: Vector3, b: Vector3): Vector3

    /**
     * Adds the multiple of v and s to this vector.
     */
    fun addScaledVector(v: Vector3, s: Number): Vector3

    /**
     * Subtracts v from this vector.
     */
    fun sub(v: Vector3): Vector3

    /**
     * Subtracts s from this vector's x, y and z compnents.
     */
    fun subScalar(s: Number): Vector3

    /**
     * Sets this vector to a - b.
     */
    fun subVectors(a: Vector3, b: Vector3): Vector3

    /**
     * Multiplies this vector by v.
     */
    fun multiply(v: Vector3): Vector3

    /**
     * Multiplies this vector by scalar s.
     */
    fun multiplyScalar(scalar: Number): Vector3

    /**
     * Sets this vector equal to a x b.
     */
    fun multiplyVectors(a: Vector3, b: Vector3): Vector3

    /**
     * Applies euler transform to this vector by converting the Euler object to a Quaternion and applying.
     */
    fun applyEuler(euler: Euler): Vector3

    /**
     * Applies a rotation specified by an axis and an angle to this vector.
     * @param axis A normalized Vector3.
     * @param angle An angle in radians.
     */
    fun applyAxisAngle(axis: Vector3, angle: Number): Vector3

    /**
     * Multiplies this vector by m
     */
    fun applyMatrix3(m: Matrix3): Vector3

    /**
     * Multiplies this vector (with an implicit 1 in the 4th dimension) and m, and divides by perspective.
     */
    fun applyMatrix4(m: Matrix4): Vector3

    /**
     * Applies a Quaternion transform to this vector.
     */
    fun applyQuaternion(q: Quaternion): Vector3

    /**
     * Projects the vector with the camera.
     * @param camera — camera to use in the projection.
     */
    fun project(camera: Camera): Vector3

    /**
     * Unprojects the vector with the camera's projection matrix.
     * @param camera camera to use in the projection.
     */
    fun unproject(camera: Camera): Vector3

    /**
     * Transforms the direction of this vector by a matrix (the upper left 3 x 3 subset of a m)
     * and then normalizes the result.
     */
    fun transformDirection(m: Matrix4): Vector3

    fun divide(v: Vector3): Vector3
    fun divideScalar(scalar: Double): Vector3
    /**
     * If this vector's x, y or z value is greater than v's x, y or z value, replace that value with the corresponding min value.
     */
    fun min(v: Vector3): Vector3

    /**
     * If this vector's x, y or z value is less than v's x, y or z value, replace that value with the corresponding max value.
     */
    fun max(v: Vector3): Vector3

    /**
     * If this vector's x, y or z value is greater than the max vector's x, y or z value, it is replaced by the corresponding value.
     *
     * If this vector's x, y or z value is less than the min vector's x, y or z value, it is replaced by the corresponding value.
     */
    fun clamp(min: Vector3, max: Vector3): Vector3

    fun clampScalar(minVal: Number, maxVal: Number): Vector3
    fun clampLength(min: Number, max: Number): Vector3
    /**
     * The components of the vector are rounded down to the nearest integer value.
     */
    fun floor(): Vector3

    /**
     * The x, y and z components of the vector are rounded up to the nearest integer value.
     */
    fun ceil(): Vector3

    /**
     * The components of the vector are rounded to the nearest integer value.
     */
    fun round(): Vector3

    /**
     * The components of the vector are rounded towards zero (up if negative, down if positive) to an integer value.
     */
    fun roundToZero(): Vector3

    /**
     * Inverts this vector - i.e. sets x = -x, y = -y and z = -z.
     */
    fun negate(): Vector3

    /**
     * Calculate the dot product of this vector and v.
     */
    fun dot(v: Vector3): Double

    /**
     * Computes the square of the Euclidean length (straight-line length) from (0, 0, 0) to (x, y, z).
     * If you are comparing the lengths of vectors, you should compare the length squared instead as it
     * is slightly more efficient to calculate.
     */
    fun lengthSq(): Double

    /**
     * Computes the Euclidean length (straight-line length) from (0, 0, 0) to (x, y, z).
     */
    fun length(): Double

    /**
     * Computes the Manhattan length of this vector.
     */
    fun manhattanLength(): Double

    /**
     * Convert this vector to a unit vector - that is, sets it equal to the vector with
     * the same direction as this one, but length 1.
     */
    fun normalize(): Vector3

    /**
     * Set this vector to the vector with the same direction as this one, but length l.
     */
    fun setLength(length: Number): Vector3

    /**
     * Linearly interpolate between this vector and v, where alpha is the distance along
     * the line - alpha = 0 will be this vector, and alpha = 1 will be v.
     * @param v Vector3 to interpolate towards.
     * @param alpha  interpolation factor in the closed interval [0, 1].
     */
    fun lerp(v: Vector3, alpha: Number): Vector3

    /**
     * Sets this vector to be the vector linearly interpolated between v1 and v2 where alpha is the distance along the line
     * connecting the two vectors - alpha = 0 will be v1, and alpha = 1 will be v2.
     * @param v1 the starting Vector3.
     * @param v2 Vector3 to interpolate towards.
     * @param alpha  interpolation factor in the closed interval [0, 1].
     */
    fun lerpVectors(v1: Vector3, v2: Vector3, alpha: Number): Vector3

    /**
     * Sets this vector to cross product of itself and v.
     */
    fun cross(v: Vector3): Vector3

    /**
     * Sets this vector to cross product of a and b.
     */
    fun crossVectors(a: Vector3, b: Vector3): Vector3

    /**
     * Projects this vector onto another vector.
     */
    fun projectOnVector(vector: Vector3): Vector3

    /**
     * Projects this vector onto a plane by subtracting this vector projected onto the plane's normal from this vector.
     * @param planeNormal A vector representing a plane normal.
     */
    fun projectOnPlane(planeNormal: Vector3): Vector3

    /**
     * Reflect the vector off of plane orthogonal to normal. Normal is assumed to have unit length.
     * @param normal the normal to the reflecting plane
     */
    fun reflect(normal: Vector3): Vector3

    /**
     * Returns the angle between this vector and vector v in radians.
     */
    fun angleTo(v: Vector3): Double

    /**
     * Computes the distance from this vector to v.
     */
    fun distanceTo(v: Vector3): Double

    /**
     * Computes the squared distance from this vector to v. If you are just comparing the distance with another distance,
     * you should compare the distance squared instead as it is slightly more efficient to calculate.
     */
    fun distanceToSquared(v: Vector3): Double

    /**
     * Computes the Manhattan distance from this vector to v.
     */
    fun manhattanDistanceTo(v: Vector3): Double

    /**
     * Sets this vector from the spherical coordinates s.
     */
    fun setFromSpherical(s: Spherical): Vector3

    /**
     * Sets this vector from the cylindrical coordinates c.
     */
    fun setFromCylindrical(c: Cylindrical): Vector3

    /**
     * Sets this vector to the position elements of the transformation matrix m.
     */
    fun setFromMatrixPosition(m: Matrix4): Vector3

    /**
     * Sets this vector to the scale elements of the transformation matrix m.
     */
    fun setFromMatrixScale(m: Matrix4): Vector3

    /**
     * Sets this vector's x, y and z equal to the column of the matrix specified by the index.
     */
    fun setFromMatrixColumn(m: Matrix4, index: Int): Vector3

    /**
     * Sets this vector's x value to be array[ offset + 0 ], y value to be array[ offset + 1 ]
     * and z value to be array[ offset + 2 ].
     *
     * @param array the source array.
     * @param offset ( optional) offset into the array. Default is 0.
     *
     */
    fun fromArray(array: DoubleArray, offset: Int = definedExternally): Vector3

    fun toArray(array: DoubleArray = definedExternally, offset: Int = definedExternally): DoubleArray

    /**
     * Sets this vector's x, y and z values from the attribute.
     */
    fun fromBufferAttribute(attribute: dynamic, index: Int, offset: Int = definedExternally): Vector3

    /**
     * Checks for strict equality of this vector and v.
     */
    fun equals(v: Vector3): Boolean

    /**
     * Returns a new vector3 with the same x, y and z values as this one.
     */
    fun clone(): Vector3

    /**
     * Copies the values of the passed vector3's x, y and z properties to this vector3.
     */
    fun copy(v: Vector3): Vector3

}