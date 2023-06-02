package altanic.content;

import arc.graphics.*;


import mindustry.content.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.type.Items;

public class AltItems
{
    public static Item feco, coalCoke, flux, wallAloy;

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
    }
}