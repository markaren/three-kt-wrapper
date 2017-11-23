@file:JsQualifier("THREE")

package org.three.objects

import org.three.cameras.Camera
import org.three.core.Intersect
import org.three.core.Object3D
import org.three.core.Raycaster



open external class LOD : Object3D {

    fun copy(source: LOD) : LOD

    fun addLevel(`object`: Object3D, distance: Double)

    fun getObjectForDistance(distance: Double) : Object3D

    fun raycast(raycaster: Raycaster, intercects: List<Intersect>)

    fun update(camera: Camera)

}