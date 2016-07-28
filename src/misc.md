# Other #

## Multiple types of Mark up Required ##

We have three major categories of mark up in our XML documents:
- Structural: this is already handled in your template files (i.e. organizing things by book, etc.)
- Special Content: indications of numbers, titles, named entities, etc.
- Editorial Status: things like abbreviations, whether the text is readable, etc.


In cases where you have mark up for both editorial status and special content (e.g. an abbreviation personal name), you will do the editorial status first, then wrap it in the mark up for content.

Example:

`<persName n="urn:cite:hmt:pers.pers16"><choice><abbr>Αρισταρχ</abbr><expan>Ἀρίσταρχος</expan></choice></persName>`

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
