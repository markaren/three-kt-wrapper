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

@file:JsQualifier("THREE")
@file:JsModule("three-orbitcontrols")
@file:JsNonModule
package info.laht.threekt.external.controls

import info.laht.threekt.core.Object3D
import info.laht.threekt.math.Vector3
import org.w3c.dom.Node

/**
 *  This set of controls performs orbiting, dollying (zooming), and panning.
 *  Unlike TrackballControls, it maintains the "up" direction object.up (+Y by default).
 *
 *  Orbit - left mouse / touch: one finger move
 *  Zoom - middle mouse, or mousewheel / touch: two finger spread or squish
 *  Pan - right mouse, or arrow keys / touch: three finger swipe
 */
external class OrbitControls(`object`: Object3D, domElement: Node = definedExternally) {

    var `object`: Object3D

    var domElement: Node

    var enabled: Boolean

    var target: Vector3

    var minDistance: Double
    var maxDistance: Double

    var minZoom: Double
    var maxZoom: Double

    /**
     * How far you can orbit vertically, lower limit.
     * In radians
     */
    var minPolarAngle: Double
    /**
     * How far you can orbit vertically, upper limit.
     * In radians
     */
    var maxPolarAngle: Double

    var minAzimuthAngle: Double
    var maxAzimuthAngle: Double

    var enableDamping: Boolean
    var dampingFactor: Double

    var enableZoom: Boolean
    var zoomSpeed: Double

    var enableRotate: Boolean
    var rotateSpeed: Double

    var enablePan: Boolean
    var keyPanSpeed: Double

    var autoRotate: Boolean
    var autoRotateSpeed: Double

    var enableKeys: Boolean

    interface Keys {
        var LEFT: Int
        var UP: Int
        var RIGHT: Int
        var BOTTOM: Int
    }

    var keys: Keys

    fun getPolarAngle(): Double

    fun getAzimutAngle(): Double

    fun saveState()

    fun reset()

    fun update()

    fun dispose()
}