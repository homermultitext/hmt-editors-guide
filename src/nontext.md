# Editing Non-Textual Elements #

## Slurs ##

Semi-circular symbols, which resemble musical slur marks, are written beneath some compound words in the Venetus A manuscript. These marks are recorded in comma separated value tables (files should be .csv and can be edited on github or in simple text editor). The tables for compound word slurs should contain three headings: 

`Slur,Reading,Image` 

Under **Slur** goes the urn reference for the slur itself. This urn reference is composed of the Book Number, a hyphen, and unique identifying sequence.


`urn:cite:hmt:venAslur.Book#_Identifier`

Under **Reading** goes the urn reference for the line of text in the *Iliad* in the Venetus A and the word under which the slur appears.


`urn:cts:greekLit:tlg0012.tlg001.msA:11.[line#]@[word],`

Finally, under **Image**, goes the the urn reference for the image citation of the word and its slur. This is contained within quotation marks(""). This urn reference is obtained via the image citation tool.

Each of these columns is separated by a comma.

An entry typically looks like this:

`Slur,Reading,Image`
`urn:cite:hmt:venAslur.10_1,urn:cts:greekLit:tlg0012.tlg001.msA:10.1@Παναχαιῶν,"urn:cite:hmt:vaimg.VA126RN-0298@0.4825,0.2141,0.1131,0.0173"`

## Connecting Signs ##

Some scholia appear to have connecting signs that work in a way similar to footnotes. These are not recorded in your text edition, but are recorded in `.csv` files in the collections folder. If you find these in your assignment, you should create the following two files in your repository.

`venA-connectingTextSigns.csv` : For recording the signs that appear over lines of Iliadic text
`venA-connectingScholiaSigns.csv` : For recording the signs that appear next to scholia text

`venA-connectingTextSigns.csv` should contain 6 columns:

`ObjectURN,ScholionURN,TextURN,ImageURN,FolioURN,Notes`

|Column Item|Definition|Example|
|:---|:---|:---|
|ObjectURN|a unique reference for the object|urn:cite:hmt:VAtextsign_1|
|ScholionURN|full URN for the scholion referenced|urn:cts:greekLit:tlg5026.msA.hmt:19.2015office9_2|
|TextURN|full cts URN for the Iliadic text up to the word/phrase level|urn:cts:greekLit:tlg0012.tlg001.msA:19.80@ἐόντα|
|ImageURN|full cite URN for the image of the mark|urn:cite:hmt:vaimg.VA253RN-0424@0.602,0.2915,0.028,0.0173|
|FolioURN|full cite URN for the folio|urn:cite:hmt:msA.253r|
|Notes|any relevant comments such as type of mark|curly oti|

`venA-connectingScholiaSigns.csv` should contain 4 columns:

`ObjectURN,ScholionURN,ImageURN,Notes`

|Column Item|Definition|Example|
|:---|:---|:---|
|ObjectURN|a unique reference for the object|urn:cite:hmt:VAscholiasign_1|
|ScholionURN|full cts URN for the scholion referenced|urn:cts:greekLit:tlg5026.msA.hmt:19.2015office9_2|
|ImageURN|full cite URN for the image of the mark|urn:cite:hmt:vaimg.VA253RN-0424@0.1181,0.3001,0.0228,0.0114|
|Notes|any relevant comments such as type of mark|curly oti|

## Critical Signs on Scholia ##

On rare occasions you may find critical signs next to the scholia. While the ones next to the main text are already indexed, the ones next to the scholia are not. In this situation, you should make a file called `venAsigns-Scholia.csv` in your Collections folder with the following columns:

`OccurenceURN,SequenceWithinBook,CritSignURN,ScholiaURN,ImageURN`

|Column Item|Definition|Example|
|:---|:---|:---|
|OccurenceURN|a unique cite URN for the occurence of the sign|urn:cite:hmt:venAscholiasign.1|
|SequenceWithinBook|numerical sequence of the sign within the assigned book|1|
|CritSignURN|cite URN reference for the type of critical sign|urn:cite:hmt:critsigns.diple|
|ScholiaURN|full cts URN for the scholion referenced|urn:cts:greekLit:tlg5026.msA.hmt:17.76|
|ImageURN|full cite URN for the image of the critical sign|urn:cite:hmt:vaimg.VA227RN-0398@0.349,0.726,0.02,0.015|

crit sign URNs are:

|diple|urn:cite:hmt:critsigns.diple|
|dotted diple|urn:cite:hmt:critsigns.dotteddiple|
|asterisk|urn:cite:hmt:critsigns.asterisk|
|obelos|urn:cite:hmt:critsigns.obelos|
|dotted antisigma|urn:cite:hmt:critsigns.dottedantisigma|
|dotted sigma|urn:cite:hmt:critsigns.dottedsigma|
