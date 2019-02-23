/*
 * The MIT License
 *
 * Copyright 2017-2018 Lars Ivar Hatledal
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING  FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

@file:JsModule("three")
@file:JsNonModule


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

    /**
     * readonly – Unique number for this object instance.
     */
    val id: Int

    /**
     * UUID of this object instance. This gets automatically assigned, so this shouldn't be edited.
     */
    val uuid: String
    /**
     * Optional name of the object (doesn't need to be unique). Default is an empty string.
     */
    val name: String

    /**
     * Object's parent in the scene graph.
     */
    val parent: Object3D?
    /**
     * Array with object's children. See Group for info on manually grouping objects.
     */
    val children: Array<Object3D>

    /**
     * This is used by the lookAt method, for example, to determine the orientation of the result.
     * Default is Object3D.DefaultUp - that is, ( 0, 1, 0 ).
     */
    val up: Vector3

    /**
     * A Vector3 representing the object's local position. Default is (0, 0, 0).
     */
    val position: Vector3
    /**
     * Object's local rotation (see Euler angles), in radians.
     */
    val rotation: Euler
    /**
     * Object's local rotation as a Quaternion.
     */
    val quaternion: Quaternion
    /**
     * The object's local # .scale . Default is Vector3( 1, 1, 1 ).
     */
    val scale: Vector3
    /**
     * This is passed to the shader and used to calculate the position of the object.
     */
    val modelViewMatrix: Matrix4
    /**
     * This is passed to the shader and used to calculate lighting for the object.
     * It is the transpose of the inverse of the upper left 3x3 sub-matrix of this object's modelViewMatrix.
     *
     * The reason for this special matrix is that simply using the modelViewMatrix could result in a non-unit
     * length of normals (on scaling) or in a non-perpendicular direction (on non-uniform scaling).
     *
     * On the other hand the translation part of the modelViewMatrix is not relevant for the calculation of normals.
     * Thus a Matrix3 is sufficient.
     */
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
     * When this is set, it calculates the matrix of position, (rotation or quaternion) and scale every frame and
     * also recalculates the matrixWorld property. Default is Object3D.DefaultMatrixAutoUpdate (true).
     */
    var matrixAutoUpdate: Boolean
    /**
     * When this is set, it calculates the matrixWorld in that frame and resets this property to false. Default is false.
     */
    var matrixWorldNeedsUpdate: Boolean

    var layers: Layers
    /**
     * Object gets rendered if true. Default is true.
     */
    var visible: Boolean

    /**
     * Whether the object gets rendered into shadow map. Default is false.
     */
    var castShadow: Boolean
    /**
     * Whether the material receives shadows. Default is false.
     */
    var receiveShadows: Boolean

    /**
     * When this is set, it checks every frame if the object is in the frustum of the camera before rendering the object.
     * Otherwise the object gets renderered every frame even if it isn't visible. Default is true.
     */
    var frustrumCulled: Boolean
    /**
     * This value allows the default rendering order of scene graph objects to be overridden although opaque and transparent objects remain sorted independently.
     * Sorting is from lowest to highest renderOrder. Default value is 0.
     */
    var renderOrder: Int

    /**
     * An object that can be used to store custom data about the Object3D.
     * It should not hold references to functions as these will not be cloned.
     */
    var userData: Map<String, Any>

    /**
     * An optional callback that is executed immediately before the Object3D is rendered.
     * This function is called with the following parameters: renderer, scene, camera, geometry, material, group.
     */
    var onBeforeRender: () -> Unit
    var onAfterRender: () -> Unit

    /**
     * Applies the matrix transform to the object and updates the object's position, rotation and scale.
     */
    fun applyMatrix(matrix: Matrix4)

    /**
     * Applies the rotation represented by the quaternion to the object.
     */
    fun applyQuaternion(q: Quaternion)

    fun setRotationFromAxisAngle(axis: Vector3, angle: Number)
    fun setRotationFromEuler(euler: Euler)
    fun setRotationFromMatrix(m: Matrix3)
    fun setRotationFromQuaternion(q: Quaternion)
    fun rotateOnAxis(axis: Vector3, angle: Number)
    fun rotateOnWorldAxis(axis: Vector3, angle: Double)
    fun rotateX(angle: Number)
    fun rotateY(angle: Number)
    fun rotateZ(angle: Number)
    /**
     * Translate an object by distance along an axis in object space. The axis is assumed to be normalized.
     * @param axis A normalized vector in object space.
     * @param distance The distance to translate.
     */
    fun translateOnAxis(axis: Vector3, distance: Number)

    /**
     * Translates object along x axis by distance units.
     */
    fun translateX(distance: Number)

    /**
     * Translates object along y axis by distance units.
     */
    fun translateY(distance: Number)

    /**
     * Translates object along z axis by distance units.
     */
    fun translateZ(distance: Number)

    /**
     * Converts the vector from local space to world space.
     * @param vector A vector representing a position in local (object) space.
     */
    fun localToWorld(vector: Vector3): Vector3

    /**
     *
     * Updates the vector from world space to local space.
     * @param vector A world vector.
     */
    fun worldToLocal(vector: Vector3): Vector3

    /**
     * Rotates the object to face a point in world space.
     * This method does not support objects with rotated and/or translated parent(s).
     * @param v A vector representing a position in world space.
     */
    fun lookAt(v: Vector3)

    /**
     * Rotates the object to face a point in world space.
     * This method does not support objects with rotated and/or translated parent(s).
     * @param x the x component of the world space position.
     * @param y the y component of the world space position.
     * @param z the z component of the world space position.
     */
    fun lookAt(x: Number, y: Number, z: Number)

    /**
     * Adds object as child of this object. An arbitrary number of objects may be added.
     */
    fun add(`object`: Object3D)

    /**
     * Removes object as child of this object. An arbitrary number of objects may be removed.
     */
    fun remove(`object`: Object3D)

    /**
     * Searches through the object's children and returns the first with a matching id.
     * Note that ids are assigned in chronological order: 1, 2, 3, ..., incrementing by one for each new object.
     * @param id Unique number of the object instance
     */
    fun getObjectById(id: Int): Object3D?

    /**
     * Searches through the object's children and returns the first with a matching name.
     * Note that for most objects the # .name is an empty string by default. You will have to set
     * it manually to make use of this method.
     * @param name String to match to the children's Object3D.name property.
     */
    fun getObjectByName(name: String): Object3D?

    fun getObjectByProperty(name: String, value: dynamic): Object3D?
    /**
     * Returns a vector representing the position of the object in world space.
     */
    fun getWorldPosition(optionalTarget: Vector3 = definedExternally): Vector3

    /**
     * Returns a quaternion representing the rotation of the object in world space.
     */
    fun getWorldQuaternion(optionalTarget: Quaternion = definedExternally): Quaternion

    /**
     * Returns the euler angles representing the rotation of the object in world space.
     */
    fun getWorldRotation(optionalTarget: Euler = definedExternally): Euler

    /**
     *
    Returns a vector of the scaling factors applied to the object for each axis in world space.
     */
    fun getWorldScale(optionalTarget: Vector3 = definedExternally): Vector3

    /**
     * Returns a vector representing the direction of object's positive z-axis in world space
     */
    open fun getWorldDirection(optionalTarget: Vector3 = definedExternally): Vector3

    /**
     * Abstract (empty) method to get intersections between a casted ray and this object.
     * Subclasses such as Mesh, Line, and Points implement this method in order to use raycasting.
     */
    open fun raycast()

    /**
     * Executes the callback on this object and all descendants.
     */
    fun traverse(callback: (Object3D) -> Unit)

    /**
     * Like traverse, but the callback will only be executed for visible objects.
     * Descendants of invisible objects are not traversed.
     */
    fun traverseVisible(callback: (Object3D) -> Unit)

    /**
     * Executes the callback on all ancestors.
     */
    fun traverseAncestors(callback: (Object3D) -> Unit)

    /**
     * Update the local transform
     */
    fun updateMatrix()

    /**
     * Update the global transform of the object and its children.
     */
    open fun updateMatrixWorld(force: Boolean = definedExternally)

    /**
     * Convert the object to JSON format.
     */
    fun toJSON(meta: String = definedExternally): Any

    open fun clone(recursive: Boolean = definedExternally): Object3D
    open fun copy(source: Object3D, recursive: Boolean = definedExternally): Object3D

}

