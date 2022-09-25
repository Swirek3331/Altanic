//https://liplum.github.io/MultiCrafterLib/usage/
//for more info

const multi = require("multi-crafter/lib")
// Multi-crafter is a library that allows you to create multi-crafters
// Here multi-crafter class is imported

const electricFurnace = multi.MultiCrafter("electric-furnace");
//this create block named electric-furnace, I am not sure how to make it in one const, so
electricFurnace.recipe = []