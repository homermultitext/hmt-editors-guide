# Editorial policies #


The Homer Multitext project is creating  *digital, diplomatic editions* of Homeric manuscripts and papyri.  Our editions document what we are able to read, and our readings are cross-referenced to citations of the visual evidence we used.

In the following examples, images are linked to interactive versions of the cited visual evidence.

## Characters and character sequences ##

**diaereses** on vowels with breathing and/or accent

:  Use Unicode "Combining Diaeresis" character

[![diaresis][diaeresis]][1]

Example:  ί̈σχειν (urn:cts:greekLit:tlg0012.tlg001.msA:9.352)

[diaeresis]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA118VN-0621.tif&RGN=0.4855,0.5409,0.0721,0.0301&WID=8000&CVT=JPEG

[1]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301

[1embed]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301&width=9000



**macra**

:  Use Unicode "Combining Macron" character.

[![macron][macron]][2]

Example: δαίνῡ {urn:cts:greekLit:tlg0012.tlg001.msA:9.70)


[2]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA113RN-0285@0.1832,0.4222,0.0741,0.0233

[macron]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA113RN-0285.tif&RGN=0.1832,0.4222,0.0741,0.0233&WID=8000&CVT=JPEG

**brevia**

: Use Unicode "Combining Breve" character

urn:cite:hmt:edguide:brevefloat


**elisions**

: Of the many possible Unicode characters for elision, use only Unicode straight single quote.  If you use Sophokeys to enter Greek, note that this is **not** the character it generates automatically when entering Greek.

[![elision][elision]][4]

Example: ἄλλ' ἐν (urn:cts:greekLit:tlg0012.tlg001.msA:9.235)

[elision]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA116VN-0619.tif&RGN=0.5485,0.2201,0.0561,0.0278&WID=8000&CVT=JPEG

[4]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA116VN-0619@0.5485,0.2201,0.0561,0.0278



**"floating" grave accents**

: Floating grave accents in the manuscript can appear on an elided syllable.
"Float" a grave accent character between the last letter of the word and the elision mark.

[!["floating" accent][float]][5]

Example: μετα δ`᾽ ἔσσεται
(urn:cts:greekLit:tlg0012.tlg001.msA:9.131)

[float]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA114RN-0286.tif&RGN=0.3333,0.6371,0.1221,0.0233&WID=8000&CVT=JPEG

[5]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA114RN-0286@0.3333,0.6371,0.1221,0.0233

## Orthography ##

**accentuation and breathings**
:	We record all accents and breathings as given in the manuscript (not "corrected" to modern usage).  This category includes diaeresis, and markings for short or long vowel quantities (breve and macron).

**iota**
: Iotas are consistently written adscript in most of our manuscripts: we write them subscript where that is usual in modern practice without implying that the manuscript does so.

[![iota subscript][subscript]][200]

[200]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.501,0.2434,0.058,0.027

[subscript]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.501,0.2434,0.058,0.027&WID=8000&CVT=JPEG

Example: καλῇ (urn:cts:greekLit:tlg0012.tlg001.msA:1.604)

**ligatures and variant letter forms**
: Our transcription does not  note ligatures or variant letter forms: readers interested in these visual features of the manuscript should consult the associated high-resolution images.  We treat regular abbreviations for morphological endings, for prepositions, and for the conjunction καί as variant letter forms, and silently expand these in the transcriptions.


## Distinct content types ##

### Named entities (proper nouns and adjectives) ###


**personal names**

: Use TEI `persName` element; include an `@n` attribute with the full URN value from the [reference table of identifiers for personal names][pers].

[![Achilles][Achilles]][500]

Example:

`<persName n="urn:cite:hmt:pers.pers1">Ἀχιλλεύς</persName>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.58)

[Achilles]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA013RN-0014.tif&RGN=0.488,0.2915,0.063,0.0263&WID=8000&CVT=JPEG

[500]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA013RN-0014@0.488,0.2915,0.063,0.0263

- Note in cases where more than one person is refered to, such as the Atreidai, you double wrap personal names

[![Atreidai][Atreidai]][501]

Example:

`<persName n="urn:cite:hmt:pers.pers22"><persName n="urn:cite:hmt:pers.pers119">Ἀτρεΐδαι</persName></persName>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.17)

[Atreidai]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012RN-0013.tif&RGN=0.1602,0.5465,0.0841,0.0263&WID=8000&CVT=JPEG

[501]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.1602,0.5465,0.0841,0.0263

**place names**

: Use TEI `placeName` element; include on the `@n` attribute has a full URN value from  the [reference table of identifiers for place names][place].

[![Argos][Argos]][503]

Example:

`<placeName n="urn:cite:hmt:place.place114">Ἄργεϊ</placeName>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.30)

[Argos]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012VN-0514.tif&RGN=0.655,0.2915,0.049,0.0293&WID=8000&CVT=JPEG

[503]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012VN-0514@0.655,0.2915,0.049,0.0293


**ethnic adjectives**

:  Use TEI `rs` element.  Include a `@type` attribute with value `ethnic`, and `@n` attribute with an identifier from the  [reference table for place names][place] or the [reference table for personal names][pers], when you need to use an eponymous ancestor (such as the Danaans).

[![Achaious][Achaious]][504]

Example:

`<rs type="ethnic" n="urn:cite:hmt:place.place96">Ἀχαιούς</rs>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.61)

- Since some ethnic names could be attributed to a location or an eponymous ancester (e.g. Trojans link to Tros or Troy), always take the geographic location before resorting to an eponymous ancestor.

[Achaious]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA013RN-0014.tif&RGN=0.461,0.426,0.071,0.027&WID=8000&CVT=JPEG

[504]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA013RN-0014@0.461,0.426,0.071,0.027

**astronomical bodies**

:   Use TEI `rs` element.   Include a `@type` attribute with value `astro`, and `@n` attribute with an identifer from the [reference table for astronomical bodies][astro].

[![Orion][Orion]][505]

Example:

`<rs type="astro" n="urn:cite:hmt:astro.1">Ὠρίωνος</rs>`

(urn:cts:greekLit:tlg0012.tlg001.msA:18.486)

[astro]: https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv

[Orion]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA248VN-0750.tif&RGN=0.811,0.3343,0.084,0.0323&WID=8000&CVT=JPEG

[505]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA248VN-0750@0.811,0.3343,0.084,0.0323

**untagged proper names**

:   While it is tempting to tag all proper names, there are other names capitalized in our editions that we do not tag as named entities because they are too vague or don't fit our categories. Among them include: the Muses, Gorgons, Centaurs, Giants, Myrmidons, the Scaean Gate, and adjectival forms of people's names (ergo, we can tag 'Homer' but not 'Homeric'). We also do not tag unclear epithets, even if the identity can be determined from context. For example "Phoebus Apollo" is ok, but the "Earthshaker" to refer to Poseidon is not.

###Other special content types ###

**titles**

:  If the title refers to a known, citable work, use TEI `ref` with `@type='urn'` and `@n` attribute with a full URN for the work
- Use TEI `title` element (wrapping `ref` if that is given). `ref` is not necessary if it is a work or portion of a work we do not have a URN for.

[![Odyssey][Odyssey]][600]

Example:

`<title><ref type="urn" n="urn:cts:greekLit:tlg0012.tlg002">Οδυσσεία</ref></title>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.4)

- Note that book numbers are considered titles, as are common names for books or portions of books (e.g. the Catalog refering to the Catalog of Ships in Book 2).

[Odyssey]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012RN-0013.tif&RGN=0.6086,0.2072,0.037,0.0203&WID=9000&CVT=JPEG

[600]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.6086,0.2072,0.037,0.0203


**numbers**

: Use TEI `num` with `@value` attribute. Numbers are often denoted with a horizontal bar by the scribe to indicate that they are not lexical content.

[![number][number]][602]

`<num value="50">ν</num>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.42)

[number]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012VN-0514.tif&RGN=0.838,0.7543,0.018,0.0195&WID=9000&CVT=JPEG

[602]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012VN-0514@0.838,0.7543,0.018,0.0195

note: Remember that Dindorf and Erbse will typically take a Milesian numeral and write the full Greek word, but we want a fully diplomatic edition. Also remember that book numbers are treated as titles, not numbers in TEI.

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


##Editorial status##

While readers always take many kinds of contextual information into consideration when reading a text, HMT editors should distinguish three levels of legibility based solely on the paleographic clarity of the reading.

1. *clear*.  The letter is unambiguously legible, based on paleographic considerations alone.  It may be incompletely preserved, but the visible remains cannot be read as any other character.
2. *unclear*. Part of the letter is visible, but taken by itself cannot be unambiguously read. That is **paleographically** ambiguous. You might be able to make an educated guess, but that is not a diplomatic edition.
3. *missing*.  No trace of the letter remains, but it is clear from the context that one or more letters were originally present. This occurs in instances where there is damage to the manuscript such as a [hole][hole] or extreme [fading][fading], even in [specialized lighting][uv].

[hole]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA044VN-0546@0.24,0.7506,0.065,0.0729

[fading]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.7808,0.0916,0.1251,0.2297

[uv]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RUVD-0895@0.577,0.1367,0.248,0.4636

**Clear readings**

: Enter the text with no additional markup

**Unclear readings**

: Use TEI `unclear` element.  If the `unclear` element breaks up a word token, wrap the entire work  in a TEI `w` element. Note that `w` is only necessary if the word is broken up. If a whole word is unclear, `w` is not necessary and should not be included.

[![unclear][unclear]][100]

Example:

`<w>γ<unclear>ὰ</unclear>ρ</w>`

(urn:cts:greekLit:tlg5026.msA.hmt:8.132)


[100]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA104RN-0105@0.5386,0.1585,0.0224,0.0174


[unclear]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA104RN-0105.tif&RGN=0.5386,0.1585,0.0224,0.0174&WID=8000&CVT=JPEG


**Missing**
:  Use TEI `gap` element.  Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicate how many units are likely included in the gap.

Example:

`<gap unit="letters" extent="3"/>`




**Text deleted by original scribe**
: Use TEI `del` when the scribe has either crossed out content or marked it with "deletion dots"

[![deletion][deletion]][102]

Example:

`<del>οὐκ εἰς το πρεσβεύειν ἀλλ εἰς τὸ πρεσβεύειν Αἴαντας καὶ Ὀδυσσέα Φοίνικος προέληλυθότος</del>` (urn:cts:greekLit:tlg5026.msA.hmt:9.193)

[deletion]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA115RN-0287.tif&RGN=0.233,0.7521,0.453,0.027&WID=8000&CVT=JPEG

[102]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA115RN-0287@0.233,0.7521,0.453,0.027

**Added text above line**

: Use TEI `add` element, including `@place` attribute with value `supralinear`

[![added text][added]][103]

Example:

`<w>ἔνι<add place="supralinear">οι</add></w>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.9)

[103]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5045,0.7325,0.031,0.021

[added]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.5045,0.7325,0.031,0.021&WID=8000&CVT=JPEG


**Alternate readings offered above the line**

: Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading; group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example:

`<choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.351)


[![alternative text][alt]][104]

[alt]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.3844,0.5364,0.1021,0.0293&WID=8000&CVT=JPEG


[104]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293



**Scribal corrections**

: Use TEI `corr/sic` pair for corrections when the wants to correct a reading that is unintelligible in the text;  group the pair in a TEI `choice` element.

[![correction][corr]][105]


Example: accent corrected by the original scribe

`<choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.337)

[corr]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.5245,0.275,0.0871,0.0308&WID=8000&CVT=JPEG

[105]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308

## Abbreviations ##

###Abbreviations without mark up###

**Regular terminating syllables**

: Regular terminating syllables (often morphological endings, but not always appearing at the end of a word) are treated as a variant letter form, and are not specially marked in any way. See the paleography guide if you are unfamiliar with the common abbreviations.

[![Abbreviate -os][os]][106]

Example:

εἰκος, where a raised omicron is a brief writing for the morphological ending -ος (urn:cts:greekLit:tlg5026.msA.hmt:4.478)

[106]:  http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.7755,0.4663,0.0263,0.0159

[os]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.7755,0.4663,0.0263,0.0159&WID=8000&CVT=JPEG

**Symbol Abbreviations**

: Regular abbreviated forms of the whole words (e.g. καί, ὅτι, δέ, γάρ, διά, etc.) are treated as variant letter forms, and are not specially marked in any way. The rule of thumb for determining if it is a symbol abbreviation is if the symbol cannot be completely broken down into distinquishable letter forms.

Examples:

[![καί][kai]][107]

(urn:cts:greekLit:tlg5026.msA.hmt:4.437)

[![oti][oti]][108]

(urn:cts:greekLit:tlg5026.msA.hmt:4.8)

[oti]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.6517,0.4711,0.02,0.0158&WID=8000&CVT=JPEG

[kai]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA056RN-0057.tif&RGN=0.621,0.5696,0.0152,0.0137&WID=8000&CVT=JPEG

[107]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA056RN-0057@0.621,0.5696,0.0152,0.0137

[108]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.6517,0.4711,0.02,0.0158


### Abbreviations that Require Mark up ###

**paleographically ambiguous abbreviations**

: Unlike the examples above, the marks that denote these abbreviations do not always indicate the same missing letters. Therefore, because they are paleographically ambiguous, they require mark up.

- Use the TEI `abbr/expan` pair, wrapped in `choice`

[![abbreviation][houtos]][109]

Example:

`<choice><abbr>ουτ</abbr><expan>οὑτῶς</expan></choice>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.495)

[109]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.453,0.7399,0.0224,0.0135

[houtos]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.453,0.7399,0.0224,0.0135&WID=8000&CVT=JPEG

[![abbr][pater]][110]

Example:

`<choice><abbr>περ</abbr><expan>πάτερ</expan></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.288)

[pater]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.3183,0.293,0.045,0.024&WID=8000&CVT=JPEG

[110]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.3183,0.293,0.045,0.024


## Multiple types of Mark up Required ##

We have three major categories of mark up in our XML documents:
- Structural: this is already handled in your template files (i.e. organizing things by book, etc.)
- Special Content: indications of numbers, titles, named entities, etc.
- Editorial Status: things like abbreviations, whether the text is readable, etc.


In cases where you have mark up for both editorial status and special content (e.g. an abbreviation personal name), you will do the editorial status first, then wrap it in the mark up for content.

Example:

`<persName n="urn:cite:hmt:pers.pers16"><choice><abbr>Αρισταρχ</abbr><expan>Ἀρίσταρχος</expan></choice></persName>`

### Editing Non-Textual Elements ###

## Slurs ##

Semi-circular symbols, which resemble musical slur marks, are written beneath some compound words in the Venetus A manuscript. These marks are recorded in comma separated value tables (files should be .csv and can be edited on github or in simple text editor). The tables for compound word slurs should contain three headings:

`Slur,Reading,Image`

Under **Slur** goes the urn reference for the slur itself. This urn reference is composed of the Book Number, a hyphen, and unique identifying sequence.


`urn:cite:hmt:venAslur.Book#_Identifier`

Under **Reading** goes the urn reference for the line of text in the *Iliad* in the Venetus A and the word under which the slur appears.


`urn:cts:greekLit:tlg0012.tlg001.msA:11.[line#]@[word],`

Finally, under **Image**, goes the the urn reference for the image citation of the word and its slur. This is contained within quotation marks(""). This urn reference is obtained via the image citation tool.

Each of these columns is separated by a comma.

An entry typically looks like this:

`Slur,Reading,Image`
`urn:cite:hmt:venAslur.10_1,urn:cts:greekLit:tlg0012.tlg001.msA:10.1@Παναχαιῶν,"urn:cite:hmt:vaimg.VA126RN-0298@0.4825,0.2141,0.1131,0.0173"`

## Connecting Signs ##

Some scholia appear to have connecting signs that work in a way similar to footnotes. These are not recorded in your text edition, but are recorded in `.csv` files in the collections folder. If you find these in your assignment, you should create the following two files in your repository.

`venA-connectingTextSigns.csv` : For recording the signs that appear over lines of Iliadic text
`venA-connectingScholiaSigns.csv` : For recording the signs that appear next to scholia text

`venA-connectingTextSigns.csv` should contain 6 columns:

`ObjectURN,ScholionURN,TextURN,ImageURN,FolioURN,Notes`

|Column Item|Definition|Example|
|:---|:---|:---|
|ObjectURN|a unique reference for the object|urn:cite:hmt:VAtextsign_1|
|ScholionURN|full URN for the scholion referenced|urn:cts:greekLit:tlg5026.msA.hmt:19.2015office9_2|
|TextURN|full cts URN for the Iliadic text up to the word/phrase level|urn:cts:greekLit:tlg0012.tlg001.msA:19.80@ἐόντα|
|ImageURN|full cite URN for the image of the mark|urn:cite:hmt:vaimg.VA253RN-0424@0.602,0.2915,0.028,0.0173|
|FolioURN|full cite URN for the folio|urn:cite:hmt:msA.253r|
|Notes|any relevant comments such as type of mark|curly oti|

`venA-connectingScholiaSigns.csv` should contain 4 columns:

`ObjectURN,ScholionURN,ImageURN,Notes`

|Column Item|Definition|Example|
|:---|:---|:---|
|ObjectURN|a unique reference for the object|urn:cite:hmt:VAscholiasign_1|
|ScholionURN|full cts URN for the scholion referenced|urn:cts:greekLit:tlg5026.msA.hmt:19.2015office9_2|
|ImageURN|full cite URN for the image of the mark|urn:cite:hmt:vaimg.VA253RN-0424@0.1181,0.3001,0.0228,0.0114|
|Notes|any relevant comments such as type of mark|curly oti|

## Critical Signs on Scholia ##

On rare occasions you may find critical signs next to the scholia. While the ones next to the main text are already indexed, the ones next to the scholia are not. In this situation, you should make a file called `venAsigns-Scholia.csv` in your Collections folder with the following columns:

`OccurenceURN,SequenceWithinBook,CritSignURN,ScholiaURN,ImageURN`

|Column Item|Definition|Example|
|:---|:---|:---|
|OccurenceURN|a unique cite URN for the occurence of the sign|urn:cite:hmt:venAscholiacritsign.1|
|SequenceWithinBook|numerical sequence of the sign within the assigned book|1|
|CritSignURN|cite URN reference for the type of critical sign|urn:cite:hmt:critsigns.diple|
|ScholiaURN|full cts URN for the scholion referenced|urn:cts:greekLit:tlg5026.msA.hmt:17.76|
|ImageURN|full cite URN for the image of the critical sign|urn:cite:hmt:vaimg.VA227RN-0398@0.349,0.726,0.02,0.015|

crit sign URNs are:

|diple|urn:cite:hmt:critsigns.diple|
|dotted diple|urn:cite:hmt:critsigns.dotteddiple|
|asterisk|urn:cite:hmt:critsigns.asterisk|
|obelos|urn:cite:hmt:critsigns.obelos|
|dotted antisigma|urn:cite:hmt:critsigns.dottedantisigma|
|dotted sigma|urn:cite:hmt:critsigns.dottedsigma|

## Appendix:  other references ##


Reference table for identifiers for personal names:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtnames.csv][pers]

Reference table for identifiers for place names:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtplaces.csv][place]

Reference table for identifiers for astronomical bodies:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv][astro]

Paleography Guide to the Venetus A:
[http://homermultitext.github.io/hmt-docs/palguide.pdf][paleo]



[pers]: https://www.google.com/fusiontables/DataSource?docid=1fcfeXQWcChl-EiSt9vNHMfXYGSM3ETn5ZwTKF0Y#rows:id=1

[place]: https://www.google.com/fusiontables/DataSource?docid=1M7FKJjXaK4WQVL85zhi30TsWHeF-XSMVfQ3bYz8#rows:id=1

[paleo]: http://homermultitext.github.io/hmt-docs/palguide.pdf
