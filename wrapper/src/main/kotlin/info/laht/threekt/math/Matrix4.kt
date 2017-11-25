@file:JsQualifier("THREE")

package info.laht.threekt.math

import info.laht.threekt.core.BufferGeometry

open external class Matrix4 {

    constructor()

    val elements: DoubleArray

    fun set(n11: Number, n12: Number, n13: Number, n14: Number,
            n21: Number, n22: Number, n23: Number, n24: Number,
            n31: Number, n32: Number, n33: Number, n34: Number,
            n41: Number, n42: Number, n43: Number, n44: Number)

    fun identity () : Matrix4

    fun clone () : Matrix4

    fun copy ( m: Matrix4) : Matrix4

    fun copyPosition ( m: Matrix4): Matrix4

    fun extractBasis (xAxis: Vector3, yAxis: Vector3, zAxis: Vector3) : Matrix4

    fun makeBasis (xAxis: Vector3, yAxis: Vector3, zAxis: Vector3) : Matrix4

    fun extractRotation (m: Matrix4) : Matrix4

    fun makeRotationFromEuler ( euler: Euler) : Matrix4

    fun makeRotationFromQuaternion ( q: Quaternion): Quaternion

    fun lookAt (eye : Vector3, target: Vector3, up: Vector3): Matrix4

    fun multiply ( m: Matrix4) : Matrix4

    fun multiplyMatrices (a: Matrix4, b: Matrix4) : Matrix4

    fun multiplyScalar ( s: Double ): Matrix4

    fun  applyToBufferAttribute (attribute : BufferGeometry)

    fun  determinant () : Double

    fun  transpose () : Matrix4

    fun  setPosition ( v: Vector3) : Matrix4

    fun  getInverse (m : Matrix4, throwOnDegenerate: () -> Unit = definedExternally )

    fun  scale ( v: Vector3): Matrix4

    fun getMaxScaleOnAxis () : Double

    fun makeTranslation ( x: Double, y: Double, z: Double ) : Matrix4

    fun makeRotationX ( theta: Double ): Matrix4

    fun makeRotationY ( theta: Double ) : Matrix4

    fun makeRotationZ ( theta: Double ) : Matrix4

    fun makeRotationAxis (axis: Vector3, angle:Double ) : Matrix4

    fun makeScale ( x: Double, y: Double, z: Double ) : Matrix4

    fun makeShear ( x:Double, y:Double, z:Double ) : Matrix4

    fun compose (position: Vector3, quaternion: Vector3, scale: Vector3) : Matrix4

    fun decompose (position: Vector3, quaternion: Vector3, scale: Vector3) : Matrix4

    fun makePerspective ( left: Int, right: Int, top: Int, bottom: Int, near: Double, far:Double ) : Matrix4

    fun makeOrthographic ( left: Int, right: Int, top: Int, bottom: Int, near: Double, far: Double ) : Matrix4

    fun equals ( matrix: Matrix4) : Boolean

    fun fromArray ( array: DoubleArray, offset: Int = definedExternally ) : Matrix4

    fun toArray ( array: DoubleArray, offset: Int = definedExternally ) : DoubleArray

}

