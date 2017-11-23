@file:JsQualifier("THREE")

package org.three.core

open external class Clock(autoStart: Boolean) {

    fun start()
    fun stop()
    fun getElapsedTime() : Double
    fun getDelta() : Double

}