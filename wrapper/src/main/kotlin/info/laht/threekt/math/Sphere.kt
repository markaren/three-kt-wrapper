@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Sphere {

    constructor()
    constructor(center: Vector3, radius: Number)

    fun setFromPoints(points: Array<Vector3>, optionalCenter: Vector3 = definedExternally): Sphere

    fun clone(): Sphere
    fun copy(sphere: Sphere) : Sphere

    fun empty() : Boolean

    fun containsPoint(point: Vector3):  Boolean

    fun distanceToPoint(point: Vector3) : Double

    fun  intersectsSphere ( sphere: Sphere ): Boolean

    fun intersectsBox ( box: Box3 ) : Boolean

    fun clampPoint ( point: Vector3, optionalTarget: Vector3 = definedExternally ) : Vector3

    fun getBoundingBox ( optionalTarget: Box3 ) : Box3

    fun applyMatrix4 ( matrix: Matrix4 ) : Sphere

    fun translate ( offset: Vector3 ) : Sphere

    fun equals ( sphere: Sphere ) : Boolean

}

