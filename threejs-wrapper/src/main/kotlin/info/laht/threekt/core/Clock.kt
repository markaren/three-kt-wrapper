/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.core

/**
 * Object for keeping track of time.
 * This uses performance.now() if it is available, otherwise it reverts to the less accurate Date.now().
 * @param autoStart (optional) whether to automatically start the clock. Default is true.
 */
external class Clock(autoStart: Boolean = definedExternally) {

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
    fun getElapsedTime(): Double

    /**
     * Get the seconds passed since the time oldTime was set and sets oldTime to the current time.
     * If autoStart is true and the clock is not running, also starts the clock.
     */
    fun getDelta(): Double

}