# Homer Multitext project: guide to XML usage for editors

## Introduction

This document describes the HMT project's use of TEI XML in the summer of 2017.


All citable texts in the HMT project follow the OHCO2 model:  citable units are organized in an ordered hierarchy of citation units.  We use familiar TEI elements to represent the citation hierarchy: citable nodes are either `l` for lines of poetic text, or `p` for paragraph units of prose, with higher parts of the hierarchy (such as books of the *Iliad*) represented by TEI `div` elements.  Each element corresponding to a level of the citation hierarchy has an `@n` attribute giving identifying value for that part of the text.  *Iliad* 10.1, for example, would be contained in a `div` element with `@n` attribute of `10`, and a `l` element with a value of `1`.

If the text of a scholion explicitly organizes material in a table or list structure, we use TEI `list` with `item` elements.  These are the only TEI elements we need to capture the basic structure of our diplomatic editions.


>Example:  see an example of a [list structure in a scholion](http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA315VN-0817@0.157,0.1772,0.281,0.0713). Items can be numbered (if they are numbered in the text) by adding the attribute `@type="ordered"` to the list element and the `item` elements can take an `@n` attribute to indicate the sequence.

    <list>
     <item>πέπλος· ὅν περονῶνται γυναῖκες· ὃς καὶ εανὸς καλεῖται:</item>`
     <item>χιτών ἀνδρεῖον ἔνδυμα</item>
     <item>φᾶρος ϊματιον ἀνδρῶν και γυναικῶν·</item>
     <item>χλαίνη τὸ περίβλημα τῆς κλίνης:</item>
    </list>


The focus of this document is our usage of TEI markup *within* those citable nodes, that is, how we document the contents of our citable nodes.  The order of sections describes our markup practice from "inside to out":  when elements co-occur, the element described first in this document (and so, innermost) will be wrapped by the element described later (outermost).  The major sections are:


1.   transcription of the main text
2.   tokenization the main text
3.   semantic disambiguation of named entities and abbreviations
4.   scribal intervention in the text
5.   editorial identification of the voice of the text

All editorial activity at every level involves scholarly judgments, and the clean separation suggested by this scheme is to some degree artificial:  nevertheless, we hope this schema will be helpful in guiding editors to follow the HMT project's editorial principles as they exercise their best judgment.
