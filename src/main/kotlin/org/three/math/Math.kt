@file:JsQualifier("THREE")

package org.three.math


external class Math {

    companion object {

        val DEG2RAD: Double
        val RAD2DEG: Double

        fun generateUUID(): String

        fun clamp(value: Int, min: Int, max: Int): Int
        fun clamp(value: Double, min: Double, max: Double): Double

        fun mapLinear(x: Double, a1:Double, a2:Double, b1:Double, b2:Double): Double

        fun lerp(x: Double, y: Double, t: Double): Double

        fun degToRad(deegrees: Double) : Double
        fun radToDeg(radians: Double) : Double

    }

}