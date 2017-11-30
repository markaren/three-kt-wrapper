@file:JsQualifier("THREE")

package info.laht.threekt.external.loaders

import info.laht.threekt.core.Object3D
import info.laht.threekt.loaders.LoadingManager
import info.laht.threekt.objects.Mesh
import org.w3c.xhr.XMLHttpRequest

/**
 * A loader for loading a .obj resource.
 * The OBJ file format is a simple data-format that represents 3D geometry in a human redeable format as,
 * the position of each vertex,the UV position of each texture coordinate vertex, vertex normals,
 * and the faces that make each polygon defined as a list of vertices, and texture vertices.
 */
open external class OBJLoader(
        manager: LoadingManager = definedExternally
) {

    fun load(url: String,
             onLoad: (Mesh) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally)

    fun setPath(value: String)

    fun parse(text: String) : Object3D

}

