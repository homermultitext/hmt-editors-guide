---
title: Citation
layout: page
---



## Citation

Editors create two kinds of documents:  diplomatic editions of texts in TEI-compliant XML, and tables in the simple form of delimited text files.

In both kinds of document, we use URNs to *refer* to citable objects:  CTS URNs to cite passages of text, and CITE2 URNs to cite other kinds of objects.

In XML editions of texts, however, the citation scheme is encoded as described in the following section.


## Citing texts

The OHCO2 model of citable texts joins two hierarchies:  a hierarchy of notional and concrete works, and an ordered hierarchy of citation units.  Each XML document that you edit must be cataloged in a file in your repository named `textcatalog.cex`: this documents the work hierarchy.

In your XML edition, we use familiar TEI elements to represent the citation hierarchy: citable nodes are either `l` for lines of poetic text, or `p` for paragraph units of prose, with higher parts of the hierarchy (such as books of the *Iliad*) represented by TEI `div` elements.  Each element corresponding to a level of the citation hierarchy has an `@n` attribute giving identifying value for that part of the text.  *Iliad* 10.1, for example, would be contained in a `div` element with `@n` attribute of `10`, and a `l` element with a value of `1`.

If the text of a scholion explicitly organizes material in a table or list structure, we use TEI `list` with `item` elements.  These are the only TEI elements we need to capture the basic structure of our diplomatic editions.


>Example:  see an example of a [list structure in a scholion][listzoom]. Items can be numbered (if they are numbered in the text) by adding the attribute `@type="ordered"` to the list element and the `item` elements can take an `@n` attribute to indicate the sequence.

[![List structure in a scholion][listimg]][listzoom]

[listimg]:  http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/deepzoom/hmt/vaimg/2017a/VA102VN_0605.tif&RGN=0.168,0.1306,0.25,0.1779&wID=500&CVT=JPEG


[listzoom]:  http://www.homermultitext.org/ict2/?urn=urn:cite2:hmt:vaimg.2017a:VA102VN_0605@0.168,0.1306,0.25,0.1779


## Citing objects


In addition to transcribed texts, our diplomatic editions document the physical artifacts preserving the text and documentary images illustrating the text.

A table in the `surfaces` directory records an ordered sequence of pages in a  text file with columns delimited by the pound sign `#`.  The first column in each row gives the CITE2 URN identifying that page.

Similarly, a table in the `images` directory records images documenting each manuscript in a text file with columns delimited by the pound sign `#`. The first column in each row gives the CITE2 URN identifying that image. These records are *not* ordered.


When editors index pages and passages of text to regions of images, they compile this information in tables associating URNs for each cited object.

## See also


-  [editorial principles](https://homermultitext.github.io/hmt-editing-principles/citation) behind these citation practices
-  [code libraries for citation](https://homermultitext.github.io/hmt-textmodel/citation)
