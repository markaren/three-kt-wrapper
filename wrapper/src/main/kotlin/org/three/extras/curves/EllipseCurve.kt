@file:JsQualifier("THREE")

package org.three.extras.curves

import org.three.extras.core.Curve
import org.three.math.Vector2

open external class EllipseCurve (
        aX: Double = definedExternally,
        aY: Double = definedExternally,
        xRadius: Double = definedExternally,
        yRadius: Double = definedExternally,
        aStartAngle: Double = definedExternally,
        aEndAngle: Double = definedExternally,
        aClockwise: Boolean = definedExternally,
        aRotation: Double = definedExternally

) : Curve<Vector2> {

    var aX: Double
    var aY: Double

    var xRadius : Double
    var yRadius: Double

    var aStartAngle : Double
    var aEndAngle: Double

    var aClockwise: Boolean

    var aRotation: Double

    override fun clone() : EllipseCurve

    fun copy(curve: EllipseCurve) : EllipseCurve

}