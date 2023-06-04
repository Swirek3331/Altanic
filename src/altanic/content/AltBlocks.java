package altanic.content;

import  arc.struct.Seq;

import mindustry.*;
import mindustry.type.ItemStack;
import mindustry.type.LiquidStack;
import mindustry.world.*;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;

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
                                Seq.with(ItemStack.with(feco, 5, coalCoke, 5)),
                                Seq.with(),
                                6
                            ),

                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 5)),
                                    Seq.with(LiquidStack.with(slag, 0.1f))
                            ),
                            180
                    )
            );
        }};
    }
}