/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

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
external class Layers {

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
    fun toggle(layer: Int)

    /**
     * Remove membership of this layer.
     * @layer - an integer from 0 to 31.
     */
    fun disable(layer: Int)

    /**
     * Returns true if this and the passed layers object are members of the same set of layers.
     * @param layers a Layers object
     */
    fun test(layers: Int)
}