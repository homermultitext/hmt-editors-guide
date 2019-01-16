
scalaVersion := "2.11.8"


resolvers += Resolver.jcenterRepo
resolvers += "beta" at "http://beta.hpcc.uh.edu/nexus/content/repositories/releases"
resolvers += Resolver.bintrayRepo("neelsmith", "maven")


libraryDependencies ++= Seq(

  "edu.holycross.shot.cite" %% "xcite" % "3.7.0",
  "edu.holycross.shot" %% "scm" % "6.2.0",
  "edu.holycross.shot" %% "ohco2" % "10.11.1",
  "edu.holycross.shot" %% "citeobj" % "7.2.0",
  "edu.holycross.shot" %% "citerelations" % "2.4.0",
  "edu.holycross.shot" %% "citeiip" % "1.0.0",
  "org.homermultitext" %% "hmt-textmodel" % "4.1.0"

)
