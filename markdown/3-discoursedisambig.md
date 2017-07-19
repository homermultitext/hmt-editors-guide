# Tier 4: Discourse disambiguation

### Quotation and citation

**unidentified quoted words, phrases, or passages**

Use TEI `q` for quoted words, phrases, or passages. A quoted selection must be at least one full parsable Greek work. Quoted phrases can ranges from hypothetical phrases to multiforms to quotations from works that we cannot cite. The scribe will not make quotes visually distinct. Use our print editions to help you, as well as context.

[![q1][q1]][400]

Example:

`<q>πρὸς ὃ</q>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.1498)

[q1]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.709,0.154,0.04,0.0188&WID=8000&CVT=JPEG

[400]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.709,0.154,0.04,0.0188

**identifiable quotations**

Use TEI `ref/q` pair wrapped in a `cit` element.  On `ref` element use `@type` attribute =`urn`. Inside `ref` element give the full cts urn for the quote (i.e. the text reference). The most common references will likely be *Iliad* or *Odyssey* quotes. If you have other citations, see the lists of citable [authors](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-groups.csv) and [works](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-works.csv). If you have a known text that is not referenced, create an [issue](https://github.com/chs-tg/greekLit/issues) in the repository. The scribe will not make quotes visually distinct. Use our print editions to help you, as well as context.

[![quotation][quot]][111]

Example:

`<cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg001:17.453</ref><q>ἔτι γάρ σφισι κῦδος ὀρέξω</q></cit>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.8)

[quot]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.5696,0.5064,0.1552,0.0195&WID=8000&CVT=JPEG

[111]:  http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5696,0.5064,0.1552,0.0195


## Other Discourse Analysis ##

**titles**

If the title refers to a known, citable work, use TEI `ref` with `@type='urn'` and `@n` attribute with a full URN for the work
- Use TEI `title` element (wrapping `ref` if that is given). `ref` is not necessary if it is a work or portion of a work we do not have a URN for. You can find a full list of our citable [authors](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-groups.csv) and [works](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-works.csv). If a known work is not present, please create an issue in the repository to request its addition.

[![Odyssey][Odyssey]][600]

Example:

`<title><ref type="urn" n="urn:cts:greekLit:tlg0012.tlg002:">Οδυσσεία</ref></title>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.4)

- Note that book numbers are considered titles, as are common names for books or portions of books (e.g. the Catalog referring to the Catalog of Ships in Book 2).

[Odyssey]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012RN-0013.tif&RGN=0.6086,0.2072,0.037,0.0203&WID=9000&CVT=JPEG

[600]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.6086,0.2072,0.037,0.0203

Titles that are not citable with a cts URN can still be cited with an object URN found at [citable works](https://github.com/homermultitext/hmt-authlists/blob/master/data/citedworks.csv).

Example:

`<title n="urn:cite2:hmt:citedworks:work2">Κυπρία</title>`

Like the named entities, new citable works can be proposed using the Issue Tracker on the authority list repository.

**lists**

When text is arranged in a list format (see [example](http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA102VN-0605@0.168,0.1306,0.25,0.1779)), use TEI element `list` with each line of the list in the element `item`. Items can be numbered (if they are numbered in your text) by adding the attribute `@type="ordered"` to the list element and the `item` elements can take an `@n` attribute to indicate the sequence.

Full mark up could look something like this:

`<list>`
`<item>apples</item>`
`<item>bananas</item>`
`<item>bread</item>`
`</list>`
