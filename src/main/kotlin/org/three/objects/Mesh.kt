@file:JsQualifier("THREE")

package org.three.objects

import org.three.core.BufferGeometry
import org.three.core.Geometry
import org.three.core.Object3D
import org.three.core.Raycaster
import org.three.materials.Material

open external class Mesh : Object3D {

    constructor(geometry: Geometry, material: Material)
    constructor(geometry: BufferGeometry, material: Material)

    var geometry: dynamic
    var material: Material

    var drawMode: Int

    fun copy(source: Mesh) : Mesh
    fun updateMorphTargets()
    fun raycast(raycaster: Raycaster, intersects: List<dynamic> )
    fun clone() : Mesh

}