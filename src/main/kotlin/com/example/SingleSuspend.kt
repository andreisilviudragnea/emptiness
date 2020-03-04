package com.example

private suspend fun singleSuspendStep1(input: String): String {
    return input
}

private suspend fun singleSuspendStep2(input: String): String {
    return input
}

private suspend fun singleSuspendStep3(input: String): String {
    return input
}

suspend fun singleSuspendExample(input: String): String {
    val singleSuspendStep1 = singleSuspendStep1(input)

    val singleSuspendStep2 = singleSuspendStep2(singleSuspendStep1)

    return singleSuspendStep3(singleSuspendStep2)
}
