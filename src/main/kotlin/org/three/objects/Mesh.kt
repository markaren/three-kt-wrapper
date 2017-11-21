@file:JsQualifier("THREE")

package org.three.objects

import org.three.core.BufferGeometry
import org.three.core.Geometry
import org.three.core.Object3D
import org.three.materials.Material

open external class Mesh : Object3D {

    constructor(geometry: Geometry, material: Material)
    constructor(geometry: BufferGeometry, material: Material)

}