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

package info.laht.threekt.scenes

import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material

/**
 * Scenes allow you to set up what and where is to be rendered by three.js.
 * This is where you place objects, lights and cameras.
 */
external class Scene : Object3D {

    /**
     * A fog instance defining the type of fog that affects everything rendered in the scene. Default is null.
     */
    var fog: dynamic

    /**
     * If not null, it will force everything in the scene to be rendered with that material. Default is null.
     */
    var overideMaterial: Material

    /**
     * Default is true. If set, then the renderer checks every frame if the scene and its objects needs matrix updates.
     * When it isn't, then you have to maintain all matrices in the scene yourself.
     */
    var autoUpdate: Boolean
    /**
     * If not null, sets the background used when rendering the scene, and is always rendered first.
     * Can be set to a Color which sets the clear color, a Texture covering the canvas, or a CubeTexture. Default is null.
     */
    var background: dynamic

    fun copy(source: Scene, recursive: Boolean = definedExternally): Scene

}
