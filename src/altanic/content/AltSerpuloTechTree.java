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

        vanillaNode(Liquids.slag, () -> {//Ciecze mają takie same nazwy jak ich bloki
            node(feco, () -> {
                node(wallAlloy, () -> {
                    node(flux);
                });
            });
        });

        vanillaNode(coal, () -> {
           node(coalCoke, () -> {
               node(sulfur);
               node(petroleumCoke);
           });
        });

        vanillaNode(Liquids.water, () -> {
            node(biomass);
            node(wood, () -> {
                node(creosote);
            });
        });

        vanillaNode(melter, () -> {
           node(pyrolyseOven, () -> {
               node(blastFurnace);
           });
        });
    }

    //https://github.com/MEEPofFaith/prog-mats-java/blob/erekir/src/progressed/content/PMTechTree.java
        private static void vanillaNode(UnlockableContent parent, Runnable children)
        {
            vanillaNode("serpulo", parent, children);
        }

        private static void vanillaNode(String tree, UnlockableContent parent, Runnable children)
        {
            context = findNode(TechTree.roots.find(r -> r.name.equals(tree)), n -> n.content == parent);
            children.run();
        }

        private static TechNode findNode(TechNode root, Boolf<TechNode> filter)
        {
            if (filter.get(root))
                return root;
            for (TechNode node : root.children)
            {
                TechNode search = findNode(node, filter);
                if (search != null)
                    return search;
            }
            return null;
        }
}
