//Ahh gówno idzemy tu znowusz

const oilBurner = extendContent(ConsumeGenerator, "oil-burner", {
    size: 2,
    helht: 400,
    powerProduction: 15,
    
    hasLiquds: true,
    hasItems: false,
});
oilBurner.consume(new ConsumeLiquidFlammable());