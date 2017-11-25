@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Line3(
        start: Vector3 = definedExternally,
        end: Vector3 = definedExternally
) {
    
    var start: Vector3
    var end: Vector3

    fun set(start: Vector3, end: Vector3) : Line3

    fun clone() : Line3
    fun copy(line: Line3) : Line3

    fun getCenter ( optionalTarget: Vector3 = definedExternally ) : Vector3

    fun delta ( optionalTarget: Vector3 ) : Vector3

    fun distanceSq () : Double

    fun distance () : Double

    fun at ( t: Number, optionalTarget: Vector3 ) : Vector3

    fun closestPointToPointParameter (point: Vector3, clampToLine: Boolean = definedExternally) : Double

    fun closestPointToPoint ( point: Vector3, clampToLine: Boolean, optionalTarget: Vector3 = definedExternally ) : Vector3

    fun applyMatrix4 ( matrix: Matrix4 ) : Matrix4

    fun equals ( line: Line3 ): Boolean
}