@file:JsQualifier("THREE")

package org.three.objects

import org.three.core.*
import org.three.materials.Material

open external class Line : Object3D {

    constructor(geometry: Geometry, material: Material)
    constructor(geometry: BufferGeometry, material: Material)

    var geometry: dynamic
    var material: Material

    fun raycast(raycaster: Raycaster, intercects: List<Intersect>)

    fun clone() : Line

}

