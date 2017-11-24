@file:JsQualifier("THREE")

package info.laht.threekt.helpers

import info.laht.threekt.cameras.Camera
import info.laht.threekt.objects.LineSegments

open external class CameraHelper(
        camera: Camera
) : LineSegments {


    var camera: Camera

    fun update()

}

