# Blocks

Everything that consumes place on a grid.

## Structure

```txt
blocks
|
├──crafting
|   ├──files
|   └──README.md
├──defense
|   ├──files
|   └──README.md|   
├──environment
|   ├──files
|   └──README.md
├──liquid
|   ├──files
|   └──README.md
├──multi
|   ├──files
|   └──README.md
├──power
|   ├──files
|   └──README.md
├──temporary
|   ├──files
|   └──README.md
|
└──README.md
```

### [Crafting](/content/blocks/crafting/README.md)

Crafting category files.

### [Defense](/content/blocks/defense/README.md)

Defense category including turrets.

### [Environment](/content/blocks/environment/README.md)

Floors, walls, ores, that kind of content.

### [Liquid](/content/blocks/liquid/README.md)

Block that have to deal with liquids

### [Multi](/content/blocks/multi/README.md)

Multicrafters directory.

### [Power](/content/blocks/power/README.md)

Power production and distribution, and storage.

### [Temporary](/content/blocks/temporary/README.md)

Temp.

### [README.md](/content/blocks/README.md)

Here it is.

## Specific

Every block that does something more must have a `type:` decleration.
List of [those](https://github.com/Anuken/Mindustry/tree/master/core/src/mindustry/world/blocks).
They are being sorted by category.
__More details will show up in READMEs.md for blocks category types__.

### Other

`Type` in the one only one.
There is more variables and they have deafault value.
I listed here more important ones.

//TODO

#### Has

If true block will have each module.
They used to set it self by default if You add something with items, liquids, power etc.

* `hasItems`
* `hasLiquids`
* `hasPower`

#### Capacity

Capacity of each module.

* `itemCapcity`
* `liquidCapacity`
* `separateItemCapacity`

By default ther are set to 10.
Last parameter however determinetes for what capacity.
Total or for each item.
Set to false by default.

#### Rotate

* `rotate`
* `drawArrow`

If block can be rotated, like pipes, conveyors.

Draw an arrow that indicates rotation.

#### Health

* `healht`
* `size`

"Wan'st it obvious?"

#### Sounds

Those have set default sound effect.

* `placeSound`
* `breakSound`
* `destroySound`

* `loopSound`
* `loopSoundVolume`
* `ambientSound`
* `ambientSound`

#### Light

* `lightLiquid`
* `drawLiquidLight`
* `lightColor`
* `emitLight`
* `lightRadius`

#### Requirements

* `category`
* `requirements`
* `instantDeconstruct`
* `researchCostMultiplier`

#### Consumes

* `cosnumes`
