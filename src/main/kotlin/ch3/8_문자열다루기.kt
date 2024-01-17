package ch3

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathWithReges(path:String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if(matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main() {
    println("asd.asdas.qwewq".split("."))   // "." 단위로 나눠서 배열 반환
    println("asd.as-das.qwewq".split(".", "-"))   // ".", "-" 단위로 나눠서 배열 반환
    parsePath("/Users/yole/kotlin-book/chapter.adoc")
    parsePathWithReges("/Users/yole/kotlin-book/chapter.adoc")
}