import java.io.File
import java.io.PrintWriter

import scala.io.Source
import edu.holycross.shot.cite._
import scala.util.Try

def listFiles(dir: String): Vector[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      val realFiles =  d.listFiles.filter(_.isFile).toVector
      realFiles.filter(_.getName.matches(".+md"))
    } else {
        Vector[File]()
    }
}


case class Example(
  topic: Cite2Urn,
  image: Cite2Urn,
  text: CtsUrn,
  good: String = "",
  bad: String = "",
  teiList: String = ""
)


object GuideBuilder {


  // Write guide to file
  def writeGuide: Unit = {
    val guide = "generated/guide.md"
    new PrintWriter(guide) { write(stitch); close }
  }

  // Stitch together text contents
  def stitch:String  = {

    val txt = for (t <- toc) yield {
      val f = s"markdown/${t}"
      println(f)
      Source.fromFile(f).getLines.toVector.mkString("\n")
    }
    txt.mkString("\n\n")
  }

  // table of contents for composite markdown
  def toc = {
    Source.fromFile("markdown/toc.txt").getLines.toVector
  }

  // get example data in row by column vectors
  def exampleColumns: Vector[Vector[String]] = {
    val rows = Source.fromFile("examples.cex").getLines.toVector.drop(1)
    for (r <- rows) {
      if (r.split("#",-1).size != 6) {
        println(s"==>Badly formatted data: ${r} had ${r.split("#",-1).size} columns")
      }
    }
    val cols = rows.map( r => r.split("#",-1).toVector)
    cols.filter(_.size == 6)
  }


  // create vector of Example objects
  def examples:  Vector[Example] = {
    val rowsByCols = exampleColumns
    val validEntries = rowsByCols.filter (
      row => {

        val ex : Try[Example] = Try(Example(Cite2Urn(row(0)), Cite2Urn(row(1)),CtsUrn(row(2)),row(3),
        row(4),row(5)))
        if  (ex.isSuccess) {
          true
        } else {
          println(s"For ${rowsByCols} with size ${rowsByCols.size}: ${ex}")
          false
        }
      }
    )
    validEntries.map( cols =>
      Example(Cite2Urn(cols(0)), Cite2Urn(cols(1)),CtsUrn(cols(2)),cols(3),
      cols(4),cols(5)))
  }

}
