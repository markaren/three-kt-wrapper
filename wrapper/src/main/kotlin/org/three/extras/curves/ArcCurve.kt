@file:JsQualifier("THREE")

package org.three.extras.curves

open external class ArcCurve(
        aX: Double = definedExternally,
        aY: Double = definedExternally,
        xRadius: Double = definedExternally,
        yRadius: Double = definedExternally,
        aStartAngle: Double = definedExternally,
        aEndAngle: Double = definedExternally,
        aClockwise: Boolean = definedExternally
) : EllipseCurve {

    override fun clone() : ArcCurve

}

