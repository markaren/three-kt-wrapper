@file:JsQualifier("THREE")

package org.three.objects

import org.three.core.BufferGeometry
import org.three.core.Geometry
import org.three.core.Object3D
import org.three.core.Raycaster
import org.three.materials.Material
import org.three.materials.MaterialProxy

open external class Mesh : Object3D {

    constructor(geometry: Geometry, material: MaterialProxy)
    constructor(geometry: BufferGeometry, material: MaterialProxy)

    var geometry: dynamic
    var material: MaterialProxy

    var drawMode: Int

    fun copy(source: Mesh) : Mesh
    fun updateMorphTargets()
    fun raycast(raycaster: Raycaster, intersects: List<dynamic> )
    fun clone() : Mesh

}