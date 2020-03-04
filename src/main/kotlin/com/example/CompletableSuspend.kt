package com.example

private suspend fun completableSuspendStep1(input: String) {
    println("step1: $input")
}

private suspend fun completableSuspendStep2(input: String) {
    println("step2: $input")
}

private suspend fun completableSuspendStep3(input: String) {
    println("step3: $input")
}

suspend fun completableSuspendExample(input: String) {
    completableSuspendStep1(input)
    completableSuspendStep2(input)
    completableSuspendStep3(input)
}
