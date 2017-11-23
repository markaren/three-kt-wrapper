@file:JsQualifier("THREE")

package info.laht.threekt.lights

open external class PointLight(
        color: Int = definedExternally,
        intensity: Number = definedExternally
) : Light {

    var distance: Double
    var decay: Double

    var shadow: LightShadow

    fun copy(source: PointLight) : PointLight

}

