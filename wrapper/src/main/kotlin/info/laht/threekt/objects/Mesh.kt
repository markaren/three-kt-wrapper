@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.core.*
import info.laht.threekt.materials.Material

open external class Mesh : Object3D {

    constructor(geometry: Geometry, material: Material)
    constructor(geometry: BufferGeometry, material: Material)

    var geometry: dynamic
    var material: Material

    var drawMode: Int

    fun copy(source: Mesh) : Mesh
    fun updateMorphTargets()
    fun raycast(raycaster: Raycaster, intersects: List<Intersect> )
    fun clone() : Mesh

}