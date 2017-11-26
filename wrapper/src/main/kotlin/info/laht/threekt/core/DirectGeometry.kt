@file:JsQualifier("THREE")

package info.laht.threekt.core

import info.laht.threekt.math.Box3
import info.laht.threekt.math.Sphere

open external class DirectGeometry {

    var verticesNeedUpdate: Boolean
    var normalsNeedUpdate: Boolean
    var colorsNeedUpdate: Boolean
    var uvsNeedUpdate: Boolean
    var groupsNeedUpdate: Boolean

    fun computeBoundingBox() : Box3
    fun computeBoundingSphere() : Sphere

    fun dispose()

    fun fromGeometry(geometry: Geometry)

}