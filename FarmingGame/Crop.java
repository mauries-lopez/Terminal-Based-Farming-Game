public class Crop { 

	private String seedname; // check
	
	private int water;  // check
	private int waterNeeded; // check
	
	private int fertilizer; // check
	private int fertilizerNeeded; //check

	private int waterLimit; //check

	private int fertilizerLimit; //check

	private int harvestDay; //check

	private static int cropAge = 0; //check

	private boolean isHarvested = false; //check
	
	public Crop(String name, int waterNeeded, int waterLimit, int fertilizerNeeded, int fertilizerLimit, int harvestDay, int cropAge) { 
		this.seedname = name;
		this.water = 0; 
		this.waterNeeded = waterNeeded; 
		this.fertilizer = 0; 
		this.fertilizerNeeded = fertilizerNeeded; 
		this.waterLimit = waterLimit;
		this.fertilizerLimit = fertilizerLimit;
		this.harvestDay = harvestDay;
		Crop.cropAge = cropAge;
	}

	public String getName() { 
		return seedname;
	}
	
	public void setName(String name) { 
		this.seedname = name;
	}

	public int getWater() { 
		return water; 
	}
	public void setWater(int water) { 
		this.water = water; 
	}

	public int getWaterNeeded() { 
		return waterNeeded; 
	}
	public void setWaterNeeded(int waterNeeded) { 
		this.waterNeeded = waterNeeded; 
	}

	public int getFertilizer() { 
		return fertilizer; 
	}
	public void setFertilizer(int fertilizer) { 
		this.fertilizer = fertilizer; 
	}

	public int getFertilizerNeeded() { 
		return fertilizerNeeded; 
	}
	public void setFertilizerNeeded(int fertilizerNeeded) { 
		this.fertilizerNeeded = fertilizerNeeded; 
	}

	public int getWaterLimit() {
		return waterLimit + Player.waterBonusLimit;
	}

	public int getFertilizerLimit() {
		return fertilizerLimit + Player.fertilizerBonusLimit;
	}

	public int getHarvestDay() {
		return harvestDay;
	}

	public int getCropAge() {
		return cropAge;
	}

	public static void setCropAge(int cropAge) {
		Crop.cropAge = cropAge;
	}

	public static void growCrop() {
		cropAge++;
	}

	public boolean isHarvested() {
		return isHarvested;
	}

	public void setHarvested(boolean isHarvested) {
		this.isHarvested = isHarvested;
	}

	@Override
	public String toString() {
		return seedname + " | Water: " + water + " | Water Needed: " + waterNeeded + " | Fertilizer: " + fertilizer + " | Fertilizer Needed: " + fertilizerNeeded + " | Crop Age: " + cropAge; // YOU COULD EDIT
	}
}
