# Homer Multitext project: guide to XML usage for editors

## Introduction

This document describes the HMT project's use of TEI XML in the summer of 2017.

All citable texts in the HMT project follow the OHCO2 model:  citable units are organized in an ordered hierarchy of citation units.  We use familiar TEI elements to represent the citation hierarchy: citable nodes are either `l` for lines of poetic text, or `p` for paragraph units of prose, with higher parts of the hierarchy (such as books of the *Iliad*) represented by TEI `div` elements.  Each element corresponding to a level of the citation hierarchy has an `@n` attribute giving identifying value for that part of the text.  *Iliad* 10.1, for example, would be contained in a `div` element with `@n` attribute of `10`, and a `l` element with a value of `1`.

If the text of a scholion explicitly organizes material in a table or list structure, we use TEI `list` with `item` elements.  These are the only TEI elements we need to capture the basic structure of our diplomatic editions.


>Example:  see an example of a [list structure in a scholion](http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA102VN-0605@0.168,0.1306,0.25,0.1779). Items can be numbered (if they are numbered in the text) by adding the attribute `@type="ordered"` to the list element and the `item` elements can take an `@n` attribute to indicate the sequence.


The focus of this document is our usage of TEI markup *within* those citable nodes, that is, how we document the contents of our citable nodes.  The order of sections describes our markup practice from "inside to out":  when elements co-occur, the element described first in this document (and so, innermost) will be wrapped by the element described later (outermost).  The major sections are:


1.   transcription of the main text
2.   tokenization the main text
3.   semantic disambiguation of named entities and abbreviations
4.   scribal intervention in the text
5.   editorial identification of the voice of the text

All editorial activity at every level involves scholarly judgments, and the clean separation suggested by this scheme is to some degree artificial:  nevertheless, we hope this schema will be helpful in guiding editors to follow the HMT project's editorial principles as they exercise their best judgment.

## 1: Diplomatic transcription

The first task of HMT editors is to transcribe the text as they read it on the manuscript.  Editors must understand what belongs in a text edition, what character set to use in transcribing the text, and how to encode the paleographic status of a reading.

### What doesn't belong in a text edition?

Text editions of the *Iliad* or scholia texts should *not* contain anything in the following categories:

1.  critical signs: located next to the Iliadic lines in the Venetus A
2.  connecting signs: sometimes written next to scholia and corresponding main text
3.  metacomments: numerical or other symbolic notation that further explains the text (e.g. reordered lines)

### Orthography and digital character set

Texts should be transcribed using a specified subset of the Unicode character set.

**accentuation and breathings**
:	We record all accents and breathings as given in the manuscript (not "corrected" to modern usage).  This category includes diaeresis, and markings for short or long vowel quantities (breve and macron).

**iota subscripts**
: Iotas are consistently written adscript in most of our manuscripts: we write them subscript where that is usual in modern practice without implying that the manuscript does so.

[![iota subscript][subscript]][200]

[200]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.501,0.2434,0.058,0.027

[subscript]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.501,0.2434,0.058,0.027&WID=100&CVT=JPEG

Example: καλῇ (urn:cts:greekLit:tlg0012.tlg001.msA:1.604)

**ligatures and variant letter forms**
: Our transcription does not  note ligatures or variant letter forms: readers interested in these visual features of the manuscript should consult the associated high-resolution images.  We treat regular abbreviations for morphological endings, for prepositions, and for the conjunction καί as variant letter forms, and silently expand these in the transcriptions. See more on variant letter forms under abbreviations.


#### Diacritical Marks

Most Greek keyboards are not able to handle more than two diacritical marks, so in instances where you need and accent, breathing, and a diacritical mark, use combining characters which are typically found in special character menus in most basic text editors.

**diaereses** on vowels with breathing and/or accent should use Unicode "Combining Diaeresis" character.

[![diaresis][diaeresis]][1]

Example:  ί̈σχειν (urn:cts:greekLit:tlg0012.tlg001.msA:9.352)

[diaeresis]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA118VN-0621.tif&RGN=0.4855,0.5409,0.0721,0.0301&WID=100&CVT=JPEG

[1]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301

[1embed]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301&width=9000

**macra** should use Unicode "Combining Macron" character.

[![macron][macron]][2]

Example: δαίνῡ {urn:cts:greekLit:tlg0012.tlg001.msA:9.70)

[2]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA113RN-0285@0.1832,0.4222,0.0741,0.0233

[macron]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA113RN-0285.tif&RGN=0.1832,0.4222,0.0741,0.0233&WID=100&CVT=JPEG

**brevia** should use Unicode "Combining Breve" character

urn:cite:hmt:edguide:brevefloat

**elisions**

Of the many possible Unicode characters for elision, use only Unicode straight single quote. If you use Sophokeys to enter Greek, note that this is **not** the character it generates automatically when entering Greek.

[![elision][elision]][4]

Example: ἄλλ' ἐν (urn:cts:greekLit:tlg0012.tlg001.msA:9.235)

[elision]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA116VN-0619.tif&RGN=0.5485,0.2201,0.0561,0.0278&WID=100&CVT=JPEG

[4]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA116VN-0619@0.5485,0.2201,0.0561,0.0278


**"floating" grave accents**

Floating grave accents in the manuscript can appear on an elided syllable.
"Float" a grave accent character between the last letter of the word and the elision mark.

[!["floating" accent][float]][5]

Example: μετα δ`᾽ ἔσσεται
(urn:cts:greekLit:tlg0012.tlg001.msA:9.131)

[float]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA114RN-0286.tif&RGN=0.3333,0.6371,0.1221,0.0233&WID=100&CVT=JPEG

[5]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA114RN-0286@0.3333,0.6371,0.1221,0.0233

** Punctuation Used **


When editing manuscripts, it is important to remember that punctuation is an important part of producing a diplomatic edition. Some easy places to forget about punctuation and other similar graphemes include: the end of Iliadic lines, the crosses at the beginning of lemmata , the various forms of punctuation or lack thereof at the end of lemmata, and punctuation at the end of scholia.

period: .
high stop: ·
comma: ,
colon: :
end of scholion: ⁑
cross: ‡

You should only find end-of-scholion markers and the cross in scholia.


### Paleographic status

While readers always take many kinds of contextual information into consideration when reading a text, HMT editors should distinguish three levels of legibility based solely on the paleographic clarity of the reading.

1.  *clear*.  The letter is unambiguously legible, based on paleographic considerations alone.  It may be incompletely preserved, but the visible remains cannot be read as any other character.
2.  *unclear*. Part of the letter is visible, but taken by itself cannot be unambiguously read. That is **paleographically** ambiguous. You might be able to make an educated guess, but that is not a diplomatic edition.
3.  *missing*.  No trace of the letter remains, but it is clear from the context that one or more letters were originally present. This occurs in instances where there is damage to the manuscript such as a [hole][hole] or extreme [fading][fading], even in [specialized lighting][uv].

[hole]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA044VN-0546@0.24,0.7506,0.065,0.0729

[fading]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.7808,0.0916,0.1251,0.2297

[uv]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RUVD-0895@0.577,0.1367,0.248,0.4636

**Clear readings**

Enter the text with no additional markup

**Unclear readings**

Use TEI `unclear` element.  If the `unclear` element breaks up a lexical token or numeric token, wrap the entire word  in a TEI `w` element or `num`:  see the following section on "Tokenization" for more details. Note that `w` is only necessary if the word is broken up. If a whole word is unclear, `w` is not necessary and need not be included.

[![unclear][unclear]][100]

Example:

`<w>γ<unclear>ὰ</unclear>ρ</w>`

(urn:cts:greekLit:tlg5026.msA.hmt:8.132)


[100]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA104RN-0105@0.5386,0.1585,0.0224,0.0174


[unclear]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA104RN-0105.tif&RGN=0.5386,0.1585,0.0224,0.0174&WID=100&CVT=JPEG


**Missing**
Use TEI `gap` element.  Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicate how many units are likely included in the gap.

Example:

`<gap unit="letters" extent="3"/>`


### Scribal modifications

(For markup of more extensive scribal interventions in the text, see section 4.)

## 2: Tokenization

Editors must subdivide their transcribed text into tokens, and explicitly or implicitly classify each token as one of the following types:

-   lexical type (a "word")
-   numeric type (normally written with alphabetic characters in Milesian notation)
-   punctuation
-   unintelligible
-   literal string of characters

While print editions typically imply tokenization of all types by separating them with white space or punctuation characters, the use of space and punctuation in Byzantine manuscripts is not a rigidly consistent guide to tokenization, so HMT editors must deliberately distinguish tokens in their transcribed text.  For automated processing, punctuation tokens can be distinguished by their unique character set, and so require no markup.  Lexical tokens are the default type, and require no further markup if a token is unambiguously bounded by white space or punctuation.  Other tokens always require markup, as explained next.

### Lexical tokens

If a lexical token is paleographically clear, editors should use white space to separate it from adjacent lexical tokens.  White space is not necessary if the adjacent token is a punctuation charater.

If parts of a lexical token are unclear or include gaps, however, XML processors are free to separate the literal text of the clear readings from text included in
There are a few cases where we cannot rely on whitespace to split our tokens because of other TEI mark up.

**paleographic clarity**

As previously noted, transcribing a text can sometimes split lexical tokens with `gap` or `unclear`. In these situations, the whole word needs to be explicitly wrapped in the `w` ("word") element so that the contents can be recognized as a single token.



**scribal additions**

Use TEI `add` element, including `@place` attribute with value `supralinear`

[![added text][added]][103]

Example:

`<w>ἔνι<add place="supralinear">οι</add></w>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.9)

[103]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5045,0.7325,0.031,0.021

[added]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.5045,0.7325,0.031,0.021&WID=100&CVT=JPEG

In cases where the addition does not split a word, you would not need to use `w`




### Numbers

Use TEI `num` with `@value` attribute. Numbers are often denoted with a horizontal bar by the scribe to indicate that they are not lexical content.

[![number][number]][602]

`<num value="50">ν</num>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.42)

[number]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012VN-0514.tif&RGN=0.838,0.7543,0.018,0.0195&WID=100&CVT=JPEG

[602]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012VN-0514@0.838,0.7543,0.018,0.0195

note: Remember that Dindorf and Erbse will typically take a Milesian numeral and write the full Greek word, but we want a fully diplomatic edition. Also remember that book numbers are treated as titles, not numbers in TEI.



### Quoted literal strings

Quoted literal strings are defined as strings of letters that should not be considered parseable Greek words. One example might be the scholion talking about the use of the letter sigma. We do not want the machine to treat a single sigma as a Greek word so use TEI `rs` element with `@type` attribute = `waw` ("word-as-word"). Quoted strings are often, but not always, made visually distinct via a horizontal bar. They can be difficult to distinguish from the horizontal bars that denote numbers and you have to determine from context. The neuter article, prepositions, and other vocabulary related to writing will be your clue.

[![waw][waw]][300]

Example:

`<rs type="waw">ν</rs>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.1498)

[waw]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.697,0.1548,0.018,0.0195&WID=100&CVT=JPEG

[300]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.697,0.1548,0.018,0.0195



## Scribal Deletions

Use TEI `del` when the scribe has either crossed out content, erased, or marked it with "deletion dots"

[![deletion][deletion]][102]

Example:

`<del>οὐκ εἰς το πρεσβεύειν ἀλλ εἰς τὸ πρεσβεύειν Αἴαντας καὶ Ὀδυσσέα Φοίνικος προέληλυθότος</del>` (urn:cts:greekLit:tlg5026.msA.hmt:9.193)

[deletion]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA115RN-0287.tif&RGN=0.233,0.7521,0.453,0.027&WID=100&CVT=JPEG

[102]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA115RN-0287@0.233,0.7521,0.453,0.027




## Scribal Corrections

Use TEI `sic/corr` pair for corrections when the wants to correct a reading that is unintelligible in the text;  group the pair in a TEI `choice` element.

[![correction][corr]][105]


Example: accent corrected by the original scribe

`<choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.337)

[corr]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.5245,0.275,0.0871,0.0308&WID=100&CVT=JPEG

[105]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308

Please note that this mark up is *only* used by corrections we believe were made by the scribe. That means you cannot offer your own corrections and the scribe could be wrong by our orthographic standards. This is a diplomatic editions and we do not want to make our own judges on grammatical correctness at this stage of editing.


## Scribal Multiforms

Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading; group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example:

`<choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.351)


[![alternative text][alt]][104]

[alt]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.3844,0.5364,0.1021,0.0293&WID=100&CVT=JPEG


[104]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293

Alternative readings are typically strings of characters or even single letters. You will use the whole word like in the example above.

## Abbreviations

### Abbreviations without mark up

**Regular terminating syllables**

Regular terminating syllables (often morphological endings, but not always appearing at the end of a word) are treated as a variant letter form, and are not specially marked in any way. See the [paleography guide](http://homermultitext.github.io/hmt-docs/palguide.pdf) if you are unfamiliar with the common abbreviations. If accents or other diacritical marks should be present on the abbreviated syllable(s), they can be supplied in the expansion.

[![Abbreviate -os][os]][106]

Example:

εἰκος, where a raised omicron is a brief writing for the morphological ending -ος (urn:cts:greekLit:tlg5026.msA.hmt:4.478)

[106]:  http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.7755,0.4663,0.0263,0.0159

[os]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.7755,0.4663,0.0263,0.0159&WID=100&CVT=JPEG

**Symbol Abbreviations**

Regular abbreviated forms of the whole words (e.g. καί, ὅτι, δέ, γάρ, διά, etc.) are treated as variant letter forms, and are not specially marked in any way. The rule of thumb for determining if it is a symbol abbreviation is if the symbol cannot be completely broken down into distinguishable letter forms. If accents or other diacritical marks should be present on the abbreviated word, they can be supplied in the expansion.

Examples:

[![καί][kai]][107]

(urn:cts:greekLit:tlg5026.msA.hmt:4.437)

[![oti][oti]][108]

(urn:cts:greekLit:tlg5026.msA.hmt:4.8)

[oti]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.6517,0.4711,0.02,0.0158&WID=100&CVT=JPEG

[kai]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA056RN-0057.tif&RGN=0.621,0.5696,0.0152,0.0137&WID=100&CVT=JPEG

[107]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA056RN-0057@0.621,0.5696,0.0152,0.0137

[108]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.6517,0.4711,0.02,0.0158


### Abbreviations that Require Mark up

**paleographically ambiguous abbreviations**

Unlike the examples above, the marks that denote these abbreviations do not always indicate the same missing letters. Therefore, because they are paleographically ambiguous, they require mark up. If accents or other diacritical marks should be present on the abbreviated syllable(s), they can be supplied in the expansion.

-   Use the TEI `abbr/expan` pair, wrapped in `choice`

[![abbreviation][houtos]][109]

Example:

`<choice><abbr>ουτ</abbr><expan>οὑτῶς</expan></choice>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.495)

[109]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.453,0.7399,0.0224,0.0135

[houtos]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.453,0.7399,0.0224,0.0135&WID=100&CVT=JPEG

[![abbr][pater]][110]

Example:

`<choice><abbr>περ</abbr><expan>πάτερ</expan></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.288)

[pater]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.3183,0.293,0.045,0.024&WID=100&CVT=JPEG

[110]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.3183,0.293,0.045,0.024

## 3: Semantic disambiguation

Tier 3 semantically disambiguates tokens. This class of mark up is primarily named entities.

## Named entities (proper nouns and adjectives) ##

**personal names**

For people, mythological or historical, use TEI `persName` element; include an `@n` attribute with the full URN value from the [reference table of identifiers for personal names][pers]. If a person does not yet exist in the authority list, create an issue in the repository to request its addition.

[![Achilles][Achilles]][500]

Example:

`<persName n="urn:cite:hmt:pers.pers1">Ἀχιλλεύς</persName>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.58)

[Achilles]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA013RN-0014.tif&RGN=0.488,0.2915,0.063,0.0263&WID=100&CVT=JPEG

[500]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA013RN-0014@0.488,0.2915,0.063,0.0263

- Note in cases where more than one person is refered to, such as the Atreidai, you double wrap personal names

[![Atreidai][Atreidai]][501]

Example:

`<persName n="urn:cite:hmt:pers.pers22"><persName n="urn:cite:hmt:pers.pers119">Ἀτρεΐδαι</persName></persName>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.17)

[Atreidai]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012RN-0013.tif&RGN=0.1602,0.5465,0.0841,0.0263&WID=100&CVT=JPEG

[501]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.1602,0.5465,0.0841,0.0263

**place names**

For places, mythological or historical, use TEI `placeName` element; include on the `@n` attribute has a full URN value from  the [reference table of identifiers for place names][place]. If a place does not yet exist in the authority list, create an issue in the repository to request its addition.

[![Argos][Argos]][503]

Example:

`<placeName n="urn:cite:hmt:place.place114">Ἄργεϊ</placeName>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.30)

[Argos]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA012VN-0514.tif&RGN=0.655,0.2915,0.049,0.0293&WID=100&CVT=JPEG

[503]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012VN-0514@0.655,0.2915,0.049,0.0293


**ethnic groups**

These are exclusively for groups of people that can be traced either to a geographic place or an emponymous ancestor. Use TEI `rs` element. Include a `@type` attribute with value `ethnic`, and `@n` attribute with an identifier from the  [reference table for place names][place] or the [reference table for personal names][pers], when you need to use an eponymous ancestor (such as the Danaans).

[![Achaious][Achaious]][504]

Example:

`<rs type="ethnic" n="urn:cite:hmt:place.place96">Ἀχαιούς</rs>`

(urn:cts:greekLit:tlg0012.tlg001.msA:1.61)

- Since some ethnic names could be attributed to a location or an eponymous ancester (e.g. Trojans link to Tros or Troy), always take the geographic location before resorting to an eponymous ancestor.
- Note that the ethnic mark up is only for people or groups of people (e.g. Trojan man or Trojans). We would not use it to describe a dialect (e.g. Ionic) or an inanimate object. Those are treated as normal vocabulary items that can be searched.
- Groups that cannot be tied to a geographic place or an eponymous ancestor are also treated as vocabulary items (e.g. Centaurs, Myrmidons, Gorgons, Giants, Fates, etc).
- Adjectival forms of people's names are also not tagged (ergo, we can tag 'Homer' but not 'Homeric')
- We also do not tag unclear epithets, even if the identity can be determined from context. For example "Phoebus Apollo" is ok, but the "Earthshaker" to refer to Poseidon is not. If you are in doubt, refer to the description of the indiviual in the authority list. If the epithet is not listed there, you can request it, via Issue Tracker and our editorial guide team can render a judgement.

[Achaious]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA013RN-0014.tif&RGN=0.461,0.426,0.071,0.027&WID=100&CVT=JPEG

[504]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA013RN-0014@0.461,0.426,0.071,0.027

**astronomical bodies**

:   Use TEI `rs` element.   Include a `@type` attribute with value `astro`, and `@n` attribute with an identifer from the [reference table for astronomical bodies][astro].

[![Orion][Orion]][505]

Example:

`<rs type="astro" n="urn:cite:hmt:astro.1">Ὠρίωνος</rs>`

(urn:cts:greekLit:tlg0012.tlg001.msA:18.486)

[astro]: https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv

[Orion]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA248VN-0750.tif&RGN=0.811,0.3343,0.084,0.0323&WID=100&CVT=JPEG

[505]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA248VN-0750@0.811,0.3343,0.084,0.0323

## 4: More extensive scribal intervention in the text


### Scribal Deletions

Use TEI `del` when the scribe has either crossed out content, erased, or marked it with "deletion dots"

[![deletion][deletion]][102]

Example:

`<del>οὐκ εἰς το πρεσβεύειν ἀλλ εἰς τὸ πρεσβεύειν Αἴαντας καὶ Ὀδυσσέα Φοίνικος προέληλυθότος</del>` (urn:cts:greekLit:tlg5026.msA.hmt:9.193)

[deletion]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA115RN-0287.tif&RGN=0.233,0.7521,0.453,0.027&WID=100&CVT=JPEG

[102]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA115RN-0287@0.233,0.7521,0.453,0.027




### Scribal Corrections

Use TEI `sic/corr` pair for corrections when the wants to correct a reading that is unintelligible in the text;  group the pair in a TEI `choice` element.

[![correction][corr]][105]


Example: accent corrected by the original scribe

`<choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.337)

[corr]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.5245,0.275,0.0871,0.0308&WID=100&CVT=JPEG

[105]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308

Please note that this mark up is *only* used by corrections we believe were made by the scribe. That means you cannot offer your own corrections and the scribe could be wrong by our orthographic standards. This is a diplomatic editions and we do not want to make our own judges on grammatical correctness at this stage of editing.


### Scribal Multiforms

Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading; group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example:

`<choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.351)


[![alternative text][alt]][104]

[alt]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.3844,0.5364,0.1021,0.0293&WID=100&CVT=JPEG


[104]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293

Alternative readings are typically strings of characters or even single letters. You will use the whole word like in the example above.

## 5: Discourse disambiguation

### Quotation and citation

**unidentified quoted words, phrases, or passages**

Use TEI `q` for quoted words, phrases, or passages. A quoted selection must be at least one full parsable Greek work. Quoted phrases can ranges from hypothetical phrases to multiforms to quotations from works that we cannot cite. The scribe will not make quotes visually distinct. Use our print editions to help you, as well as context.

[![q1][q1]][400]

Example:

`<q>πρὸς ὃ</q>`

(urn:cts:greekLit:tlg5026.msA.hmt:1.1498)

[q1]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.709,0.154,0.04,0.0188&WID=100&CVT=JPEG

[400]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.709,0.154,0.04,0.0188

**identifiable quotations**

Use TEI `ref/q` pair wrapped in a `cit` element.  On `ref` element use `@type` attribute =`urn`. Inside `ref` element give the full cts urn for the quote (i.e. the text reference). The most common references will likely be *Iliad* or *Odyssey* quotes. If you have other citations, see the lists of citable [authors](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-groups.csv) and [works](https://github.com/chs-tg/greekLit/blob/master/collections/greekLit-works.csv). If you have a known text that is not referenced, create an [issue](https://github.com/chs-tg/greekLit/issues) in the repository. The scribe will not make quotes visually distinct. Use our print editions to help you, as well as context.

[![quotation][quot]][111]

Example:

`<cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg001:17.453</ref><q>ἔτι γάρ σφισι κῦδος ὀρέξω</q></cit>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.8)

[quot]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.5696,0.5064,0.1552,0.0195&WID=100&CVT=JPEG

[111]:  http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5696,0.5064,0.1552,0.0195


### Other Discourse Analysis ##

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
