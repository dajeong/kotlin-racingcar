package racingcar.racingcar

class TurnIndicator(
    private val indicators: List<Int>
) {
    fun findByCarIndex(carIndex: Int): Int {
        return indicators[carIndex]
    }
}
