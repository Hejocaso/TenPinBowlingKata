val frames: List[Int] = List()
var scoreList: List[Int] = List()

def roll(pins: Int) = {
  if (pins < 10 && pins > 0) {
    score(pins)
  } else if (pins == 10) {
    score(pins)
  } else { //Gutter game
    score(0)
  }
}

def score(score: Int) = {
  val scores = score
  scoreList(1) += 1
  println("Score:" + scores)
}

roll(0)