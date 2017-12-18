@file:JsQualifier("THREE")

package info.laht.threekt.helpers

import info.laht.threekt.core.Object3D
import info.laht.threekt.lights.HemiSphereLight
import info.laht.threekt.lights.Light

/**
 * Creates a visual aid consisting of a spherical Mesh for a HemisphereLight.
 *
 * @param light The light being visualized.
 * @param size The size of the mesh used to visualize the light.
 * @param color (optional) if this is not the set the helper will take the color of the light.
 */
open external class HemisphereLightHelper(
        light: HemiSphereLight,
        size: Number,
        color: Int = definedExternally
): Object3D {

    var light: Light

    fun dispose()

}