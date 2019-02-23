@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.curves

import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector2

external class SplineCurve(
    points: Array<Vector2> = definedExternally
) : Curve<Vector2> {

    var points: Array<Vector2>

    override fun clone(): SplineCurve
    fun copy(curve: SplineCurve): SplineCurve

}