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
                                Seq.with(ItemStack.with(coalCoke, 5, feco, 5)),
                                Seq.with()
                            ),

                            new IOEntry(
                                    Seq.with(ItemStack.with(wallAlloy, 5)),
                                    Seq.with(LiquidStack.with(slag, 0.1f))
                            ),
                            180f
                    )
            );
        }};
    }
}