package altanic.content;

import arc.graphics.*;
import mindustry.content.Items;
import mindustry.type.Item;

public class AltItems
{
    public static Item feco, coalCoke, flux, wallAlloy, wood, petroleumCoke, biomass, sulfur;

    public static void load()
    {
        Items.sporePod.flammability = 1f;
        Items.coal.flammability = 1.2f;

        feco = new Item("feco", Color.valueOf("bfa58b"))
        {{
            hardness = 5;
        }};

        coalCoke = new Item("coal-coke", Color.valueOf("706f74"))
        {{
            flammability = 1.5f;
            explosiveness = 0.4f;
        }};

        flux = new Item("flux", Color.valueOf("ffffff"))
        {{
            hardness = 2;
        }};

        wallAlloy = new Item("wall-alloy", Color.valueOf("8ca498"));

        wood = new Item("wood", Color.valueOf("e9cfa3"))
        {{
            flammability = 1f;
        }};

        petroleumCoke = new Item("petroleum-coke", Color.valueOf("000000"))
        {{
            flammability = 2f;
            explosiveness = 0.8f;
        }};

        biomass = new Item("biomass")
        {{
            flammability = 0.75f;
        }};

        sulfur = new Item("sulfur")
        {{
            flammability = Items.blastCompound.flammability;
            explosiveness = Items.blastCompound.explosiveness * 0.8f;
        }};
    }
}