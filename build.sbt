import sbt._

organization := "com.intenthq"

name := "gander"

description := "Extracts text, metadata from web pages."

licenses += "Apache2" -> url("http://www.apache.org/licenses/")

scalaVersion := "2.11.7"

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

Defaults.itSettings

scalacOptions ++= Seq(
  "-Xlint",
  "-Xfatal-warnings",
  "-unchecked",
  "-deprecation",
  "-feature")

testOptions in Test += Tests.Argument("-oF")

libraryDependencies ++= Seq(
  "commons-lang" % "commons-lang" % "2.6",
  "com.google.guava" % "guava" % "18.0",
  "joda-time" % "joda-time" % "2.8.1",
  "junit" % "junit" % "4.12" % Test,
  "org.joda" % "joda-convert" % "1.7",
  "org.jsoup" % "jsoup" % "1.8.2",
  "org.slf4j"	% "slf4j-api"	% "1.7.12",
  "org.specs2" %% "specs2-core" % "3.6.3" % "it,test"
)

scalacOptions ++= Seq("-unchecked", "-deprecation")

publishTo := Some("Sonatype Snapshots Nexus" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

lazy val root = project.in(file(".")).configs(IntegrationTest)
