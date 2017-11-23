@file:JsQualifier("THREE")

package info.laht.threekt.objects

import info.laht.threekt.cameras.Camera
import info.laht.threekt.core.Intersect
import info.laht.threekt.core.Object3D
import info.laht.threekt.core.Raycaster



open external class LOD : Object3D {

    fun copy(source: LOD) : LOD

    fun addLevel(`object`: Object3D, distance: Double)

    fun getObjectForDistance(distance: Double) : Object3D

    fun raycast(raycaster: Raycaster, intercects: List<Intersect>)

    fun update(camera: Camera)

}