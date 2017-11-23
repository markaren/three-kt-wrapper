@file:JsQualifier("THREE")

package info.laht.threekt.core

open external class Face3 {

    var a: Int
    var b: Int
    var c: Int

    var materialIndex: Int

    fun clone() : Face3
    fun copy(source: Face3): Face3

}