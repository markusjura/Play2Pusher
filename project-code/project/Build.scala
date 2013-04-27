import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

	val appName = "Play2Pusher"
	val appVersion = "1.1"

	val appDependencies = Seq( // Add your project dependencies here,
	)

	val main = play.Project(appName, appVersion, appDependencies).settings(
		// Add your own project settings here
		organization := "tindr")

}
