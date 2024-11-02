plugins {
	id("my-java-base")
	id("application")
}

val myBuildGroup = "My Project build"
tasks.named("run") {
	group = myBuildGroup
}
