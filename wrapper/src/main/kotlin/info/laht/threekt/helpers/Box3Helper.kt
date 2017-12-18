@file:JsQualifier("THREE")

package info.laht.threekt.helpers

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.math.Box3
import info.laht.threekt.objects.LineSegments

/**
 * Helper object to visualize a Box3.
 *
 * @param box the Box3 to show.
 * @param color (optional) the box's color. Default is 0xffff00.
 */
open external class Box3Helper(
        box: Box3,
        color: Int = definedExternally
) : LineSegments {

    /**
     * The Box3 being visualized.
     */
    var box: Box3

}