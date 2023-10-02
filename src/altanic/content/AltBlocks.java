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
    //TODO: requirements, item chronology in it?, content chronology.
    public static Block

            //environment

                //ores
                fecoOre, calcite,

            //crafting
            pyrolyseOven, blastFurnace, solidMixer, centrifuge, oilRefinery, fermentationChamber, biomassPress,

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
            requirements(Category.crafting, ItemStack.with(copper, 40, metaglass, 15, titanium, 25));
            size = 2;

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
            requirements(Category.crafting, ItemStack.with(lead, 50, metaglass, 25, graphite, 100, titanium, 45, thorium, 75));
            size = 3;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.04f;

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
            requirements(Category.crafting, ItemStack.with(lead, 50, graphite, 25, titanium, 45, metaglass, 10, silicon, 15));
            size = 2;

            ambientSound = Sounds.grinding;
            ambientSoundVolume = 0.04f;

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

        //TODO: Drawers has some problems
        oilRefinery = new GenericCrafter("oil-refinery")
        {{
            requirements(Category.crafting, ItemStack.with(metaglass, 45, graphite, 50, titanium, 75, silicon, 50));
            size = 3;

            craftTime = 30f;//Is it matters? Liquids always comes with per __one__ second.
            rotate = true;
            invertFlip = true;
            hasItems = false;
            hasLiquids = true;

            consumeLiquid(oil, 0.2f);
            consumePower(2f);

            regionRotated1 = 3;
            outputLiquids = LiquidStack.with(AltLiquids.fuel, 0.12/*0.15*/, heavyOil, 0.08/*0.05*/);
            liquidOutputDirections = new int[]{1, 3};

            drawer = new DrawMulti(
                    new DrawRegion("-bottom"),
                    new DrawLiquidTile(oil),
                    new DrawDefault(),
                    //new DrawLiquidOutputs(),
                    new DrawFlame(Color.valueOf("ffef99"))
            );
        }};

        //TODO: nerf
        fermentationChamber = new MultiCrafter("fermentation-chamber")
        {{
            requirements(Category.crafting, ItemStack.with(copper, 50, lead, 45, graphite, 25, metaglass, 15));
            size = 2;

            ambientSound = Sounds.steam;
            ambientSoundVolume = 0.02f;

            resolvedRecipes = Seq.with(
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(biomass, 10)),
                                    Seq.with(),
                                    1.2f
                            ),
                            new IOEntry(
                                    Seq.with(),
                                    Seq.with(LiquidStack.with(ethanol, 0.2f))
                            ),
                            60
                    ),
                    new Recipe(
                        new IOEntry(
                                Seq.with(ItemStack.with(sporePod, 6)),
                                Seq.with(),
                                1.5f
                        ),
                        new IOEntry(
                                Seq.with(),
                                Seq.with(LiquidStack.with(gas, 0.2f))
                        ),
                        60
                    ),
                    new Recipe(
                            new IOEntry(
                                    Seq.with(ItemStack.with(wood, 12)),
                                    Seq.with(),
                                    1.4f
                            ),
                            new IOEntry(
                                    Seq.with(),
                                    Seq.with(LiquidStack.with(methanol, 0.2f))
                            ),
                            60
                    )

            );

            //TODO: find a better way - less code.
            drawer = new DrawRecipe(){{
                drawers = new DrawBlock[]{
                        new DrawMulti(
                                new DrawRegion("-bottom"),
                                new DrawCells()
                                {{
                                        color = Color.valueOf("edffff");
                                        particleColorFrom = Color.white;
                                        particleColorTo = Color.valueOf("bbffff");
                                        particles = 25;
                                        range = 2f;
                                }},
                                new DrawDefault(),
                                new DrawRegion("-top")
                        ),
                        new DrawMulti(
                                new DrawRegion("-bottom"),
                                new DrawCells()
                                {{
                                        color = Color.valueOf("1d1d23");
                                        particleColorFrom = Color.black;
                                        particleColorTo = Color.valueOf("313131");
                                        particles = 25;
                                        range = 2f;
                                }},
                                new DrawDefault(),
                                new DrawRegion("-top")
                        ),
                        new DrawMulti(
                                new DrawRegion("-bottom"),
                                new DrawCells()
                                {{
                                        color = Color.valueOf("edffff");
                                        particleColorFrom = Color.white;
                                        particleColorTo = Color.valueOf("e6ffff");
                                        particles = 25;
                                        range = 2f;
                                }},
                                new DrawDefault(),
                                new DrawRegion("-top")
                        )
                };
            }};
        }};

        biomassPress = new GenericCrafter("biomass-press")
        {{
            requirements(Category.crafting, ItemStack.with(copper, 60, lead, 30, silicon, 10));
            size = 2;

            craftTime = 30f;
            hasLiquids = true;
            hasItems = true;

            consumeItem(biomass, 6);
            consumePower(0.4f);

            outputLiquids = LiquidStack.with(plantOil, 0.3f);

            drawer = new DrawMulti(
                    new DrawRegion("-bottom"),
                    new DrawRegion("-mid"),
                    new DrawLiquidTile(plantOil),
                    new DrawPistons()
                    {{
                        sinMag = 1f;
                    }},
                    new DrawDefault(),
                    new DrawRegion("-top")
            );
        }};

        //power

        oilBurner = new ConsumeGenerator("oil-burner")
        {{
            requirements(Category.power, ItemStack.with(copper, 50, lead, 75, titanium, 40, metaglass, 35, silicon, 45));
            size = 3;

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

            drawer = new DrawMulti(
                    new DrawDefault(),
                    new DrawWarmupRegion()
            );
        }};

        //walls
        //TODO: Change to `scaledHealth`.

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