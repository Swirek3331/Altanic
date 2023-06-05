package altanic.content;

import arc.func.*;
import arc.struct.Seq;

import mindustry.ctype.UnlockableContent;
import mindustry.content.*;
import static mindustry.content.TechTree.*;
import static mindustry.content.Blocks.*;
import static mindustry.content.Items.*;

import static altanic.content.AltItems.*;
import static altanic.content.AltBlocks.*;
import static altanic.content.AltLiquids.*;

public class AltSerpuloTechTree
{
    static TechNode context = null;

    public static void load()
    {
        //This can be replaced with a lambda expression?

        mergeNode(Liquids.slag, () -> {//Ciecze mają takie same nazwy jak ich bloki
            node(feco, () -> {
                node(wallAlloy, () -> {
                    node(flux);
                });
            });
        });

        mergeNode(coal, () -> {
           node(coalCoke, () -> {
               node(sulfur);
               node(petroleumCoke);
           });
        });

        mergeNode(Liquids.water, () -> {
            node(biomass);
            node(wood, () -> {
                node(creosote);
            });
        });

        mergeNode(melter, () -> {
           node(pyrolyseOven, () -> {
               node(blastFurnace);
           });
        });
    }

    private static void mergeNode(UnlockableContent parent, Runnable children){
        context = TechTree.all.find(t -> t.content == parent);
        children.run();
    }
}
