@file:JsQualifier("THREE")

package org.three.external.controls

import org.three.core.Object3D
import org.three.math.Vector3
import org.w3c.dom.Node

/**
 *  This set of controls performs orbiting, dollying (zooming), and panning.
 *  Unlike TrackballControls, it maintains the "up" direction object.up (+Y by default).
 *
 *  Orbit - left mouse / touch: one finger move
 *  Zoom - middle mouse, or mousewheel / touch: two finger spread or squish
 *  Pan - right mouse, or arrow keys / touch: three finger swipe
 */
open external class OrbitControls(
        object3D: Object3D,
        domElement: Node)
{

    var `object`: Object3D

    var domElement: Node

    var enabled: Boolean

    var target: Vector3

    var minDistance: Float
    var maxDistance: Float

    var minZoom : Float
    var maxZoom : Float

    /**
     * How far you can orbit vertically, lower limit.
     * In radians
     */
    var minPolarAngle: Float
    /**
     * How far you can orbit vertically, upper limit.
     * In radians
     */
    var maxPolarAngle: Float

    var minAzimuthAngle  : Float
    var maxAzimuthAngle  : Float

    var enableDamping: Boolean
    var dampingFactor: Float

    var enableZoom: Boolean
    var zoomSpeed: Float

    var enableRotate : Boolean
    var rotateSpeed : Float

    var enablePan  : Boolean
    var keyPanSpeed  : Float

    var autoRotate   : Boolean
    var autoRotateSpeed   : Float

    var enableKeys: Boolean

    interface Keys {
        var LEFT: Int
        var UP: Int
        var RIGHT: Int
        var BOTTOM: Int
    }

    var keys: Keys

    fun getPolarAngle() : Float

    fun getAzimutAngle() : Float

    fun saveState()

    fun reset()

    fun update()

    fun dispose()


}