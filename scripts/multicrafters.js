//https://liplum.github.io/MultiCrafterLib/usage/
//for more info

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

const inductionSmelter = multi.MultiCrafter("induction-smelter");
inductionSmelter.size = 3;
inductionSmelter.health = 500;
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
    },
    //more items
    {
        input: {
            items: ["sand/4", "coal/2"],
            power: 1
        },
        output: {
            items: ["silicon/2"]
        },
        craftTime: 15
    },
    {
        input: {
            items: ["sand/2", "lead/2"],
            power: 1
        },
        output: {
            items: ["metaglass/2"]
        },
        craftTime: 15
    }
]

const arcFurnace = multi.MultiCrafter("arc-furnace");
arcFurnace.size = 4;
arcFurnace.health = 750;
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
    },
    //more items
    {
        input: {
            items: ["sand/8", "coal/4"],
            power: 2
        },
        output: {
            items: ["silicon/4"]
        },
        craftTime: 7.5
    },
    {
        input: {
            items: ["sand/4", "lead/4"],
            power: 2
        },
        output: {
            items: ["metaglass/4"]
        },
        craftTime: 7.5
    }
]

const pyrolyseOven = multi.MultiCrafter("pyrolyse-oven");
pyrolyseOven.size = 2;
pyrolyseOven.health = 400;
pyrolyseOven.recipes = [
    {
        input: {
            items: ["altanic-wood/5"],
            power: 0.75
        },
        output: {
            items: ["coal/1"],
            liquids: ["creosote/1"]
        },
        craftTime: 120
    },
    {
        input: {
            items: ["coal/5"],
            power: 1
        },
        output: {
            items: ["altanic-coal-coke/5"],
            liquids: ["creosote/2"]
        },
        craftTime: 180
    }
]