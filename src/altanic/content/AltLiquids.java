package altanic.content;

import arc.graphics.*;
import mindustry.type.Liquid;
import mindustry.content.Liquids;

public class AltLiquids
{
    public static Liquid creosote, lightOil, gas, heavyOil;

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
        
        lightOil = new Liquid("light-oil", Color.valueOf("ddc600"))
        {{
            gasColor = color;
            viscosity = oil.viscosity * 0.8;
            flammability = oil.flammability * 2;
            explosiveness = oil.explosiveness * 0.75f;
            heatCapacity = oil.heatCapacity;
            boilPoint = oil.boilPoint;
        }};

        gas = new Liquid("gas", Color.valueOf("1D1D23"))
        {{
            gas = true;
            gasColor = color;
            flammability = oil.flammability * 1.5f;
            explosiveness = oil.explosiveness * 0.8f;
            heatCapacity = oil.heatCapacity;
        }};

        heavyOil = new Liquid("heavy-oil", Color.valueOf("3d0000"))
        {{
            viscosity = oil.viscosity * 2;
            flammability = oil.flammability * 0.8f;
            explosiveness = oil.explosiveness * 1.1f;
            heatCapacity = oil.heatCapacity;
            boilPoint = oil.boilPoint;
        }};
    }
}
