@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Triangle(
            a: Vector3 = definedExternally,
            b: Vector3 = definedExternally,
            c: Vector3 = definedExternally
    ) {

    var a: Vector3
    var b: Vector3
    var c: Vector3

    companion object {
        fun normal(a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3 = definedExternally)
        fun barycoordFromPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3, optionalTarget: Vector3 = definedExternally)
        fun containsPoint(point: Vector3, a: Vector3, b: Vector3, c: Vector3)
    }

    fun set(a: Vector3, b: Vector3, c: Vector3) : Triangle
    fun setFromPointsAndIndices(points: Array<Vector3>, i0: Int, i1: Int, i2: Int) : Triangle
    fun clone() : Triangle
    fun copy(source: Triangle) : Triangle
    fun area() : Double
    fun midpoint(optionalTarget: Vector3 = definedExternally) : Vector3
    fun normal(optionalTarget: Vector3 = definedExternally) : Vector3
    fun plane(optionalTarget: Plane = definedExternally) : Plane
    fun barycoordFromPoint(point: Vector3, optionalTarget: Vector3 = definedExternally) : Vector3
    fun containsPoint(point: Vector3) : Boolean
    fun closestPointToPoint(point: Vector3, optionalTarget: Vector3 = definedExternally) : Vector3

    fun equals(triangle: Triangle) : Boolean

}