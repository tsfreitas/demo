package com.example

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.comparables.shouldBeGreaterThan
import io.kotest.matchers.shouldBe

class OtherTest : WordSpec({

    "this test" should {
        "be true" {
            true shouldBe true
        }

        "be false" {
            false shouldBe false
        }

        "be positive" {
            10 shouldBeGreaterThan 0
        }
    }
})