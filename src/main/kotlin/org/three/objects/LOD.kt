@file:JsQualifier("THREE")

package org.three.objects

import org.three.core.Object3D
import org.three.core.Raycaster



open external class LOD : Object3D {

    fun addLevel(`object`: Object3D, distance: Double)

    fun raycast(raycaster: Raycaster, intercects: List<Any>)

    fun update()

}