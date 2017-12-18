@file:JsQualifier("THREE")

package info.laht.threekt.core

/**
 * Object for keeping track of time.
 * This uses performance.now() if it is available, otherwise it reverts to the less accurate Date.now().
 * @param autoStart (optional) whether to automatically start the clock. Default is true.
 */
open external class Clock(
        autoStart: Boolean = definedExternally
) {

    /**
     * If set, starts the clock automatically when the first update is called. Default is true.
     */
    var autoStart: Boolean

    /**
     * Holds the time at which the clock's start method was last called.
     */
    val startTime: Double
    /**
     * Holds the time at which the clock's start, getElapsedTime or getDelta methods were last called.
     */
    val oldTime: Double
    /**
     * Keeps track of the total time that the clock has been running.
     */
    val elapsedTime: Double

    /**
     * Whether the clock is running or not.
     */
    val running: Boolean

    /**
     * Starts clock. Also sets the startTime and oldTime to the current time, sets elapsedTime to 0 and running to true.
     */
    fun start()

    /**
     * Stops clock and sets oldTime to the current time.
     */
    fun stop()
    /**
     * Get the seconds passed since the clock started and sets oldTime to the current time.
     * If autoStart is true and the clock is not running, also starts the clock.
     */
    fun getElapsedTime() : Double

    /**
     * Get the seconds passed since the time oldTime was set and sets oldTime to the current time.
     * If autoStart is true and the clock is not running, also starts the clock.
     */
    fun getDelta() : Double

}