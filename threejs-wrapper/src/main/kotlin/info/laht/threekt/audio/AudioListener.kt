@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.audio

import info.laht.threekt.core.Object3D

/**
 * Create a non-positional ( global ) audio object.
 *
 * This uses the Web Audio API.
 */
external class AudioListener : Object3D {

    var context: dynamic

    /**
     * Return the gainNode.
     */
    fun getInput(): dynamic

    /**
     * Set the filter property to null.
     */
    fun removeFilter()

    /**
     * Returns the value of the filter property.
     */
    fun getFilter(): dynamic

    /**
     * Set the filter property to value.
     */
    fun setFilter(value: dynamic)

    fun getMasterVolume(): Double

    fun setMasterVolume(value: Number)

}