/*
Reads 2 files:  markdown source for editor's guide, and .csv list of examples,
and generates new markdown replacing URNs referring to examples with content
generated from .csv table.  It writes to standard output.

Example: from the root of this repository, run

    groovy addExamples.groovy src/editorial-policies.md examples.csv > OUTPUT.md


*/
@GrabResolver(name='beta', root='http://beta.hpcc.uh.edu/nexus/content/repositories/releases')
@Grab(group='edu.holycross.shot', module='safecsv', version='1.0.0')
@Grab(group='edu.harvard.chs', module='cite', version='2.0.0')

import edu.holycross.shot.safecsv.SafeCsvReader
import edu.harvard.chs.cite.CiteUrn
import edu.harvard.chs.cite.CtsUrn

String usage = "Usage: groovy addExamples.groovy MARKDOWNFILE CSVTABLE"

if (args.size() != 2) {
  System.err.println usage
  System.exit(-1)
}


File md = new File(args[0])
File csv = new File(args[1])


String formatExample(String key, LinkedHashMap examples, Integer idx) {
  def data = examples[key]

  System.err.println "{key} --> ${data}"

  String urlBase = "http://www.homermultitext.org/hmt-digital/images"
  //ImageUrn,TextPassage,Good,Bad,TeiElements
  StringBuilder sbldr = new StringBuilder()
  CiteUrn img
  CtsUrn txt
  try {
    img = new CiteUrn(data[0])
    txt = new CtsUrn(data[1])

    if (txt.hasSubref()) {
        sbldr.append("Example:  ${txt.getSubref()} (${txt.getUrnWithoutPassage()}${txt.getPassageNode()})\n\n")
    } else {
      sbldr.append("Example: (${txt})\n\n")
    }

    sbldr.append("[![${key}][${idx}]][${idx}zoom]\n\n")
    sbldr.append("[${idx}]: ${urlBase}?request=GetBinaryImage&urn=${img}\n\n")
    sbldr.append("[${idx}zoom]: ${urlBase}?request=GetIIPMooViewer&urn=${img}\n\n")

    sbldr.append("Example of correct usage:\n\n")
    sbldr.append("    ${data[2]}\n\n")

    if (data[3].size() > 0) {
      sbldr.append("Incorrect usage:\n\n")
      sbldr.append("    ${data[3]}\n\n")
    }


  } catch (Exception e) {
    System.err.println "Failed on entry ${key}:  " + e
  }


  /*

  [![diaresis][diaeresis]][1]

  Example:  ί̈σχειν (urn:cts:greekLit:tlg0012.tlg001.msA:9.352)

  [diaeresis]: http://www.homermultitext.org/iipsrv?OBJ=IIP,1.0&FIF=/project/homer/pyramidal/VenA/VA118VN-0621.tif&RGN=0.4855,0.5409,0.0721,0.0301&WID=8000&CVT=JPEG

  [1]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301

  [1embed]: http://www.homermultitext.org/hmt-digital/images?request=GetIIPMooViewer&urn=urn:cite:hmt:vaimg.VA118VN-0621@0.4855,0.5409,0.0721,0.0301&width=9000


*/

  return sbldr.toString()
}

def examples = [:]
SafeCsvReader srcReader = new SafeCsvReader(csv)
srcReader.readAll().each { cols ->
  examples[cols[0]] = cols.drop(1)

}

Integer count = 0
md.eachLine { l ->
  if (l ==~ /urn:cite:hmt:edguide.+/) {
    count++
    if (! examples.keySet().contains(l)) {

      System.err.println "ERROR: no data for example with URN " + l
      System.out.println "ERROR: no data for example with URN " + l
    } else {
      println formatExample(l, examples, count)
    }
  } else {
    //println l
  }
}
