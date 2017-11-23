@file:JsQualifier("THREE")

package org.three.lights

import org.three.core.Object3D

open external class Light(
        color: Int = definedExternally,
        intensity: Double = definedExternally
) : Object3D {

    var color: Int
    var intensity : Double

    var receiveShadow: Boolean

    fun copy(source: Light) : Light

}