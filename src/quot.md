### Quotation and citation ###

**unidentified quoted words, phrases, or passages**

:  Use TEI `q` for quoted words, phrases, or passages. A quoted selection must be at least one full parsable Greek work. Quoted phrases can ranges from hypothetical phrases to multiforms to quotations from works that we cannot cite. The scribe will not make quotes visually distinct. Use our print editions to help you, as well as context.

[![q1][q1]][400]

Example:

`<q>πρὸς ὃ</q>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.1498)

[q1]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.709,0.154,0.04,0.0188&WID=8000&CVT=JPEG

[400]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.709,0.154,0.04,0.0188

**identifiable quotations**

: Use TEI `q/ref` pair wrapped in a `cit` element.  On `ref` element use `@type` attribute =`urn`. Inside `ref` element give the full cts urn for the quote (i.e. the text reference). The most common references will likely be *Iliad* or *Odyssey* quotes. If you have other citations, see the lists of citable [authors](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-groups.csv) and [works](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-works.csv). If you have a known text that is not referenced, create an [issue](https://github.com/chs-tg/greekLit/issues) in the repository. The scribe will not make quotes visually distinct. Use our print editions to help you, as well as context.

[![quotation][quot]][111]

Example:

`<cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg001:17.453</ref><q>ἔτι γάρ σφισι κῦδος ὀρέξω</q></cit>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.8)

[quot]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.5696,0.5064,0.1552,0.0195&WID=8000&CVT=JPEG

[111]:  http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5696,0.5064,0.1552,0.0195

**quoted strings**
: Quoted strings are defined as strings of letters that should not be considered parsable Greek words. One example might be the scholion talking about the use of the letter sigma. We do not want the machine to treat a single sigma as a Greek word so use TEI `rs` element with `@type` attribute = `waw` ("word-as-word"). Quoted strings are often, but not always, made visually distinct via a horizontal bar. They can be difficult to distinguish from the horizonatal bars that denote numbers and you have to determine from context. The neuter article, prepostions, and other vocabulary realted to writing will be your clue.

[![waw][waw]][300]

Example:

`<rs type="waw">ν</rs>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.1498)

[waw]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.697,0.1548,0.018,0.0195&WID=8000&CVT=JPEG

[300]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.697,0.1548,0.018,0.0195
