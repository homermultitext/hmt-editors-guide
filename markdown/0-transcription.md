# Tier 1: Transcription

The transcription tier handles issues of paleographic status. Is a reading clear? How do we transcribe the specific orthographic choices of the manuscript? What belongs in the text edition and what is recorded elsewhere.

## What doesn't belong in a text edition?

Text editions of the *Iliad* or scholia texts should not contain anything in the following categories:
1. critical signs: located next to the Iliadic lines in the Venetus A
2. connecting signs: sometimes written next to scholia and corresponding main text
3. metacomments: numerical or other symbolic notation that further explains the text (e.g. reordered lines)

## Orthography and digital character set

Regarding the following issues of orthography, we have very specific conventions for how to display them in Unicode. These examples are unambiguous and therefore do require mark up. We do, however, want to be consistent in how we handle them in our editions.

**accentuation and breathings**
:	We record all accents and breathings as given in the manuscript (not "corrected" to modern usage).  This category includes diaeresis, and markings for short or long vowel quantities (breve and macron).

**iota subscripts**
: Iotas are consistently written adscript in most of our manuscripts: we write them subscript where that is usual in modern practice without implying that the manuscript does so.

[![iota subscript][subscript]][200]

[200]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA024RN-0025@0.501,0.2434,0.058,0.027

[subscript]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA024RN-0025.tif&RGN=0.501,0.2434,0.058,0.027&WID=8000&CVT=JPEG

Example: καλῇ (urn:cts:greekLit:tlg0012.tlg001.msA:1.604)

**ligatures and variant letter forms**
: Our transcription does not  note ligatures or variant letter forms: readers interested in these visual features of the manuscript should consult the associated high-resolution images.  We treat regular abbreviations for morphological endings, for prepositions, and for the conjunction καί as variant letter forms, and silently expand these in the transcriptions. See more on variant letter forms under abbreviations.


### Diacritical Marks

Most Greek keyboards are not able to handle more than two diacritical marks, so in instances where you need and accent, breathing, and a diacritical mark, use combining characters which are typically found in special character menus in most basic text editors.

**diaereses** on vowels with breathing and/or accent should use Unicode "Combining Diaeresis" character.

[![diaresis][diaeresis]][1]

Example:  ί̈σχειν (urn:cts:greekLit:tlg0012.tlg001.msA:9.352)

[diaeresis]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA118VN-0621.tif&RGN=0.4855,0.5409,0.0721,0.0301&WID=8000&CVT=JPEG

[1]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301

[1embed]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301&width=9000

**macra** should use Unicode "Combining Macron" character.

[![macron][macron]][2]

Example: δαίνῡ {urn:cts:greekLit:tlg0012.tlg001.msA:9.70)

[2]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA113RN-0285@0.1832,0.4222,0.0741,0.0233

[macron]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA113RN-0285.tif&RGN=0.1832,0.4222,0.0741,0.0233&WID=8000&CVT=JPEG

**brevia** should use Unicode "Combining Breve" character

urn:cite:hmt:edguide:brevefloat

**elisions**

Of the many possible Unicode characters for elision, use only Unicode straight single quote. If you use Sophokeys to enter Greek, note that this is **not** the character it generates automatically when entering Greek.

[![elision][elision]][4]

Example: ἄλλ' ἐν (urn:cts:greekLit:tlg0012.tlg001.msA:9.235)

[elision]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA116VN-0619.tif&RGN=0.5485,0.2201,0.0561,0.0278&WID=8000&CVT=JPEG

[4]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA116VN-0619@0.5485,0.2201,0.0561,0.0278


**"floating" grave accents**

Floating grave accents in the manuscript can appear on an elided syllable.
"Float" a grave accent character between the last letter of the word and the elision mark.

[!["floating" accent][float]][5]

Example: μετα δ`᾽ ἔσσεται
(urn:cts:greekLit:tlg0012.tlg001.msA:9.131)

[float]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA114RN-0286.tif&RGN=0.3333,0.6371,0.1221,0.0233&WID=8000&CVT=JPEG

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


## Paleographic status

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


[unclear]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA104RN-0105.tif&RGN=0.5386,0.1585,0.0224,0.0174&WID=8000&CVT=JPEG


**Missing**
Use TEI `gap` element.  Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicate how many units are likely included in the gap.

Example:

`<gap unit="letters" extent="3"/>`
