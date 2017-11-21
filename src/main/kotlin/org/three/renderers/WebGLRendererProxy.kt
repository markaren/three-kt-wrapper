@file:JsQualifier("THREE")

package org.three.renderers

import org.three.cameras.Camera
import org.three.scenes.Scene
import org.w3c.dom.Node


@JsName("WebGLRenderer")
open external class WebGLRendererProxy {

    protected  constructor()
    protected constructor(params: dynamic)

    var domElement: Node

    var autoClear: Boolean
    var autoClearColor: Boolean
    var autoClearDepth: Boolean
    var autoClearStencil: Boolean

    var sortObjects: Boolean

    var gammaFactor: Float
    var gammaInput: Boolean
    var gammaOutput: Boolean

    var physicallyCorrectLights: Boolean


    var toneMapping: Int
    var toneMappingExposure: Number;
    var toneMappingWhitePoint: Number

    var maxMorphTargets: Int
    var maxMorphNormals: Int

    fun getSize() : dynamic
    fun setSize(width: Int, height: Int, updateStyle: Boolean = definedExternally)

    fun render(scene: Scene, camera: Camera, renderTarget: dynamic = definedExternally, forceClear: Boolean = definedExternally)

}