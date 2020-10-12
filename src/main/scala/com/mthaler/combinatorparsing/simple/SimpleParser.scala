package com.mthaler.combinatorparsing.simple

import scala.util.parsing.combinator.RegexParsers

object SimpleParser extends RegexParsers {

  def word = """[a-z]+""".r ^^ { _.toString }
}
