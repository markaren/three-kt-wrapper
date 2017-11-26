@file:JsQualifier("THREE")

package info.laht.threekt.helpers

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.math.Box3
import info.laht.threekt.objects.LineSegments

open external class Box3Helper(
        box: Box3,
        hex: Int = definedExternally
) : LineSegments {

    var box: Box3
    var geometry: BufferGeometry

}