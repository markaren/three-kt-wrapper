@file:JsQualifier("THREE")

package org.three.lights

open external class PointLight(
        color: Int = definedExternally,
        intensity: Double = definedExternally
) : Light {

    var distance: Double
    var decay: Number

    var shadow: LightShadow

    fun copy(source: PointLight) : PointLight

}

