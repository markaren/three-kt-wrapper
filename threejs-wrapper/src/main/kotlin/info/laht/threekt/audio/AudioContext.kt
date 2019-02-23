@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.audio

/**
 * This contains methods for setting up an AudioContext.
 * Used internally by the AudioListener and AudioLoader classes.
 *
 * This uses the Web Audio API.
 */
external object AudioContext {

    /**
     * Return the value of the variable context in the outer scope, if defined, otherwise set it to a new AudioContext.
     */
    fun getContext(): dynamic

    /**
     * Set the variable context in the outer scope to value.
     */
    fun setContext(value: dynamic)

}