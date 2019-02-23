@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.curves

import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector2

external class LineCurve(
    v1: Vector2 = definedExternally,
    v2: Vector2 = definedExternally
) : Curve<Vector2> {

    override fun clone(): LineCurve
    fun copy(curve: LineCurve): LineCurve

}