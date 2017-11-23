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

    var clearColor: FloatArray
    var geometryOrigin: FloatArray
    var sunDirection: FloatArray
    var oceanColor: Vector3
    var skyColor: Vector3
    var exposure: Float

    fun render()

}