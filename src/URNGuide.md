# URN Notation in the HMT project #
The Homer Multitext project uses two basic types of URNs to cite and identify material. It is vital to the project to be able to understand the structure and meaning of each URN. A URN is a unique reference like an ISBN on a book that identifies a single item. The same URN cannot be used to refer to two distinct items.

## Citable Object URNs ##
Like the name suggest these URNs can be used to refer to specific objects. In the Homer Multitext project we use object URNs to refer to personal and place names, folios, images, and graphic features.

All object URNs in the HMT share this base form:

	urn:cite:hmt	

From there you can distinguish manuscripts (e.g msA, msB, e3, e4, etc.)

To cite just a manuscript, such as the the Venetus A, your URN will look like this:
	
	urn:cite:hmt:msA
	
To cite a specific folio, such as 12r of the Venetus A, your URN will look like this:

	urn:cite:hmt:msA.12r

You can also distinguish types of citable objects (e.g. pers, place, e3footnotes, e3bifolio, venAslur, msAfootnotes, etc). Do not worry too much about being able to generate these. You will typically have examples to follow. You will most likely run into personal and place names. Here are examples of each:

	urn:cite:hmt:pers.pers1 = Achilles
	
	urn:cite:hmt:place.place1 = Athens

Finally you will also see object URNs to refer to images and portions of an image. These are distinct from folios as objects. These refer not to the folio as a concept but to specific image files available in the HMT image archive.

	urn:cite:hmt:msA.12r = 12r of the Venetus A as an object. 

	urn:cite:hmt:vaimg.VA012RN-0013 = the image of 12r of the Venetus A.
	
	urn:cite:hmt:vaimg.VA012RN-0013@0.0511,0.2245,0.1221,0.0916 = a portion of the image of 12r of the Venetus A.
	

## Canonical Text Service URNs ##
Like the name suggests these URNs can be used to refer to specific passages of text. There are three types you will regularly see within the HMT project.

1. Iliadic text passages
2. Scholia text passges
3. Other Greek text passages

You will use the Iliadic text passages to reference which line of text a scholion is commenting on. These references correspond to the canonical references established by Wolf. 

You will use scholia text passages to uniquely identify each scholion that you inventory. Unlike the Iliadic lines, the scholia do not have established references, so you must create your own. Here is where it becomes vitally important to create unique references. You cannot repeat an identifier.

Other Greek text passages will come up in the scholia where the scholiast uses other works, such as the *Odyssey* to support a point. These quoted sections will get URN references to identify them.

Every canonical text urn will use this base:

	urn:cts:greekLit:
	
This base identifies that your reference is part of the corpus of Greek Literature.

From here you will have to identify the unique TLG references for your passage. Here are the three most frequent:

	Iliad = urn:cts:greekLit:tlg0012.tlg001
	
	Odyssey = urn:cts:greekLit:tlg0012.tlg002
	
	Homeric Scholia = urn:cts:greekLit:tlg5026
	
You will notice that there is only a small difference between the *Iliad* and the *Odyssey*.  That is because the first TLG reference refers to the author. In this case 'tlg0012' refers to Homer. The second TLG reference refer to the work by that author if the author has multiple works attributed to him or her. 'tlg001' refers to the *Iliad* and 'tlg002' refers to the *Odyssey*. Because the scholia have no single identifiable author, they are merely listed by their work reference, 'tlg5026'.

From this point, you can then identify a specific manuscript for the *Iliad* readings. 

	urn:cts:greekLit:tlg0012.tlg001.msA = specifically the Iliad found in the Venetus A
	
Or you can just refer to the *Iliad* in general by leaving off the 'msA'. Finally you can refer to a specific passage in the text. You must be explicit as possible. For instance if you want to cite Book 3 lines 103 to 107, you would write the reference 3.103-3.107. In full URN notation that reference would be:

	urn:cts:greekLit:tlg0012.tlg001:3.103-3.107
	
Or for those lines specifically in the Venetus A:

	urn:cts:greekLit:tlg0012.tlg001.msA:3.103-3.107
	
From the base form of the scholia, your URNs will be slightly different. In the Venetus A, we have five distinct sets of scholia documents, so you must identify the scholia document by one of the following sigla:
	
	msA = main scholia
	msAim = intermarginal scholia
	msAint = interior scholia
	msAil = interlinear scholia
	msAext = exterior
	msAextlong= lengthy exterior scholia
	msAlate = later hand scholia
	
To refer to the main scholia document your URN would be:

	urn:cts:greekLit:tlg5026.msA.hmt
	
From here you can identify a specific scholion with is usually formatted by Book Number and then a unique identifier. For instance the first main scholion in Book 1 would probably look like this:

	urn:cts:greekLit:tlg5026.msA.hmt:1.1
	
You can also refer to specific words or strings of words in a canonical text URN by adding @X

To cite the word μῆνιν in the first main scholion of the Venetus A, your URN would look like this:

urn:cts:greekLit:tlg5026.msA.hmt:1.1@μῆνιν 