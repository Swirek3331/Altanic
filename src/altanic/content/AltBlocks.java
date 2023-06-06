package altanic.content;

import  arc.struct.Seq;

import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;

import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.power.*;

import multicraft.*;

import static altanic.content.AltItems.*;
import static altanic.content.AltLiquids.*;

public class AltBlocks
{
    public static Block

            //crafting
            blastFurnace, pyrolyseOven, solidMixer, oilFractioner,

            //power
            oilBurner,

            //defense

                //walls
                fecoWall, fecoWallLarge;

    public static void load()
    {
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

        oilFractioner = new GenericCrafter("oil-fractioner")
        {{
            requirements(Category.crafting, ItemStack.with(metaglass, 45, graphite, 50, titanium, 75, silicon, 50));

            size = 3;
            health = 800;

            craftTime = 30f;
            rotate = true;
            invertFlip = true;
            hasItems = false;
            hasLiquids = true;

            consumeLiquid(oil, 0.2f);
            consumePower(2f);

            regionRotated1 = 3;
            outputLiquids = LiquidStack.with(lightOil, 3f / 60, gas, 3f / 60, heavyOil, 2f / 60);
            liquidOutputDirections = new int[]{1, 2, 3};

            drawer = new DrawMulti(
                    new DrawLiquidRegion()
            );
        }};

        //power

        oilBurner = new ConsumeGenerator("oil-burner")
        {{
            requirements(Category.power, ItemStack.with(copper, 50, lead, 75, titanium, 40, metaglass, 35, silicon, 45));

            size = 2;
            health = 500;

            consume(new ConsumeLiquidFlammable());

            powerProduction = 9f;
            liquidCapacity = 60f;
            hasItems = false;
            hasLiquids = true;

            ambientSound = Sounds.smelter;
            ambientSoundVolume = 0.03f;

            drawer = new DrawMulti(
                    new DrawRegion("-bottom"),
                    new DrawPistons()
                    {{
                        sinMag = 1f; //Ło boże
                    }},
                    new DrawRegion("-mid"),
                    new DrawLiquidRegion(),
                    new DrawGlowRegion()
                    {{
                        alpha = 1f;
                        glowScale = 5f;
                    }},
                    new DrawDefault(),
                    new DrawRegion("-top")
            );
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