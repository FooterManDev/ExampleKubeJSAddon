## Example KubeJS Addon
### **1.20.1 Forge**

Basically just a quick mod template for KubeJS Addon Mods. I got annoyed setting up new mods for Kube so often, so thats why I made it. Yeah, I'll add more versions later.
If you're looking to learn how to make a KubeJS Addon, well you're not *really* in the right place, but I'll help you with the basics.

* Uses Arch Loom - 1.10 🧵️
* Forge 47.4.0 🔨️
* Kube Version - 6.5-build.16 🟪️

#
### Basic how-to

**1. Download the Mod**             
* You can use this repo's Template feature to make a new repo for yourself,
or you can clone it using your terminal:    
```
git clone --branch minecraftversion-modLoader https://github.com/FooterManDev/ExampleKubeJSAddon
```
Replace `minecraftversion` and `modLoader` with your Minecraft version and ModLoader of choice. Check the [branches](https://github.com/FooterManDev/ExampleKubeJSAddon/branches) to see what's available.

Alternatively if you use an IDE that supports generating projects from templates, you can clone it that way.

After cloning, you can remove the `.git` directory from the mod to initialize your own Github repository.

**2. Open with your favorite Integrated Development Environment (IDE)**          
* For IntelliJ IDEA, open the cloned mod folder, and run gradle task `ideaSyncTask` to generate run configurations for IDEA. Alternatively you can run gradle task `runClient` to start the game.    
* For VSCode, you have to open the cloned mod folder, and run gradle task `vscode` to generate launch tasks for VSCode. Alternatively you can run gradle task `runClient` to start the game.      
* For Eclipse... ehh not really sure, but there is a gradle task for eclipse, called `eclipse`. I have no further info.

#

### For newbies
I assume you have come across my repo to make a quick addon mod for Kube. This example mod **does not** show you how to make your addon features, but here's a quick rundown for how your addon is set up with Kube:<br/>
This class: [ExampleKubeJSPlugin](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/java/com/example/exampleaddon/kubejs/ExampleKubeJSPlugin.java)
is the KubeJS Plugin class. There you will apply your KubeJS integrations. Read KubeJS's [README](https://github.com/KubeJS-Mods/KubeJS/blob/2002/README.md#creating-a-plugin) and their [BuiltinKubeJSPlugin](https://github.com/KubeJS-Mods/KubeJS/blob/2001/common/src/main/java/dev/latvian/mods/kubejs/BuiltinKubeJSPlugin.java) class for integration examples.             
You have to register your Plugin to Kube, otherwise nothing will happen. To do this, get your Plugin Class's full path (For example, `com.example.exampleaddon.kubejs.ExampleKubeJSPlugin`), and add it to the [kubejs.plugins.txt](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/resources/kubejs.plugins.txt) file. You can have multiple plugin classes in one mod, just add a new class path on a new line.
