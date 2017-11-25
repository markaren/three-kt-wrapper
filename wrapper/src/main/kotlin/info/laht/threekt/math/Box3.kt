@file:JsQualifier("THREE")

package info.laht.threekt.math

import info.laht.threekt.core.Object3D

open external class Box3(
        min: Vector3  = definedExternally,
        max: Vector3 = definedExternally
) {

    var min: Vector3
    var max: Vector3

    fun set(min: Vector3, max: Vector3) : Box3

    fun setFromArray(array: DoubleArray) : Box3

    fun setFromPoints(points: List<Vector3>): Box3

    fun setFromCenterAndSize(center: Vector3, size: Vector3): Box3

    fun setFromObject(`object`: Object3D) : Box3

    fun clone() : Box3
    fun copy(box: Box3) : Box3

    fun makeEmpty() : Box3

    fun isEmpty() : Boolean

    fun getCenter(optionalTarget: Vector3 = definedExternally) : Vector3

    fun getSize(optionalTarget: Vector3 = definedExternally) : Vector3

    fun expandByPoint(point: Vector3): Box3

    fun expandByVector(vector: Vector3): Box3

    fun expandByScalar(scalar: Number): Box3

    fun expandByObject(`object`: Object3D) : Box3

    fun containsPoint(point: Vector3): Boolean

    fun containsBox(box: Box3): Boolean

    fun intersectsBox ( box: Box3 ) : Boolean

    fun intersectsSphere(sphere: Sphere) : Boolean

    fun intersectsPlane ( plane: Plane ) : Boolean

    fun clampPoint ( point: Vector3, optionalTarget: Vector3 = definedExternally ) : Vector3

    fun distanceToPoint (point: Vector3): Double

    fun getBoundingSphere(optionalTarget: Sphere = definedExternally) : Sphere

    fun intersect(box: Box3): Box3

    fun union(box: Box3): Box3

    fun applyMatrix4(matrix: Matrix4) : Box3

    fun translate(offset: Vector3): Box3

    fun equals(box: Box3): Boolean
}

