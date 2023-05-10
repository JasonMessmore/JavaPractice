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