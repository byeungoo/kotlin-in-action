package ch7

fun printEntries(map: Map<String, String>) {
    for( (key, value) in map) {
        println("$key -> $value")
    }


    for(entry in map) {
        val key = entry.component1()
        val value = entry.component2()
    }
}

