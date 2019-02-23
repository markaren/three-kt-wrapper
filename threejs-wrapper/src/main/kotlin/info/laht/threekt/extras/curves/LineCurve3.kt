@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.curves

import info.laht.threekt.extras.core.Curve
import info.laht.threekt.math.Vector3

external class LineCurve3(
    v1: Vector3 = definedExternally,
    v2: Vector3 = definedExternally
) : Curve<Vector3> {

    override fun clone(): LineCurve3
    fun copy(curve3: LineCurve3): LineCurve3

}

