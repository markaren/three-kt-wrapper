@file:JsQualifier("THREE")

package info.laht.threekt.math


open external class Euler(
        x: Number = definedExternally,
        y: Number = definedExternally,
        z: Number = definedExternally,
        order: String = definedExternally
) {

    companion object {
        val RotationOrders: Array<String>
        var DefaultOrder: String
    }

    var x: Double
    var y: Double
    var z: Double

    var order: String

    fun set(x: Number, y: Number, z: Number, order: String = definedExternally) : Euler

    fun clone() : Euler
    fun copy(euler: Euler): Euler

    fun setFromRotationMatrix(m: Matrix4, order:String = definedExternally, update: Boolean = definedExternally) : Euler

    fun  setFromQuaternion (q: Quaternion, order:String = definedExternally, update: Boolean = definedExternally)

    fun setFromVector3 ( v: Vector3, order: String = definedExternally ): Euler

    fun reorder (order: String) : Euler

    fun equals ( euler: Euler ) : Boolean

    fun fromArray ( array: DoubleArray ) : Euler

    fun toArray ( array: DoubleArray = definedExternally, offset: Int = definedExternally ) : DoubleArray

    fun toVector3 ( optionalResult: Vector3 = definedExternally ) : Vector3

    fun onChange ( callback: () -> Unit )


}

