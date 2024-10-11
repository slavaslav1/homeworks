package homework2.Задание.ДзНаООП;



/* Реализовать методы класс Calculator , CalculatorUtils а также создать класс наследник класса Calculator - PositiveNumberCalculator
   который сможет работать только с числами больше 0

   В методе main запрашивать число a, число b, и операцию которую вы хотите с ними сделать,
   программа должна работать до тех пор, пока пользователь не введет ключевое слово "стоп"

   Типы операций вводимых пользователем нужно приводить к енаму CalculatorOperationEnum,
   а дальше передавать в метод класса Calculator operationHandler.
   (вся логика работы калькулятора происходит через метод handle)

   в методе мейн должна быть след логика -
   1. Сделать так, чтобы программа работала до ввода ключевого слова
   2. Запрашивать у пользователя число a, число b и операцию, которую нужно сделать с этими числами
   3. Считывать данные из пункта 2 через класс Scanner
   4. запускать передавать данные в метод operationHandler в классе Calculator

    если пользователь введет операцию которой не существует то произойдет исключение IllegalArgumentException, как его обработать смотрите ниже

*/

public class Main {

    Calculator calculator = new Calculator();
//    Calculator calculator = new PositiveNumberCalculator;

    public static void main(String[] args) {

        //пример как создать ЕNUM из строки
        String d = "разделить";
        CalculatorOperationEnum operationEnum = CalculatorOperationEnum.fromValue(d);



    }


    private void exeptionHandler () {
//        В блоке try мы пишем блок кода, где потенциально может возникнуть ошибка (Exception)

        try {
//            ПРИМЕР
//            :
//            в этой части все окей и для нас должено вывестись значение енама
            String d = "разделить";
            CalculatorOperationEnum operationEnum = CalculatorOperationEnum.fromValue(d);
            System.out.println(operationEnum);

/*            в этой части кода у нас возникает ошибка так как в енаме нету операции - ненавижу писать код, как только произойдет ошибка мы улетим в блок
                    catch и обработаем ее. текст с названием енама не вывыдется */

            String s = "ненавижу писать код";
            CalculatorOperationEnum operationEnum1 = CalculatorOperationEnum.fromValue(s);
            System.out.println(operationEnum1);

//            В блоке catch мы ее обрабатываем
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

