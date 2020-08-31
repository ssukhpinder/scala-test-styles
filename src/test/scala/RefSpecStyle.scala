import org.scalatest.refspec.RefSpec

class RefSpecClass extends RefSpec {

  object `A Set` {
    object `when empty` {
      def `should have size 0` {
        assert(Set.empty.size == 0)
      }

      def `should produce NoSuchElementException when invoked` {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}