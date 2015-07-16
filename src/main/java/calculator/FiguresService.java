package calculator;

import org.springframework.stereotype.Service;

@Service(FiguresService.NAME)
public class FiguresService {

    public static final String NAME = "FiguresService";

    public int sum(int firstNumber, int secondNumber) {

        return firstNumber + secondNumber;
    }

    public int difference(int firstNumber, int secondNumber) {
        if (firstNumber > secondNumber) {
            return firstNumber - secondNumber;
        } else {
            return secondNumber - firstNumber;
        }
    }

    public int multiply(int firstNumber, int seocndNumber) {

        return firstNumber * seocndNumber;

    }

}
