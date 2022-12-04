name := "Game Server"

version := "1.0"

scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.10",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",
  "org.typelevel" %% "mouse" % "1.2.1",
  "org.typelevel" %% "cats-effect" % "3.2.9",
  "org.typelevel" %% "cats-effect-testing-scalatest" % "1.3.0" % Test,
  "org.scalatest" %% "scalatest" % "3.2.10" % Test,
)
