import java.io.File

def listFiles(dir: String): Vector[File] = {
    val d = new File(dir)
    if (d.exists && d.isDirectory) {
      val realFiles =  d.listFiles.filter(_.isFile).toVector
      realFiles.filter(_.getName.matches(".+md"))
    } else {
        Vector[File]()
    }
}
