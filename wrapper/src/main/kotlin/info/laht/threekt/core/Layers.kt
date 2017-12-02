@file:JsQualifier("THREE")

package info.laht.threekt.core

/**
 * A Layers object assigns an Object3D to 1 or more of 32 layers numbered 0 to 31 - internally the
 * layers are stored as a bit mask, and by default all Object3Ds are a member of layer 0.
 *
 * This can be used to control visibility - an object must share a layer with a camera to be visible when that
 * camera's view is renderered.
 *
 * All classes that inherit from Object3D have an Object3D.layers property which is an instance of this class.
 */
open external class Layers {

    /**
     * A bit mask storing which of the 32 layers this layers object is currently a member of.
     */
    var mask: Int

    /**
     * Set membership to layer, and remove membership all other layers.
     * @param layer layer - an integer from 0 to 31.
     */
    fun set(layer: Int)

    /**
     * Add membership of this layer.
     * @param layer an integer from 0 to 31.
     */
    fun enable(layer: Int)
    /**
     * Toggle membership of layer.
     * @layer - an integer from 0 to 31.
     */
    fun toggle ( layer: Int )

    /**
     * Remove membership of this layer.
     * @layer - an integer from 0 to 31.
     */
    fun disable ( layer: Int )
    /**
     * Returns true if this and the passed layers object are members of the same set of layers.
     * @param layers a Layers object
     */
    fun test ( layers: Int )
}