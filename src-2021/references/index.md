---
layout: page
title: "References for editors"
nav_order: 4
has_children: true
---


# References for editors


## Previous editions


- Dindorf:  [vol. 1 of his edition of Venetus B scholia](http://www.homermultitext.org/pd-pdfs/Dindorf-v3.pdf) (pdf)
- text of limited [selection of *scholia* by Erbse](./wh-iliad4.html) (ca. 80% of Venetus A scholia; probably less for Venetus B. Text from WordHoard project: note that Erbse's critical apparatus is not included).  For help reading the format of Erbse's text, see [this guide](./erbse-key/)

## *Iliad* 4

- a ["low-friction" reader](https://www.inusum.com/homer/iliad/4/) (from Furman University, thanks, Randall Childress!)


## URNs

- *Iliad* text
    - Venetus B: `urn:cts:greekLit:tlg0012.tlg001.msB:`
- scholia text
    - Venetus B: `urn:cts:greekLit:tlg5026.msB.hmt:`
- manuscript pages
    - Venetus B: `urn:cite2:hmt:msB.v1:`


Finding other URNs:

- [HMT URN search](https://interwing.nl/hmt/urn/) (from Leiden team member Mees Gelein)
- request URNs for new personal names, place names, etc using forms on the [`hmt-authlists` repository](https://github.com/homermultitext/hmt-authlists)


## XML usage


### Summary of character set usage

- alphabetic c  haracters: alphabetic α-ω in upper or lower case. They may be combined with accents and/or breathings in the Unicode Greek range.  
- punctuation:
    -   period = `.`
    -   comma = `,`
    -   interrogation mark = `;`
    -   high stop = `:`
    -  the "second" or "doubled" grave accent (a punctuation mark occasionally included in Venetus B and Upsilon 1.1 to mark some kind of clausal or phrasal unit) = `⸌` (Unicode U+2e0c)
    -   "end-of-scholion/unit" marker:  `⁑` (Unicode U+2015)
    - "cross" marking change of unit:     `‡` (Unicode U+2021)
- quantity:
    -   macron = `_` (underscore)
    -   breve = `^`
- "floating" characters:  our manuscripts sometimes create combinations of accents, breathings and other marks that we do not encounter in modern typeset Greek, and that cannot be encoded with Unicode characters.  In those cases where you may need to add an additional diacritic character, use the following encodings:

      -   "floating" diaeresis =  `+`

### Concise summary of XML usage

Our XML markup falls in 4 tiers:

1. *transcription level* (or, editorial status): unclear, gaps, etc
2. *tokenization level*: words, abbreviations, superlinear addtions, deletions, corrections, scribal multiforms, character strings
3. *editorial disambiguation level*: named entities
4. *discourse disambiguation*: quotations and citable references

At each level, the following TEI elements are allowed:


**Transcription level**



| Element | Meaning | Example | Comments |
| ---: | :--- | :---: | :--- |
| `unclear` | There are traces of a letter or letters, but not enough to be certain how to read them. | `<unclear>καὶ</unclear>` | Some traces visible, you think the reading is ***καὶ*** |
| `gap` | Letters are missing or completely illegible due to damage | `<gap/>` | Note that `gap` is an empty element with no content, |
| `del` | Text deleted by scribe (e.g., with overdots) | `καὶ <del>καὶ</del>` | The scribe deleted the second ***καὶ*** |
 `add` | Text added by script (eg, above line) | `<add>et</add>` | ***καὶ*** was not part of the original text but was added by the scribe |



**Tokenization level**


| Element | Meaning | Example | Comments |
| ---: | :--- | :---: | :--- |
| `num` | One or more numeric characters. | `<num value="2">β</num>` | Put the numeric value in the `value` attribute. Note that you should *not* tag number words like ***δύο***!|
| `w` | Wrap any word that is broken up by markup.  | `<w>γέρ<unclear>ον</unclear>τας</w>` | The letters ***ον*** are unclear, but we want our parser to recognize ***γέροντας*** as a single word. 
| `choice` containing `abbr` and `expan` | Text includes an abbreviation; you are including an expansion for it | `<choice><abbr>μηρ</abbr><expan>μήτηρ</expan></choice>` | The scribe writes ***μηρ*** (perhaps including a distinct mark signaling an abbreviation); you interpret it to mean ***μήτηρ*** |
| `choice` containing `sic` and `corr`  | Scribe deletes original reading, inserts a correction | `<choice><sic>ὑπθετο</sic><corr>ὑπέθετο</corr></choice>` | Scribe orginally wrote ***ὑπθετο*** but changed the text to ***ὑπέθετο*** |
| `choice` containing `orig` and `reg`  | Scribe offers an alternate second reading without deleting the original reading. | `<choice><orig>σοι</orig><reg>τοί</reg></choice>`| Scribe wrote ***σοι*** in the main text, then added ***τοί*** as an alternative above it, but did not delete ***σοι***. |



**Editorial disambiguation level**

Named entities with `@n` attribute with URN value:


| Element | Meaning | Example | Comments |
| ---: | :--- | :---: | :--- |
|  `persName` | Proper name of a person | `<persName n="urn:cite2:hmt:persname.v1:pers1">Ἀχιλλεύς</persName>` | Include a URN value in the `n` attribute |
| `placeName` | Proper name of a place (real or imaginary) | `<placeName n="urn:cite2:hmt:place.v1:place6">΅Ιλιον</placeName>` |  Include a URN value in the `n` attribute |
| `rs`, type = `ethnic` | Name of an ethnic group | `<rs  @type="ethnic" n="urn:cite2:hmt:place.v1:place96">Ἀχαιῶν</rs>` | Include a URN value in the `n` attribrute |

**Discourse level**


- `q` alone:  
    - quotation, work not extant
    - quoted example of language. Test: you would not  translate this when reading the text, e.g. explaining the declension of a noun by using another common Greek word as an example
- `cit` containing `q` and `ref`: quotation of extant work
- `title` with either CTS URN (extant work) or CITE2URN
- `rs` with `type="waw"` quoted expression not parseable as  a Greek word, e.g. "the letter σ"



### Indexing *scholion* markers

We record the occurrence of each footnote-like marker in the *Iliad* text in a delimited-text table with five columns.  You'll find an example in the `scholionmarkers.cex` file of your repository's `collections` directory.  The five columns are:

#### 1. Identify the marker

You need to assign each *scholion* marker an identifier in the collection `urn:cite2:hmt:vbmarkers.v1:`.  Use the convention `PAGE_SCHOLION`.  For example, the fifth scholion on folio 51 recto will be `urn:cite2:hmt:vbmarkers.v1:51r_5`.


#### 2. Transcribe the text of the marker

In the Venetus B, the markers are numeric values.  Wrap your reading in a `num` element with a `value` attribute giving its numeric value.  Example:  `<num value="19">ιθ</num>`


#### 3. Image

Use the Image Citation Tool to identify where on the image you read the marker.


#### 4. Scholion

Give the URN for the scholion this marker corresponds to.  Example: this URN refers to the fifth scholion on page 51r of the Venetus B manuscript: `urn:cts:greekLit:tlg5026.msB.hmt:4.51r_5`


#### 5. *Iliad* passage with subreference

The final column should give the URN for the *Iliad* line the marker is attached to.  Include at the end of this URN a *subreference*: an `@` sign followed by the text of the word the scholion is above.  Marker `urn:cite2:hmt:vbmarkers.v1:51r_5`, for example, is above the first word of *Iliad* 4.1, οἱ, so the URN will be  `urn:cts:greekLit:tlg0012.tlg001.msB:4.1@οἱ`



### Indexing hyphens

TBA