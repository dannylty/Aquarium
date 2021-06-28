public class AquariumRecurrentWaterTestEvent extends Event {
	private Aquarium aquarium;
	private ArrayList<LivingObjects> livingObjects;

	public AquariumRecurrentWaterTestEvent(Aquarium a, ArrayList<LivingObjects> l) {
		this.aquarium = a;
		this.livingObjects = l;
	}

	
}