@file:JsQualifier("THREE")

package org.three.external

import org.three.cameras.Camera
import org.three.math.Vector3
import org.three.renderers.WebGLRenderer
import org.three.scenes.Scene

open external class Ocean {

    protected constructor(renderer: WebGLRenderer,
                          camera: Camera,
                          scene: Scene,
                          options: dynamic)

    var clearColor: DoubleArray
    var geometryOrigin: DoubleArray
    var sunDirection: DoubleArray
    var oceanColor: Vector3
    var skyColor: Vector3
    var exposure: Double
    var geometryResolution: Int
    var geometrySize: Int
    var resolution: Int
    var floatSize: Int
    var windX: Double
    var windY: Double
    var size: Double
    var choppiness: Double

    fun render()

}