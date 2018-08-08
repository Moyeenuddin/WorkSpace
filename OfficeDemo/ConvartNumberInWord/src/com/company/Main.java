package com.company;

public class Main {

    public static void main(String[] args) {
        int number;
        number = 1234;
        int[] array = {};
        for (int i = 0; number > 0; i++) {
            array[i] = (number % 10);
            number = (number / 10);
        }
        for (int j = array.length; j > 0; j--) {
            System.out.println(array[j]);
        }
    }
}

////            v = int[i];
//
////            switch (v) {
////                case 9:
////                    array[i] = "nine";
////                    break;
////                case 8:
////                    array[i] = "eight";
////                    break;
////                case 7:
////                    array[i] = "seven";
////                    break;
////                case 6:
////                    array[i] = "six";
////                    break;
////                case 5:
////                    array[i] = "five";
////                    break;
////                case 4:
////                    array[i] = "four";
////                    break;
////                case 3:
////                    array[i] = "three";
////                    break;
////                case 2:
////                    array[i] = "two";
////                    break;
////                case 1:
////                    array[i] = "one";
////                    break;
////                default:
////                    array[i] = "";
////            }
//        }
//
////        for (int i = 5; i >0; i--) {
////            System.out.println(array[i]);
////        }
//
//    }
//}
