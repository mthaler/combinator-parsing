package com.mthaler.combinatorparsing.json

import scala.util.parsing.combinator._

object JSON extends JavaTokenParsers {

  def value : Parser[Any] = obj | arr | stringLiteral | floatingPointNumber | "null" | "true" | "false"
  def obj: Parser[Any] = "{"~repsep(member, ",")~"}"
  def arr: Parser[Any] = "["~repsep(value, ",")~"]"
  def member: Parser[Any] = stringLiteral~":"~value
}

