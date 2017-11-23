@file:JsQualifier("THREE")

package info.laht.threekt.external

import info.laht.threekt.cameras.Camera
import info.laht.threekt.math.Vector3
import info.laht.threekt.renderers.WebGLRenderer
import info.laht.threekt.scenes.Scene

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