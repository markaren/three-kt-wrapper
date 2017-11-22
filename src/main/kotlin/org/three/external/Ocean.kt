//package org.three.external
//
//import org.three.cameras.Camera
//import org.three.math.Vector3
//import org.three.renderers.WebGLRenderer
//import org.three.scenes.Scene
//
//class Ocean(
//        renderer: WebGLRenderer,
//        camera: Camera,
//        scene: Scene,
//        options: OceanOptions
//) : OceanProxy(renderer, camera, scene, options.options)
//
//class OceanOptions(
//        clearColor: FloatArray,
//        geometryOrigin: FloatArray,
//        sunDirection: FloatArray,
//        oceanColor: Vector3,
//        skyColor: Vector3,
//        exposure: Float,
//        geometryResolution : Int,
//        geometrySize : Int,
//        resolution : Int,
//        floatSize: Int,
//        wind  : FloatArray,
//        size  : Float,
//        choppiness  : Float
//) {
//
//    val options: dynamic = js("new Object()")
//
//    init {
//
//        clearColor.let { options.clearColor = it }
//        geometryOrigin.let { options.geometryOrigin = it }
//        sunDirection.let { options.sunDirection = it }
//        oceanColor.let { options.oceanColor = it }
//        skyColor.let { options.skyColor = it }
//        exposure.let { options.exposure = it }
//        geometryResolution.let { options.geometryResolution = it }
//        geometrySize.let { options.geometrySize = it }
//        resolution.let { options.resolution = it }
//        floatSize.let { options.floatSize = it }
//        wind.let { options.wind = it }
//        size.let { options.size = it }
//        choppiness.let { options.choppiness = it }
//
//    }
//
//}