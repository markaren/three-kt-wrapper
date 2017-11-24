@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.core.Intersect
import info.laht.threekt.core.Object3D
import info.laht.threekt.core.Raycaster
import info.laht.threekt.materials.Material

open external class Sprite(
        material: Material = definedExternally
) : Object3D {

    var material: Material

    fun raycast(raycaster: Raycaster, intersects: List<Intersect>)

    fun clone() : Sprite

}