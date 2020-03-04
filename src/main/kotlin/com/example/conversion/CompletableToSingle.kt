package com.example.conversion

import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

private fun completableToSingleStep1(input: String): Completable {
    println("step1: $input")
    return Completable.complete()
}

private fun completableToSingleStep2(input: String): Single<String> {
    return Single.just(input)
}

fun completableToSingleExample(input: String): Single<String> {
    return completableToSingleStep1(input)
        .andThen(completableToSingleStep2(input))
}
