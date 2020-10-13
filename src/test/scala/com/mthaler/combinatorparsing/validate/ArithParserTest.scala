package com.mthaler.combinatorparsing.validate

import org.scalatest.funsuite.AnyFunSuite

class ArithParserTest extends AnyFunSuite with ArithParser {

  test("validate") {
    assert(parse("3.14").successful)
    assert(parse("3.0 + 4.0").successful)
  }

  def parse(txt: String) = parseAll(expr, txt)
}
