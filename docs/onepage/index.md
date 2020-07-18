---
layout: page
title: "References for participants"
---

## Reading *Iliad* 23

"Low-friction pages" for [reading *Iliad* 23](https://furman-university-editions.github.io/Readers).

## Citation with URNs

- *Iliad* text
    - Venetus B: `urn:cts:greekLit:tlg0012.tlg001.msB:`
    - Upsilon 1.1: `urn:cts:greekLit:tlg0012.tlg001.e3:`
- scholia text
    - Venetus B: `urn:cts:greekLit:tlg5026.msB.hmt:`
    - Upsilon 1.1: `urn:cts:greekLit:tlg5026.e3.hmt:`
- manuscript pages
    - Venetus B: `urn:cite2:hmt:msB.v1:`
    - Upsilon 1.1: `urn:cite2:hmt:e3pages.v1:`


Finding other URNs:

- [HMT URN search](https://interwing.nl/hmt/urn/) (from Leiden team member Mees Gelein)
- request URNs for new personal names, place names, etc using forms on the [`hmt-authlists` repository](https://github.com/homermultitext/hmt-authlists)



### Indexing DSE records


See this [overview](https://github.com/neelsmith/transmission-evolution/wiki/DSE-indexing).



### How to validate

See these [instructions for validating content in your repository](https://github.com/neelsmith/transmission-evolution/wiki/Validating).



## XML editing


### Summary of character set usage

- alphabetic characters: alphabetic α-ω in upper or lower case. They may be combined with accents and/or breathings in the Unicode Greek range.  
- punctuation:
    -   period = `.`
    -   comma = `,`
    -   interrogation mark = `;`
    -   high stop = `~`
    -   "end-of-scholion/unit" marker:  `⁑` (Unicode U+2015)
- quantity:
    -   macron = `_` (underscore)
    -   breve = `^`
- "floating" characters:  our manuscripts sometimes create combinations of accents, breathings and other marks that we do not encounter in modern typeset Greek, and that cannot be encoded with Unicode characters.  In those cases where you may need to add an additional diacritic character, use the following encodings:
    -   "floating" acute accent =  `/`
    -   "floating" grave accent =  `\`
    -   "floating" diaeresis =  `+`

### Concise summary of XML usage

Our XML markup falls in 4 tiers:

1. *transcription level* (or, editorial status): unclear, gaps, etc
2. *tokenization level*: words, abbreviations, superlinear addtions, deletions, corrections, scribal multiforms, character strings
3. *editorial disambiguation level*: named entities
4. *discourse disambiguation*: quotations and citable references

At each level, the following TEI elements are allowed:


**Transcription level**

- `unclear`
- `gap`

**Tokenization level**


- `w`
- `num`
- `abbr/expan` choice
- `del` deleted by scribe (e.g., underdots)
- `add` text added (eg, above line)
- `orig/reg` choice: alternate reading offered (multiform)
- `sic/corr` choice: scribal correction

**Editorial disambiguation level**

Named entities with `@n` attribute with URN value:

- `persName`
- `placeName`
- `rs` with `@type` attribute


**Discourse level**


- `q` alone:  
    - quotation, work not extant
    - quoted example of language. Test: you would not  translate this when reading the text, e.g. explaining the declension of a noun by using another common Greek word as an example
- `cit` containing `q` and `ref`: quotation of extant work
- `title` with either CTS URN (extant work) or CITE2URN
- `rs` with `type="waw"` quoted expression not parseable as  a Greek word, e.g. "the letter σ"



### Indexing *scholion* markers, dingbats and hyphens

See these [instructions for recording non-textual features](https://github.com/neelsmith/transmission-evolution/wiki/Recording-non-textual-features).


## Previous editions of scholia

- Erbse: [scholia to *Iliad* 23](https://neelsmith.github.io/transmission-evolution/iliad23-scholia-wh/iliad23.html)
- Dindorf:  [vol. 2 of his edition of Venetus B scholia](http://www.homermultitext.org/pd-pdfs/Dindorf-v4.pdf) (pdf)


## How to.. videos

- [using `bash` shell](https://www.youtube.com/watch?v=lSfNQIeb0uo&t=3s)
- [using `git`](https://www.youtube.com/watch?v=RQXE8E0U9a8)
