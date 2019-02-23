@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras.core


external abstract class Curve<E> {

    var arcLengthDivisions: Int

    fun getPoint(t: Double, optionalTarget: E = definedExternally): E

    fun getPointAt(u: Double, optionalTarget: E = definedExternally): E

    fun getPoints(divisions: Int): Array<E>

    fun getSpacedPoints(divisions: Int): Array<E>

    fun getLength(): Double

    fun updateArcLengths()

    fun getUtoTmapping(u: Double, distance: Double): Double

    fun getTangent(t: Double): E

    fun getTangentAt(u: Double): E

    fun computeFrenetFrames(segments: Int, closed: Boolean = definedExternally)

    open fun clone(): Curve<E>

    fun copy(source: Curve<E>): Curve<E>

}