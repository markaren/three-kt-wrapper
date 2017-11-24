@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.materials.Material

open external class LineLoop : Line {

    constructor(geometry: BufferGeometry, material: Material)

}