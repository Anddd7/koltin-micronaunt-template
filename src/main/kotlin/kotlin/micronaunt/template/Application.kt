package kotlin.micronaunt.template

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("kotlin.micronaunt.template")
		.start()
}

