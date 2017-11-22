@file:JsQualifier("THREE")

package org.three.math

open external class Matrix3 {

    constructor()

    var elements: List<Double>

    fun clone () : Matrix3

    fun copy ( m: Matrix3 ) : Matrix3

}