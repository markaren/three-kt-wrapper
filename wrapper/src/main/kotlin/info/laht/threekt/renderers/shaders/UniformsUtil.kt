@file:JsQualifier("THREE")

package info.laht.threekt.renderers.shaders

import info.laht.threekt.core.Uniform

external object UniformsUtil {

    fun merge(uniforms: Array<Uniform>) : dynamic

    fun clone(uniforms_src: Uniform) : dynamic

}