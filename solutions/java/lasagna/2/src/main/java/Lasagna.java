public class Lasagna {
    private static final int TIME_TO_COOK = 40, TIME_PER_LAYER = 2;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        return TIME_TO_COOK;
    }

    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int minutesInOven) {
        return 40 - minutesInOven; 
    }

    // TODO: define the 'preparationTimeInMinutes()' method

    public int preparationTimeInMinutes(int layers) {
        return layers * TIME_PER_LAYER;
    }

    // TODO: define the 'totalTimeInMinutes()' method

    public int totalTimeInMinutes(int layers, int minutesInOven) {
        return this.preparationTimeInMinutes(layers) + minutesInOven;
    }
}
