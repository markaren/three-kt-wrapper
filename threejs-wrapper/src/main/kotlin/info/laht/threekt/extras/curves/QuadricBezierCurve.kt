@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.curves

import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector2

external class QuadricBezierCurve : Curve<Vector2> {

    constructor(
        v0: Vector2 = definedExternally,
        v1: Vector2 = definedExternally,
        v2: Vector2 = definedExternally
    )

    override fun clone(): QuadricBezierCurve
    fun copy(curve: QuadricBezierCurve3): QuadricBezierCurve

}

