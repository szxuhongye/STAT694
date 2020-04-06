name := "ScalaDemo"

version := "0.1"

scalaVersion := "2.11.8"

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "spark" at "https://repo1.maven.org/maven2/org/apache"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "2.4.5",
  "org.apache.spark" %% "spark-sql" % "2.4.5"
)