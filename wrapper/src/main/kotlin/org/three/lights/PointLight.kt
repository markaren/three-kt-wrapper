@file:JsQualifier("THREE")

package org.three.lights

open external class PointLight(
        color: Int = definedExternally,
        intensity: Float = definedExternally
) : Light {

    var distance: Float
    var decay: Number

    var shadow: LightShadow

    fun copy(source: PointLight) : PointLight

}

