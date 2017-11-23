package info.laht.threekt.math

open external class Line3 {

    constructor(start: Vector3, end: Vector3)

    var start: Vector3
    var end: Vector3

    fun set(start: Vector3, end: Vector3) : Line3

    fun clone() : Line3
    fun copy(line: Line3) : Line3

}