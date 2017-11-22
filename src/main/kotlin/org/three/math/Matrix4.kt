@file:JsQualifier("THREE")

package org.three.math

import org.three.core.BufferGeometry

open external class Matrix4 {

    constructor()

    val elements: DoubleArray

    fun set(n11: Double, n12: Double, n13: Double, n14: Double,
            n21: Double, n22: Double, n23: Double, n24: Double,
            n31: Double, n32: Double, n33: Double, n34: Double,
            n41: Double, n42: Double, n43: Double, n44: Double)

    fun identity () : Matrix4

    fun clone () : Matrix4

    fun copy ( m: Matrix4 ) : Matrix4

    fun copyPosition ( m: Matrix4 ): Matrix4

    fun extractBasis ( xAxis: Vector3, yAxis: Vector3, zAxis: Vector3 ) : Matrix4

    fun makeBasis ( xAxis: Vector3, yAxis: Vector3, zAxis: Vector3 )

    fun extractRotation (m: Matrix4) : Matrix4

    fun makeRotationFromEuler ( euler: Euler ) : Matrix4

    fun makeRotationFromQuaternion ( q: Quaternion ): Quaternion

    fun lookAt (eye : Vector3, target: Vector3, up: Vector3): Matrix4

    fun multiply ( m: Matrix4) : Matrix4

    fun multiplyMatrices ( a: Matrix4, b: Matrix4 ) : Matrix4

    fun multiplyScalar ( s: Double ): Matrix4

    fun  applyToBufferAttribute (attribute : BufferGeometry)

    fun  determinant () : Double

    fun  transpose () : Matrix4

    fun  setPosition ( v: Vector3 ) : Matrix4

    fun  getInverse ( m : Matrix4, throwOnDegenerate: () -> Unit = definedExternally )

    fun  scale ( v: Vector3 ): Matrix4

    fun getMaxScaleOnAxis () : Double

    fun makeTranslation ( x: Double, y: Double, z: Double ) : Matrix4

    fun makeRotationX ( theta: Double ): Matrix4

    fun makeRotationY ( theta: Double ) : Matrix4

    fun makeRotationZ ( theta: Double ) : Matrix4

    fun makeRotationAxis ( axis: Vector3, angle:Double ) : Matrix4

    fun makeScale ( x: Double, y: Double, z: Double ) : Matrix4

    fun makeShear ( x:Double, y:Double, z:Double ) : Matrix4

    fun compose ( position: Vector3, quaternion: Vector3, scale: Vector3 ) : Matrix4

    fun decompose (position: Vector3, quaternion: Vector3, scale: Vector3) : Matrix4

    fun makePerspective ( left: Int, right: Int, top: Int, bottom: Int, near: Double, far:Double ) : Matrix4

    fun makeOrthographic ( left: Int, right: Int, top: Int, bottom: Int, near: Double, far: Double ) : Matrix4

    fun equals ( matrix: Matrix4 ) : Boolean

    fun fromArray ( array: DoubleArray, offset: Int = definedExternally )

    fun toArray ( array: DoubleArray, offset: Int = definedExternally )

}

