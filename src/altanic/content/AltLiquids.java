package altanic.content;

import arc.graphics.Color;
import mindustry.content.Liquids;
import mindustry.type.Liquid;

public class AltLiquids
{
    public static Liquid creosote, fuel, gas, heavyOil, ethanol, methanol, plantOil, biofuel;
    //TODO: Stats

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

        fuel = new Liquid("fuel", Color.valueOf("ff8000"))
        {{
            gasColor = color;
            viscosity = (float)(Liquids.oil.viscosity * 0.8);
            flammability = Liquids.oil.flammability * 2;
            explosiveness = Liquids.oil.explosiveness * 0.75f;
            heatCapacity = Liquids.oil.heatCapacity;
            boilPoint = Liquids.oil.boilPoint;
        }};

        gas = new Liquid("gas", Color.valueOf("1d1d23"))
        {{
            gas = true;
            gasColor = color;
            flammability = Liquids.oil.flammability * 1.5f;
            explosiveness = Liquids.oil.explosiveness * 0.8f;
            heatCapacity = Liquids.oil.heatCapacity;
        }};

        heavyOil = new Liquid("heavy-oil", Color.valueOf("3d0000"))
        {{
            viscosity = Liquids.oil.viscosity * 2;
            flammability = Liquids.oil.flammability * 0.8f;
            explosiveness = Liquids.oil.explosiveness * 1.1f;
            heatCapacity = Liquids.oil.heatCapacity;
            boilPoint = Liquids.oil.boilPoint;
        }};

        ethanol = new Liquid("ethanol", Color.valueOf("edffff"))
        {{
            gasColor = color;
            flammability = Liquids.oil.flammability;
            explosiveness = Liquids.oil.explosiveness / 3;
            boilPoint = Liquids.water.boilPoint;
        }};

        methanol = new Liquid("methanol", Color.valueOf("e0e0e0"))
        {{
            gasColor = color;
            flammability = Liquids.oil.flammability * 0.8f;
            explosiveness = Liquids.oil.explosiveness / 3;
            boilPoint = Liquids.water.boilPoint;
        }};

        plantOil = new Liquid("plant-oil", Color.valueOf("cefa32"))
        {{
            viscosity = (float)(Liquids.oil.viscosity * 0.8);
            flammability = Liquids.oil.flammability * 0.7f;
            explosiveness = Liquids.oil.explosiveness * 0.8f;
            boilPoint = Liquids.oil.boilPoint;
        }};

        biofuel = new Liquid("biofuel", Color.valueOf("a2a00f"))
        {{
            viscosity = fuel.viscosity;
            flammability = fuel.flammability;
            explosiveness = fuel.explosiveness;
            boilPoint = fuel.boilPoint;
        }};
    }
}
