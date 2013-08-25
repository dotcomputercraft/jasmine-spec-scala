package com.prystupa

import org.scalatest.matchers.ShouldMatchers
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * Created with IntelliJ IDEA.
 * User: eprystupa
 * Date: 8/24/13
 * Time: 11:37 PM
 */
@RunWith(classOf[JUnitRunner])
class MathSuite extends JasmineSpec with ShouldMatchers {

  var x: Int = _
  var y: Int = _
  var result: Int = _

  describe("A simple calculator") {

    describe("when turned on") {
      it("displays 0") {
        result should equal(0)
      }

      describe("when I input 5") {
        beforeEach {
          x = 5
        }

        describe("and multiple by 3") {
          beforeEach {
            result = x * 3
          }

          it("shows 15") {
            result should equal(15)
          }
        }

        describe("and add by 3") {
          beforeEach {
            result = x + 3
          }

          it("shows 8") {
            result should equal(8)
          }
        }
      }
    }

  }
}
