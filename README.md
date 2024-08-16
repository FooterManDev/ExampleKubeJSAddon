## Example KubeJS Addon (UNFINISHED FOR 1.21)
### **1.21 NeoForge**

[Will eventually come to 1.21.1/2]


Basically just a quick mod template for KubeJS Addon Mods. I got annoyed setting up new mods for Kube so often, so thats why I made it. Yeah, I'll add more versions later.
If you're looking to learn how to make a KubeJS Addon, well you're not *really* in the right place, but I'll help you with the basics.

* Uses ModDevGradle - 1.0.17
* MC Version 1.21 - NeoForge 21.1.12 🔨️
* Kube Version - 7.0-build.119 🟪️
* Rhino Version - 2.5-build.46 🦏️
* Architectury - 13.0.6 🏗️

#
### Basic how-to

**1. Download the Mod**             
* You can use this repo's Template feature to make a new repo for yourself,
or you can clone it using your terminal:    
```
git clone --branch minecraftversion https://github.com/FooterManDev/ExampleKubeJSAddon
```
`minecraftversion` being 1.20.1, 1.20.4, 1.21, etc, plus modloader. This repo has 1.20.1 and 1.20.4 branches.

Alternatively if you use an IDE that supports generating projects from templates, you can clone it that way.

After cloning, you can remove the `.git` directory from the mod to initialize your own Github repository.

**2. Open with your favorite Integrated Development Environment (IDE)**          
* For IntelliJ IDEA, open the cloned mod folder, and IDEA should automatically generate run configurations. Alternatively you can run gradle task `runClient` to start the game.    
* For VSCode, you have to open the cloned mod folder, I am unsure if runs are automatically generated or require manual creation. You can run gradle task `runClient` to start the game.      
* For Eclipse... yeah I have no idea.

#

### For newbies
I assume you have come across my repo to make a quick addon mod for Kube. Here's how KubeJS integration is set-up:      
In this mod, there is a class here: [ExampleKubeJSPlugin](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/java/com/example/exampleaddon/kubejs/ExampleKubeJSPlugin.java)                             
This is the Plugin class. There you will apply your KubeJS integrations. I won't tell you how to create your integrations, read KubeJS's [README](https://github.com/KubeJS-Mods/KubeJS/blob/2002/README.md#creating-a-plugin).             
You have to register your Plugin to Kube, otherwise nothing will happen. To do this, get your Plugin Class's full path (For example, `com.example.exampleaddon.kubejs.ExampleKubeJSPlugin`), and add it to the [kubejs.plugins.txt](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/resources/kubejs.plugins.txt) file.

Alright, now go play with KubeJS.
