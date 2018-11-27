name := "squants-cats"

version := "0.1"

scalaVersion := "2.12.7"

lazy val catsVer = "1.4.0"
lazy val squantsVer = "1.4.0"

lazy val specs2Ver = "4.3.4"

// General stuff
scalacOptions ++= Seq(
  "-Ypartial-unification",
  "-language:higherKinds",
)
libraryDependencies += "org.typelevel" %% "cats-core" % catsVer

// Data types stuff
libraryDependencies ++= Seq(
  "org.typelevel" %% "squants" % squantsVer,
)

// Testing stuff
libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % specs2Ver % Test,
  "org.specs2" %% "specs2-scalacheck" % specs2Ver % Test,
  "org.typelevel" %% "cats-laws" % catsVer % Test,
)
scalacOptions in Test += "-Yrangepos"
