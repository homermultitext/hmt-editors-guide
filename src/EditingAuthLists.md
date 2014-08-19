# HMT Authority Lists #

One of the useful features of the Homer Multitext project is the thorough identification of named entities present in the text. It is vitally important to maintain the authority lists carefully. The lists are constantly growing as more material is edited and it becomes more difficult to prevent accidental overlaps and repeats. Below is detailed the structure of each authority list and how new entries are added.

## Personal Names ##

The personal name list is a 6-column .csv file. These columns include:

1. PersonUrn - a unique urn identifier 
2. Label - the transliteration of the Greek
3. Description - a thorough descriptor offering alternate spellings and clear identification of the individual
4. Status - proposed or rejected
5. Redirect - the proper URN reference if rejected
6. Stem Class - (not used by editors currently)

When a new personal name appears, editors should create an issue in the [authority list issue tracker](https://github.com/homermultitext/hmt-authlists/issues/new). The issue must include: the full URN for where the name appears as well as the urn of the line commented on if the occurrence is in a scholion; a label; and a description. The description should include as much information as possible. Information can always be left out if it is too much. The description should also include alternate spellings if applicable. 

The editor in charge of adding personal names should verify the existence of the new personal name, double check through the list that is does not yet exist, including testing alternate spellings. If the proposed new name is a duplicate, close the issue and indicate which URN ought to be used. If the proposed new name is valid, the name should be entered and the issue closed with a comment on the new URN to use.

## Place Names ##

The personal name list is a 6-column .csv file. These columns include:

1. URN - a unique urn identifer
2. Label - the transliteration of the Greek
3. Description -a thorough descriptor offering alternate spellings and clear identification of the geographic location
4. Pleiades - the canonical reference is the place is located on [pleiades](http://pleiades.stoa.org/).
5. Status - proposed or rejected
6. Redirect - valid URN if applicable

When  a new place name appears, editors should create an issue in the [authority list issue tracker](https://github.com/homermultitext/hmt-authlists/issues/new). The issue must include: the full URN for where the place appears as well as the urn of the line commented on if the occurrence is in a scholion; a label; a description; and a pleiades reference. The description should include as much information as possible. Information can always be left out if it is too much. The description should also include alternate spellings if applicable. 

## Adjectives ##

The Homer Multitext project marks up three different types of named entity adjectives that use the personal and place URNs. New occurrences should be treated like new place and personal names, but the issue should indicate what type of adjective it is. Note that ethnic adjectives can be linked to either people or places. In the case where both an eponymous ancestor and a location are available (e.g. Trojans could be linked to Tros or Troy) preference is given to the geographic location.

## Useful Resources ##

- [Perseus Project](http://www.perseus.tufts.edu/hopper/)
- [Pleiades Project](http://pleiades.stoa.org)
- [Wikipedia](http://en.wikipedia.org/wiki/Main_Page)
	- [for places](http://en.wikipedia.org/wiki/List_of_ancient_Greek_cities)	
- *The Oxford Classical Dictionary*
- *Early Greek Myth* by Timothy Gantz