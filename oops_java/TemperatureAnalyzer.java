
class TemperatureAnalyzer {

    TemperatureAnalyzer(float[] p) {
        this.temps = p;
    }
    float[] temps = new float[7];

    float computeAverage(float[] p) {
        float average = 0;
        for (float temps : p) {
            average += temps;
        }
        return average / 7;
    }

    float findHighest(float[] p) {
        float highest = 0;
        for (float temps : p) {
            if (temps > highest) {
                highest = temps;
            }
        }
        return highest;
    }

    float findLowest(float[] p) {
        float lowest = 100;
        for (float temps : p) {
            if (temps < lowest) {
                lowest = temps;
            }
        }
        return lowest;
    }
}
