@file:JsQualifier("THREE")

package org.three.cameras

open external class PerspectiveCamera : Camera {

    constructor(fov: Int, aspect: Double, near: Double, far: Double)

    var fov: Int
    var zoom: Double

    var near: Double
    var far: Double
    var focus: Double

    val aspect: Double
    val view: dynamic

    var filmGauge: Int
    var filmOffset: Int

    fun copy(source: PerspectiveCamera, recursive: Boolean = definedExternally)


}