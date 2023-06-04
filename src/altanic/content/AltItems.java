package altanic.content;

import arc.graphics.*;
import mindustry.type.Item;

public class AltItems
{
    public static Item feco, coalCoke, flux, wallAlloy;

    public static void load()
    {
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
    }
}