# Editorial policies #



## Characters and character sequences ##

- **diaereses on vowels with breathing and/or accent**

Use Unicode "Combining Diaeresis" character

Example:  ί̈σχειν



{urn:cts:greekLit:tlg0012.tlg001:9.352}
{urn:cite:hmt:vaimg.VA118VN-0621:0.4855,0.5409,0.0721,0.0301}


- **macra**
Use Unicode "Combining Macron" character

Example: δαίνῡ
{urn:cts:greekLit:tlg0012.tlg001:9.70}
{urn:cite:hmt:vaimg.VA113RN-0285:0.1832,0.4222,0.0741,0.0233}


- **brevia**
Use Unicode "Combining Breve" character

Example: ἄ̆ν
{urn:cts:greekLit:tlg0012.tlg001:9.101}
{urn:cite:hmt:vaimg.VA113VN-0616:0.7057,0.5462,0.029,0.0203}


- **elisions**

Use Unicode straight single quote.  Note that our verification system only accepts one of the many possible Unicode character for elision, and that it is not the one generated automatically by Sophokeys! ᾽

Example: ἀλ᾽λ᾽ ἐν
{urn:cts:greekLit:tlg0012.tlg001:9.235}
{urn:cite:hmt:vaimg.VA116VN-0619:0.5485,0.2201,0.0561,0.0278}


- **"floating"" grave accents**

Floating grave accents in the manuscript can appear on an elided syllable. 

"Float" a grave accent character between the last letter of the word and the elision mark

Example: μετα δ`᾽ ἔσσεται 
{urn:cts:greekLit:tlg0012.tlg001:9.131}
{urn:cite:hmt:vaimg.VA114RN-0286:0.1612,0.6401,0.4655,0.024}



## TEI markup: distinct content types ##



### Named entities (proper nouns and adjectives) ###



**personal names**

- TEI `persName` element
- `@n` attribute has a full URN value from this reference table:

[https://www.google.com/fusiontables/DataSource?docid=1fcfeXQWcChl-EiSt9vNHMfXYGSM3ETn5ZwTKF0Y#rows:id=1][pers]


[pers]: https://www.google.com/fusiontables/DataSource?docid=1fcfeXQWcChl-EiSt9vNHMfXYGSM3ETn5ZwTKF0Y#rows:id=1

Example
    
    <persName n="urn:cite:hmt:pers.pers1">Ἀχιλῆος</persName>

**Place names**


- TEI `placeName` element
- `@n` attribute has a full URN value from this reference table:


[https://www.google.com/fusiontables/DataSource?docid=1M7FKJjXaK4WQVL85zhi30TsWHeF-XSMVfQ3bYz8#rows:id=1][place]


[place]: https://www.google.com/fusiontables/DataSource?docid=1M7FKJjXaK4WQVL85zhi30TsWHeF-XSMVfQ3bYz8#rows:id=1

Example


    <placeName n=”urn:cite:hmt:place.place185”>Σπάρτη</placeName>


**ethnic adjectives**

- TEI `rs` element, `@type` attribute = `ethnic`
- `@n` attribute is identifier from the geographic reference table above


    <rs type="ethnic" n="urn:cite:hmt:place.place96">Ἀχαιοὶ</rs>

**"word-as-word"** 

- TEI `rs` element, with `@type` attribute = `waw`



**TEI markup: editorial status**

For all markup showing editorial status, wrap word units in TEI `w` element if the editorial status markup breaks up the word unit (examples below).

- Use TEI `unclear` element for unclear readings

Example:

    <w>γ<unclear>ὰ</unclear>ρ</w>


 {urn:cite:hmt:vaimg.VA104RN-0105:0.5386,0.1585,0.0224,0.0174}


- Use TEI `del` when the scribe has either crossed out content or marked it with "deletion dots"

Example

    <del>ἢ τοὺς ἑξῆς τρεῖς</del>


{urn:cite:hmt:vaimg.VA054RN-0055:0.3857,0.1421,0.0164,0.01}, 

{urn:cite:hmt:vaimg.VA111RN-0283:0.5638,0.1617,0.097,0.0191}.

- Use TEI `gap` element for lacuae
- Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicates how many units are likely included in the gap

    <gap unit="letters" extent="3"></gap>



-When words are Corrected
        -TAG the word in the text that is corrected
        -Type the element "corr" and press enter or select OK
        -Type the original form of the word (the uncorrected form) after the "corr"         element
        -TAG the original form of the word (which you have just typed)
        -Type the element "sic" and press enter or select OK
        -TAG both the corrected and original words along with their elements
        -Type "choice" and press enter or select OK 
(e.g.) {urn:cite:hmt:vaimg.VA058RN-0059:0.5245,0.275,0.0871,0.0308}
<choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>






-When words are Abbreviated
First you need to determine what sort of abbreviation you have: 
1) If it is a morphological ending, we include the expanded form without any markup. 
        (e.g.) {urn:cite:hmt:vaimg.VA057RN-0058:0.7755,0.4663,0.0263,0.0159}
Here in εἰκος, the raised omicron is actually shorthand for the morphological ending -ος. This receives no markup in our editions.
2) If if it a symbol abbreviation... 
such as καὶ: 
(e.g.) {urn:cite:hmt:vaimg.VA056RN-0057:0.621,0.5696,0.0152,0.0137} 
or ὅτι: 
(e.g.) {urn:cite:hmt:vaimg.VA051RN-0052:0.6517,0.4711,0.02,0.0158} 
...we include the expanded form without any markup. 
3) If a word is only partially complete with one of the last letters raised, the expanded form is unclear and requires markup.
        (e.g.) οὑτῶς  abbreviated like this {urn:cite:hmt:vaimg.VA057RN-0058:0.453,0.7399,0.0224,0.0135} will be marked up like this:
        <choice><abbr>ουτ</abbr><expan>οὑτῶς</expan></choice>
4) If the expanded form is otherwise unclear, we include the markup described below. For example, common words like πάτερ often include only a couple of letters with a horizontal bar drawn over them (see below). It is unclear which letters are missing, so we include the markup below.
        -TAG the word in the text that is abbreviated
        -Type the element "abbr" and press enter or select OK
        -Type the expanded form of the abbreviated word after its element
        -TAG the expanded form of the word (which you have just typed)
        -Type the element "expan" and press enter or select OK
        -TAG both the abbreviated and expanded words along with their elements
        -Type the element "choice" and press enter or select OK 
(e.g.) {urn:cite:hmt:vaimg.VA057RN-0058:0.3183,0.293,0.045,0.024}
<choice><abbr>περ</abbr><expan>πάτερ</expan></choice>



-When words or letters are Added (usually supralinearly)
        -TAG the word or letter in the text that is added
        -Type the element "add" and press enter or select OK
-Next to the closing arrow of the element (">"), add attribute:                 place="supralinear"
(e.g.) {urn:cite:hmt:vaimg.VA051RN-0052:0.5045,0.7325,0.031,0.021}
<w>ἔνι<add place="supralinear">οι</add></w>


-When an alternate reading is offered supralinearly:
        -TAG what appears in the main line of text
        -Type the element "orig" and press enter or select OK
        -Next to the element "orig" type the alternate reading of the text
        -TAG the alternate reading
        -Type the element "reg" and press enter or select OK
        -TAG the two readings and their elements
        -Type the element "choice" and press enter or select OK
(e.g.) {urn:cite:hmt:vaimg.VA058RN-0059:0.3844,0.5364,0.1021,0.0293}
<choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>









-When words are Titles
*Titles can be fully known works such as the Iliad or lost works such as On Iliadic Prosody 
        -TAG the word(s) in the text that is a title
        -Type the element "title" and press enter or select OK
-When we can reference a work be its TLG citation TAG the title selection, including the element "title"
        -Type the element "ref" and press enter or select OK
        -Add the attribute "type" and put the full URN reference in the attribute.
(e.g.) <title><ref type="urn:cts:greekLit:tlg0012.tlg002">Οδυσσεία</ref></title>


-When words are Numbers
*Greek Numbers are written as letters, often with horizontal bars or hooks written over them. There are two number systems to be aware of. One is the Milesian Number System, references for which can be found here: http://www.lib.umich.edu/files/collections/papyrus/k12/images/numbers2.gif
Note that the Milesian System uses letters that are not part of the Greek alphabet you are probably most familiar with. However, book numbers for texts are assigned numbers one through twenty-four based on the Greek alphabet. Be sure to figure out which number system is being used
        -TAG the word in the text that is a number
        -Type "num" and press enter or select OK
        -Next to the closing arrow of the element (">"), add attribute: value="#"
-When numbers are book numbers, be sure to TAG them in their urn reference. TAG the entire number and its "num" element
        -Type the element "ref" and press enter or select OK
        -Add the attribute "type" and put the full URN reference in the attribute.
(e.g.) <num value="1">α</num>


-When words are Word As Word
        -TAG the word
        -Type element "rs" and press enter or select OK
        -In front of the closing arrow of the element (">"), add the attribute "type="waw""
*Note that scribes will often denote something as word as word by drawing a horizontal bar over the word {urn:cite:hmt:vaimg.VA051RN-0052:0.1933,0.8089,0.0139,0.0118}. This is not an ironclad rule and you will have to read the text to determine whether there are any other words as words.
(e.g.) <rs type=”waw”>ε</rs>


-When words are Quoted
        -TAG the word or words in the text that are quoted
        -Type the element "q" and press enter or select OK
(e.g) <q>ἀλλ ὥς τις κείνων γε</q>


-When words are Quoted and require a Reference
        -TAG the word or words in the text that are quoted
        -Type the element "q" and press enter or select OK
        -TAG the word and its new element
        -Type the element "cit" and press enter or select OK
-TAG the space in between "<cit>" and "<q>" (simply press command+e;         no highlighting is necessary)
        -Type the element "ref" and press enter or select OK
        -In front of the closing arrow of the element (">"), add attribute: type="urn"
        -Type the URN reference within the "ref" element:
(e.g.) {urn:cite:hmt:vaimg.VA051RN-0052:0.5696,0.5064,0.1552,0.0195}
<cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg001:17.453</ref><q>ἔτι γάρ σφισι κῦδος ὀρέξω</q></cit>


-When your manuscript includes Diagrams with the scholia
        -In the relevant selection include the element "figure"
-To include a a description of the diagram within the figure element include the element "figDesc" and type a short explanation
-If the diagram includes text add the element "floatingText." Add the element "body" within "floatingText." For each distinct portion of text include the element "p" (paragraph) and include your text.
(e.g.) Iliad 8 includes the following diagram (link to image). The mark up for this figure was included with the scholion it appears with and looked like this:
<figure>
    <figDesc>The scribe has drawn a spherical diagram delineating the aether, air, Hades, and Tartarus</figDesc>
                        <floatingText>
                           <body>
                              <p>αιθηρ</p>
                              <p>ἀήρ</p>
                              <p><placeName
                                    n="place67">αίδης</placeName></p>
                              <p><placeName
                                    n="place60">τάρταρος</placeName>:</p>
                           </body>
                        </floatingText>
                     </figure>


-When material in the manuscript is recorded in a numbered List
        -TAG the entire list in the element "list" with the attribute "type="ordered""
-each entry in the list will be TAGGED with the element "item" with with attribute "n="X"" *The entry for X will proceed in numerical order*
-Numbers in the list will be marked in the element "num" as numbers normally would be marked.
(e.g.) a list in Iliad 8 appeared within scholion urn:cts:greekLit:tlg5026.msA.hmt:8.78 {urn:cite:hmt:vaimg.VA102VN-0605:0.1723,0.1311,0.2397,0.1821} and was marked up as follows:
<list type="ordered">
<item n="1">
<num value="1">Α</num> εστι δὲ γεωργος <cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg002:18.368</ref><q>ἐν ποίη δρεπανον μέν</q></cit>·</item>
<item  n="2">
<num value="2">Β</num> κυβερνήτης <cit><ref type="urn">urn:cts:greekLit:tlg0012.tlg002:10.32</ref><q>ἀεὶ γὰρ πόδα <choice><sic>νηὸς</sic><corr>νηός</corr></choice></q>
                              </cit></item>
<item n="3">
<num value="3">Γ</num> τέκτων ἀπο τῆς κλίνης <note  resp="Erbse">cf. ψ 189</note></item>
                           ...etc.


Useful Links
-Erbse
-Dindorf http://books.google.com/books?id=JfcNAAAAYAAJ&printsec=frontcover&source=gbs_ge_summary_r&cad=0#v=onepage&q&f=false
-tlg references
https://www.google.com/fusiontables/DataSource?dsrcid=800206
-special characters:
        -End of Scholia Mark        = ⁑
        -Double Dagger        = ‡