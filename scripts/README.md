# Scripts

Here will be .js files

//TO DO write structure and explanation, and something?

## [Multicrafters](https://liplum.github.io/MultiCrafterLib/)

That one

```js

const multi = require("multi-crafter/lib")
// Multi-crafter is a library that allows you to create multi-crafters
// Here multi-crafter class is imported

const electricFurnace = multi.MultiCrafter("electric-furnace");
//this create a block named electric-furnace, I am not sure how to make it in one const, so
electricFurnace.size = 2;
electricFurnace.health = 250;
//electricFurnace.requirements(Category.crafting, ItemStack.with(Items.copper, 2137)); //this is not working
electricFurnace.recipes = [
    {
        input: {
            items: ["sand/2", "coal/1"], //I don't know if , is needed, but better to put it
            power: 0.5 //here I didn't put it beacuse it is end of {}, this is the same as input: {items: ["sand/2", "coal/1"], power: 0.5}
        },
        output: {
            items: ["silicon/1"]
        },
        craftTime: 30
    },//You can also do }, {
    {
        input: {
            items: ["sand/1", "lead/1"],
            power: 0.5
        },
        output: {
            items: ["metaglass/1"]
        },
        craftTime: 30
    }
]

```

I have planed that mutlicrafters will be in one file sotred by category chronology.
I hope that possible will be editing this by other mods.
Actual blocks will be something like this:

### Crafting

#### Electric Furnace

Combination of all basic smelters.

#### Induction Smelter

More complex version of above.

#### Arc Furnace

Propably the most complext one.

#### Blast Furnace

~~Stell~~ Feco manufacture.
Here I am not realy sure about recipes.

#### Pyrolyse Oven

For making coal from wood and coal coke.
And also creosote oils is a byproduct.

#### Centrifue

For oil seperation, mostly.
Will be also allowed to refine slag, but I do not remeber how exacly seperator works.
Like is this 6 slag for one item or for all?

#### Thermal Centrifuege

Add some fancy word to object and now it is special object.

#### Solid Mixer

Compound mixer.
Liquid one will come later.
