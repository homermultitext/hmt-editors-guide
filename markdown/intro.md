# Homer Multitext project: guide for editors

This document describes the HMT project's use of TEI XML in the summer of 2017.  All citable texts in the HMT project follow the OHCO2 model:  citable units are organized in an ordered hierarchy of citation units.  We use familiar TEI elements to represent the citation hierarchy: for citable nodes, `l` for lines of poetic text, and `p` for paragraph units of prose, with higher parts of the hierarchy (such as books of the *Iliad*) represented by TEI `div` elements.


The focus of this document is our usage of TEI *within* those citable nodes, to document the contents of our editions.  The order of sections describes our markup practice from "inside to out":  when elements co-occur, the element described first in this document (and so, innermost) will be wrapped by the element described later (outermost).  The major sections are:


1.   transcription of the main text
2.   tokenization the main text
3.   semantic disambiguation of named entities and abbreviations
4.   scribal intervention in the text
5.   editorial identification of the voice of the text

All editorial activity at every level involves scholarly judgments, and the clean separation suggested by this scheme is to some degree artificial:  nevertheless, we hope this schema will be helpful in guiding editors to follow the HMT project's editorial principles as they exercise their best judgment.
