@file:JsQualifier("THREE")

package org.three.lights

import org.three.core.Object3D

open external class DirectionalLight(
        color: Int = definedExternally,
        intensity: Float = definedExternally
) : Light {

    var target: Object3D

    var shadow: DirectionalLightShadow

}