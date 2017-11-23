@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.core.Intersect
import info.laht.threekt.core.Object3D
import info.laht.threekt.core.Raycaster
import info.laht.threekt.materials.Material

open external class Points : Object3D {

    var geometry: dynamic
    var material: Material

    fun raycast(raycaster: Raycaster, intercects: List<Intersect>)

    fun clone() : Points

}