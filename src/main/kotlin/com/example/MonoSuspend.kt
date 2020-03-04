package com.example

private suspend fun monoSuspendStep1(input: String): String? {
    return input
}

private suspend fun monoSuspendStep2(input: String): String? {
    return input
}

private suspend fun monoSuspendStep3(input: String): String? {
    return input
}

suspend fun monoSuspendExample(input: String?): String? {
    if (input == null) {
        return null
    }

    val monoSuspendStep1 = monoSuspendStep1(input)

    if (monoSuspendStep1 == null) {
        return null
    }

    val monoSuspendStep2 = monoSuspendStep2(monoSuspendStep1)

    if (monoSuspendStep2 == null) {
        return null
    }

    return monoSuspendStep3(monoSuspendStep2)
}
