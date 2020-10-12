package com.mthaler.combinatorparsing.json

import org.scalatest.funsuite.AnyFunSuite

class JSONTest extends AnyFunSuite {

  test("parse") {
    def parse(txt: String) = JSON.parseAll(JSON.obj, txt)

    val json =
      """{
        |    "address book": {
        |        "name": "John Smith",
        |        "address": {
        |            "street": "10 Market Street",
        |            "city" : "San Francisco, CA",
        |            "zip" : 94111
        |        },
        |        "phone numbers": [
        |            "408 338-4238",
        |            "408 111-6892"
        |        ]
        |    }
        |}
        |""".stripMargin

    assert(parse(json).get === Map("\"address book\"" -> Map("\"name\"" -> "\"John Smith\"", "\"address\"" -> Map("\"street\"" -> "\"10 Market Street\"", "\"city\"" ->
      "\"San Francisco, CA\"", "\"zip\"" -> 94111.0),"\"phone numbers\"" -> List("\"408 338-4238\"", "\"408 111-6892\"")))
    )
  }
}
