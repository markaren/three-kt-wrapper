@file:JsQualifier("THREE")

package org.three.lights

import org.three.core.Object3D

open external class SpotLight(
        color: Int = definedExternally,
        intensity: Float = definedExternally,
        distance: Float = definedExternally,
        angle: Float = definedExternally,
        penumbra: Float = definedExternally,
        decay: Float = definedExternally
) : Light {

    var target: Object3D

    var power: Float

    var distance: Float
    var angle: Float
    var penumbra: Float
    var decay : Number

    var shadow: SpotLightShadow

    fun copy(source: SpotLight) : SpotLight

}