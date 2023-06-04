package altanic.content;

import  arc.struct.Seq;

import mindustry.gen.Sounds;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.*;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import mindustry.world.draw.*;

import multicraft.*;

import static altanic.content.AltItems.*;

public class AltBlocks
{
    public static Block blastFurnace, cokeOven;

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
                    )

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
    }
}