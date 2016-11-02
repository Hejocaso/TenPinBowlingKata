import org.scalatestplus.play.{OneAppPerSuite, PlaySpec}

/**
  * Created by helen on 28/10/16.
  */
class BowlingSpec extends PlaySpec with OneAppPerSuite{
  "Calling TenPinBowlingGame" should {
    "roll a gutter game" in {
      val roll = bowling.roll(0)
      roll mustBe "Gutter"
    }

    "roll a spare" in {
    }

    "roll a strike" in {
    }

    "roll all ones" in {
    }

    "roll a perfect game" in {
    }
  }

  object TestBowling extends Bowling
  def bowling = TestBowling
}


