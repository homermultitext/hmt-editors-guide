# Abbreviations #

## Abbreviations without mark up ##

**Regular terminating syllables**

Regular terminating syllables (often morphological endings, but not always appearing at the end of a word) are treated as a variant letter form, and are not specially marked in any way. See the [paleography guide](http://homermultitext.github.io/hmt-docs/palguide.pdf) if you are unfamiliar with the common abbreviations.

[![Abbreviate -os][os]][106]

Example:

εἰκος, where a raised omicron is a brief writing for the morphological ending -ος (urn:cts:greekLit:tlg5026.msA.hmt:4.478)

[106]:  http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA057RN-0058@0.7755,0.4663,0.0263,0.0159

[os]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA057RN-0058.tif&RGN=0.7755,0.4663,0.0263,0.0159&WID=8000&CVT=JPEG

**Symbol Abbreviations**

Regular abbreviated forms of the whole words (e.g. καί, ὅτι, δέ, γάρ, διά, etc.) are treated as variant letter forms, and are not specially marked in any way. The rule of thumb for determining if it is a symbol abbreviation is if the symbol cannot be completely broken down into distinquishable letter forms.

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

Unlike the examples above, the marks that denote these abbreviations do not always indicate the same missing letters. Therefore, because they are paleographically ambiguous, they require mark up.

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
