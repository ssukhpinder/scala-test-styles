lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.13.1"
    )),
    name := "scalatest-example"
  )
  
libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % Test
libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-flatspec" % "3.2.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-funspec" % "3.2.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-wordspec" % "3.2.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-freespec" % "3.2.0" % "test"
libraryDependencies += "org.scalatest" %% "scalatest-refspec" % "3.2.0" % "test"