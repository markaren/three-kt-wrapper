@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.audio

/**
 * Create a positional audio object.
 *
 * This uses the Web Audio API.
 */
external class PositionalAudio(listener: AudioListener) : Audio {

    /**
     * The PositionalAudio's PannerNode.
     */
    var panner: dynamic

    /**
     * Returns the panner.
     */
    override fun getOutput(): dynamic

    /**
     * Returns the value of panner.refDistance.
     */
    fun getRefDistance(): Double

    /**
     * Sets the value of panner.refDistance.
     */
    fun setRefDistance(value: Number)

    /**
     * Returns the value of panner.rolloffFactor.
     */
    fun getRolloffFactor(): Double

    /**
     * Sets the value of panner.rolloffFactor.
     */
    fun setRolloffFactor(value: Number)

    /**
     * Returns the value of panner.distanceModel.
     */
    fun getDistanceModel(): String

    /**
     * Sets the value of panner.distanceModel.
     */
    fun setDistanceModel(value: String)

    /**
     * Returns the value of panner.maxDistance.
     */
    fun getMaxDistance(): Double

    /**
     * Sets the value of panner.maxDistance.
     */
    fun setMaxDistance(value: Number)

}