package com.datawizards.dmg

package object dialects {

  /**
    * Takes a camel cased identifier name and returns an underscore separated
    * name
    *
    * Example:
    * camelToUnderscores("thisIsA1Test") == "this_is_a_1_test"
    */
  def camelToSnake(name: String): String = {
    name.drop(1).foldLeft(name.headOption.map(_.toLower + "") getOrElse "") {
      case (acc, c) if c.isUpper => acc + "_" + c.toLower
      case (acc, c) => acc + c
    }
  }

  /**
   * Takes an underscore separated identifier name and returns a camel cased one
   *
   * Example:
   *    underscoreToCamel("this_is_a_1_test") == "thisIsA1Test"
   */
  def snakeToCamel(name: String, forceLower: Boolean = false): String = {
    val result: String = "_([a-z\\d])".r.replaceAllIn(name, m => {
      m.group(1).toUpperCase()
    })
    if (forceLower) {
      val c = result.toCharArray
      c(0) = Character.toLowerCase(c(0))
      new String(c)
    } else {
      result
    }
  }

}
