@file:JsQualifier("THREE")

package org.three.extras.curves

import org.three.extras.core.Curve
import org.three.math.Vector3

open external class QuadricBezierCurve3 : Curve<Vector3> {

    constructor(v0: Vector3 = definedExternally,
                v1: Vector3 = definedExternally,
                v2: Vector3 = definedExternally)

    override fun clone() : QuadricBezierCurve3
    fun copy(curve: QuadricBezierCurve3) : QuadricBezierCurve3

}

