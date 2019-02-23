@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.animation

import org.khronos.webgl.Float32Array

/**
 * @param name the identifier for the KeyframeTrack.
 * @param times an array of keyframe times, converted internally to a Float32Array.
 * @param values an array with the values related to the times array, converted internally to a Float32Array.
 * @param interpolation the type of interpolation to use. See Animation Constants for possible values. Default is InterpolateLinear.
 */
external class KeyFrameTrack(
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

    /**
     * Returns the interpolation type
     */
    fun getInterpolation(): Int


}