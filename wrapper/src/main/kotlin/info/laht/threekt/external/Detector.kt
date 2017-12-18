@file:JsQualifier("THREE")

package info.laht.threekt.external

import org.w3c.dom.Element

external object Detector {

    val webgl: Boolean
    val canvas: Boolean
    val workers: Boolean
    val fileapi: Boolean

    fun getWebGLErrorMessage() : Element
    fun addGetWebGLMessage(parameters: dynamic)

}