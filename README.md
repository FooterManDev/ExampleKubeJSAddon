# Example KubeJS Addon
### **1.20.1 Forge**

Basically just a quick mod template for KubeJS Addon Mods. I got annoyed setting up new mods for Kube so often, so thats why I made it. Yeah, I'll add more versions later.
If you're looking to learn how to make a KubeJS Addon, well you're not *really* in the right place, but I'll help you with the basics.

* Uses [Cloche Gradle](https://github.com/terrarium-earth/cloche) - 0.11.20
* Uses [Kotlin](https://kotlinlang.org) - 2.2.0 <img src="https://raw.githubusercontent.com/FooterManDev/FooterManDev/7f4e01448982fdadcb3d8773ba1fe2efb09840fc/assets/kotlin.svg" alt="kotlin"/>
* MC Version 1.20.1 - Forge 47.2.1 <img src="https://raw.githubusercontent.com/FooterManDev/FooterManDev/refs/heads/main/assets/grayscale-anvil.svg" alt="forge"/>
* KubeJS Version - 6.4-build.138 <img src="https://raw.githubusercontent.com/FooterManDev/ExampleKubeJSAddon/refs/heads/1.21.1-NeoForge/src/main/resources/icon.png" alt="kubejs" width="16"/>


## Basic how-to

**1. Download the Mod**             
* You can use this repo's Template feature to make a new repo for yourself,
or you can clone it using your terminal:    
```
git clone --branch minecraftversion https://github.com/FooterManDev/ExampleKubeJSAddon
```
Replace `minecraftversion` with 1.20.1, 1.20.4, etc, plus modloader, e.g. **1.20.1-Forge**. \
Some branches apply [Kotlin](https://kotlinlang.org), e.g. **1.20.1-Forge-Kotlin**.

Alternatively if you use an IDE that supports generating projects from templates, you can clone it that way.

After cloning, you can remove the `.git` directory from the mod to initialize your own Github repository.

**2. Open with your favorite Integrated Development Environment (IDE)**          
* For [IntelliJ IDEA](https://www.jetbrains.com/idea/) and [Fleet](https://www.jetbrains.com/fleet/), open the cloned mod folder, the project should start importing immediately. 
* For [VSCode](https://code.visualstudio.com/), open the cloned mod folder.

## For newbies
I assume you have come across my repo to make a quick addon mod for Kube. Here's how KubeJS integration is set-up:      
In this mod, there is a class here: [ExampleKubeJSPlugin](https://github.com/FooterManDev/ExampleKubeJSAddon/blob/1.20.1-Forge-Kotlin/src/main/kotlin/com/example/exampleaddon/ExampleAddon.kt)                             
This is the Plugin class. There you will apply your KubeJS integrations. I won't tell you how to create your integrations, read KubeJS's [README](https://github.com/KubeJS-Mods/KubeJS/blob/2002/README.md#creating-a-plugin).             
You have to register your Plugin to Kube, otherwise nothing will happen. To do this, get your Plugin Class's full path (For example, `com.example.exampleaddon.kubejs.ExampleKubeJSPlugin`), and add it to the [kubejs.plugins.txt](https://github.com/FooterMan15/ExampleKubeJSAddon/blob/master/src/main/resources/kubejs.plugins.txt) file.
