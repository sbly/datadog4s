import sbt._
object Dependencies {
  object Cats {
    val effect = "org.typelevel" %% "cats-effect" % "3.1.1"
    val core   = "org.typelevel" %% "cats-core"   % "2.6.1"
  }

  object Datadog {
    val statsDClient = "com.datadoghq" % "java-dogstatsd-client" % "2.13.0"
  }

  object Http4s {
    val core = "org.http4s" %% "http4s-core" % "0.23.0-RC1"
  }

  object Testing {
    val mockitoScalatest = "org.mockito"   %% "mockito-scala-scalatest" % "1.15.1"
    val munit            = "org.scalameta" %% "munit"                   % "0.7.26"
  }

  object Logging {
    val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  }

  object Mdoc {
    val libMdoc = "org.scalameta" %% "mdoc" % "2.2.21" excludeAll (ExclusionRule(
      organization = "org.slf4j"
    ))
  }

  object ScalaModules {
    val collectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.4.4"
  }

}
