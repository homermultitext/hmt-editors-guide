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

[![breve][breve]][3]

Example: ̆ἄντ (urn:cts:greekLit:tlg0012.tlg001.msA:9.101)

[breve]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA113VN-0616.tif&RGN=0.7057,0.5462,0.029,0.0203&WID=8000&CVT=JPEG

[3]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA113VN-0616@0.7057,0.5462,0.029,0.0203


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

Example:

[![iota subscript][subscript]][200]

[200]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.501,0.2434,0.058,0.027

[subscript]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.501,0.2434,0.058,0.027&WID=8000&CVT=JPEG 

καλῇ (urn:cts:greekLit:tlg0012.tlg001.msA:1.604)

**ligatures and variant letter forms**
: Our transcription does not  note ligatures or variant letter forms: readers interested in these visual features of the manuscript should consult the associated high-resolution images.  We treat regular abbreviations for morphological endings, for prepositions, and for the conjunction καί as variant letter forms, and silently expand these in the transcriptions. 


## Distinct content types ##

### Named entities (proper nouns and adjectives) ###


**personal names**

: Use TEI `persName` element; include an `@n` attribute with the full URN value from the [reference table of identifiers for personal names][pers].

Example:
    
`<persName n="urn:cite:hmt:pers.pers1">Ἀχιλῆος</persName>`

note 1: in cases where more than one person is refered to, such as the Atreidai, you double wrap personal names

Example:

`<persName n="urn:cite:hmt:pers.pers22"><persName n="urn:cite:hmt:pers.pers119">Ἀτρεΐδαι</persName></persName>`

**place names**

: Use TEI `placeName` element; include on the `@n` attribute has a full URN value from  the [reference table of identifiers for place names][place].


Example:


`<placeName n="urn:cite:hmt:place.place185">Σπάρτη</placeName>`


**ethnic adjectives**

:  Use TEI `rs` element.  Include a `@type` attribute with value `ethnic`, and `@n` attribute with an identifier from the  [reference table for place names][place] or the [reference table for personal names][pers], when you need to use an eponymous ancestor (such as the Danaans).

Example:

`<rs type="ethnic" n="urn:cite:hmt:place.place96">Ἀχαιοὶ</rs>`

note: Since some ethnic names could be attributed to a location or an eponymous ancester (e.g. Trojans link to Tros or Troy), always take the geographic location before resorting to an eponymous ancestor.

**astronomical bodies**

:   Use TEI `rs` element.   Include a `@type` attribute with value `astro`, and `@n` attribute with an identifer from the [reference table for astronomical bodies][astro].

Example:

`<rs type="astro" n="urn:cite:hmt:astro.1">Ὠρίωνος</rs>`
    

[astro]: https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv

**untagged proper names**

:   While it is tempting to tag all proper names, there are other names capitalized in our editions that we do not tagged as named entities because they are too vague or don't fit our categories. Among them include: the Muses, Gorgons, Centaurs, Giants, Myrmidons, the Scaean Gate, and adjectival forms of people's names (ergo, we can tag 'Homer' but not 'Homeric'). We also do not tag unclear epithets, even if the identity can be determined from context. For example "Phoebus Apollo" is ok, but the "Earthshaker" to refer to Poseidon is not.

###Other special content types ###

**titles**

:  If the title refers to a known, citable work, use TEI `ref` with `@type='urn'` and `@n` attribute with a full URN for the work
- Use TEI `title` element (wrapping `ref` if that is given). `ref` is not necessary if it is a work or portion of a work we do not have a URN for.

Example: 

`<title><ref type="urn" n="urn:cts:greekLit:tlg0012.tlg002">Οδυσσεία</ref></title>`

- Note that book numbers are considered titles, as are common names for books or portions of books (e.g. the Catalog refering to the Catalog of Ships in Book 2).


**numbers**

: Use TEI `num` with `@value` attribute.


`<num value="1">α</num>`
    
note: Remember that Dindorf and Erbse will typically take a Milesian numeral and write the full Greek word, but we want a fully diplomatic edition. Also remember that book numbers are treated as titles, not numbers in TEI.


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

Added text above line
: Use TEI `add` element, including `@place` attribute with value `supralinear`

Example:



`<w>ἔνι<add place="supralinear">οι</add></w>`

[![added text][added]][103]

[103]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5045,0.7325,0.031,0.021

[added]: images/added.jpg


Alternate readings offered above the line
: Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading; group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example 

`<choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>`


[![alternative text][alt]][104]

[alt]: images/alt.jpg


[104]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293



Scribal corrections
: Use TEI `corr/sic` pair for corrections when the wants to correct a reading that is unintelligible in the text;  group the pair in a TEI `choice` element.  



Example: accent corrected by the original scribe

`<choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>`


[![correction][corr]][105]


[corr]: images/corr.jpg

[105]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308

Other content with `choice`
: When you have to include additional mark up (e.g. a personal name) on text that is wrapped in `choice`, put the additional mark up around `choice`.

Example

`<persName n="urn:cite:hmt:pers.pers16"><choice><abbr>Αρισταρχ</abbr>Ἀρίσταρχος<expan></expan></choice></persName>`

## Abbreviations

Regular terminating syllables
: Regular terminating syllables (often morphological endings) are treated as a variant letter form, and are not specially marked in any way

Example:

εἰκος, where a raised omicron is a brief writing for the morphological ending -ος


[![Abbreviate -os][os]][106]

[106]:  http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.7755,0.4663,0.0263,0.0159

[os]: images/os.jpg

καί and ὅτι
: Regular abbreviated forms of the whole words καί and ὅτι are treated as variant letter forms, and are not specially marked in any way

Examples:

[![καί][kai]][107]


[![oti][oti]][108]

[oti]: images/oti.jpg

[kai]: images/kai.jpg

[107]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA056RN-0057@0.621,0.5696,0.0152,0.0137

[108]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.6517,0.4711,0.02,0.0158


Other abbreviations
: Use the TEI `abbr/expan` pair, wrapped in `choice`

Example


        <choice><abbr>ουτ</abbr><expan>οὑτῶς</expan></choice>

[![abbreviation][houtos]][109]

[109]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.453,0.7399,0.0224,0.0135

[houtos]: images/houtos.jpg


    <choice><abbr>περ</abbr><expan>πάτερ</expan></choice>

[![abbr][pater]][110]

[pater]: images/pater.jpg

[110]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.3183,0.293,0.045,0.024




## Quotation and citation ##


unidentified quoted phrases
:  Use TEI `q` for quoted phrases or passages from unidentified sources. This is for one or more parsable Greek words.

Example 

    <q>ἀλλ ὥς τις κείνων γε</q>


identifiable quotations
: Use TEI `q/ref` pair wrapped in a `cit` element.  On `ref` element use `@type` attribute =`urn`. Inside `ref` element give the full cts urn for the quote.

Example

    <cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg001:17.453</ref><q>ἔτι γάρ σφισι κῦδος ὀρέξω</q></cit>

[![quotation][quot]][111]


[quot]: images/quot.jpg

[111]:  http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5696,0.5064,0.1552,0.0195

quoted strings
: Use TEI `rs` element with `@type` attribute = `waw` ("word-as-word"). This is for string of letters that are not parsable as Greek words.

Example

    <rs type="waw">ε</rs>

## Multiple types of Mark up Required ##

We have three major categories of mark up in our XML documents:
- Structural: this is already handled in your template files (i.e. organizing things by book, etc.)
- Editorial Status: things like abbreviations, whether the text is readable, etc.
- Content Judgments: indications of numbers, titles, named entities, etc.

In cases where you have mark up for both editorial status and content judgments (e.g. an abbreviation personal name), you will do the editorial status first, then wrap it in the mark up for content.

Example:

`<persName n="urn:cite:hmt:pers.pers16"><choice><abbr>Αρισταρχ</abbr><expan>Ἀρίσταρχος</expan></choice></persName>` 

## Appendix:  other references ##


Reference table for identifiers for personal names: 
[https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtnames.csv][pers]

Reference table for identifiers for place names:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtplaces.csv][place]

Reference table for identifiers for astronomical bodies:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv][astro]



[pers]: https://www.google.com/fusiontables/DataSource?docid=1fcfeXQWcChl-EiSt9vNHMfXYGSM3ETn5ZwTKF0Y#rows:id=1

[place]: https://www.google.com/fusiontables/DataSource?docid=1M7FKJjXaK4WQVL85zhi30TsWHeF-XSMVfQ3bYz8#rows:id=1
