package com.example.exampleaddon.kubejs

import com.example.exampleaddon.ExampleAddon
import com.example.exampleaddon.Logger
import dev.latvian.mods.kubejs.KubeJSPlugin

class ExampleKubeJSPlugin : KubeJSPlugin() {
    /* Basic example of a KubeJS Plugin.
       To register your own plugins, add this class and package name to "kubejs.plugins.txt" in your Resources directory.
    */
    override fun init() {
        Logger.info("This is my KubeJS Plugin!")
        /** If you don't know how to add content, use Kube's built-in Plugin for reference.
         * @see dev.latvian.mods.kubejs.BuiltinKubeJSPlugin
         */
    }
}