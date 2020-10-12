package com.mthaler.combinatorparsing.arith

import org.scalatest.funsuite.AnyFunSuite

class ArithTest extends AnyFunSuite {

  test("parse") {
    def parse(txt: String) = Arith.parseAll(Arith.expr, txt)

    println(parse("3 + 4"))
  }
}
