# Content

Folder for files with creates content, in (h)json.

## Structure

**You need to add folder for contetn types (blocks, items, liquids, units, sectro, etc.)** But what is inside of them is up to You.

Structure of this folder here:

```txt
content
├──blocks
|   |
|   ├──crafting
|   |   ├──files
|   |   └──README.md
|   ├──defense
|   |   ├──files
|   |   └──README.md
|   ├──environment
|   |   ├──files
|   |   └──README.md
|   ├──liquid
|   |   ├──files
|   |   └──README.md
|   ├──multi
|   |   ├──files
|   |   └──README.md
|   ├──power
|   |   ├──files
|   |   └──README.md
|   ├──temporary
|   |   ├──files
|   |   └──README.md
|   |
|   └──README.md
|
├──items
|   |
|   ├──files
|   └──README.md
|
└──liquids
|   |   
|   ├──files
|   └──README.md
└──README.md
```

### Blocks

#### Crafting

Crafting category files.

#### Defense

Defense category including turrets.

#### Environment

Floors, walls, ores, that kind of content.

#### Liquid

Block that have to deal with liquids

#### Multi

Multicrafters directory.

#### Power

Power production and distribution, and storage.

#### Temporary

Temp.

### Items

Everything else that could be transported or storaged.

### Liquids

Liquids.

### README.md

You are here.

## Specifics

For liquids and items no `type:` is required, **but they must be in specif folder**.
Block are more complex, have more functionality.

In this folder everything is done by using hjson or normal json.
Since I am intrested in making mindustry mods I started to see that *the parser* can read json files that were written like hjson and the oposite.

These two format has diffrences with syntax.

### Diffrences

HJSON is easier basicly.

#### JSON

The first and last lines are occupaided by `{}` and the parameters of *thing* are in them.

Names of parameter is in `""` and the same with *names*.
Numbers, booleans not.

You have to put `,` as well.

Example:

```json
"shoot": {
  "type": "ShootAlternate",
  "barrels": 2,
  "barrelOffset": 0
}
```

```json
# From Z.P.G.M._mod.

"requirements": [
    { "item": "copper", "amount": 1500 },
    { "item": "titanium", "amount": 1000 },
    { "item": "silicon", "amount": 500 },
    { "item": "plastanium", "amount": 500 },
    { "item": "elen", "amount": 500 },
    { "item": "fazowane", "amount": 200 },
    { "item": "mikroczip", "amount": 50 }
],
```

### HJSON

Keep the basic and everything will be good.

```hjson
shoot: {
    type: ShootAlternate
    barrels: 2
    spread: 5
    barrelOffset: 0
}
```

```hjson
# This as well from other mod.

requirements: [
    copper/600
    lead/600
    titanium/1800
    thorium/2000
    silicon/4000
    plastanium/2000
    phase-fabric/1000
    nanoczesci/100
    torwz/800
]
```

### Other

If you want to use something from a (h)json format just write a `file-name` of that thing. If it is from other mod add `mod-name-file-name`.
