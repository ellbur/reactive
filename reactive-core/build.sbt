
organization := "cc.co.scala-reactive"

scalaVersion := "2.11.0-M6"

name := "reactive-core"

version := "0.3.0"

description := "An FRP framework"

unmanagedSourceDirectories in Compile <++= (scalaBinaryVersion, baseDirectory) { (sv, bd) => Seq(bd / "src" / "main" / ("scala-"+sv)) }

libraryDependencies ++= Seq(
    "org.scala-lang" % "scala-actors" % "2.11.0-M6"
)

