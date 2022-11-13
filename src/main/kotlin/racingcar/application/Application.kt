package racingcar.application

import racingcar.racingcar.CarManager
import racingcar.racingcar.CarRacing
import racingcar.racingcar.IndicatorGenerator
import racingcar.ui.InputView
import racingcar.ui.ResultView

class Application {
    private val carManager = CarManager()

    private val inputView = InputView()
    private val resultView = ResultView()

    private var run = true

    fun run() {
        println(GuideScript.PROGRAM_INFO)
        while (run) {
            val carRacingRequest = inputView.getRequest()
            val cars = carManager.ready(carRacingRequest.carNames)
            val carRacing = CarRacing(IndicatorGenerator(), carRacingRequest.turnCount, cars)
            carRacing.start()
            resultView.view(carRacing.result())

            println(GuideScript.BEGIN_GUIDE)
            val runCommand = readln()
            run = STOP_COMMAND != runCommand
        }
        println(GuideScript.CLOSE_GUIDE)
    }

    companion object {
        private const val STOP_COMMAND = "0"
    }
}
