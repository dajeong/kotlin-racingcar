package racingcar.racingcar

class CarManager {
    fun ready(carNames: List<String>): List<Car> {
        return carNames.map { Car(it) }
    }
}
