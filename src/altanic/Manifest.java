package altanic;

import mindustry.mod.*;

import altanic.content.*;

public class Manifest extends Mod
{
    public Manifest()
    {

    }

    @Override
    public  void loadContent()
    {
        AltItems.load();
        AltBlocks.load();
    }
}