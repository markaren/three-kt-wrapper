@file:JsQualifier("THREE")

package info.laht.threekt.external.loaders

import info.laht.threekt.loaders.LoadingManager
import info.laht.threekt.objects.Mesh
import org.w3c.xhr.XMLHttpRequest

external interface Detail {
    var loaderRootNode: Mesh
    var modelName: String
    var instanceNo: Int
}

external interface OBJ2OnLoadCallback {
    var detail: Detail
}

external interface LoaderProxy {
    fun load(url: String,
             onLoad: (OBJ2OnLoadCallback) -> Unit,
             onProgress: (XMLHttpRequest) -> Unit = definedExternally,
             onError: (dynamic) -> Unit = definedExternally,
             onMeshAlter: () -> Unit = definedExternally,
             useAsync: Boolean = definedExternally)
}

external class OBJLoader2(
        manager: LoadingManager = definedExternally,
        logger: LoaderSupport.ConsoleLogger = definedExternally
) : LoaderProxy {

   companion object {
       val OBJLOADER2_VERSION: String
       val LoaderBase: LoaderSupport.LoaderBase
       val Validator: LoaderSupport.Validator
   }

    override fun load(url: String,
                      onLoad: (OBJ2OnLoadCallback) -> Unit,
                      onProgress: (XMLHttpRequest) -> Unit,
                      onError: (dynamic) -> Unit,
                      onMeshAlter: () -> Unit,
                      useAsync: Boolean)
}