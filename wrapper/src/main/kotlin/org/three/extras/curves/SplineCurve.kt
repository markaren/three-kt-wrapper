@file:JsQualifier("THREE")

package org.three.extras.curves

import org.three.extras.core.Curve
import org.three.math.Vector2

open external class SplineCurve(
        points: Array<Vector2> = definedExternally
) : Curve<Vector2> {

    var points: Array<Vector2>

    override fun clone() : SplineCurve
    fun copy(curve: SplineCurve) : SplineCurve

}