package week15d01;

import java.util.HashMap;
import java.util.Map;

public class Function {
    Map<Double,Double> coordinates = new HashMap<>();

    public Function(Map<Double, Double> coordinates) {
        this.coordinates = coordinates;
    }

    public Point getMaxCoodrinate(){
        Point result = null;
        for (Double coordinate : coordinates.keySet()) {
            if (result == null) {
                result = new Point(coordinate,coordinates.get(coordinate).doubleValue());
            }
            if (coordinates.get(coordinate).doubleValue() > result.getY()){
                result = new Point(coordinate,coordinates.get(coordinate).doubleValue());
            }
        }
        return result;
    }
}
