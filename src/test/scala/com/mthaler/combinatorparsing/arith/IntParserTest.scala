package com.mthaler.combinatorparsing.arith

import org.scalatest.funsuite.AnyFunSuite

class IntParserTest extends AnyFunSuite {

  test("parse") {

    def parse(txt: String) = IntParser.parseAll(IntParser.number, txt)

    assert(parse("42").get === 42)
    assert(!parse("3.14").successful)
  }
}
