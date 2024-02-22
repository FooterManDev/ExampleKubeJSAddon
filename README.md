## Example KubeJS Addon
Basically just a quick mod template for KubeJS Addon Mods. I got annoyed setting up new mods for Kube so often, so thats why I made it. Yeah, I'll add more versions later.
If you're looking to learn how to make a KubeJS Addon, well you're not *really* in the right place, but I'll help you with the basics.

* Uses Arch Loom - 1.3 🧵️
* MC Version 1.20.1 - Forge 47.2.1 🔨️
* Kube Version - 6.4-build.138 🟪️
* Rhino Version - 2.2-build.18 🦏️
* Architectury - 9.1.13 🏗️

#
### Basic how-to

**1. Download the Mod**             
You can use this repo's Template feature to make a new repo for yourself,
Or you can clone it using your terminal:    
`git clone --branch minecraftversion https://github.com/FooterMan15/ExampleKubeJSAddon`   
`minecraftversion` being 1.20.1, 1.19.2, etc, plus modloader. I only have 1.20.1 Forge on here right now.         
If you do clone with your terminal, you can remove the `.git` directory from the mod to initialize your own Github repository.

**2. Open with your favorite Integrated Development Environment (IDE)**          
For IntelliJ IDEA, it should be as simple as opening the cloned mod folder, and it will build and index for you.       
For VSCode, you have to open the cloned mod folder, and run gradle task `vscode`. Then you're good.       
For Eclipse... ehh not really sure, but there is a gradle task for eclipse, called `eclipse`.      
From then on you can run `runClient` to launch the game.      

#

### For newbies
I assume you have come across my repo to make a quick addon mod for Kube. Here's how KubeJS integration is set-up:      
In this mod, there is a class here: [ExampleKubeJSPlugin](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/java/com/example/exampleaddon/kubejs/ExampleKubeJSPlugin.java)                             
This is the Plugin class. There you will apply your KubeJS integrations. I won't tell you how to create your integrations, read KubeJS's [README](https://github.com/KubeJS-Mods/KubeJS/blob/2002/README.md#creating-a-plugin).             
You have to register your Plugin to Kube, otherwise nothing will happen. To do this, get your Plugin Class's full path (For example, `com.example.exampleaddon.kubejs.ExampleKubeJSPlugin`), and add it to the [kubejs.plugins.txt](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/resources/kubejs.plugins.txt) file.

Alright, now go play with KubeJS.
