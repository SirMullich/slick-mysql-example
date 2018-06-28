name := "slick-mysql"

version := "0.1"

scalaVersion := "2.12.6"

lazy val slickVersion = "3.2.1"
lazy val mysqlVersion = "5.1.34"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % slickVersion,
  "com.typesafe.slick" %% "slick-hikaricp" % slickVersion,
  "com.typesafe.slick" %% "slick-codegen" % slickVersion,
  "mysql" % "mysql-connector-java" % mysqlVersion,
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)