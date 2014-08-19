# Guide to Running Verification tests on your Homer Multitext Data #

## Why Virtual Machines ##

It is incredibly important to run your verifications in the virtual machine. If anything happens to go wrong, your results will be replicable. If something doesn't work properly in your virtual machine, always test the same thing in another virtual machine. There are several tests currently available in your virtual machine which will be described below.

## Getting Started ##

Follow these steps to start up for virtual machine. Anything written in all caps may vary depending on the location or name of your local repositories:

1. cd PATHWAY/hmt-vm
2. vagrant up
3. vagrant ssh
4. cd /vagrant
5. sh refresh-hmt.sh
6. cd /YOURREPOSITORY
7. git pull

If you do not have a clone of your repository in your virtual machine, be sure to clone one. 

## Testing Your Paleographic Data ##

Every repository contains a folder called *Scripts*. This includes every test that you are able to run on your data. The first of these is *palview.sh*. *palview.sh* generates a webpage in which you can view and visually verify the accuracy of the paleographic sample data you collect. After you have started up your virtual machine and pulled the latest data for your repository run the following command:

sh scripts/palview.sh 

When the script is complete, you can find your results here: hmt-vm/hmt-mom/build/paleography/viewer.html 

It is recommended that you do not use Google Chrome to view this webpage.

This script should be run immediately after collecting paleographic observations. Any errors should be fixed. You may move on after you no longer find errors.

## Testing Your Visual Inventory ##

The next script that you will encounter is called *dse.sh*. This script will generate a color-coded image overlay for a specified folio side. After you have started up your virtual machine and pulled the latest data for the repository, run the following command:

sh scripts/dse.sh FOLIO-URN

When the script is complete, you can find your results here: hmt-vm/hmt-mom/build/visualinventory/inventory.xml

You should open this file in a non-Google Chrome web browser. You must visual verify that everything on the page has been indexed correctly. You can turn on and off particular documents and highlight particular indexed images by clicking on them. The most common errors include:

1. Gaps where nothing has been indexed
2. Text that should be distinct items is included in one indexed image
3. Text is not indexed in the proper document (e.g. an exterior scholion indexed with the main scholia)

You should run this test after you have indexed images. You do not have to wait until the whole page is complete. For instance, you could run this test after you have indexed only the Homeric text or after particular scholia documents. Ideally you would not move onto editing the folio until everything has been indexed properly, but you may potentially find more errors when you move onto editing. Always re-check the visual inventory if you have made any changes to the data. 

## Testing Your Text Editions ##

The last script that you will encounter is called *verify.sh*. This script runs both the visual verification test used in *dse.sh* and a full parsing check on your text editions. You should run this script before moving on to a new folio side. After you have started up your virtual machine and pulled the latest data for the repository, run the following command:

sh scripts/verify.sh FOLIO-URN

When the script is complete you will find your results here: hmt-vm/hmt-mom/build/visualinventory/inventory.xml

and here: hmt-vm/hmt-mom/build/verification/index.html

This script will change as new tests are added but below are some of those tests and what sorts of errors you might find in your results:

1. **Personal Names**: The test verifies that everything wrapped in the element 'persName' contains a valid URN in @n. Frequent errors include:

   a. misspelled URNs
   b. invalid URNs
   c. missing URNs

You should verify that you are using a valid URN from the authority lists. If the URN is misspelled, correct it. If the URN is invalid, you may have run into an issue where there was a duplicate and you should check the authority lists for a redirect. If the name does not exist, be sure to create an issue in the authority lists for the name.

2. **Place Names**: The test verifies that everything wrapped in the element 'placeName' contains a valid URN in @n. Frequent errors include:

   a. misspelled URNs
   b. invalid URNs
   c. missing URNs

You should verify that you are using a valid URN from the authority lists. If the URN is misspelled, correct it. If the URN is invalid, you may have run into an issue where there was a duplicate and you should check the authority lists for a redirect. If the place does not exist, be sure to create an issue in the authority lists for the place.

3. **Ethnic Names**: The test verifies that everything wrapped in the element 'rs' with @type="ethnic" also has a valid URN in @n. Frequent errors include:

   a. misspelled URNs
   b. invalid URNs
   c. missing URNs

You should verify that you are using a valid URN from the authority lists. If the URN is misspelled, correct it. If the URN is invalid, you may have run into an issue where there was a duplicate and you should check the authority lists for a redirect. If the place or eponymous ancestor does not exist, be sure to create an issue in the authority lists for the place or eponymous ancestor and indicate that you are doing so for the purpose of an ethnic name. 

4. **Lexical Tokens**: Everything that is not a named entity like above is categorized under lexical tokens and run through the morpheus parsing tool. For each failure, you should locate the error in your edition and verify its presence in the manuscript. There are several different kinds of errors that you may run into:

   a. *An error in your edition*: The text in your edition does not match the manuscript. Fix it and re-run verification.
   b. *An orthographic variant*: We account for variations in Byzantine orthographic practices by creating a list of these orthographic variants and running your text against this list as well as morpheus. Orthographic variants include missing breathings, accents, iota subscripts, or elision marks. If your failed form also contains a wrong breathing, accent, iota subscript, elision mark, or spelling error, it should be wrapped in 'sic' and considered a scribal error, not an orthographic variant. You should be careful about relying on online dictionaries to tell you whether or not a word will parse (especially for grammatical terms). The virtual machine is equipped with a copy of morpheus which you can run in the terminal session. To do so, enter the command, 'morpheus', in your virtual machine. From there you must type your greek word using [Beta Code Greek](http://www.tlg.uci.edu/encoding/). Always test words with proper accents and breathings in morpheus before assuming you have a different type of error. When you have a legitimate orthographic variant you should submit an issue to the [Byzantine orthography issue tracker](https://github.com/homermultitext/byzortho/issues/new). 
   c. *A scribal error*: Your edition correctly reflects the reading in the manuscript, but the reading in the manuscript has the wrong breathing, accent, elision mark, or spelling. These we call scribal errors and wrap in the element 'sic'.
   d. *A morpheus parsing error*: You have a legitimate word that fails to parse in morpheus but should (meaning you have verified its existence in an authoritative lexicon such as the LSJ). If morpheus in the terminal is unable to parse your correct form, then you should submit an issue to the [morpheus issue tracker](https://github.com/homermultitext/morpheus/issues/new).
   e. *A hmt-mom tokenization error*: You have a legitimate form that fails verification but is able to be parsed by morpheus. You must verify the word's existence in an authoritative lexicon such as the LSJ and test whether it is parsable in morpheus via the terminal. In this case you should submit an issue to the [hmt-mom issue tracker](https://github.com/homermultitext/hmt-mom/issues/new).  
  f. *A new word or form*: Sometimes, but generally very rarely, the scholia will offer words or forms of words not contained in the LSJ. If you have verified that the failed form is not one of the other possible failures, you can submit your proposed new word or form to the [morpheus issue tracker](https://github.com/homermultitext/morpheus/issues/new).

## Formatting Your Issues ##

All issues should use full urn notation to refer to text passages and folios! It is vital to making sure your issues are processed as quickly as possible. The *subject line* for the issue should be composed of 3 parts:

   1. The standard name:
      a. New Orthographic Variant
      b. Proposed New Word
      c. Proposed New Form
      d. Parsing Error
      e. Tokenization Error
   2. The full urn notation for the folio (cite object urn).
   3. The failed word 

For example μαχην without the proper accent as an orthographic variant on folio 154v would have this subject line: *New Orthographic Variant urn:cite:hmt:msA.154v: μαχην* 

The comment of every issue should contain the following two things:
   
   1. The full urn for the passage
   2. The failed form

From there certain issue require more specialized information. For specialized information see this list:

- *Orthographic Variants* should also include the *normalized form* of the word. 
- *Proposed New Words* should include to the best of your ability a summary of what is going on in the scholion, the lemma of your proposed new word, and a proposed meaning of the new word. You should also indicate if the word is not in the LSJ but is in the glossary of Eleanor Dickey's *Ancient Greek Scholarship*.
- *Proposed New Forms* should include to the best of your ability a summary of what is going on in the scholion, the lemma of the word you think you have a form of, and what the parsed form is.
- *Parsing Errors* should indicate whether you found the word in the LSJ and that is does not pass in morpheus in the terminal.
- *Tokenization Errors* should indicate that the word passes in morpheus in the terminal but not overall validation. 

## Verification Tips and Tricks ##

Recommended tabs to have open: issue trackers for 1) your repository 2) byzortho 3) morpheus and 4) hmt-mom; Erbse; Dindorf; a parsing tool like morpheus online; the manuscript browser; and the relevant section of the *Iliad* text.

There are a few common errors that you can avoid simply by being aware of them while creating your addition. 1) Always make sure you're typing in Greek. You will have a hard time noticing the difference between the English letter 'o' and an omicron. 2) ensure that all personal and place names have urns 3) Always put correct accents and breathings on the expanded form in an 'abbr' 'expan' pair. The 'abbr' indicates what is on the manuscript. Verification parses the 'expan'.  

**Typical work flow of resolving failures in the text editions**:

1) Find a failure.
2) Is it an orthographic variant? Is it missing an accent, breathing, iota subscript, or elision mark? Test this with an online dictionary.
3) If the online dictionary doesn't work, but you suspect it might still be an orthographic variant does it work in morpheus in the terminal? If yes, it's still an orthographic variant.
4) Is it a scribal error? Does it have the wrong accent, breathing, iota subscript, elision mark, or misspelling? Test it with an online dictionary. If you are correct, wrap in 'sic'. 
5) If you find an orthographic variant or properly spelled word that works in an online dictionary but not in morpheus, you have a parsing error.
6) If you find a properly spelled word that works in an online dictionary and in morpheus but still fails you have a tokenization error.
7) If you have a properly spelled word that works neither in an online dictionary nor morpheus, but you can tell from context it is not a scribal error, then you have a potential new word or form.
