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

@file:JsQualifier("THREE")

package info.laht.threekt.renderers

import info.laht.threekt.cameras.Camera
import info.laht.threekt.scenes.Scene
import org.w3c.dom.Node


external class WebGLRenderer(params: WebGLRendererParams = definedExternally) {

    var domElement: Node

    var autoClear: Boolean
    var autoClearColor: Boolean
    var autoClearDepth: Boolean
    var autoClearStencil: Boolean

    var sortObjects: Boolean

    var gammaFactor: Double
    var gammaInput: Boolean
    var gammaOutput: Boolean

    var physicallyCorrectLights: Boolean


    var toneMapping: Int
    var toneMappingExposure: Double;
    var toneMappingWhitePoint: Double

    var maxMorphTargets: Int
    var maxMorphNormals: Int

    interface Size {
        val x: Int
        val y: Int
    }

    fun clear(
        color: Boolean = definedExternally,
        depth: Boolean = definedExternally,
        stencil: Boolean = definedExternally
    )

    fun clearColor()
    fun clearDepth()
    fun clearStencil()

    fun getSize(): Size
    fun setSize(width: Int, height: Int, updateStyle: Boolean = definedExternally)

    /**
     * Sets the clear alpha. Valid input is a float between 0.0 and 1.0.
     */
    fun setClearAlpha(alpha: Number)

    /**
     * Sets the clear color and opacity.
     */
    fun setClearColor(color: Int, alpha: Number)

    /**
     * Render a scene using a camera.
     * The render is done to the renderTarget (if specified) or to the canvas as usual.
     * If forceClear is true, the depth, stencil and color buffers will be cleared before rendering even if the renderer's autoClear property is false.
     * Even with forceClear set to true you can prevent certain buffers being cleared by setting either the autoClearColor, autoClearStencil or autoClearDepth properties to false.
     */
    fun render(
        scene: Scene,
        camera: Camera,
        renderTarget: dynamic = definedExternally,
        forceClear: Boolean = definedExternally
    )

    fun setPixelRatio(value: Number)

}