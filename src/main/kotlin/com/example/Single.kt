package com.example

import io.reactivex.rxjava3.core.Single

private fun singleStep1(input: String): Single<String> {
    return Single.just(input)
}

private fun singleStep2(input: String): Single<String> {
    return Single.just(input)
}

private fun singleStep3(input: String): Single<String> {
    return Single.just(input)
}

fun singleExample(input: String): Single<String> {
    return Single
        .just(input)
        .flatMap { singleStep1(it) }
        .flatMap { singleStep2(it) }
        .flatMap { singleStep3(it) }
}
