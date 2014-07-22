name := "chorus"

organization := "com.loopfor.chorus"

version := "0.1-SNAPSHOT"

homepage := Some(url("https://github.com/davidledwards/chorus"))

licenses := Seq("Apache License, Version 2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))

scmInfo := Some(ScmInfo(
  url("https://github.com/davidledwards/chorus"),
  "scm:git:https://github.com/davidledwards/chorus.git",
  Some("scm:git:https://github.com/davidledwards/chorus.git")
))

scalaVersion := "2.11.1"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-encoding", "UTF-8"
)

javacOptions ++= Seq(
  "-source", "1.7",
  "-target", "1.7"
)

// Compile dependencies.
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % "2.3.4"
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.2.1-M3" % "test"
)
