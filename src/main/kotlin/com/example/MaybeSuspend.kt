package com.example

private suspend fun maybeSuspendStep1(input: String): String? {
    return input
}

private suspend fun maybeSuspendStep2(input: String): String? {
    return input
}

private suspend fun maybeSuspendStep3(input: String): String? {
    return input
}

suspend fun maybeSuspendExample(input: String?): String? {
    if (input == null) {
        return null
    }

    val maybeSuspendStep1 = maybeSuspendStep1(input)

    if (maybeSuspendStep1 == null) {
        return null
    }

    val maybeSuspendStep2 = maybeSuspendStep2(maybeSuspendStep1)

    if (maybeSuspendStep2 == null) {
        return null
    }

    return maybeSuspendStep3(maybeSuspendStep2)
}
