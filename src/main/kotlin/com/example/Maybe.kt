package com.example

import io.reactivex.rxjava3.core.Maybe
import java.util.Optional

private fun maybeStep1(input: String): Maybe<String> {
    return Maybe.just(input)
}

private fun maybeStep2(input: String): Maybe<String> {
    return Maybe.just(input)
}

private fun maybeStep3(input: String): Maybe<String> {
    return Maybe.just(input)
}

fun maybeExample(input: String?): Maybe<String> {
    return Maybe
        .fromOptional(Optional.ofNullable(input))
        .flatMap { maybeStep1(it) }
        .flatMap { maybeStep2(it) }
        .flatMap { maybeStep3(it) }
}
