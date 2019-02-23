/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.core

import info.laht.threekt.cameras.Camera
import info.laht.threekt.math.Ray
import info.laht.threekt.math.Vector2
import info.laht.threekt.math.Vector3

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

external class Raycaster {

    constructor(origin: Vector3, direction: Vector3, near: Number, far: Number)

    var ray: Ray
    var near: Double
    var far: Double

    fun set(origin: Vector3, direction: Vector3): Raycaster

    fun setFromCamera(coord: Vector2, camera: Camera)

    fun intersectObject(object3D: Object3D, recursive: Boolean): List<Intersect>

    fun intersectObjects(objects: List<Object3D>, recursive: Boolean): List<Intersect>

}