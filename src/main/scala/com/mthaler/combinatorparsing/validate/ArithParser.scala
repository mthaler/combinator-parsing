package com.mthaler.combinatorparsing.validate

import scala.util.parsing.combinator.JavaTokenParsers

/**
 * A simple arithmetic parser that can be used to validate input
 */
trait ArithParser extends JavaTokenParsers {

  def expr: Parser[Any] = term ~ rep("+" ~ term | "-" ~ term)

  def term = factor ~ rep(" * " ~ factor | "/" ~ factor)
  def factor = floatingPointNumber | "(" ~ expr ~ ")"
}

