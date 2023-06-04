package altanic.content;

import arc.struct.Seq;

import mindustry.content.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.Blocks.*;
import static mindustry.content.Items.*;

import static altanic.content.AltItems.*;
import static altanic.content.AltBlocks.*;
import static altanic.content.AltLiquids.*;

public class AltSerpuloTechTree
{
    public static void load()
    {
        //This can be replaced with a lambda expression?

        node(Liquids.slag, () -> {//Ciecze mają takie same nazwy jak ich bloki
            node(feco, () -> {
                node(wallAlloy, () -> {
                    node(flux);
                });
            });
        });

        node(coal, () -> {
           node(coalCoke, () -> {
               node(sulfur);
               node(petroleumCoke);
           });
        });

        node(Liquids.water, () -> {
            node(biomass);
            node(wood, () -> {
                node(creosote);
            });
        });

        node(melter, () -> {
           node(pyrolyseOven, () -> {
               node(blastFurnace);
           });
        });
    }
}
