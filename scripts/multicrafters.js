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
    },
    //others
    {
        input: {
            items: ["coal/4", "sand/6", "pyratite/1"],
            power: 4
        },
        output: {
            items: ["silicon/8"]
        },
        craftTime: 90
    },
    {
        input: {
            items: ["copper/3", "lead/4", "titanium/2", "silicon/3"],
            power: 4
        },
        output: {
            items: ["surge-alloy/1"]
        },
        craftTime: 75
    }
]

const arcFurnace = multi.MultiCrafter("arc-furnace");
arcFurnace.size = 5;
arcFurnace.health = 1000;
arcFurnace.recipes = [
    //speed but the same numbers of items are required
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
    {
        input: {
            items: ["copper/3", "lead/4", "titanium/2", "silicon/3"],
            power: 8
        },
        output: {
            items: ["surge-alloy/1"]
        },
        craftTime: 37.5
    },
    {
        input: {
            items: ["coal/4", "sand/6", "pyratite/1"],
            power: 8
        },
        output: {
            items: ["silicon/8"]
        },
        craftTime: 45
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
    },
    {
        input: {
            items: ["coal/8", "sand/12", "pyratite/2"],
            power: 8
        },
        output: {
            items: ["silicon/12"]
        },
        craftTime: 45
    },
    {
        input: {
            items: ["copper/6", "lead/8", "titanium/4", "silicon/6"],
            power: 8
        },
        output: {
            items: ["surge-alloy/2"]
        },
        craftTime: 37.5
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
            fluids: ["altanic-creosote/0.1"]
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
            fluids: ["altanic-creosote/0.2"]
        },
        craftTime: 180
    }
]

const blastFurnace = multi.MultiCrafter("blast-furnace");
//Tworzy blok według importowanej klasy, który dla tego pliku ma nazwę blastFurnace, ale dla hjson to co jest w cudzysłowiu
blastFurnace.size = 3;
blastFurnace.health = 600;
blastFurnace.recipes = [
    {
        input: {//zawartość wchodząca
            items: ["altanic-coal-coke/5", "altanic-feco/5", "thorium/5"],//przedmioty
            power: 5//prund
        },
        output: {//zawartość wychodząca
            items: ["altanic-wall-alloy/5"],
            fluids: ["slag/0.2"]
        },
        craftTime: 180 //czas produkcji w tickach
    },
    {
        input: {
            items: ["altanic-coal-coke/5", "altanic-feco/5", "scrap/10"], //przedmioty wchodzące do bloku. Przy zawarości z modyfikacji nazwa-moda-rzecz.
            power: 5 //tutaj nie ma przecinka gdyż jest to ostatni element. To to samo co input: {items: ["altanic-coal-coke/5", "altanic-feco/3", "scrap/2"], power: 5}
        },
        output: {
            items: ["altanic-wall-alloy/5"],
            fluids: ["slag/0.2"]
        },
        craftTime: 180
    },

]
