class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int summy = 0;
        while (input > 0){
            summy = summy + input;
            input = input - 1;
        }
        return summy * summy;
    }

    int computeSumOfSquaresTo(int input) {
        int sep = 0;
        while (input > 0) {
            sep = sep + input * input;
            input = input - 1;
        }
        return sep;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

}

//public class EvenDigitSum {
//    public static int getEvenDigitSum(int number) {
//        int total = 0;
//        if (number < 0) {
//            return -1;
//        }
//        while (number >= 2){
//            if (number % 2 == 0){
//                total = total + (number % 10);
//            }
//            number = number / 10;
//        }
//        return total;
//    }
//}
//public class SharedDigit {
//    public static boolean hasSharedDigit(int num1, int num2){
//        int num1Dig1 = 0;
//        int num1Dig2 = 0;
//        int num2Dig1 = 0;
//        int num2Dig2 = 0;
//        if (num1 < 10 || num2 < 10 || num1 > 99 || num2 > 99){
//            return false;
//        }
//        num1Dig1 = num1 % 10;
//        num1Dig2 = num1 / 10;
//        num2Dig1 = num2 % 10;
//        num2Dig2 = num2 / 10;
//        if (num1Dig1 == num2Dig1 || num1Dig1 == num2Dig2 || num1Dig2 == num2Dig1 || num1Dig2 == num2Dig2){
//            return true;
//        } return false;
//    }
//}