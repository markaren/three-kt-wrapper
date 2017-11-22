@file:JsQualifier("THREE")

package org.three.math

open external class Matrix3 {

    constructor()

    var elements: DoubleArray

    fun clone () : Matrix3

    fun copy ( m: Matrix3 ) : Matrix3

}