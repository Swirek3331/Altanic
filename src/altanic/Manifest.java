package altanic;

import mindustry.mod.*;

import altanic.content.*;

public class Manifest extends Mod
{
    public Manifest()
    {
        //To potrzebne?
    }

    @Override
    public  void loadContent()
    {
        AltItems.load();
        AltLiquids.load();
        AltBlocks.load();
        AltSerpuloTechTree.load();
    }
}