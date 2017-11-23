@file:JsQualifier("THREE")

package info.laht.threekt.scenes

import info.laht.threekt.math.Color

open external class Fog {

    var name: String
    var color: Color

    var near: Int
    var far: Int

    fun clone() : Fog

    fun toJSON() : String

}

