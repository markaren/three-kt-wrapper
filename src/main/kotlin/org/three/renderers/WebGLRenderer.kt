@file:JsQualifier("THREE")

package org.three.renderers

import org.three.cameras.Camera
import org.three.scenes.Scene
import org.w3c.dom.Node


open external class WebGLRenderer {

    constructor()
    constructor(parameters: WebGLRendererParameters)

    var domElement: Node

    var autoClear: Boolean
    var autoClearColor: Boolean
    var autoClearDepth: Boolean
    var autoClearStencil: Boolean

    var sortObjects: Boolean

    var gammaFactor: Double
    var gammaInput: Boolean
    var gammaOutput: Boolean

    var maxMorphTargets: Int
    var maxMorphNormals: Int

    fun getSize() : dynamic
    fun setSize(width: Int, height: Int, updateStyle: Boolean = definedExternally)

    fun render(scene: Scene, camera: Camera, renderTarget: dynamic = definedExternally, forceClear: Boolean = definedExternally)

}