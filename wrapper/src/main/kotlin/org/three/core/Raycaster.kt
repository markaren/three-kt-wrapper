@file:JsQualifier("THREE")

package org.three.core

import org.three.cameras.Camera
import org.three.math.Ray
import org.three.math.Vector2
import org.three.math.Vector3

external interface Params {
    var Mesh: dynamic
    var Line: dynamic
    var LOD: dynamic
    var Points: dynamic
    var Sprite: dynamic
}

external interface Intersect {
    var distance: Double
    var distanceToRay: Double?
    var point: Vector3
    var index: Int
    var face: Face3?
    var faceIndex: Int?
    var `object`: Object3D
}

open external class Raycaster {

    constructor(origin: Vector3, direction: Vector3, near: Double, far: Double)

    var ray: Ray
    var near: Double
    var far: Double

    fun set(origin: Vector3, direction: Vector3) : Raycaster

    fun setFromCamera(coord: Vector2, camera: Camera)

    fun intersectObject(object3D: Object3D, recursive: Boolean) : List<Intersect>

    fun intersectObjects(objects: List<Object3D>, recursive: Boolean) : List<Intersect>

}