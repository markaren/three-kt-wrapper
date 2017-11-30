@file:JsQualifier("THREE")

package info.laht.threekt.animation

import org.khronos.webgl.Float32Array

open external class KeyFrameTrack(
        name: String,
        times: Array<Number>,
        values: Array<Number>,
        interpolation: Int
) {

    companion object {
        var DefaultInterpolation: Int
    }

    var name: String
    var times: Float32Array
    var values: Float32Array


}