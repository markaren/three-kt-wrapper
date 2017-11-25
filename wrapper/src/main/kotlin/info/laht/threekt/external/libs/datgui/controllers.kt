package info.laht.threekt.external.libs.datgui

import org.w3c.dom.Element

external interface Controller {

    val initialValue: dynamic
    val domElement: Element

    val `object`: dynamic
    val property: String

    fun onChange(fnc: () -> Unit)

    fun onFinishChange(fnc: () -> Unit)

    fun setValue(newValue: dynamic) : Controller

    fun getValue(): dynamic

    fun updateDisplay() : Controller

    fun isModified() : Boolean

}

external interface StringController : Controller {

}

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

    fun min(minValue: Number) : NumberController
    fun max(maxValue: Number) : NumberController
    fun step(step: Number) : NumberController

}

external interface NumberControllerSlider : NumberController
external interface NumberControllerBox : NumberController

external interface ColorController : Controller

external interface OptionController: Controller {
    val __select: Element
}