@file:JsQualifier("THREE")

package info.laht.threekt.core

open external class Clock(autoStart: Boolean) {

    var autoStart: Boolean

    var startTime: Double
    var oldTime: Double
    var elapsedTime: Double

    var running: Boolean

    fun start()
    fun stop()
    fun getElapsedTime() : Double
    fun getDelta() : Double

}