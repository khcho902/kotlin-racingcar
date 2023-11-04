package racing_car

import racing_car.domain.RacingGame
import racing_car.view.InputView
import racing_car.view.ResultView

fun main() {

    val racingGame = RacingGame(
        cars = InputView.inputCars(),
        racingRound = InputView.inputRacingRound(),
    )

    ResultView.printResultTitle()
    while (racingGame.isContinuable) {
        racingGame.move()
        ResultView.printPosition(racingGame.carInfos)
    }

    val winners = racingGame.judgeWinners()
    ResultView.printWinners(winners)
}
