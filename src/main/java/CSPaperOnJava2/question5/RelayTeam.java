package CSPaperOnJava2.question5;
import java.util.*;

public class RelayTeam implements Team{
    private final String mascot;
    private final Map<String, Double> runners;

    public RelayTeam(String mascot) {
        this.mascot = mascot;
        this.runners = new HashMap<>();
    }

    @Override
    public String getMascot() {
        return mascot;
    }

    @Override
    public void addRunner(String runner, double time) {
        if (runners.isEmpty()) {
            throw new IllegalStateException("No runners on the team");
        }
        if (time < 0) {
            throw new IllegalArgumentException("Time cannot be negative");
        }
        if (runners.containsKey(runner)) {
            throw new IllegalArgumentException("Runner is already on the team");
        }
        runners.put(runner, time);
    }

    @Override
    public void substituteRunner(String oldRunner, String newRunner, double newTime) {
        if (runners.isEmpty()) {
            throw new IllegalStateException("No runners on the team");
        }
        if (!runners.containsKey(oldRunner)) {
            throw new IllegalArgumentException("Old runner is not on the team");
        }
        if (runners.containsKey(newRunner)) {
            throw new IllegalArgumentException("New runner is already on the team");
        }
        if (newTime < 0) {
            throw new IllegalArgumentException("New time cannot be negative");
        }
        runners.remove(oldRunner);
        runners.put(newRunner, newTime);
    }

    // Returns the fastest runner
    @Override
    public String getFastestRunner() {
        if (runners.isEmpty()) {
            throw new IllegalStateException("No runners on the team");
        }
        String fastestRunner = null;
        double fastestTime = Double.MAX_VALUE;
        for (var entry : runners.entrySet()) {
            String runner = entry.getKey();
            double time = entry.getValue();

            if (time < fastestTime || (time == fastestTime && runner.compareTo(fastestRunner) < 0)) {
                fastestRunner = runner;
                fastestTime = time;
            }
        }
        return fastestRunner;
    }

    @Override
    public double getAverageTime() {
        if (runners.isEmpty()) {
            return 0.0;
        }

        double totalTime = 0.0;
        for (double time : runners.values()) {
            totalTime += time;
        }
        return totalTime / runners.size();
    }

    @Override
    public boolean hasFasterAverage(Team other) {
        if (other == null) {
            throw new IllegalArgumentException("Other team cannot be null");
        }
        return this.getAverageTime() < other.getAverageTime();
    }

    @Override
    public String toString() {
        return String.format("%s’s average time: %.1f s", mascot, getAverageTime());
    }
}
