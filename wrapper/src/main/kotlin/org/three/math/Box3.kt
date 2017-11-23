@file:JsQualifier("THREE")

package org.three.math

open external class Box3 {

    constructor()
    constructor(min: Vector3, max: Vector3)

    var min: Vector3
    var max: Vector3

    fun set(min: Vector3, max: Vector3) : Box3

    fun setFromPoints(points: List<Vector3>): Box3

    fun setFromCenterAndSize(center: Vector3, size: Vector3): Box3

    fun clone() : Box3
    fun copy(box: Box3) : Box3

    fun makeEmpty() : Box3

    fun isEmpty() : Boolean
}

