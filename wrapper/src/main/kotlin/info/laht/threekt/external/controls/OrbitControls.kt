@file:JsQualifier("THREE")

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
open external class OrbitControls(
        `object`: Object3D,
        domElement: Node = definedExternally
) {

    var `object`: Object3D

    var domElement: Node

    var enabled: Boolean

    var target: Vector3

    var minDistance: Double
    var maxDistance: Double

    var minZoom : Double
    var maxZoom : Double

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

    var minAzimuthAngle  : Double
    var maxAzimuthAngle  : Double

    var enableDamping: Boolean
    var dampingFactor: Double

    var enableZoom: Boolean
    var zoomSpeed: Double

    var enableRotate : Boolean
    var rotateSpeed : Double

    var enablePan  : Boolean
    var keyPanSpeed  : Double

    var autoRotate   : Boolean
    var autoRotateSpeed   : Double

    var enableKeys: Boolean

    interface Keys {
        var LEFT: Int
        var UP: Int
        var RIGHT: Int
        var BOTTOM: Int
    }

    var keys: Keys

    fun getPolarAngle() : Double

    fun getAzimutAngle() : Double

    fun saveState()

    fun reset()

    fun update()

    fun dispose()


}