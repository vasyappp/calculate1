import java.util.Scanner;

/**
 * Калькулятор
 * Осуществляет сложение, вычитание, умножение и деление двух дробных чисел
 *
 * @author Natalia Litvinova */

public class Calculate {
    /**
     * Сложение двух чисел
     *
     * @param firstValue Первое слагаемое
     * @param secondValue Второе слагаемое
     * @return Сумма двух чисел
     */
    private static float plus(float firstValue, float secondValue) {
        return firstValue + secondValue;
    }

    /**
     * Вычитание двух чисел
     *
     * @param firstValue Уменьшаемое
     * @param secondValue Вычитаемое
     * @return Разность двух чисел
     */
    private static float minus(float firstValue, float secondValue) {
        return firstValue - secondValue;
    }

    /**
     * Деление двух чисел
     *
     * @param firstValue Делимое
     * @param secondValue Делитель
     * @return Частное двух чисел
     */
    private static float del(float firstValue, float secondValue) {
        return firstValue / secondValue;
    }

    /**
     * Умножение двух чисел
     *
     * @param firstValue Множимое
     * @param secondValue Множитель
     * @return Произведение двух чисел
     */
    private static float umn(float firstValue, float secondValue) {
        return firstValue * secondValue;
    }

    public static void main(String[] args) {
        Scanner myValue = new Scanner(System.in);

        // Ввод чисел пользователем
        System.out.println("Enter the first value:");
        float firstValue = myValue.nextFloat();

        System.out.println("Enter the second value:");
        float secondValue = myValue.nextFloat();

        int flag = 1; // Флаг указывает, продолжать ли просматривать результат операций

        // Выбор операции до тех пор, пока пользователь не введет команду остановки
        while (flag == 1) {
            // Меню выбора операции
            System.out.println("What do you want to do?");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");

            int operation = myValue.nextInt();

            /* Проверяет, какая операция требуется пользователю.
            В зависимости от операции, вызывает нужный метод */
            switch (operation) {
                case 1:
                    System.out.printf("%.4f + %.4f = %.4f\n", firstValue, secondValue, plus(firstValue, secondValue));
                    break;
                case 2:
                    System.out.printf("%.4f - %.4f = %.4f\n", firstValue, secondValue, minus(firstValue, secondValue));
                    break;
                case 3:
                    System.out.printf("%.4f * %.4f = %.4f\n", firstValue, secondValue, umn(firstValue, secondValue));
                    break;
                case 4:
                    System.out.printf("%.4f / %.4f = %.4f\n", firstValue, secondValue, del(firstValue, secondValue));
                    break;
                default: // Выводит сообщение об ошибке, если пользователь ввел неверную команду
                    System.err.println("Wrong command!"); // почему-то выводится позже следующего вывода?..
            }


            // Пользователь сообщает, хочет ли он посмотреть результат других операций (1 - да, 2 - нет)
            System.out.println("Would you like to check another operation? (1 - yes, 2 - no)");
            flag = myValue.nextInt();
        }
    }
}
