package com.example

import com.example.conversion.completableToMaybeExample
import com.example.conversion.completableToMaybeSuspendExample
import com.example.conversion.completableToSingleExample
import kotlinx.coroutines.runBlocking

fun main() {
    println(completableExample("input1").blockingAwait())
    println(runBlocking { completableSuspendExample("input2") })

    println(maybeExample("input3").blockingGet())
    println(runBlocking { maybeSuspendExample("input4") })

    println(monoExample("input5").block())
    println(runBlocking { monoSuspendExample("input6") })

    println(singleExample("input7").blockingGet())
    println(runBlocking { singleSuspendExample("input8") })

    // suspend () -> Unit <=> Mono<Void> (no explicit type) <=> Completable
    // suspend () -> T? <=> Mono<T> <=> Maybe<T>
    // suspend () -> T <=> Mono<T> (no explicit type) <=> Single<T>

    println(completableToMaybeExample("input9").blockingGet())
    println(runBlocking { completableToMaybeSuspendExample("input10") })

    println(completableToSingleExample("input11").blockingGet())
}
