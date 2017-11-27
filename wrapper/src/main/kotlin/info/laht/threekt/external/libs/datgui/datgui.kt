package info.laht.threekt.external.libs.datgui

import org.w3c.dom.Element

data class GUIParams(
        val name: String? = undefined,
        val auto: Boolean? = undefined,
        val load: dynamic? = undefined,
        val parent: dat.GUI? = undefined,
        val closed: Boolean? = undefined,
        val closeOnTop: Boolean? = undefined,
        val autoPlace: Boolean? = undefined,
        val width: Int? = undefined
)

/**
 * https://github.com/dataarts/dat.gui/blob/master/src/dat/gui/val js
 */
external class dat {

    class GUI(params: GUIParams = definedExternally) {

        companion object {

            val CLASS_AUTO_PLACE: String
            val CLASS_AUTO_PLACE_CONTAINER: String
            val CLASS_MAIN: String
            val CLASS_CONTROLLER_ROW: String
            val CLASS_TOO_TALL: String
            val CLASS_CLOSED: String
            val CLASS_CLOSE_BUTTON: String
            val CLASS_CLOSE_TOP: String
            val CLASS_CLOSE_BOTTOM: String
            val CLASS_DRAG: String

            val DEFAULT_WIDTH: Int
            val TEXT_CLOSED: String
            val TEXT_OPEN: String
            
            fun toggleHide()
        }

        val domElement: Element

        val parent: dat.GUI

        val scrollable: Boolean

        val autoPlace: Boolean

        val closeOnTop: Boolean

        var preset: String

        var width: Number

        var name: String

        var closed: Boolean

        val load: dynamic

        var useLocalStorage: Boolean

        fun add(`object`: dynamic, property: String, vararg args: dynamic) : Controller

        fun addColor(`object`: dynamic, property: String) : ColorController

        fun destroy()

        fun addFolder(name: String) : dat.GUI

        fun open()

        fun close()

        fun onResize()

        fun remember(`object`: dynamic)

        fun getRoot() : dat.GUI

        fun getSaveObject() : dynamic

        fun save()

        fun saveAs(presetName: String)

        fun revert(gui: GUI = definedExternally)

        fun listen(controller: Controller)

        fun updateDisplay(controller: Controller)

    }

}

