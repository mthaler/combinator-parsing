package com.mthaler.combinatorparsing.arith

import scala.util.parsing.combinator.RegexParsers

object IntParser extends RegexParsers {

  def number = """(0|[1-9])*""".r ^^ { _.toInt }
}
