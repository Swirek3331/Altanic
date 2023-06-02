package altanic;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.content.*;

import altanic.content.*;

public class Altanic extends Mod
{
    public Altanic()
    {

    }

    @Override
    public void loadContent()
    {
        //ALtBlocks.load();
        AltItems.load();
    }
}