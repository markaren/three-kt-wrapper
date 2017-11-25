@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Frustrum(
        p0: Plane = definedExternally,
        p1: Plane = definedExternally,
        p2: Plane = definedExternally,
        p3: Plane = definedExternally,
        p4: Plane = definedExternally
) {

    fun set(p0: Plane, p1: Plane, p2: Plane, p3: Plane, p4: Plane) : Frustrum

    fun clone()  : Frustrum
    fun copy(frustrum: Frustrum) : Frustrum

}