---
layout: page
grand_parent: Workflow
parent: Editing
title: "Indexing a passage of text"
nav_order: 2
---


# Indexing a passage of text


## What you record

Every citable passage of text that you edit is indexed to:

1. a region of a citable image
2. a reference for the page of the manuscript

The citable text passage is identified by a CTS URN.  The region of the image and the manuscript page are each identified by CITE2 URNs.

## How to record it

You keep your indexes in simple text files in the `dse` directory of your repository.  (`dse` stands for "digital scholarly edition".)  You may name the files anything you like, but include the file extensions `.cex`.

Each line in the file is a single index entry that associates a trio of URNs.  URNs are separated by the pipe character `|`.  The illustration below shows the first two lines of a DSE file: a header line, and one row of data.  (Unlike the illustration below, if you have configured Rainbow CSV to recognize `cex` files, the columns will be visually distinguished by colors.)


```
passage|imageroi|surface
urn:cts:greekLit:tlg0012.tlg001.e3:3.title|urn:cite2:hmt:e3bifolio.v1:E3_39v_40r@0.5346,0.2677,0.1974,0.04296|urn:cite2:hmt:e3bifolio.v1:E3_39v_40r
```

The text passage and the surface (page) are URNs your team should know before you start work on a page.  You create the image URN using the Homer Multitext project's [image citation tool](http://www.homermultitext.org/ict2/).




> ## ⭐️ Tips
>
> 1. Some teams like to have one member set up a (short) series of records with text and page URNs, leaving the image URN blank, while a second member uses the image citation tool to copy image URNs and paste them into the middle column of the CEX file.
> 2. Keep your editing and indexing in sync.  Don't index all the *Iliad* lines and *scholia* on a page without editing anything, or edit text without indexing the passages you're reading.





<style>
    blockquote {
         
     background-color: #f0f7fb;
     background-position: 9px 0px;
     background-repeat: no-repeat;
     border-left: solid 4px #3498db;
     line-heigh
     t: 18px;
     overflow: hidden;
     padding: 15px 60px;
   font-style: normal;
  
    }
</style>