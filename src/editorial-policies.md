# Editorial policies #

The Homer Multitext project is creating  *digital, diplomatic editions* of Homeric manuscripts and papyri.  Our editions document what we are able to read, and our readings are cross-referenced to citations of the visual evidence.

In the following examples, images are linked to interactive versions of the cited visual evidence.

## Characters and character sequences ##

### diaereses on vowels with a breathing ###
:  Use Unicode "Combining Diaeresis" character

Example:  

ἵ̈ει (urn:cts:greekLit:tlg0012.tlg001.msA:25)

[!{diaresis}[diaeresis]][1]

[diaeresis]: images/diaeresis.jpg

[1]: urn:cite:hmt:vaimg.VA154VN-0656@0.6957,0.6739,0.038,0.0248

[1embed]: urn:cite:hmt:vaimg.VA154VN-0656@0.6957,0.6739,0.038,0.0248

### Macra ###
:  Should be indexed under 'Reading Aids'

Example: 

δαίνῡ  {urn:cts:greekLit:tlg0012.tlg001.msA:9.70}

[!{macron}[macron]][2]

[2]: urn:cite:hmt:vaimg.VA113RN-0285@0.1832,0.4222,0.0741,0.0233

[macron]: images/macron.jpg

### Brevia ###
: Should be indexed under 'Reading Aids'

Example: 

ἄ̆ν {urn:cts:greekLit:tlg0012.tlg001.msA:9.101}

[!{breve}[breve]][3]

[breve]: images/breve.jpg

[3]: urn:cite:hmt:vaimg.VA113VN-0616@0.7057,0.5462,0.029,0.0203

### Elisions ###
: Of the many possible Unicode characters for elision, use only Unicode straight single quote, which is standard on an English keyboard. If you use Sophokeys to enter Greek, note that this is **not** the character it generates automatically when entering Greek.

Example: 

ἄλλ' ἐν {urn:cts:greekLit:tlg0012.tlg001.msA:9.235}

[!{elision}[elision]][4]

[elision]: images/elision.jpg

[4]: urn:cite:hmt:vaimg.VA116VN-0619@0.5485,0.2201,0.0561,0.0278

### "Floating" grave accents ###
: Floating grave accents in the manuscript can appear on an elided syllable. 
"Float" a grave accent character between the last letter of the word and the elision mark.

Example: 

μετα δ`᾽ ἔσσεται 
{urn:cts:greekLit:tlg0012.tlg001.msA:9.131}

!{"floating" accent}[float][5]

[float]: images/float.jpg

[5]: urn:cite:hmt:vaimg.VA114RN-0286@0.3333,0.6371,0.1221,0.0233

### Critical Signs ###
:  receive no markup or mention in the text editions. Critical signs next to Iliadic lines have been separately indexed. Critical Signs that appear next to scholia should be documents in 'Reading Aids'. 

### Punctuation ###
:  All punctuation must be accounted for. That includes where it would not make sense by our modern conventions, at the end of lines, at the end of lemmata etc. See [difficult to type characters](pasteboard.html) for any unicode characters you are unable to generate.

## Orthography ##

### accentuation and breathings ###
:  We record all accents and breathings as given in the manuscript (not "corrected" to modern usage).  This category includes diaeresis, and markings for short or long vowel quantities (breve and macron).

### iota ###
: Iotas are consistently written adscript in most of our manuscripts: we write them subscript where that is usual in modern practice without implying that the manuscript does so.

Example: 

ἐγκλισίῃσι {urn:cts:greekLit:tlg0012.tlg001.msA:12.1}

!{example}[urn:cite:hmt:vaimg.VA154VN-0656@0.5906,0.2194,0.1181,0.0278]

### ligatures and variant letter forms ###
: Our transcription does not  note ligatures or variant letter forms: readers interested in these visual features of the manuscript should consult the associated high-resolution images.  We treat regular abbreviations for morphological endings, for prepositions, and for the conjunction καί as variant letter forms, and silently expand these in the transcriptions because they are unambiguous. 


## Distinct content types ##

### Named entities (proper nouns and adjectives) ###

#### personal names ####
: Use TEI `persName` element; include an `@n` attribute with the full URN value from the [reference table of identifiers for personal names][pers].

Example:

    <persName n="urn:cite:hmt:pers.pers1">Ἀχιλῆος</persName>

#### place names ####
: Use TEI `placeName` element; include on the `@n` attribute has a full URN value from  the [reference table of identifiers for place names][place].

Example:

    <placeName n="urn:cite:hmt:place.place185">Σπάρτη</placeName> 

#### ethnic adjectives ####
:  Use TEI `rs` element.  Include a `@type` attribute with value `ethnic`, and `@n` attribute with an identifier from the  [reference table for place names][place] or from [reference table for personal names][pers]. 

Examples:

    <rs type="ethnic" n="urn:cite:hmt:place.place96">Ἀχαιοὶ</rs>
    <rs type="ethnic" n="urn:cite:hmt:pers.pers66">Δαναοί </rs>

Ethnic adjectives can be linked either to a geographic location or an eponymous ancestor. In instances where both exist, preference is given to the geographic location. For example, Trojans are linked to Troy not Tros. 

#### geographic adjectives ####
: Use TEI `rs` element.  Include a `@type` attribute with value `geographic`, and `@n` attribute with an identifier from the  [reference table for place names][place].

For instances when a non-ethnic group is described using a geographic adjective, such as Aleian plain.

Example:

    <rs type="geographic" n="urn:cite:hmt:place.place309">Ἀλήϊον</rs>

#### personal adjectives ####
:  Use TEI `rs` element.  Include a `@type` attribute with value `personal`, and `@n` attribute with an identifier from the  [reference table for personal names][pers].

For instances when an adjectival form of personal name is used, such as Nestorean.

Example:

    <rs type="personal" n="urn:cite:hmt:pers.pers117">Νεστορέῃ</rs>

**N.B.** If any named entities require additional markup such as abbreviations or corrections, the named entity element should be the outermost element in the markup.

### Other special content types ###

#### "word-as-word" ####

Meaning that the content should not be considerable parsable Greek. For instance a scholion might talk about the spelling of a word and whether certain letters should or should not be present. These are not parsable strings. They are often written with horizontal bars or curves above them, but not always

:  Use TEI `rs` element, with `@type` attribute = `waw`.

Example:

    <rs type="waw">ε</rs>

#### citable quotes ####
: Use TEI `cit`, `ref` with `@type="urn"`, and `q` elements

Example:

    <cit><ref>urn:cts:greekLit:tlg0012.tlg001:12.25</ref><q>ἐννῆμαρ δ' ἐς τεῖχος ἵ̈ει ῥόον</q></cit>

The quote is wrapped in `q`, then `cit`. A `ref` element is place within the `cit` but outside the `q`. The `ref` element contains a full urn for the cited passage. You do not use `cit` when your quoting from the passage commented on by the scholion (e.g. if your scholion talks about line 12 and quotes it, you do not cite line 12 in markup).

#### quoted strings or uncitable quotes ####

The scribe may be offering an alternative reading or quoting a work we do not have a URN citation for.

: Use TEI `q` element

Example:
 
    <q>οὐδὲ διαπρὸ</q>

#### titles ####
:  If the title refers to a known, citable work, use TEI `ref` with @type="urn" and @n attribute with a full URN for the work
- Use TEI `title` element (wrapping `ref` if that is given)

Example:

    <title><ref type="urn" n="urn:cts:greekLit:tlg0012.tlg002">Οδυσσεία</ref></title>

#### numbers ####
: Use TEI `num` with `@value` attribute.

Example:

    <num value="2">β</num>

Numbers are often written with bars over them link this: !{number 2}[urn:cite:hmt:vaimg.VA127RN-0299@0.6083,0.1214,0.0166,0.0164]

You must distinguish whether it is a "word-as-word" or number form the context.

## Editorial status ##

While readers always take many kinds of contextual information into consideration when reading a text, HMT editors should distinguish three levels of legibility based solely on the paleographic clarity of the reading.   

1. *clear*.  The letter is unambiguously legible, based on paleographic considerations alone.  It may be incompletely preserved, but the visible remains cannot be read as any other character.
2. *unclear*. Part of the letter is visible, but taken by itself cannot be unambiguously read.
3. *missing*.  No trace of the letter remains, but it is clear from the context that one or more letters were originally present.
4. *partially perserved*. For instance when the edge of a folio is trimmed and letters are still legible, with no hint as to how they were originally marked with accents or breathings.
5. *deletions*. The scribe has either crossed out or otherwise stricken a reading that is legible. 
6. *insertions*. The scribe has reinserted a letter in a later pass. Usually supralinearly. 
7. *alternative readings*. The scribe has offered an alternative reading, visually distinct from any scholia hand.
8. *corrections*. The scribe has corrected something in the text either by crossing it out or writing over it.

### Clear readings ###
: Enter the text with no additional markup

### Unclear readings ###
: Use TEI `unclear` element.  If the `unclear` element breaks up a word token, wrap the entire work  in a TEI `w` element.

Example:

    <w>γ<unclear>ὰ</unclear>ρ</w>

[!{unclear}[unclear]][100]

[100]: urn:cite:hmt:vaimg.VA104RN-0105@0.5386,0.1585,0.0224,0.0174

[unclear]: images/unclear.jpg

### Missing ###
:  Use TEI `gap` element.  Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicate how many units are likely included in the gap.

Example:

    <gap unit="letters" extent="3"/>

### Partially Preserved Readings ###
:  Use TEI `damage` element and `choice` element, with the diplomatic transcription in `unclear` and regularized transcription in `reg`.

Example:

    <damage><choice><unclear>ως</unclear><reg>ὡς</reg></choice></damage>

!{partial}[urn:cite:hmt:e3bifolio.E3_136v_137r@0.0891,0.1532,0.3734,0.0435]
                                    
### Text deleted by scribe ###
: Use TEI `del` when the scribe has either crossed out content or marked it with "deletion dots"

Example:

    <del>ἢ τοὺς ἑξῆς τρεῖς</del>

[!{deletion}[deletion]][102]

[deletion]: images/deletion.jpg

[102]: urn:cite:hmt:vaimg.VA054RN-0055@0.3682,0.1297,0.0301,0.0113

### Added text above line ###
: Use TEI `add` element, including `@place` attribute with value `supralinear`

Example:

    <w>ἔνι<add place="supralinear">οι</add></w>

[!{added text}[added]][103]

[103]: urn:cite:hmt:vaimg.VA051RN-0052@0.5045,0.7325,0.031,0.021

[added]: images/added.jpg


### Alternate readings offered above the line ###
: Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading, distinct from the scholia hand (therefore not including glosses or elided letters); group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example: 

    <choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>


[!{alternative text}[alt]][104]

[alt]: images/alt.jpg


[104]: urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293

### Scribal corrections ###
: Use TEI `corr/sic` pair for when the scribe corrects a reading in the text. This might be a change in accent or spelling; group the pair in a TEI `choice` element.  

Example: accent corrected by the scribe

    <choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>

[!{correction}[corr]][105]

[corr]: images/corr.jpg

[105]: urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308

## Abbreviations ##

Abbreviations are noted only where they are ambiguous. Morphological endings are expanded without comment because they are unambiguous, as are certain symbols.

### Regular terminating syllables ###
: Regular terminating syllables (often morphological endings) are treated as a variant letter form, and are not specially marked in any way

Example:

εἰκος, where a raised omicron is a brief writing for the morphological ending -ος

[!{Abbreviate -os}[os]][106]

[106]: urn:cite:hmt:vaimg.VA057RN-0058@0.7755,0.4663,0.0263,0.0159

[os]: images/os.jpg

### καί and ὅτι ###
: Regular abbreviated forms of the whole words καί and ὅτι are treated as variant letter forms, and are not specially marked in any way

Examples:

[!{καί}[kai]][107]

[!{oti}[oti]][108]

[oti]: images/oti.jpg

[kai]: images/kai.jpg

[107]: urn:cite:hmt:vaimg.VA056RN-0057@0.621,0.5696,0.0152,0.0137

[108]: urn:cite:hmt:vaimg.VA051RN-0052@0.6517,0.4711,0.02,0.0158

### Ambiguous abbreviations ###
: Use the TEI `abbr/expan` pair, wrapped in `choice`. The `expan` form can include all correct accents and breathings because it is not the diplomatic version of the text.

Examples:

    <choice><abbr>ουτ</abbr><expan>οὑτῶς</expan></choice>

[!{abbreviation}[houtos]][109]

[109]: urn:cite:hmt:vaimg.VA057RN-0058@0.453,0.7399,0.0224,0.0135

[houtos]: images/houtos.jpg

    <choice><abbr>περ</abbr><expan>πάτερ</expan></choice>

[!{abbr}[pater]][110]

[pater]: images/pater.jpg

[110]: urn:cite:hmt:vaimg.VA057RN-0058@0.3183,0.293,0.045,0.024

## Appendix:  other references ##

Reference table for identifiers for personal names: 
[https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtnames.csv][pers]

Reference table for identifiers for place names:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtplaces.csv][place]

Reference table for identifiers for astronomical bodies:
[https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv][astronomy]

[Tips on Typing Accented Greek](typingGreek.html)

[HMT For Editors Page](http://www.homermultitext.org/for-editors.html)

[HMT Editors Google Forum](https://groups.google.com/forum/#!forum/homer-multitext-editors-resource-forum)

[pers]: https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtnames.csv

[place]: https://github.com/homermultitext/hmt-authlists/blob/master/data/hmtplaces.csv

[astronomy]: https://github.com/homermultitext/hmt-authlists/blob/master/data/astronomy.csv