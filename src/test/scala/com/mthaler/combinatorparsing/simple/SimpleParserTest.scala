package com.mthaler.combinatorparsing.simple

import org.scalatest.funsuite.AnyFunSuite

class SimpleParserTest extends AnyFunSuite {

  test("parse") {
    def parse(txt: String) = SimpleParser.parseAll(SimpleParser.word, txt)

    assert(parse("test").get === "test")
    assert(!parse("test123").successful)
    assert(parse(" test ").successful)
    assert(!parse(" test 123").successful)
  }
}
