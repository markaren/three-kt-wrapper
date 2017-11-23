@file:JsQualifier("THREE")

package org.three.scenes

import org.three.math.Color

open external class Fog {

    var name: String
    var color: Color

    var near: Int
    var far: Int

    fun clone() : Fog

    fun toJSON() : String

}

