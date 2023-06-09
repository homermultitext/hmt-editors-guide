---
layout: page
title: "Julia and Pluto notebooks"
parent: "Technical requirements"
nav_order: 3
---


# Installing and configuring Julia and Pluto


## What it does

Julia is a modern programming language that is especially effective for machine learning, image processing and working with text in Unicode -- all tasks that are releveant to the HMT project.

Pluto is an interactive notebook system, writting in Julia.  We use Pluto notebooks for automated validation and computer-assisted verification of our editorial work.


## Install and configure Julia and Pluto

### Install the Julia language

- download and install the "current stable release" of [Julia for your operating system](https://julialang.org/downloads/).


### Install Pluto

1. use the Julia icon to start a new Julia session
2. At the `julia>` prompt, type `]`.  The prompt will change to `pkg>` to indicate you're in "package" mode, where you can manage the packages in your installation of Julia.
3. Enter `add Pluto` to add the Pluto package.  *This will take a long time!* Don't worry about it: you won't have to repeat this.
4. When job has finished and you see the `pkg>` prompt again, hit delete or backspace to go back to the `julia>` prompt.
5. At the `julia>` prompt, enter `using Pluto`.   The first time you do this, Julia will need to build the entire Pluto notebook system so *this, too, will take a long time.* Don't worry about this, eiether: you won't have to build Pluto from scratch again.
6. At the `julia>` prompt, enter `Pluto.run()`.  The first time you do this, Julia will need to build a few additional items, and *this will not be fast*.  Don't worry: it will be much faster when you use Pluto notebooks ever after.  At the end of this process, Julia will open a new window in your default web browser connected to your Pluto notebook server.
7. In the Julia window where you are running the Pluto server, type control-C to stop the server, and enter `exit()` to quit Julia.


## Testing your installation

You know you've done your job right when you can repeat the process at will.  Test your installation:


1. Open Julia
2. At the `julia>` prompt, type `using Pluto`
3. At the `julia>` prompt, type `Pluto.run()`
4. Follow one of the links in the browser window that opens.