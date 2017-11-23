@file:JsQualifier("THREE")

package org.three.lights

import org.three.core.Object3D

open external class Light(
        color: Int = definedExternally,
        intensity: Float = definedExternally
) : Object3D {

    var color: Int
    var intensity : Float

    var receiveShadow: Boolean

    fun copy(source: Light) : Light

}