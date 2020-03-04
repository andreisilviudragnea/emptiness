package com.example.conversion

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Maybe

private fun completableToMaybeStep1(input: String): Completable {
    println("step1: $input")
    return Completable.complete()
}

private fun completableToMaybeStep2(input: String): Maybe<String> {
    return Maybe.just(input)
}

fun completableToMaybeExample(input: String): Maybe<String> {
    return completableToMaybeStep1(input)
        .andThen(completableToMaybeStep2(input))
}
