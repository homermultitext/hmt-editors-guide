##Editorial status##

While readers always take many kinds of contextual information into consideration when reading a text, HMT editors should distinguish three levels of legibility based solely on the paleographic clarity of the reading.   

1. *clear*.  The letter is unambiguously legible, based on paleographic considerations alone.  It may be incompletely preserved, but the visible remains cannot be read as any other character.
2. *unclear*. Part of the letter is visible, but taken by itself cannot be unambiguously read. That is **paleographically** ambiguous. You might be able to make an educated guess, but that is not a diplomatic edition.
3. *missing*.  No trace of the letter remains, but it is clear from the context that one or more letters were originally present. This occurs in instances where there is damage to the manuscript such as a [hole][hole] or extreme [fading][fading], even in [specialized lighting][uv].

[hole]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA044VN-0546@0.24,0.7506,0.065,0.0729

[fading]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RN-0013@0.7808,0.0916,0.1251,0.2297

[uv]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA012RUVD-0895@0.577,0.1367,0.248,0.4636

**Clear readings**

: Enter the text with no additional markup

**Unclear readings**

: Use TEI `unclear` element.  If the `unclear` element breaks up a word token, wrap the entire work  in a TEI `w` element. Note that `w` is only necessary if the word is broken up. If a whole word is unclear, `w` is not necessary and should not be included.

[![unclear][unclear]][100]

Example:

`<w>γ<unclear>ὰ</unclear>ρ</w>`

(urn:cts:greekLit:tlg5026.msA.hmt:8.132)


[100]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA104RN-0105@0.5386,0.1585,0.0224,0.0174


[unclear]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA104RN-0105.tif&RGN=0.5386,0.1585,0.0224,0.0174&WID=8000&CVT=JPEG


**Missing**
:  Use TEI `gap` element.  Use `@unit` attribute for  the type of the gap (for example, "letters" or "words"), and `@extent`  to indicate how many units are likely included in the gap.

Example:

`<gap unit="letters" extent="3"/>`




**Text deleted by original scribe**
: Use TEI `del` when the scribe has either crossed out content or marked it with "deletion dots"

[![deletion][deletion]][102]

Example:

`<del>οὐκ εἰς το πρεσβεύειν ἀλλ εἰς τὸ πρεσβεύειν Αἴαντας καὶ Ὀδυσσέα Φοίνικος προέληλυθότος</del>` (urn:cts:greekLit:tlg5026.msA.hmt:9.193)

[deletion]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA115RN-0287.tif&RGN=0.233,0.7521,0.453,0.027&WID=8000&CVT=JPEG

[102]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA115RN-0287@0.233,0.7521,0.453,0.027

**Added text above line**

: Use TEI `add` element, including `@place` attribute with value `supralinear`

[![added text][added]][103]

Example:

`<w>ἔνι<add place="supralinear">οι</add></w>`

(urn:cts:greekLit:tlg5026.msA.hmt:4.9)

[103]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA051RN-0052@0.5045,0.7325,0.031,0.021

[added]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA051RN-0052.tif&RGN=0.5045,0.7325,0.031,0.021&WID=8000&CVT=JPEG


**Alternate readings offered above the line**

: Use the TEI `orig/reg` pair to identify the reading in the main text and the alternative reading; group them with TEI `choice`.  The  scribe sometimes writes only the letters that are to be changed to create the alternate reading.  We put the fully expanded word in the `reg` element.

Example:

`<choice><orig>μεθειέμεν</orig><reg>μεθιέμεν</reg></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.351)


[![alternative text][alt]][104]

[alt]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.3844,0.5364,0.1021,0.0293&WID=8000&CVT=JPEG


[104]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.3844,0.5364,0.1021,0.0293



**Scribal corrections**

: Use TEI `corr/sic` pair for corrections when the wants to correct a reading that is unintelligible in the text;  group the pair in a TEI `choice` element.  

[![correction][corr]][105]


Example: accent corrected by the original scribe

`<choice><sic>προσηῦδα</sic><corr>προσηύδα</corr></choice>`

(urn:cts:greekLit:tlg0012.tlg001.msA:4.337)

[corr]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA058RN-0059.tif&RGN=0.5245,0.275,0.0871,0.0308&WID=8000&CVT=JPEG

[105]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA058RN-0059@0.5245,0.275,0.0871,0.0308
