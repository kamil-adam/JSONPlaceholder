name := "Game Server"

version := "1.0"

scalaVersion := "2.13.6"

val http4sVersion = "1.0.0-M37"
val circe = "0.14.3"

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.10",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.9.5",

  "org.http4s" %% "http4s-ember-client" % http4sVersion,
  "org.http4s" %% "http4s-circe" % http4sVersion,
  "io.circe" %% "circe-generic" % circe,
  "io.circe" %% "circe-literal" % circe,

  "org.typelevel" %% "mouse" % "1.2.1",
  "org.typelevel" %% "cats-effect" % "3.2.9",
  "org.typelevel" %% "cats-effect-testing-scalatest" % "1.3.0" % Test,
  "org.scalatest" %% "scalatest" % "3.2.10" % Test,
)
