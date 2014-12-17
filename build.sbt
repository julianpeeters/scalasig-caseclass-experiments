name := "scalasig-caseclass-experiments"

version := "0.2"

organization := "com.julianpeeters"

//scalaVersion := "2.9.1"
//scalaVersion := "2.10.1"
scalaVersion := "2.11.4"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

libraryDependencies ++= Seq(  
   "com.novus" %% "salat" % "1.9.9"
)
