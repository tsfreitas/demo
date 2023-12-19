package com.example

import io.kotest.core.spec.style.WordSpec
import io.kotest.matchers.shouldBe

class OtherTest : WordSpec({

    "this test" should {
        "be true" {
            true shouldBe true
        }
    }
})