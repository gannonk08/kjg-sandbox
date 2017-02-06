name := """email-validator"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  "com.typesafe.play" %% "play-mailer" % "4.0.0",
  "com.typesafe.play" %% "anorm" % "2.5.0",
  "mysql" % "mysql-connector-java" % "5.1.38",
  "com.stripe" % "stripe-java" % "2.6.0",
  "com.braintreepayments.gateway" % "braintree-java" % "2.68.0",
  //  "org.webjars" % "requirejs" % "2.1.22",
  //  "org.webjars" % "react" % "0.14.7",
  //  "org.webjars" % "jquery" % "2.1.4",
  //  "org.webjars" % "flux" % "2.1.1",
  //  "org.webjars" % "momentjs" % "2.11.1",
  //  "org.webjars" % "EventEmitter" % "4.2.7-1",
  //  "org.webjars" % "jsx-requirejs-plugin" % "0.6.0",
  //  "org.webjars.npm" % "react-router" % "2.0.0",
  //  "org.webjars.npm" % "react-dom" % "0.14.7",
  //  "org.webjars.npm" % "react-intl" % "2.0.0-pr-2",
  //  "org.webjars.bower" % "requirejs-babel" % "0.0.8",
  "org.reactivemongo" %% "play2-reactivemongo" % "0.11.14-play24",
  "xalan" % "serializer" % "2.7.2",
  "org.scalatest" % "scalatest_2.11" % "3.0.0" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.35.0" % "test",
  "org.scalaz.stream" % "scalaz-stream_2.11" % "0.7.3",
  cache,
  ws,
  specs2 % Test
)

