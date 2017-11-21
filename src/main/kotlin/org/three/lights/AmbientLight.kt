@file:JsQualifier("THREE")

package org.three.lights

open external class AmbientLight(
        color: Int = definedExternally,
        intensity: Float = definedExternally
) : Light {

    var castShadow: Boolean

}