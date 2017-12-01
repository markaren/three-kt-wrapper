@file:JsQualifier("THREE")

package info.laht.threekt.lights

import info.laht.threekt.core.Object3D
import info.laht.threekt.math.Color

/**
 * Abstract base class for lights - all other light types inherit the properties and methods described here.
 */
open external class Light(
        color: Int = definedExternally,
        intensity: Number = definedExternally
) : Object3D {

    /**
     * Color of the light. Defaults to a new Color set to white, if not passed in the constructor.
     */
    var color: Color
    /**
     * The light's intensity, or strength.
     * In physically correct mode, the product of color * intensity is interpreted as luminous intensity measured in candela.
     * Default - 1.0.
     */
    var intensity : Double

    var receiveShadow: Boolean?

    /**
     * Copies the value of color and intensity from the source light into this one.
     */
    fun copy(source: Light) : Light

}