public class CoatExperimentSimulator {

    private int numberOfPeople;

    public CoatExperimentSimulator(int numPpl) {
        numberOfPeople = numPpl;
    }

    public int numPplWhoGotTheirCoat(int[] permutation) {
        int count = 0;
        for (int i = 0; i < permutation.length; i++) {
            if (permutation[i] == i + 1) { // person i+1 got coat i+1
                count++;
            }
        }
        return count;
    }

    public int[] simulateCoatExperiment(int iterations) {
        int[] results = new int[iterations];
        for (int i = 0; i < iterations; i++) {
            int[] randomOrder = RandomOrderGenerator.getRandomOrder(numberOfPeople);
            results[i] = numPplWhoGotTheirCoat(randomOrder);
        }
        return results;
    }

    public double answerToQuestionOne(int[] results) {
        int zeroCount = 0;
        for (int val : results) {
            if (val == 0) {
                zeroCount++;
            }
        }
        return (double) zeroCount / results.length;
    }

    public double answerToQuestionTwo(int[] results) {
        int total = 0;
        for (int val : results) {
            total += val;
        }
        return (double) total / results.length;
    }
}
