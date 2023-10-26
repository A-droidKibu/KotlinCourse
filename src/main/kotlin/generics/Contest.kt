package generics

/**
 * the contest class with generic T of type Pet
 * meaning the generic must be either the subtypes of Pet
 * or Pet itself
 */
class Contest<T: Pet> {
    // the property of the class
    val scores: MutableMap<T, Int> = mutableMapOf()
    // the function to add the score of each contestant's into
    // the map use the
    // put() to add score to map()
    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }
    /**
     * function to return contestants with high score
     * get the value of highest score from the scores and return all contestants
     */
    fun getWinners(): MutableSet<T> {
        val highscore = scores.values.max()
        val winners: MutableSet<T> = mutableSetOf()
        for ((t, score) in scores) {
            if (score == highscore) winners.add(t)
        }
        return winners
    }
}