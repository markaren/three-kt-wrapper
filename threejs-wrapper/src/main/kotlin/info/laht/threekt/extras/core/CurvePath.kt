@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.core


open external class CurvePath<E> : Curve<E> {

    var curves: List<Curve<E>>

    var autoClose: Boolean

    fun add(curve: Curve<E>)

    fun closePath()

    fun getPoint(t: Double)

    override fun clone(): CurvePath<E>

    fun copy(source: CurvePath<E>): CurvePath<E>
}