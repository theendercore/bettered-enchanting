# Bettered Enchanting

# 🏳️‍🌈 Better Enchanting Mod (For Fabric/Quilt)
Welcome to Better Enchanting for Minecraft. This mod is a total rework on how enchanting is managed in Minecraft. The whole enhanting porcess is closer to a skill-tree now, and enchanted books have totally disappeared from the game.
The idea behind the mod is to tie more closely enchanting to exploration and to the game progression. Gone are the days where you could be fully kited before fighting the ender dragon.

# Creating custom entry for your mod (as a mod developer)
This mod you can add this mod as a dependency to add custom entrie on the ingredient list for enchant.
Either by adding reference to enchantment add buy other mods / datapack or to overide current default configuration on existingenchant (thought this can also be done on the config file of the mod.

Add the folowing to your repositories in your build.gradle
```
exclusiveContent {
	forRepository {
		maven {
			name = "Modrinth"
			url = "https://api.modrinth.com/maven"
		}
	}
	filter {
		includeGroup "maven.modrinth"
	}
}
```

and either
```
modImplementation "maven.modrinth:bettered_enchanting:BETTER_ENCHANTING_VERSION"
```
or

```
modCompileOnly "maven.modrinth:bettered_enchanting:BETTER_ENCHANTING_VERSION"
```

depending or wherase you whant Better Enchanting to be optional or not to work with your mod.

You can then call anywhere in your code :

``` java
// Will be data driven
```
> [!WARNING]
> These call must be made befor the Fabric event `ServerLifecycleEvents.SERVER_STARTED` as the map of Enchantments/Items is created at this mark.
