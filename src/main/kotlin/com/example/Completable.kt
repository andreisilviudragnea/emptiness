package com.example

import io.reactivex.rxjava3.core.Completable

private fun completableStep1(input: String): Completable {
    println("step1: $input")
    return Completable.complete()
}

private fun completableStep2(input: String): Completable {
    println("step2: $input")
    return Completable.complete()
}

private fun completableStep3(input: String): Completable {
    println("step3: $input")
    return Completable.complete()
}

fun completableExample(input: String): Completable {
    return Completable
        .complete()
        .andThen(completableStep1(input))
        .andThen(completableStep2(input))
        .andThen(completableStep3(input))
}
