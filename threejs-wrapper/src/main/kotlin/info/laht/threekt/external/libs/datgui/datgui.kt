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

package info.laht.threekt.external.libs.datgui

import org.w3c.dom.Element

/**
 * @param name The name of this GUI
 * @param load JSON object representing the saved state of this GUI
 * @param auto default true
 * @param parent The GUI I'm nested in
 * @param closed If true, starts closed
 * @param closeOnTop If true, close/open button shows on top of the GUI
 * @param width
 */
data class GUIParams(
    var name: String? = undefined,
    var auto: Boolean? = undefined,
    var load: dynamic = undefined,
    var parent: dat.GUI? = undefined,
    var closed: Boolean? = undefined,
    var closeOnTop: Boolean? = undefined,
    var autoPlace: Boolean? = undefined,
    var width: Int? = undefined
)

/**
 * https://github.com/dataarts/dat.gui/blob/master/src/dat/gui/val js
 */
external class dat {

    class GUI(
        params: GUIParams = definedExternally
    ) {

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

        fun add(`object`: dynamic, property: String, vararg args: dynamic): Controller

        fun addColor(`object`: dynamic, property: String): ColorController

        fun destroy()

        fun addFolder(name: String): dat.GUI

        fun open()

        fun close()

        fun onResize()

        fun remember(`object`: dynamic)

        fun getRoot(): dat.GUI

        fun getSaveObject(): dynamic

        fun save()

        fun saveAs(presetName: String)

        fun revert(gui: GUI = definedExternally)

        fun listen(controller: Controller)

        fun updateDisplay(controller: Controller)

    }

}

external interface Controller {

    val initialValue: dynamic
    val domElement: Element

    val `object`: dynamic
    val property: String

    fun onChange(fnc: () -> Unit)
    fun onFinishChange(fnc: () -> Unit)
    fun setValue(newValue: dynamic): Controller
    fun getValue(): dynamic
    fun updateDisplay(): Controller
    fun isModified(): Boolean

}

external interface StringController : Controller

external interface BooleanController : Controller {

    val __checkbox: Element
    val __prev: dynamic

}

external interface NumberController : Controller {

    val __min: Number
    val __max: Number
    val __step: Number
    val __impliedStep: Number?
    val __precision: Number?

    fun min(minValue: Number): NumberController
    fun max(maxValue: Number): NumberController
    fun step(step: Number): NumberController

}

external interface NumberControllerSlider : NumberController
external interface NumberControllerBox : NumberController

external interface ColorController : Controller

external interface OptionController : Controller {
    val __select: Element
}

