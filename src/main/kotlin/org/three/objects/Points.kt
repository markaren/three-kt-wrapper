@file:JsQualifier("THREE")

package org.three.objects

import org.three.core.Intersect
import org.three.core.Object3D
import org.three.core.Raycaster
import org.three.materials.Material

open external class Points : Object3D {

    var geometry: dynamic
    var material: Material

    fun raycast(raycaster: Raycaster, intercects: List<Intersect>)

    fun clone() : Points

}