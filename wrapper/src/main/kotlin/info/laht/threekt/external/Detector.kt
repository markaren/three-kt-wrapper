@file:JsQualifier("THREE")

package info.laht.threekt.external

import org.w3c.dom.Element

external object Detector {

    fun getWebGLErrorMessage() : Element
    fun addGetWebGLMessage(parameters: dynamic)

}