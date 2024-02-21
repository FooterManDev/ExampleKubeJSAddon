package com.example.exampleaddon.kubejs;

import com.example.exampleaddon.ExampleAddon;
import dev.latvian.mods.kubejs.KubeJSPlugin;

public class ExampleKubeJSPlugin extends KubeJSPlugin {
    /* Basic example of a KubeJS Plugin.
       To register your own plugins, add this class and package name to "kubejs.plugins.txt" in your Resources directory.
    */

    @Override
    public void init() {
        ExampleAddon.LOGGER.info("This is my KubeJS Plugin!");
        /** If you don't know how to add content, use Kube's built-in Plugin for reference.
        @see dev.latvian.mods.kubejs.BuiltinKubeJSPlugin
         */
    }
}

