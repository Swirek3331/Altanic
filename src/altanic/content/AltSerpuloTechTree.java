package altanic.content;

//import static mindustry.content.TechTree.*;
import arc.struct.Seq;
import mindustry.content.*;
import mindustry.ctype.*;
import mindustry.type.*;
import mindustry.content.TechTree.TechNode;
import mindustry.game.Objectives.*;

import static mindustry.content.Blocks.*;
import static mindustry.content.Items.*;
import static altanic.content.AltItems.*;
import static altanic.content.AltLiquids.*;
import static altanic.content.AltBlocks.*;

/**
 * Kiedyś użyłem takiego rozwiązania.
 * Od dobrodzieja 12three7.
 * Wiem, iż jest już w @link{mindustry.content.TechTree} coś, lecz ni chuj umiem tego używać.
 */
public class AltSerpuloTechTree
{
    static TechNode context = null;

    public static void load()
    {
        //This can be replaced with a lambda expression, mówi IntelliJ,
        //Lecz to jest dla mnie bardziej czytelne.

        extendNode(Liquids.slag, () -> {//Ciecze mają takie same nazwy jak ich bloki
            node(feco, () -> {
                node(wallAlloy, () -> {
                    node(flux);
                });
            });
        });

        extendNode(coal, () -> {
            node(coalCoke, () -> {
                node(petroleumCoke);
            });
        });

        extendNode(blastCompound, () -> {
            node(sulfur);
        });

        extendNode(Liquids.water, () -> {
            node(biomass);
            node(wood, () -> {
                node(creosote);
            });
        });

        extendNode(melter, () -> {
            node(pyrolyseOven, () -> {
                node(blastFurnace);
            });
        });
    }

    private static void extendNode(UnlockableContent parent, Runnable children)
    {
        context = TechTree.all.find(t -> t.content == parent);children.run();
    }
    private static void node(UnlockableContent content, ItemStack[] requirements, Seq <Objective> objectives, Runnable children)
    {
        TechNode node = new TechNode(context, content, requirements);
        if (objectives != null) node.objectives = objectives;TechNode prev = context;context = node;children.run();
        context = prev;
    }
    private static void node(UnlockableContent content, ItemStack[] requirements, Seq <Objective> objectives)
    {
        node(content, requirements, objectives, () -> {});
    }
    private static void node(UnlockableContent content, Seq <Objective> objectives)
    {
        node(content, content.researchRequirements(), objectives, () -> {});
    }
    private static void node(UnlockableContent content, ItemStack[] requirements)
    {
        node(content, requirements, Seq.with(), () -> {});
    }
    private static void node(UnlockableContent content, ItemStack[] requirements, Runnable children)
    {
        node(content, requirements, null, children);
    }
    private static void node(UnlockableContent content, Seq <Objective> objectives, Runnable children)
    {
        node(content, content.researchRequirements(), objectives, children);
    }
    private static void node(UnlockableContent content, Runnable children)
    {
        node(content, content.researchRequirements(), children);
    }
    private static void node(UnlockableContent block)
    {
        node(block, () -> {});
    }
    private static void nodeProduce(UnlockableContent content, Seq <Objective> objectives, Runnable children)
    {
        node(content, content.researchRequirements(), objectives.add(new Produce(content)), children);
        //and kiedyś tam było z tego, co pamiętam, a w samej metodzie było tam coś małego z add.
        //TODO?
        //Chociaż w sumie to używane nie jest.
    }
    private static void nodeProduce(UnlockableContent content, Seq <Objective> objectives)
    {
        nodeProduce(content, objectives, () -> {});
    }
    private static void nodeProduce(UnlockableContent content, Runnable children)
    {
        nodeProduce(content, Seq.with(), children);
    }
    private static void nodeProduce(UnlockableContent content)
    {
        nodeProduce(content, Seq.with(), () -> {});
    }
}
