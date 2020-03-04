package com.example.conversion

private suspend fun completableToMaybeSuspendStep1(input: String) {
    println("step1: $input")
}

private suspend fun completableToMaybeSuspendStep2(input: String): String? {
    return input
}

suspend fun completableToMaybeSuspendExample(input: String): String? {
    completableToMaybeSuspendStep1(input)
    return completableToMaybeSuspendStep2(input)
}
