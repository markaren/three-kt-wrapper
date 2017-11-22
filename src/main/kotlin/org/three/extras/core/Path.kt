@file:JsQualifier("THREE")

package org.three.extras.core

import org.three.math.Vector2

open external class Path : CurvePath<Vector2> {

    var currentPoint: Vector2

}