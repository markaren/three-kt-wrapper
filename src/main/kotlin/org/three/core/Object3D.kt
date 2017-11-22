@file:JsQualifier("THREE")

package org.three.core

import org.three.math.*

open external class Object3D {

    companion object {
        val DefaultUp: Vector3
        val DefaultMatrixAutoUpdate: Boolean
    }

    val uuid: String
    val name: String
    val type: String

    val parent: Object3D?
    val children: List<Object3D>

    val up: Vector3

    val position: Vector3
    val rotation: Euler
    val quaternion: Quaternion
    val scale: Vector3
    val modelViewMatrix: Matrix4
    val normalMatrix: Matrix3

    var matrix: Matrix4
    var matrixWorld: Matrix4

    var matrixAutoUpdate: Boolean
    var matrixWorldNeedsUpdate: Boolean

    var layers: Layers
    var visible: Boolean

    var castShadow: Boolean
    var receiveShadows: Boolean

    var frustrumCulled: Boolean
    var renderOrder: Int

    var userData: Map<String, Any>

    var onBeforeRender: () -> Unit
    var onAfterRender: () -> Unit

    fun applyMatrix(matrix: Matrix4)
    fun applyQuaternion(q: Quaternion)
    fun setRotationFromAxisAngle(axis: Vector3, angle: Double)
    fun setRotationFromEuler ( euler: Euler)
    fun setRotationFromMatrix ( m: Matrix3)
    fun setRotationFromQuaternion ( q: Quaternion)
    fun rotateOnAxis(axis: Vector3, angle: Double)
    fun rotateOnWorldAxis(axis: Vector3, angle: Double)
    fun rotateX(angle: Double)
    fun rotateY (angle: Double)
    fun rotateZ (angle: Double)
    fun translateOnAxis (axis: Vector3, distance: Double)
    fun translateX (distance: Double)
    fun translateY (distance: Double)
    fun translateZ (distance: Double)
    fun localToWorld ( vector: Vector3) : Vector3
    fun worldToLocal (vector: Vector3) : Vector3
    fun lookAt(v: Vector3)
    fun lookAt (x: Double, y: Double, z: Double)
    fun add ( `object`: Object3D )
    fun remove ( `object`: Object3D )
    fun getObjectById ( id: Int ) : Object3D?
    fun getObjectByName ( name: String ) : Object3D?
    fun getObjectByProperty ( name : String, value: dynamic ) : Object3D?
    fun getWorldPosition ( optionalTarget: Vector3 = definedExternally ) : Vector3
    fun getWorldQuaternion (optionalTarget: Quaternion = definedExternally) : Quaternion
    fun getWorldRotation (optionalTarget: Euler = definedExternally) : Euler
    fun getWorldScale (optionalTarget: Vector3 = definedExternally) : Vector3
    open fun getWorldDirection (optionalTarget: Vector3 = definedExternally) : Vector3
    open fun raycast ()
    fun traverse ( callback: dynamic)
    fun traverseVisible ( callback: dynamic )
    fun traverseAncestors ( callback: dynamic )
    fun updateMatrix ()
    open fun updateMatrixWorld ( force: Boolean )
    fun toJSON ( meta: String = definedExternally ) : String
    open fun clone ( recursive:Boolean = definedExternally) : Object3D
    open fun copy ( source: Object3D, recursive: Boolean ) : Object3D

}

