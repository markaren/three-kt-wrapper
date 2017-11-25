@file:JsQualifier("THREE")

package info.laht.threekt.math

open external class Box2(
        min: Vector2 = definedExternally,
        max: Vector2 = definedExternally
) {

    var min: Vector2
    var max: Vector2

    fun set(min: Vector2, max: Vector2) : Box2

    fun clone() : Box2
    fun copy(box: Box2) : Box2

}
