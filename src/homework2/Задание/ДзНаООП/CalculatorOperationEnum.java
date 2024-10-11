package homework2.Задание.ДзНаООП;

public enum CalculatorOperationEnum {

    PLUS("сложить"),
    MINUS("вычесть"),
    DIVIDE("разделить"),
    MULTIPLY("умножить"),
    STOP("стоп");
    private String value;

    public  static CalculatorOperationEnum fromValue (String value) {
        for (CalculatorOperationEnum operationEnum : values()) {
            if (operationEnum.value.equals(value)) {
                return operationEnum;
            }
        }
        double f = 1.5;
        String errorMessage = String.format("данная операция %s не предумсотрена нашей системой %d", value, 1);
        throw new IllegalArgumentException(errorMessage);
    }

    CalculatorOperationEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
