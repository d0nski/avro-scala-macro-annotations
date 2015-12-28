package test

import org.specs2.mutable.Specification

class AvroRecord2ArityHomoNestedTest extends Specification {

  "A case class with more than one `List[List[String]]` field" should {
    "serialize and deserialize correctly" in {

      val record1 = AvroRecordTest38(
        List(
          List("hi.bye"),
          List("yay.nay")
        ),
        List(
          List("one.two"),
          List("three.four")
        )
      )
      val record2 = AvroRecordTest38(
        List(
          List("goo.ga"),
          List("caloo.calay")
        ),
        List(
          List("one.two"),
          List("three.four")
        )
      )
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)

    }
  }

  "A case class with more than one `List[List[String]]` field" should {
    "serialize and deserialize correctly" in {

      val record1 = AvroRecordTest39(
        List(
          List(1, 2),
          List(3, 4)
        ),
        List(
          List(5, 6),
          List(7, 8)
        )
      )
      val record2 = AvroRecordTest39(
        List(
          List(11, 12),
          List(13, 14)
        ),
        List(
          List(15, 16),
          List(17, 18)
        )
      )
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)

    }
  }

  "A case class with more than one `Option[List[String]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest40(Some(List("up.down")), Some(List("left.right")))
      val record2 = AvroRecordTest40(Some(List("b.a")), Some(List("select.start")))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `Option[List[Int]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest41(Some(List(1, 2)), Some(List(3, 4)))
      val record2 = AvroRecordTest41(Some(List(11, 12)), Some(List(13, 14)))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `List[Option[String]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest42(List(None, Some("red")), List(Some("blue"), None))
      val record2 = AvroRecordTest42(List(None, Some("green")), List(Some("yellow"), None))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `List[Option[Int]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest43(List(Some(1), None), List(Some(3), None))
      val record2 = AvroRecordTest43(List(Some(6), None), List(Some(8), None))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `Option[List[Option[String]]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest44(Some(List(Some("gold"), None)), Some(List(Some("silver"), None)))
      val record2 = AvroRecordTest44(Some(List(Some("copper"), None)), Some(List(Some("bronze"), None)))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `Option[List[Option[Int]]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest45(Some(List(Some(8), None)), Some(List(Some(10), None)))
      val record2 = AvroRecordTest45(Some(List(Some(9), None)), Some(List(Some(11), None)))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `List[Option[List[String]]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest46(List(None, Some(List(Some("green"), None))), List(None, Some(List(None, Some("yellow")))) )
      val record2 = AvroRecordTest46(List(None, Some(List(Some("orange"), None))), List(None, Some(List(None, Some("purple")))) )
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with more than one `List[Option[List[Int]]]` field" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTest47(List(None, Some(List(Some(2), None))), List(None, Some(List(None, Some(4)))) )
      val record2 = AvroRecordTest47(List(None, Some(List(Some(7), None))), List(None, Some(List(None, Some(9)))) )
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

  "A case class with two Map[String, Map[String, Int]] fields" should {
    "serialize and deserialize correctly" in {
      val record1 = AvroRecordTestMap10(Map("glory"->Map("kitty"->3)), Map("pride"->Map("doggy"->4)))
      val record2 = AvroRecordTestMap10(Map("sweet"->Map("horsey"->3)), Map("sour"->Map("piggy"->4)))
      val records = List(record1, record2)
      TestUtil.verifyWriteAndRead(records)
    }
  }

}
