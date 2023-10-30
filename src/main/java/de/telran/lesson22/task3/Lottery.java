package de.telran.lesson22.task3;

import static de.telran.lesson22.task3.Constants.COUNT_SET_SIZE;

public class Lottery {
    private int[] winnerNumbers = new int[COUNT_SET_SIZE];
    private int lucky;
    private int luckyCount;
    private int range = 10;

    public void runLottery() {
        luckyCount = 1;

        while (luckyCount <= COUNT_SET_SIZE) {
            lucky = (int) (1 + Math.random() * ((range - 1) + 1));
//            lucky = generateIntRandomInterval(1, range);
            switch (luckyCount) {
                case 1:
                    winnerNumbers[0] = lucky;
                    luckyCount++;
                    break;
                case 2:
                    if (winnerNumbers[0] != lucky) {
                        winnerNumbers[1] = lucky;
                        luckyCount++;
                    }
                    break;
                case 3:
                    if (winnerNumbers[0] != lucky && winnerNumbers[1] != lucky) {
                        winnerNumbers[2] = lucky;
                        luckyCount++;
                    }
                    break;
                case 4:
                    if (winnerNumbers[0] != lucky && winnerNumbers[1] != lucky && winnerNumbers[2] != lucky) {
                        winnerNumbers[3] = lucky;
                        luckyCount++;
                    }
                    break;
                case 5:
                    if (winnerNumbers[0] != lucky && winnerNumbers[1] != lucky && winnerNumbers[2] != lucky && winnerNumbers[3] != lucky) {
                        winnerNumbers[4] = lucky;
                        luckyCount++;
                    }
            }
        }
    }

    public int[] getWinnerNumbers() {
        return winnerNumbers;
    }
}
