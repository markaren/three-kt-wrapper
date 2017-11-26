@file:JsQualifier("THREE")

package info.laht.threekt.core

import info.laht.threekt.math.*

/**
 * This is the base class for most objects in three.js and provides a set of properties and methods for manipulating objects in 3D space.
 *
 * Note that this can be used for grouping objects via the .add( object ) method which adds the object as a child, however it is better to use Group for this.
 */
open external class Object3D {

    companion object {
        val DefaultUp: Vector3
        val DefaultMatrixAutoUpdate: Boolean
    }

    val uuid: String
    /**
     * Optional name of the object (doesn't need to be unique). Default is an empty string.
     */
    val name: String

    val parent: Object3D?
    /**
     * Array with object's children. See Group for info on manually grouping objects.
     */
    val children: Array<Object3D>

    val up: Vector3

    val position: Vector3
    val rotation: Euler
    val quaternion: Quaternion
    val scale: Vector3
    val modelViewMatrix: Matrix4
    val normalMatrix: Matrix3

    /**
     * The local transform matrix.
     */
    var matrix: Matrix4
    /**
     * The global transform of the object. If the Object3D has no parent, then it's identical to the local transform .matrix.
     */
    var matrixWorld: Matrix4

    /**
     * When this is set, it calculates the matrix of position, (rotation or quaternion) and scale every frame and also recalculates the matrixWorld property. Default is Object3D.DefaultMatrixAutoUpdate (true).
     */
    var matrixAutoUpdate: Boolean
    /**
     * When this is set, it calculates the matrixWorld in that frame and resets this property to false. Default is false.
     */
    var matrixWorldNeedsUpdate: Boolean

    var layers: Layers
    var visible: Boolean

    /**
     * Whether the object gets rendered into shadow map. Default is false.
     */
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
    fun rotateX(angle: Number)
    fun rotateY (angle: Number)
    fun rotateZ (angle: Number)
    fun translateOnAxis (axis: Vector3, distance: Double)
    fun translateX (distance: Double)
    fun translateY (distance: Double)
    fun translateZ (distance: Double)
    fun localToWorld ( vector: Vector3) : Vector3
    fun worldToLocal (vector: Vector3) : Vector3
    fun lookAt(v: Vector3)
    fun lookAt (x: Number, y: Number, z: Number)
    fun add ( `object`: Object3D)
    fun remove ( `object`: Object3D)
    fun getObjectById ( id: Int ) : Object3D?
    fun getObjectByName ( name: String ) : Object3D?
    fun getObjectByProperty ( name : String, value: dynamic ) : Object3D?
    fun getWorldPosition ( optionalTarget: Vector3 = definedExternally ) : Vector3
    fun getWorldQuaternion (optionalTarget: Quaternion = definedExternally) : Quaternion
    fun getWorldRotation (optionalTarget: Euler = definedExternally) : Euler
    fun getWorldScale (optionalTarget: Vector3 = definedExternally) : Vector3
    open fun getWorldDirection (optionalTarget: Vector3 = definedExternally) : Vector3
    open fun raycast ()
    fun traverse ( callback: (Object3D) -> Unit)
    fun traverseVisible ( callback: (Object3D) -> Unit )
    fun traverseAncestors ( callback: (Object3D) -> Unit )
    fun updateMatrix ()
    open fun updateMatrixWorld ( force: Boolean )
    fun toJSON ( meta: String = definedExternally ) : dynamic
    open fun clone ( recursive:Boolean = definedExternally) : Object3D
    open fun copy (source: Object3D, recursive: Boolean = definedExternally ) : Object3D

}

