package altanic.content;

import arc.graphics.Color;
import arc.struct.Seq;

import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.environment.Floor;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.blocks.environment.OreBlock;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.blocks.defense.Wall;
import mindustry.world.blocks.power.ConsumeGenerator;

import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;

import multicraft.*;

import static altanic.content.AltItems.*;
import static altanic.content.AltLiquids.*;

public class AltBlocks
{
    //TODO: Correct health, requirements, item chronology in requirements?, content chronology.
    public static Block

            //environment

                //ores
                fecoOre, calcite,

            //crafting
            pyrolyseOven, blastFurnace, solidMixer, centrifuge, oilRafinery, fermentationChamber,

            //power
            oilBurner, chargeGenerator,

            //walls
            fecoWall, fecoWallLarge;

    public static void load()
    {
        //environment

        //ores

        fecoOre = new OreBlock(feco)
        {{
            mapColor = feco.color;
        }};

        calcite = new Floor("calcite")
        {{
            mapColor = Color.white;
            itemDrop = flux;    
        }};

        //crafting

        pyrolyseOven = new MultiCrafter("pyrolyse-oven")
        {{
            size = 2;
            health = 400;

            requirements(Category.crafting, ItemStack.with(copper, 40, metaglass, 15, titanium, 25));

            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(wood, 5)),
                                    Seq.with(),
                                    0.75f
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(coal, 1)),
                                    Seq.with(LiquidStack.with(creosote, 0.1f))
                            ),
                            120
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(coal, 5)),
                                    Seq.with(),
                                    1
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(coalCoke, 5)),
                                    Seq.with(LiquidStack.with(creosote, 0.2f))
                            ),
                            180
                    )
            );
        }};

        blastFurnace = new MultiCrafter("blast-furnace")
        {{
            size = 3;
            health = 500;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.04f;

            requirements(Category.crafting, ItemStack.with(lead, 50, metaglass, 25, graphite, 100, titanium, 45, thorium, 75));

            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(feco, 5, coal, 10)),
                                    Seq.with(),//Liquids?
                                    6
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 5)),
                                    Seq.with(LiquidStack.with(slag, 0.1f))
                            ),
                            180
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(feco, 5, coal, 10, flux, 5)),
                                    Seq.with(),
                                    2
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 5)),
                                    Seq.with(LiquidStack.with(slag, 0.1f))
                            ),
                            180
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(feco, 5, coalCoke, 5)),
                                    Seq.with(),
                                    6
                            ),

                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 5)),
                                    Seq.with(LiquidStack.with(slag, 0.1f))
                            ),
                            180
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(feco, 5, coalCoke, 5, flux, 5)),
                                    Seq.with(),
                                    2
                            ),

                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 5)),
                                    Seq.with(LiquidStack.with(slag, 0.1f))
                            ),
                            180
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(feco, 10, petroleumCoke, 5)),
                                    Seq.with(),
                                    6
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 10)),
                                    Seq.with(LiquidStack.with(slag, 0.2f))
                            ),
                            180
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(feco, 10, petroleumCoke, 5, flux, 5)),
                                    Seq.with(),
                                    2
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 10)),
                                    Seq.with(LiquidStack.with(slag, 0.2f))
                            ),
                            180
                    )
            );

            drawer = new DrawMulti(new DrawDefault(), new DrawFlame());
        }};

        solidMixer = new MultiCrafter("solid-mixer")
        {{
            size = 2;
            health = 400;

            ambientSound = Sounds.grinding;
            ambientSoundVolume = 0.04f;

            requirements(Category.crafting, ItemStack.with(lead, 50, graphite, 25, titanium, 45, metaglass, 10, silicon, 15));

            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(coal, 1, lead, 2, sand, 2)),
                                    Seq.with(),
                                    0.2f
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(pyratite, 1)),
                                    Seq.with()
                            ),
                            80
                    ),

                    new Recipe(
                            new IOEntry(
                                Seq.with(ItemStack.with(coalCoke, 2, sand, 4)),
                                Seq.with(),
                                0.3f
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(pyratite, 2)),
                                    Seq.with()
                            ),
                            80
                    ),

                    new Recipe(
                        new IOEntry(
                                Seq.with(ItemStack.with(pyratite, 1, sporePod, 1)),
                                Seq.with(),
                                0.8f
                        ),
                        new IOEntry(
                                Seq.with(ItemStack.with(blastCompound, 1)),
                                Seq.with()
                        ),
                        80
                    ),

                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(sulfur, 2, sand, 4)),
                                    Seq.with(),
                                    0.8f
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(blastCompound, 2)),
                                    Seq.with()
                            ),
                            80
                    )
            );
        }};

        centrifuge = new MultiCrafter("centrifuge")
        {{
            requirements(Category.crafting, ItemStack.with(lead, 50, graphite, 25, metaglass, 30, silicon, 15, titanium, 20));

            size = 2;
            health = 400;

            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with()),
                                    Seq.with(LiquidStack.with(oil, 0.2f)),
                                    0.7f
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(coal, 2)),
                                    Seq.with()
                            ),
                            30
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(sand, 14)),
                                    Seq.with(LiquidStack.with(creosote, 0.1f)),
                                    0.8f
                            ),
                            new IOEntry(
                                    Seq.with(ItemStack.with(pyratite, 5, blastCompound, 2)),
                                    Seq.with()
                            ),
                            120
                    )
            );
        }};

        //TODO: Change to Mulitcrafter (more recipes)?
        oilRafinery = new GenericCrafter("oil-rafinery")
        {{
            requirements(Category.crafting, ItemStack.with(metaglass, 45, graphite, 50, titanium, 75, silicon, 50));

            size = 3;
            health = 800;

            craftTime = 30f;//Is it matters? Liquids always comes with per __one__ second.
            rotate = true;
            invertFlip = true;
            hasItems = false;
            hasLiquids = true;

            consumeLiquid(oil, 0.2f);
            consumePower(2f);

            regionRotated1 = 2;
            outputLiquids = LiquidStack.with(AltLiquids.fuel, 0.12/*0.15*/, heavyOil, 0.08/*0.05*/);
            liquidOutputDirections = new int[]{1, 3};
        }};

        //power

        oilBurner = new ConsumeGenerator("oil-burner")
        {{
            requirements(Category.power, ItemStack.with(copper, 50, lead, 75, titanium, 40, metaglass, 35, silicon, 45));

            size = 3;
            health = 400;

            consume(new ConsumeLiquidFlammable());

            powerProduction = 9f;
            liquidCapacity = 60f;
            hasItems = false;
            hasLiquids = true;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.03f;
        }};

        chargeGenerator = new ConsumeGenerator("charge-generator")
        {{
            requirements(Category.power, ItemStack.with(lead, 125, thorium, 50, silicon, 75, plastanium, 75, phaseFabric, 25));//TODO: it has to much RTG here

            size = 2;

            powerProduction = 7.5f;
            itemDuration = 60f * 20;

            consume(new ConsumeItemCharged());
        }};

        //walls

        fecoWall = new Wall("feco-wall")
        {{
            requirements(Category.defense, ItemStack.with(feco, 1));
            health = 1080;
            size = 1;
        }};

        fecoWallLarge = new Wall("feco-wall-large")
        {{
            requirements(Category.defense, ItemStack.with(feco, 24));
            health = 4320;
            size = 2;
        }};
    }
}