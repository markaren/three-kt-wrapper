@file:JsQualifier("THREE")

package info.laht.threekt.lights

import info.laht.threekt.math.Color

/**
 * A light source positioned directly above the scene, with color fading from the sky color to the ground color.
 *
 * This light cannot be used to cast shadows.
 */
open external class HemiSphereLight(
        skyColor: Int = definedExternally,
        groundColor: Int = definedExternally,
        intensity: Number = definedExternally
): Light {

    var groundColor: Color

    fun copy(light: HemiSphereLight) : HemiSphereLight

}