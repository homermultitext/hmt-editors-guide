---
title: Editorial policies
layout: page
---


The Homer Multitext project is creating  *digital, diplomatic editions* of Homeric manuscripts and papyri.  Our editions document what we are able to read, and our readings are cross-referenced to citations of the visual evidence we used.

In the following examples, images are linked to interactive versions of the cited visual evidence.


## Characters and character sequences ##

diaereses on vowels with breathing and/or accent
:  Use Unicode "Combining Diaeresis" character

Example:  ί̈σχειν (urn:cts:greekLit:tlg0012.tlg001:9.352)

[![diaresis][diaeresis]][1]


[diaeresis]: ../images/diaeresis.jpg

[1]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301

[1embed]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetBinaryImage&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301&width=9000



macra
:  Use Unicode "Combining Macron" character.

Example: δαίνῡ  {urn:cts:greekLit:tlg0012.tlg001:9.70}

[![macron][macron]][2]

[2]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA113RN-0285@0.1832,0.4222,0.0741,0.0233

[macron]: ../images/macron.jpg

brevia
: Use Unicode "Combining Breve" character

Example: ἄ̆ν {urn:cts:greekLit:tlg0012.tlg001:9.101}


[![breve][breve]][3]

[breve]: ../images/breve.jpg

[3]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA113VN-0616@0.7057,0.5462,0.029,0.0203



elisions
: Of the many possible Unicode characters for elision, use only Unicode straight single quote.  If you use Sophokeys to enter Greek, note that this is **not** the character it generates automatically when entering Greek.

Example: ἄλλ' ἐν {urn:cts:greekLit:tlg0012.tlg001:9.235}


[![elision][elision]][4]

[elision]: ../images/elision.jpg

[4]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA116VN-0619@0.5485,0.2201,0.0561,0.0278



"floating" grave accents
: Floating grave accents in the manuscript can appear on an elided syllable. 
"Float" a grave accent character between the last letter of the word and the elision mark.

Example: μετα δ`᾽ ἔσσεται 
{urn:cts:greekLit:tlg0012.tlg001:9.131}

!["floating" accent][float][5]

[float]: ../images/float.jpg

[5]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA114RN-0286@0.3333,0.6371,0.1221,0.0233




## Orthography



accentuation and breathings
:	We record all accents and breathings as given in the manuscript (not "corrected" to modern usage).  This category includes diaeresis, and markings for short or long vowel quantities (breve and macron).

iota
: Iotas are consistently written adscript in most of our manuscripts: we write them subscript where that is usual in modern practice without implying that the manuscript does so.

ligatures and variant letter forms
: Our transcription does not  note ligatures or variant letter forms: readers interested in these visual features of the manuscript should consult the associated high-resolution images.  We treat regular abbreviations for morphological endings, for prepositions, and for the conjunction καί as variant letter forms, and silently expand these in the transcriptions. 


## Distinct content types ##



### Named entities (proper nouns and adjectives) ###



personal names
: Use TEI `persName` element; include an `@n` attribute with the full URN value from the [reference table of identifiers for personal names][pers].


Example
    
    <persName n="urn:cite:hmt:pers.pers1">Ἀχιλῆος</persName>

place names
: Use TEI `placeName` element; include on the `@n` attribute has a full URN value from  the [reference table of identifiers for place names][place].


Example


    <placeName n="urn:cite:hmt:place.place185">Σπάρτη</placeName> 


ethnic adjectives
:  Use TEI `rs` element.  Include a `@type` attribute with value `ethnic`, and `@n` attribute with an identifier from the  [reference table for place names][place].


    <rs type="ethnic" n="urn:cite:hmt:place.place96">Ἀχαιοὶ</rs>





###Other special content types ###


"word-as-word"
:  Use TEI `rs` element, with `@type` attribute = `waw`.


titles
:  If the title refers to a known, citable work, use TEI `ref` with `@type='urn'` and `@n` attribute with a full URN for the work
- Use TEI `title` element (wrapping `ref` if that is given)


     <title><ref type="urn" n="urn:cts:greekLit:tlg0012.tlg002">Οδυσσεία</ref></title>


numbers
: Use TEI `num` with `@value` attribute.


    <num value="1">α</num>



quoted strings
: Use TEI `rs` element with `@type` attribute = `waw` ("word-as-word")
 

    <rs type="waw">ε</rs>


##Editorial status##

While readers always take many kinds of contextual information into consideration when reading a text, HMT editors should distinguish three levels of legibility based solely on the paleographic clarity of the reading.   

1. *clear*.  The letter is unambiguously legible, based on paleographic considerations alone.  It may be incompletely preserved, but the visible remains cannot be read as any other character.
2. *unclear*. Part of the letter is visible, but taken by itself cannot be unambiguously read.
3. *missing*.  No trace of the letter remains, but it is clear from the context that one or more letters were originally present.




Clear readings
: Enter the text with no additional markup

Unclear readings
: Use TEI `unclear` element.  If the `unclear` element breaks up a word token, wrap the entire work  in a TEI `w` element.


Example:

    <w>γ<unclear>ὰ</unclear>ρ</w>


[![unclear][unclear]][100]

[100]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA104RN-0105@0.5386,0.1585,0.0224,0.0174


[unclear]: ../images/unclear.jpg


Missing
:  Use TEI `gap` element.  Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicate how many units are likely included in the gap.

Example:

    <gap unit="letters" extent="3"/>




Text deleted by original scribe
: Use TEI `del` when the scribe has either crossed out content or marked it with "deletion dots"

Example

    <del>ἢ τοὺς ἑξῆς τρεῖς</del>



[![deletion][deletion]][102]

[deletion]: ../images/deletion.jpg

[102]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA054RN-0055@0.3682,0.1297,0.0301,0.0113

Added text above line
: Use TEI `add` element, including `@place` attribute with value `supralinear`

Example:



    <w>ἔνι<add place="supralinear">οι</add></w>

[![added text][added]][103]

[103]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5045,0.7325,0.031,0.021

[added]: ../images/added.jpg


Alternate readings offered above the line
: Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading; group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example 

    <choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>


[![alternative text][alt]][104]

[alt]: ../images/alt.jpg


[104]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293



Scribal corrections
: Use TEI `corr/sic` pair for corrections when the wants to correct a reading that is unintelligible in the text;  group the pair in a TEI `choice` element.  



Example: accent corrected by the original scribe

    <choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>


[![correction][corr]][105]


[corr]: ../images/corr.jpg

[105]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308

## Abbreviations

Regular terminating syllables
: Regular terminating syllables (often morphological endings) are treated as a variant letter form, and are not specially marked in any way

Example:

εἰκος, where a raised omicron is a brief writing for the morphological ending -ος


[![Abbreviate -os][os]][106]

[106]:  http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.7755,0.4663,0.0263,0.0159

[os]: ../images/os.jpg

καί and ὅτι
: Regular abbreviated forms of the whole words καί and ὅτι are treated as variant letter forms, and are not specially marked in any way

Examples:

[![καί][kai]][107]


[![oti][oti]][108]

[oti]: ../images/oti.jpg

[kai]: ../images/kai.jpg

[107]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA056RN-0057@0.621,0.5696,0.0152,0.0137

[108]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.6517,0.4711,0.02,0.0158


Other abbreviations
: Use the TEI `abbr/expan` pair, wrapped in `choice`

Example


        <choice><abbr>ουτ</abbr><expan>οὑτῶς</expan></choice>

[![abbreviation][houtos]][109]

[109]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.453,0.7399,0.0224,0.0135

[houtos]: ../images/houtos.jpg


    <choice><abbr>περ</abbr><expan>πάτερ</expan></choice>

[![abbr][pater]][110]

[pater]: ../images/pater.jpg

[110]: http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.3183,0.293,0.045,0.024




## Quotation and citation ##


unidentified quoted phrases
:  Use TEI `q` for quoted phrases or passages from unidentified sources

Example 

    <q>ἀλλ ὥς τις κείνων γε</q>


identifiable quotations
: Use TEI `q/ref` pair wrapped in a `cit` element.  


    <cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg001:17.453</ref><q>ἔτι γάρ σφισι κῦδος ὀρέξω</q></cit>

[![quotation][quot]][111]


[quot]: ../images/quot.jpg

[111]:  http://beta.hpcc.uh.edu/tomcat/hmt/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5696,0.5064,0.1552,0.0195

## Appendix:  other references ##

Reference tables for identifiers for personal names and place names, are maintained in the `hmt-authlists` [github repository](https://github.com/homermultitext/hmt-authlists):  see the [`hmt-authlists` web page](http://homermultitext.github.io/hmt-authlists).

