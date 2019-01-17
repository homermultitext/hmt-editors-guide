# HMT editors' guide

This repository contains markdown source for building the Homer Multitext project's guide for contributors.

A current composite document in markdown format is included in this repository in [generated/guide.md](generated/guide.md), and is published on the web at <https://homermultitext.github.io/hmt-editors-guide/>.

If you find errors or omissions, or have questions about unclear sections of the guide, please post an issue on the project issue tracker:  <https://github.com/homermultitext/hmt-editors-guide/issues>



## Generating a fresh composite

The composite file is composed from several smaller source files.  The repository includes a scala script that stitches them together, and embeds images cataloged in a separate table.

To generate a new composite markdown file, start an `sbt console`, and from the console, load and run the script as follows:


    :load builder.sc
    GuideBuilder.writeGuide



## Organization of files


- `toc.txt` is an ordered list of names of files in markdown
-  
## Earlier versions

-   The 2014 version is available on the web [here](http://homermultitext.github.io/hmt-editors-guide/editorial-policies/)
-   The summer 2013 version is available in pdf, epub and Kindle mobi format [here][1].



[1]: http://shot.holycross.edu/chssummer2013/housestyle
