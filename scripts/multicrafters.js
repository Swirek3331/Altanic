const multi = require("multi-crafter/lib");

//This is for display chronology.

const electricFurnace = multi.MultiCrafter("electric-furnace");
const inductionSmelter = multi.MultiCrafter("induction-smelter");
const arcFurnace = multi.MultiCrafter("arc-furnace");

const pyrolyseOven = multi.MultiCrafter("pyrolyse-oven");
const blastFurnace = multi.MultiCrafter("blast-furnace");

const centrifuge = multi.MultiCrafter("centrifuge");
const thermalCentrifuge = multi.MultiCrafter("thermal-centrifuge");
const solidMixer = multi.MultiCrafter("solid-mixer");

const farmer = multi.MultiCrafter("farm");
farmer.size = 2;
farmer.health = 400;
farmer.recipes = [
       //"normal"
       {
        input: {
            fluids: ["water/0.1"],
            power: 1
        },
        output: {
            items: ["altanic-biomass/50"]
        },
        craftTime: 600
    },
    //speedy
    {
        input: {
            fluids: ["water/0.1"],
            power: 1
        },
        output: {
            items: ["altanic-biomass/25"]
        },
        craftTime: 300
    },
    //much
    {
        input: {
            fluids: ["water/0.3"],
            power: 2
        },
        output: {
            items: ["altanic-biomass/200"]
        },
        craftTime: 900
    },
    //for wood
    {
        input: {
            fluids: ["water/0.4"],
            power: 2
        },
        output: {
            items: ["altanic-wood/150", "altanic-biomass/15"]
        },
        craftTime: 1200
    },
    {
        input: {
            fluids: ["water/0.4"],
            power: 2
        },
        output: {
            items: ["altanic-wood/50", "altanic-biomass/5"]
        },
        craftTime: 900
    },
    {
        input: {
            fluids: ["water/0.6"],
            power: 4
        },
        output: {
            items: ["altanic-wood/300", "altanic-biomass/30"]
        },
        craftTime: 1500
    },
    //spore pods
    {
        input: {
            fluids: ["water/0.3"],
            //If someone abmits that cultivator uses more for less, remember, cultivator extract spores from atmosphere, farmer grow them.
            power: 1
        },
        output: {
            items: ["spore-pod/30"]
        },
        craftTime: 300
    },
    {
        input: {
            fluids: ["water/0.3"],
            power: 1
        },
        output: {
            items: ["spore-pod/10"]
        },
        craftTime: 180
    },
    {
        input: {
            fluids: ["water/0.6"],
            power: 2
        },
        output: {
            items: ["spore-pod/60"]
        },
        craftTime: 420
    }
    //Will be changed probably.
]

const fermenter = multi.MultiCrafter("fermenter");
fermenter.recipes = [
    {
        input: {
           items: ["altanic-biomass/10"],
            power: 1.2
        },
        output: {
            fluids: ["altanic-ethanol/0.2"]
        },
        craftTime: 60
    },
    {
        input: {
            items: ["spore-pod/6"],
            power: 1.5
        },
        output: {
            fluids: ["altanic-gas/0.2"]//will be changed if oil distillation will be added.
        },
        craftTime: 60
    },
    {
        input: {
            items: ["altanic-wood/12"],
            power: 1.4
        },
        output: {
            fluids: ["altanic-methanol/0.2"]
        },
        craftTime: 60
    }
]

const chemicalComposer = multi.MultiCrafter("chemical-composer")
chemicalComposer.recipes = [
    {
        input: {
            items: ["titanium/2"],
            fluids: ["water/0.3"],
            power: 1.5
        },
        output: {
            fluids: ["cryofluid/0.3"]
        },
        craftTime: 120
    },
    {
        input: {
            fluids: ["oil/0.1"],
            power: 0.8
        },
        output: {
            items: ["altanic-sulfur/2"]
        },
        craftTime: 120
    },
    {
        input: {
            fluids: ["altanic-gas/0.2"],
            power: 0.7
        },
        output: {
            items: ["altanic-sulfur/12"]
        },
        craftTime: 120
    },
    {
        input: {
            fluids: ["altanic-ethanol/0.1", "altanic-plant-oil/0.1"],
            power: 0.6
        },
        output: {
            fluids: ["altanic-biofuel/0.2"]
        },
        craftTime: 60
    },
    {
        input: {
            items: ["spore-pod/3"],
            fluids: ["altanic-creosote/0.2"],
            power: 0.8
        },
        output: {
            fluids: ["oil/0.2"]
        },
        craftTime: 90
    },
    {
        input: {
            fluids: ["altanic-glycerol/0.1", "altanic-nitric-acid/0.2"],
            power: 1
        },
        output: {
            fluids: ["altanic-nitroglycerin/0.2"]
        },
        craftTime: 60
    },
    {
        input: {
            fluids: ["oil/0.2"],
            power: 1
        },
        output: {
            items: ["coal/3"]
        },
        craftTime: 30
    },
    {
        input: {
            fluids: ["oil/0.1"],
            power: 1.5
        },
        output: {
            items: ["altanic-petroleum-coke/2"]
        },
        craftTime: 60
    },
    {
        input: {
            items: ["sand/14"],
            fluids: ["altanic-creosote/0.1"],
            power: 1
        },
        output: {
            items: ["pyratite/4", "blast-compound/3"]
        },
        craftTime: 120
    },
    {
        input: {
            items: ["coal/1", "lead/2", "sand/2"],
            power: 0.2
        },
        output: {
            items: ["pyratite/1"]
        },
        craftTime: 60
    },
    {
        input: {
            items: ["altanic-coal-coke/2", "sand/4"],
            power: 0.3
        },
        output: {
            items: ["pyratite/2"]
        },
        craftTime: 60
    },
    {
        input: {
            fluids: ["altanic-light-oil/0.1"],
            items: ["sand/20"],
            power: 1.2
        },
        output: {
            items: ["pyratite/10"]
        },
        craftTime: 80
    },
    {
        input: {
            items: ["pyratite/1", "spore-pod/1"],
            power: 0.4
        },
        output: {
            items: ["blast-compound/1"]
        },
        craftTime: 60
    },
    {
        input: {
            items: ["altanic-sulfur/2", "sand/4"],
            power: 0.6
        },
        output: {
            items: ["blast-compound/2"]
        },
        craftTime: 60
    },
    {
        input: {
            items: ["sand/20"],
            fluids: ["altanic-nitroglycerin/0.1"],
            power: 1.8
        },
        output: {
            items: ["blast-compound/10"]
        },
        craftTime: 90
    },
]

//facilities

const farmingFacility = multi.MultiCrafter("farmer");
farmingFacility.size = 3;
farmingFacility.health = 500;
farmingFacility.recipes = [
    //"normal"
    {
        input: {
            fluids: ["water/0.3"],
            power: 1.5
        },
        output: {
            items: ["altanic-biomass/100"]
        },
        craftTime: 900
    },
    //speedy
    {
        input: {
            fluids: ["water/0.3"],
            power: 1.5
        },
        output: {
            items: ["altanic-biomass/50"]
        },
        craftTime: 600
    },
    //much
    {
        input: {
            fluids: ["water/0.6"],
            power: 3,
        },
        output: {
            items: ["altanic-biomass/500"]
        },
        craftTime: 1200
    },
    //for wood
    {
        input: {
            fluids: ["water/0.8"],
            power: 3
        },
        output: {
            items: ["altanic-wood/250", "altanic-biomass/50"]
        },
        craftTime: 1500
    },
    {
        input: {
            fluids: ["water/0.8"],
            power: 3
        },
        output: {
            items: ["altanic-wood/50", "altanic-biomass/10"]
        },
        craftTime: 1200
    },
    {
        input: {
            fluids: ["water/1.2"],
            power: 6
        },
        output: {
            items: ["altanic-wood/1000", "altanic-biomass/200"]
        },
        craftTime: 1800
    },
    //spore pods
    {
        input: {
            fluids: ["water/0.6"],
            //If someone abmits that cultivator uses more for less, remember, cultivator extract spores from atmosphere, farmer grow them.
            power: 1.5
        },
        output: {
            items: ["spore-pod/80"]
        },
        craftTime: 600
    },
    {
        input: {
            fluids: ["water/0.6"],
            power: 1.5
        },
        output: {
            items: ["spore-pod/40"]
        },
        craftTime: 300
    },
    {
        input: {
            fluids: ["water/1"],
            power: 3
        },
        output: {
            items: ["spore-pod/200"]
        },
        craftTime: 900
    }
    //Will be changed probably.
]