@file:JsQualifier("THREE")

package org.three.lights

import org.three.core.Object3D

open external class DirectionalLight(
        color: Int = definedExternally,
        intensity: Double = definedExternally
) : Light {

    var target: Object3D

    var shadow: DirectionalLightShadow

}