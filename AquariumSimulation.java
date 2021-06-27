import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class implements an aquarium simulation.
 *
 * @author Liu Tianyi
 */ 

class AquariumSimulation extends Simulation {
  /** 
   * The aquarium we are simulating. 
   */
  private Aquarium aquarium;
  private ArrayList<? extends LivingObject> livingObjects;

  /** 
   * The list of customer arrival events to populate
   * the simulation with.
   */
  private ArrayList<? extends Event> initEvents;

  /** 
   * Constructor for a shop simulation. 
   *
   * @param sc A scanner to read the parameters from.  The first
   *           integer scanned is the number of customers; followed
   *           by the number of service counters.  Next is a 
   *           sequence of (arrival time, service time) pair, each
   *           pair represents a customer.
   */
  public AquariumSimulation(Scanner sc) {
    this.livingObjects = new ArrayList<>();
    this.initEvents = new ArrayList<>();
    this.initEvents.addAll(aquarium.start());

    for (LivingObject o : livingObjects) {
      this.initEvents.addAll(o.start());
    }
  }

  /**
   * Retrieve an array of events to populate the 
   * simulator with.
   *
   * @return An array of events for the simulator.
   */
  @Override
  public ArrayList<? extends Event> getInitialEvents() {
    return this.initEvents;
  }
}
