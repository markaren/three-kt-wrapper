@file:JsQualifier("THREE")

package info.laht.threekt.lights

import info.laht.threekt.core.Object3D

open external class DirectionalLight(
        color: Int = definedExternally,
        intensity: Number = definedExternally
) : Light {

    var target: Object3D

    var shadow: DirectionalLightShadow

}