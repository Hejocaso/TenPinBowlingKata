/**
  * Created by helen on 28/10/16.
  */
class Bowling {

  val frames: List[Int] = List()
  var scores: List[Int] = List()

  def roll(pins: Int) = {
    if (pins < 10) {
      score(pins)
    } else if (pins == 10) {
      score(pins)
    } else { //Gutter game
      score(0)
    }
  }

  def score(score: Int) = {
    val scores = score
  }
}
