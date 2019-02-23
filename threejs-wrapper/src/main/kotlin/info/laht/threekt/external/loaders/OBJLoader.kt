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
external class OBJLoader(
    manager: LoadingManager = definedExternally
) {

    fun load(
        url: String,
        onLoad: (Mesh) -> Unit,
        onProgress: (XMLHttpRequest) -> Unit = definedExternally,
        onError: (dynamic) -> Unit = definedExternally
    )

    fun setPath(value: String)

    fun parse(text: String): Object3D

}

