@file:JsQualifier("THREE")

package info.laht.threekt.lights

import info.laht.threekt.core.Object3D

open external class SpotLight(
        color: Int = definedExternally,
        intensity: Number = definedExternally,
        distance: Number = definedExternally,
        angle: Number = definedExternally,
        penumbra: Number = definedExternally,
        decay: Number = definedExternally
) : Light {

    var target: Object3D

    var power: Double

    var distance: Double
    var angle: Double
    var penumbra: Double
    var decay : Double

    var shadow: SpotLightShadow

    fun copy(source: SpotLight) : SpotLight

}