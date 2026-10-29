public class Lasagna {
    private static final int TIME_TO_COOK = 40, TIME_PER_LAYER = 2;
    public int expectedMinutesInOven() {
        return TIME_TO_COOK;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        return this.expectedMinutesInOven() - minutesInOven; 
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return this.preparationTimeInMinutes(layers) + minutesInOven;
    }
}
