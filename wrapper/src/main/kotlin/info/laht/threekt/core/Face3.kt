@file:JsQualifier("THREE")

package info.laht.threekt.core

import info.laht.threekt.math.Color
import info.laht.threekt.math.Vector3

open external class Face3 {

    constructor(a: Int,
                b: Int,
                c: Int,
                normal: Vector3 = definedExternally,
                color: Color = definedExternally,
                materialIndex: Int = definedExternally)

    constructor( a: Int,
                 b: Int,
                 c: Int,
                 normal: Array<Vector3> = definedExternally,
                 color: Array<Color> = definedExternally,
                 materialIndex: Int = definedExternally)

    var a: Int
    var b: Int
    var c: Int

    var normal: Vector3?
    var verrexNormals: Array<Vector3>?

    var color: Color?
    var vertexColors: Array<Color>?

    var materialIndex: Int?

    fun clone() : Face3
    fun copy(source: Face3): Face3

}