import org.scalatest.flatspec.AnyFlatSpec

class FlatSpecClass extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }

  it should "produce NoSuchElementException when invoked" in {
    assertThrows[NoSuchElementException] {
      Set.empty.head
    }
  }
}