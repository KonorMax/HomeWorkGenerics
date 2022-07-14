
package HomeWorkGenerics;

     /*Создать программу, используя обобщённые типы и метасимвольные переменные
     по вычислению результат деления произведения элементов числовых (Integer, Double типов) массивов  на количество
     элементов, добавить логику по проверке одинаково ли это значение у различных массивов.
     Продемонстрировать работу в демо классе
      */

public class MyGenEx<T extends Number> {
    T[] arrays;

    public MyGenEx(T[] arrays) {
        this.arrays = arrays;
    }

    double meanValue() {
        double sum = 0.0;
        for (int i = 0; i < arrays.length; i++)
            sum += arrays[i].doubleValue();
        return sum / arrays.length;
    }

    boolean sameValue(MyGenEx<?> ob) {
        if (meanValue() == ob.meanValue())
            return true;

        return false;
    }

}

class MyGenExDemo {
    public static void main(String[] args) {
        Integer iarrays[] = {5, 8, 3, 6, 4, 4};
        MyGenEx<Integer> iOb = new MyGenEx<>(iarrays);
        double v = iOb.meanValue();
        System.out.println("Mean value of iOb = " + v);


        Double darrays[] = {5.3, 8.4, 3.2, 6.4, 4.6};
        MyGenEx<Double> dOb = new MyGenEx<>(darrays);
        double d = dOb.meanValue();
        System.out.println("Mean value of dOb = " + d);

        System.out.print("Mean value of iOb and dOb: ");
        if (iOb.sameValue(dOb))
            System.out.println("are same");
        else
            System.out.println("are not same");
    }
}

