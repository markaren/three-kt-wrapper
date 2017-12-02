@file:JsQualifier("THREE")

package info.laht.threekt.lights

/**
 * This light globally illuminates all objects in the scene equally.
 *
 * This light cannot be used to cast shadows as it does not have a direction.
 */
open external class AmbientLight(
        color: Int = definedExternally,
        intensity: Number = definedExternally
) : Light