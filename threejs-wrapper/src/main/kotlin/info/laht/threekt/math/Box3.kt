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

import info.laht.threekt.core.Object3D

/**
 * Represents a box or cube in 3D space. The main purpose of this is to represent the Minimum Bounding Boxes for objects.
 *
 * @param min (optional) Vector3 representing the lower (x, y, z) boundary of the box. Default is ( + Infinity, + Infinity, + Infinity ).
 * @param max (optional) Vector3 representing the lower upper (x, y, z) boundary of the box. Default is ( - Infinity, - Infinity, - Infinity ).
 */
external class Box3(
    min: Vector3 = definedExternally,
    max: Vector3 = definedExternally
) {

    /**
     * Vector3 representing the lower (x, y, z) boundary of the box.
     * Default is ( + Infinity, + Infinity, + Infinity ).
     */
    var min: Vector3
    /**
     * Vector3 representing the lower upper (x, y, z) boundary of the box.
     * Default is ( - Infinity, - Infinity, - Infinity ).
     */
    var max: Vector3

    val isBox3: Boolean

    /**
     * Sets the lower and upper (x, y, z) boundaries of this box.
     */
    fun set(min: Vector3, max: Vector3): Box3

    /**
     * Sets the upper and lower bounds of this box to include all of the data in array.
     * @param array An array of position data that the resulting box will envelop.
     */
    fun setFromArray(array: DoubleArray): Box3

    fun setFromPoints(points: List<Vector3>): Box3

    /**
     * Centers this box on center and sets this box's width and height to the values specified in size.
     * @param center - Desired center position of the box (Vector3).
     * @param size - Desired x, y and z dimensions of the box (Vector3).
     */
    fun setFromCenterAndSize(center: Vector3, size: Vector3): Box3

    /**
     * Computes the world-axis-aligned bounding box of an Object3D (including its children),
     * accounting for the object's, and children's, world transforms.
     * @param `object` Object3D to compute the bounding box of.
     */
    fun setFromObject(`object`: Object3D): Box3

    /**
     * Makes this box empty.
     */
    fun makeEmpty(): Box3

    /**
     * Returns true if this box includes zero points within its bounds.
    Note that a box with equal lower and upper bounds still includes one point, the one both bounds share.
     */
    fun isEmpty(): Boolean

    fun getCenter(optionalTarget: Vector3 = definedExternally): Vector3

    fun getSize(optionalTarget: Vector3 = definedExternally): Vector3

    fun expandByPoint(point: Vector3): Box3

    fun expandByVector(vector: Vector3): Box3

    fun expandByScalar(scalar: Number): Box3

    fun expandByObject(`object`: Object3D): Box3

    fun containsPoint(point: Vector3): Boolean

    fun containsBox(box: Box3): Boolean

    fun intersectsBox(box: Box3): Boolean

    fun intersectsSphere(sphere: Sphere): Boolean

    fun intersectsPlane(plane: Plane): Boolean

    fun clampPoint(point: Vector3, optionalTarget: Vector3 = definedExternally): Vector3

    fun distanceToPoint(point: Vector3): Double

    /**
     * Gets a Sphere that bounds the box.
     * @param optionalTarget (optional) if specified, the result will be copied into this Sphere, otherwise a new Sphere will be created.
     */
    fun getBoundingSphere(optionalTarget: Sphere = definedExternally): Sphere

    fun intersect(box: Box3): Box3

    /**
     * Unions this box with box, setting the upper bound of this box to the greater of the two boxes'
     * upper bounds and the lower bound of this box to the lesser of the two boxes' lower bounds.
     * @param box Box that will be unioned with this box.
     */
    fun union(box: Box3): Box3

    /**
     * Transforms this Box3 with the supplied matrix.
     * @param matrix The Matrix4 to apply
     */
    fun applyMatrix4(matrix: Matrix4): Box3

    fun translate(offset: Vector3): Box3

    /**
     * Returns true if this box and box share the same lower and upper bounds.
     * @param box  Box to compare with this one.
     */
    fun equals(box: Box3): Boolean

    /**
     * Returns a new Box3 with the same min and max as this one.
     */
    fun clone(): Box3

    /**
     * Copies the min and max from box to this box.
     * @param box  Box3 to copy.
     */
    fun copy(box: Box3): Box3


}

