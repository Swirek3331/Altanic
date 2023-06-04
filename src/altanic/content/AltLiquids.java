package altanic.content;

import arc.graphics.*;
import mindustry.type.Liquid;

public class AltLiquids
{
    public static Liquid creosote;

    public static void load()
    {
        creosote = new Liquid("creosote", Color.valueOf("7d4f07"))
        {{
            viscosity = 0.5f;
            flammability = 0.75f;
            explosiveness = 0.25f;
            heatCapacity = 0.5f;
            gasColor = color;
            boilPoint = 0.5f;
        }};
    }
}
