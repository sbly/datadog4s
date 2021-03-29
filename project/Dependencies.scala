import sbt._
object Dependencies {
  object Cats {
    val core   = "org.typelevel" %% "cats-core"   % "2.4.2"
    val effect = "org.typelevel" %% "cats-effect" % "2.4.0"
  }

  object Datadog {
    val statsDClient = "com.datadoghq" % "java-dogstatsd-client" % "2.11.0"
  }

  object Http4s {
    val core = "org.http4s" %% "http4s-core" % "0.21.21"
  }

  object Testing {
    val mockitoScalatest = "org.mockito"   %% "mockito-scala-scalatest" % "1.15.1"
    val munit            = "org.scalameta" %% "munit"                   % "0.7.22"
  }

  object Logging {
    val logback = "ch.qos.logback" % "logback-classic" % "1.2.3"
  }

  object Mdoc {
    val libMdoc = "org.scalameta" %% "mdoc" % "2.2.18" excludeAll (ExclusionRule(
      organization = "org.slf4j"
    ))
  }

  object ScalaModules {
    val collectionCompat = "org.scala-lang.modules" %% "scala-collection-compat" % "2.4.2"
  }

}
