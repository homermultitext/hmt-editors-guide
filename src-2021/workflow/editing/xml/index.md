---
layout: page
grand_parent: Workflow
parent: Editing
title: "Editing a passage of text"
nav_order: 3
---


# Editing a passage of text



## What you record

We record a *diplomatic* edition, that transcribes exactlly what we read on a page of a manuscript, with editorial markup distinguishing unclear readings and gaps in the text.  We add editorial content to clarify content such as identification of personal names and expansion of abbreviations.

## How to record it

You keep your text editions in the aptly named `editions` directory.  The names of the files must match the file name cataloged in `config/citation.cex`.

You record your editions in XML complying with the guidelines of the Text Encoding Initiative (TEI).  VS Code's Scholarly XML plugin will check that your markup follows TEI guidelines, and will display the status of your work in the ribbon at the bottom of your VS Code window with a message that looks like one of these two:

![](../../../imgs/xml-valid.png) ![](../../../imgs/xml-invalid.png)

The HMT project uses only a small subset of the TEI guidelines.  In the summer of 2021, we plan to add further checks to a Pluto notebook validating that your XML complies not only with the broad TEI guidelines, but also the specific HMT guidelines.  You can find a complete summary of XML markup allowed in the HMT project in the technical reference part of this web site.