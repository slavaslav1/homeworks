package homework2.Задание.ДзНаООП;

public class Calculator {
    /* Метод который в зависимости от того какой CalculatorOperationEnum пришел вызывает нужный метод в классе.
        В самом начале метода вызовете метод validate и убедитесь что вам приходят корректные числа, если они не валидны сообщите об этому в sout и сделайте returb
        (для этого класса - это проверка что на 0 делить нельзя, для класса наследника - что числа приходят больше 0)
     */

    public void operationHandler (int a, int b, CalculatorOperationEnum type) {
        boolean valid = isValid(a, b, type);
    }

    public void plus () {
        int result = CalculateUtils.plus(1 , 3);
        System.out.println(formatResponse(result));
    }

    private void minus () {

    }

    private void divide () {

    }

    private void multiply () {

    }

    private boolean isValid (int a, int b, CalculatorOperationEnum type) {
        return true;
    }
    private String formatResponse (Number result) {
        return String.format("В результате операции вышло значение: %s", result.toString());
    }


}
