@file:JsModule("three")
@file:JsNonModule

package info.laht.threekt.extras

import info.laht.threekt.core.BufferGeometry
import info.laht.threekt.core.Object3D
import info.laht.threekt.materials.Material
import info.laht.threekt.objects.Group
import info.laht.threekt.scenes.Scene

/**
 * A class containing useful utility functions for scene manipulation.
 */
external object SceneUtils {

    /**
     * Creates a new Group that contains a new mesh for each material defined in materials. Beware that this is not the same as an array of materials which defines multiple materials for 1 mesh.
     * This is mostly useful for objects that need both a material and a wireframe implementation.
     * @param geometry The geometry for the set of materials.
     * @param materials The materials for the object.
     */
    fun createMultiMaterialObject(geometry: BufferGeometry, materials: List<Material>): Group

    /**
     * Detaches the object from the parent and adds it back to the scene without moving in worldspace. B
     * eware that to do this the matrixWorld needs to be updated, this can be done by calling the updateMatrixWorld method on the parent object.
     * @param child The object to remove from the parent
     * @param parent The scene to attach the object on.
     * @param scene The parent to detach the object from.
     */
    fun detach(child: Object3D, parent: Object3D, scene: Scene)

    /**
     * Attaches the object to the parent without the moving the object in the worldspace.
     * Beware that to do this the matrixWorld needs to be updated, this can be done by calling the updateMatrixWorld method on the parent object.
     *
     * @param child The object to remove from the parent
     * @param parent The scene to attach the object on.
     * @param scene The parent to detach the object from.
     */
    fun attach(child: Object3D, parent: Object3D, scene: Scene)

}