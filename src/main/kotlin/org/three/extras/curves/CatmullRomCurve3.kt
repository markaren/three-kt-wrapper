@file:JsQualifier("THREE")

package org.three.extras.curves

import org.three.extras.core.Curve
import org.three.math.Vector3

open external class CatmullRomCurve3(
        points: Array<Vector3> = definedExternally,
        closed: Boolean = definedExternally,
        curveType: String = definedExternally,
        tension: Double = definedExternally
) : Curve<Vector3> {

    var points: Array<Vector3>
    var closed: Boolean
    var curveType: String
    var tension: Double

    override fun clone() : CatmullRomCurve3
    fun copy(curve: CatmullRomCurve3) : CatmullRomCurve3
}