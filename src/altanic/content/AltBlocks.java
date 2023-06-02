package altanic.content;

import arc.struct.Seq;

import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;

import multicraft.*;

import static mindustry.type.ItemStack.*;
import static mindustry.content.Items.*;
import static mindustry.content.Liquids.*;
import static altanic.content.AltItems.*;

public class ALtBlocks
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
                        Seq.with(ItemStack.with(wallAloy, 5)),
                        Seq.with(LiquidStack.with(slag, 0.1f))
                    ),
                    180f
                )
            )
        }};
    }
}