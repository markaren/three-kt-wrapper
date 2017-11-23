@file:JsQualifier("THREE")

package info.laht.threekt.lights

open external class PointLight(
        color: Int = definedExternally,
        intensity: Double = definedExternally
) : Light {

    var distance: Double
    var decay: Number

    var shadow: LightShadow

    fun copy(source: PointLight) : PointLight

}

