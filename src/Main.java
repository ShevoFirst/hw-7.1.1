public class Main {
    public static void main(String[] args) {
        //Задание 1.
        int[] massInt = new int []{1,2,3};
        double[] massDouble = {1.57, 7.654, 9.986};
        String[] massChar = {"a","b","c"};
        //Задание 2.
        for (int i = 0; i < massInt.length; i++) {
            if (i == massInt.length-1) {
                System.out.print(massInt[i]);
            }else
                System.out.print(massInt[i]+", ");

        }
        System.out.println();
        for (int i = 0; i < massDouble.length; i++) {
            if (i == massDouble.length-1) {
                System.out.print(massDouble[i]);
            }else
                System.out.print(massDouble[i]+", ");
        }
        System.out.println();
        for (int i = 0; i < massChar.length; i++) {
            if (i == massChar.length-1) {
                System.out.print(massChar[i]);
            }else
                System.out.print(massChar[i]+", ");
        }
        System.out.println();
        System.out.println();
        //Задание 3.
        for (int i = massInt.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massInt[i]);
            }else
                System.out.print(massInt[i]+", ");

        }
        System.out.println();
        for (int i = massDouble.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massDouble[i]);
            }else
                System.out.print(massDouble[i]+", ");
        }
        System.out.println();
        for (int i = massChar.length-1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(massChar[i]);
            }else
                System.out.print(massChar[i]+", ");
        }
        System.out.println();
        System.out.println();
        //Задание 4.
        for (int i = 0; i < massInt.length; i++) {
            if (massInt[i]%2!=0) {
                massInt[i]++;

            }

            if (i == massInt.length - 1) {
                System.out.print(massInt[i]);
            } else
                System.out.print(massInt[i] + ", ");//
        }
    }
}