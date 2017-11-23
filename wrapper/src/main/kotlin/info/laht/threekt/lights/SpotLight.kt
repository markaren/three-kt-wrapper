@file:JsQualifier("THREE")

package info.laht.threekt.lights

import info.laht.threekt.core.Object3D

open external class SpotLight(
        color: Int = definedExternally,
        intensity: Double = definedExternally,
        distance: Double = definedExternally,
        angle: Double = definedExternally,
        penumbra: Double = definedExternally,
        decay: Double = definedExternally
) : Light {

    var target: Object3D

    var power: Double

    var distance: Double
    var angle: Double
    var penumbra: Double
    var decay : Number

    var shadow: SpotLightShadow

    fun copy(source: SpotLight) : SpotLight

}