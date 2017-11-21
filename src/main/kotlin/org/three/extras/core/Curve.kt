@file:JsQualifier("THREE")

package org.three.extras.core

import org.three.math.Vector3

open external abstract class Curve {

    var arcLengthDivisions: Int

    abstract fun getPoint()

    fun getPointAt(u: Float, optionalTarget: Vector3): Vector3

    fun getPoints(divisions: Int): List<Vector3>

    fun getSpacedPoints(divisions: Int): List<Vector3>

    fun getLength() : Float

    fun updateArcLengths()

    fun computeFrenetFrames(segments: Int, closed: Boolean = definedExternally)

}