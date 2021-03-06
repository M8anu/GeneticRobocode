package Robot;

import robocode.Robot;

public interface GeneticRobot {
    void run();

    Genes getCurrentGenes(String filename);

    void printGenes(String filename, Genes genes);

    double applyFitnessFunction(double lifeLeft, int victories, double timeSpent);
}
