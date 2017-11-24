@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material

open external class LineSegments : Object3D {

    constructor(geometry: BufferGeometry, material: Material)

}