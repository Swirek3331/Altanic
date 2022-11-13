# Multicrafters?

Because I do not gain the knowladge about requirements in scripting, I split build cost, category and research to `hsjon` files.
Just read the `README.md` in [scripts folder](/scripts/README.md) for information about that kind of blocks.
**Requirements will be changed, many times**

That one with "description"

```hjson

category: crafting
# cateogry
requirements: [
# requirements
    lead/50
    metaglass/25
    graphite/100
    titanium/45
    thorium/75
]
research: {
    parent: pyrolyse-oven
    # from where node will be going in tech tree
    # you can also do here research requirements by writing requirements: [], but they are optional, game has multiplier for research cost based on build 
}
# Requiremnts are in TO DO
drawer: {
# component where functions from DrawBlock family are located
    type: multicraft.DrawRecipe
    # defining the type of drawer as a imported from multicraft
    drawers: [
    # defining the drawers
        {# recipe one
            type: DrawMulti
            drawers: [
                {
                    type: DrawDefault
                    #drawing default layer
                }
                {
                    type: DrawFlame
                    color: ffef99
                    #drawing flame
                }
            ]
            # normal DrawMulti function, but in multicraft.DrawRecipe
        }
        {# recipe two
            type: DrawMulti
            drawers: [
                {
                    type: DrawDefault
                }
                {
                    type: DrawFlame
                    color: ffef99
                }
            ]
        }
        {# recipe trzy
            type: DrawMulti
            drawers: [
                {
                    type: DrawDefault
                }
                {
                    type: DrawFlame
                    color: ffef99
                }
            ]
        }
        {# recipe sqrt(16)
            type: DrawMulti
            drawers: [
                {
                    type: DrawDefault
                }
                {
                    type: DrawFlame
                    color: ffef99
                }
            ]
        }
        {#recipe pięć
            type: DrawMulti
            drawers: [
                {
                    type: DrawDefault
                }
                {
                    type: DrawFlame
                    color: ffef99
                }
            ]
        }
        {#recipe VI
            type: DrawMulti
            drawers: [
                {
                    type: DrawDefault
                }
                {
                    type: DrawFlame
                    color: ffef99
                }
            ]
        }
        # each DrawMulti is for one recipe
    ]
}
```
