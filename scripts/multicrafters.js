//https://liplum.github.io/MultiCrafterLib/usage/
//for more info

const multi = require("multi-crafter/lib")
// Multi-crafter is a library that allows you to create multi-crafters
// Here multi-crafter class is imported

const electricFurnace = multi.MultiCrafter("electric-furnace");
//this create a block named electric-furnace, I am not sure how to make it in one const, so
electricFurnace.size = 2;
electricFurnace.health = 200;
electricFurnace.buildCost = ItemStack.with(Items.copper, 2137);
electricFurnace.recipes = [
    {
        input: {
            items: ["sand/2", "coal/1"], //I don't know if , is needed, but better to put it
            power: 0.5 //here I didn't put it beacuse it is end of {}, this is the same as input: {items: ["sand/2", "coal/1"], power: 0.5}
        },
        output: {
            items: ["silicon/1"]
        },
        craftTime: 39.6 //That should 0.66 in game, right?
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

const inductionSmelter = multi.MultiCrafter("induction-smelter");
inductionSmelter.recipes = [
    //speed but the same numbers of items are required
    {
        input: {
            items: ["sand/2", "coal/1"],
            power: 1
        },
        output: {
            items: ["silicon/1"]
        },
        craftTime: 15
    },
    {
        input: {
            items: ["sand/1", "lead/1"],
            power: 1
        },
        output: {
            items: ["metaglass/1"]
        },
        craftTime: 15
    }
]

const arcFurnace = multi.MultiCrafter("arc-furnace");
arcFurnace.recipes = [
    //speed but the same numbers of items are required[
    {
        input: {
            items: ["sand/2", "coal/1"],
            power: 2
        },
        output: {
            items: ["silicon/1"]
        },
        craftTime: 7.5
    },
    {
        input: {
            items: ["sand/1", "lead/1"],
            power: 2
        },
        output: {
            items: ["metaglass/1"]
        },
        craftTime: 7.5
    }
]