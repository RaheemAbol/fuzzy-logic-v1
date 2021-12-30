import com.fuzzylite.*;

public class Example {

    public static void main(String[] args){
        Engine engine = new FllImporter().fromFile("ObstacleAvoidance.fll");

        StringBuilder status = new StringBuilder();
        if (! engine.isReady(status))
            throw new RuntimeException("[engine error] engine is not ready:n" + status);

        InputVariable obstacle = engine.getInputVariable("obstacle");
        OutputVariable steer = engine.getOutputVariable("mSteer");

        for (int i = 0; i <= 50; ++i){
            double location = obstacle.getMinimum() + i * (obstacle.range() / 50);
            obstacle.setValue(location);
            engine.process();
            FuzzyLite.logger().info(String.format(
                    "obstacle.input = %s -> steer.output = %s",
                    Op.str(location), Op.str(steer.getValue())));
        }
    }
}