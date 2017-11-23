@file:JsQualifier("THREE")

package info.laht.threekt.core

open external class Clock(autoStart: Boolean) {

    fun start()
    fun stop()
    fun getElapsedTime() : Double
    fun getDelta() : Double

}