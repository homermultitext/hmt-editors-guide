---
layout: page
parent: Workflow
title: "Opening your validating notebook"
nav_order: 2
---

# Opening your validating notebook

It will take a couple of minutes for your Pluto notebook to build, so it's important to start your notebook as soon as you've cloned your repository.


## Starting the Pluto server

1. Open Julia.
2. At the `julia>` prompt, enter `using Pluto`, then `Pluto.run()`.


This will open a page in your default web browser that looks like this:

![](../../../imgs/pluto.png)



## Loading the validating notebook

Within your team's github repository, there is a directory named `notebooks`, that includes a file named `midvalidator-VERSION.jl`.  You need to enter the path to that file in the box labelled `Open from file:`.  If you have copied the path to your repository to your clipboard, paste that in to the box.  Complete the path by adding `notebooks/midvaliator-VERSION.jl`.

The Pluto file browser supports tab-completion, so you can type a few letters of the file name and use the tab key to complete the name.

