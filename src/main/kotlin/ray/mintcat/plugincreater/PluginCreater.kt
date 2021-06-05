package ray.mintcat.plugincreater

import io.izzel.taboolib.loader.Plugin

object PluginCreater : Plugin() {

    override fun onLoad() {
        println("Hello Minecraft")
    }
}