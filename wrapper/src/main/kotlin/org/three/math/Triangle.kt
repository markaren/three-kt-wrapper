@file:JsQualifier("THREE")

package org.three.math

open external class Triangle {

    constructor()
    constructor(a: Vector3, b: Vector3, c: Vector3)

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
    fun midpoint() : Vector3

}