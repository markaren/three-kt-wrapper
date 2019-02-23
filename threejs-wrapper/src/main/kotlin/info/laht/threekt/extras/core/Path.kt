@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.core

import info.laht.threekt.math.Vector2

open external class Path : CurvePath<Vector2> {

    var currentPoint: Vector2

}