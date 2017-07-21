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
