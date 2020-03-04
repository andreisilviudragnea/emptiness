package com.example

import reactor.core.publisher.Mono

private fun monoStep1(input: String): Mono<String> {
    return Mono.just(input)
}

private fun monoStep2(input: String): Mono<String> {
    return Mono.just(input)
}

private fun monoStep3(input: String): Mono<String> {
    return Mono.just(input)
}

fun monoExample(input: String?): Mono<String> {
    return Mono
        .justOrEmpty<String>(input)
        .flatMap { monoStep1(it) }
        .flatMap { monoStep2(it) }
        .flatMap { monoStep3(it) }
}
