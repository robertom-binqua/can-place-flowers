package org.binqua.examples.canplaceflowers

import org.binqua.examples.canplaceflowers.Solution

class SolutionSpec extends munit.FunSuite {

  test("we can plant 1 seed into 0") {
    assertEquals(Solution.canPlaceFlowers(Array(0), 1), true)
  }

  test("we cannot plant 1 seed into 1") {
    assertEquals(Solution.canPlaceFlowers(Array(1), 1), false)
  }

  test("we can plant 1 seed into 00") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0), 1), true)
  }

  test("we cannot plant 2 seeds into 00") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0), 2), false)
  }

  test("we cannot plant 2 seeds into 01 or 10") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 1), 1), false)
    assertEquals(Solution.canPlaceFlowers(Array(1, 0), 1), false)
  }

  test("we can plant 1 seed into 000") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 0), 1), true)
  }

  test("we can plant 1 seed into 100") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0), 1), true)
  }

  test("we can plant 1 seed into 001") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 1), 1), true)
  }

  test("we cannot plant 1 seed into 010") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 1, 0), 1), false)
  }

  test("we can plant 2 seeds into 000") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 0), 2), true)
  }

  test("we cannot plant 3 seeds into 000") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 0), 3), false)
  }

  test("we cannot plant 4 seeds into 000") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 0), 4), false)
  }

  test("we cannot plant 1 seed into 111") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 1, 1), 1), false)
  }

  test("we cannot plant 1 seed into 0111") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 1, 1, 1), 1), false)
  }

  test("we cannot plant 1 seed into 0101") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 1, 0, 1), 1), false)
  }

  test("we can plant 1 seed into 0011") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 1, 1), 1), true)
  }

  test("we can plant 2 seeds into 0000") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 0, 0), 2), true)
  }

  test("we can plant 2 seeds into 0011") {
    assertEquals(Solution.canPlaceFlowers(Array(0, 0, 1, 1), 2), false)
  }

  test("we cannot plant 1 seed into 1 0 0 1") { // 1 0 0 1
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 1), 1), false)
  }

  test("we can plant 1 seeds into 1 0 0 0 1") { // 1 0 0 1
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 1), 1), true)
  }

  test("we can plant 1 seed into 1 0 0 0 0 1 => 1 0 1 0 0 1") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 0, 1), 1), true)
  }

  test("we can plant 2 seeds into 1 0 0 0 0 0 1 => 1 0 1 0 1 0 1") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 0, 0, 1), 2), true)
  }

  test("we can plant 1 seed into 1 0 0 0 0 0  => 1 0 1 0 0 0") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 0, 0), 1), true)
  }

  test("we can plant 2 seeds into 1 0 0 0 0 0  => 1 0 1 0 1 0") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 0, 0), 2), true)
  }

  test("we cannot plant 1 seed into 1") {
    assertEquals(Solution.canPlaceFlowers(Array(1), 1), false)
  }

  test("we can plant 1 seed into 10001") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 1), 1), true)
  }

  test("we cannot plant 2 seeds into 10001") {
    assertEquals(Solution.canPlaceFlowers(Array(1, 0, 0, 0, 1), 2), false)
  }

}
