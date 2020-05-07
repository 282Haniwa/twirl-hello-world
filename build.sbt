name := "twirlHelloWorld"
version := "1.0"

scalaVersion := "2.13.2"

scalacOptions := Seq("-deprecation", "-encoding", "utf8")

lazy val root = (project in file(".")).enablePlugins(SbtTwirl)
