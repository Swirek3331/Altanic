package altanic.content;

import  arc.struct.Seq;

import mindustry.gen.*;
import mindustry.type.*;
import mindustry.world.*;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import mindustry.world.draw.*;

import multicraft.*;

import static altanic.content.AltItems.*;
import static altanic.content.AltLiquids.*;

public class AltBlocks
{
    public static Block

            //crafting
            blastFurnace, pyrolyseOven, solidMixer,

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
    }
}