package altanic.world.consumers;

import mindustry.gen.*;
import mindustry.world.consumers.*;

public class ConsumeLiquidExplosive extends ConsumeLiquidFilter
{
    public float minExplosiveness;

    public ConsumeLiquidExplosive(float minCharge, float amount){
        this.amount = amount;
        this.minExplosiveness = minCharge;
        this.filter = liquid -> liquid.explosiveness >= this.minExplosiveness;
    }

    public ConsumeLiquidExplosive(float amount){
        this(0.2f, amount);
    }

    public ConsumeLiquidExplosive(){
        this(0.2f);
    }

    @Override
    public float efficiencyMultiplier(Building build){
        var liq = getConsumed(build);
        return liq == null ? 0f : liq.explosiveness;
    }
}
