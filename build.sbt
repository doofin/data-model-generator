name := "data-model-generator"

resolvers += "jitpack" at "https://jitpack.io"

organization := "com.github.piotr-kalanski"

version := "0.7.7.15"

scalaVersion := "2.12.7"

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

homepage := Some(url("https://github.com/piotr-kalanski/data-model-generator"))

scmInfo := Some(
  ScmInfo(
    url("https://github.com/piotr-kalanski/data-model-generator"),
    "scm:git:ssh://github.com/piotr-kalanski/data-model-generator.git"
  )
)

developers := List(
  Developer(
    id    = "kalan",
    name  = "Piotr Kalanski",
    email = "piotr.kalanski@gmail.com",
    url   = url("https://github.com/piotr-kalanski")
  )
)

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % "2.11.8",
  "log4j" % "log4j" % "1.2.17",
  "com.github.jordanburke" % "es-client" % "v0.3.0.12.1",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "junit" % "junit" % "4.10" % "test"
)

coverageExcludedPackages := "com.datawizards.dmg.examples.*"

publishMavenStyle := true

/*
publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}
*/