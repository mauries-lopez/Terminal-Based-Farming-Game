import java.util.Random;

public class Tile {

	private Crop plantedCrop = null;
	private boolean isPlowed;

	private int producedCrop;
	private int min;
	private int max;

	public Report plantSeed(Crop seed) {
		var success = false;
		Crop.setCropAge(0);

		if ( seed == null ) {
			return new Report(false, "Seed is null");
		}

		if ( plantedCrop != null ) {
			return new Report(false, "Crop already exists");
		}
		
		if ( isPlowed == false ) {
			return new Report(false, "Tile is unplowed");
		}
		
		if ( seed != null && plantedCrop == null && isPlowed == true ) {
			this.plantedCrop = seed;
			success = true;
		}

		return new Report(success, "Planted Successfully");
	}

	public Report plow() {

		isPlowed = false;

		if ( isPlowed == true ) {
			return new Report(false, "Tile is already plowed");
		}

		if ( plantedCrop != null ) {
			return new Report(false, "Tile has plant/s");
		}

		if ( isPlowed == false && plantedCrop == null ) {
			this.isPlowed = true;
			Player.playerXP += 0.5;
			return new Report(true, "Plowed Successfully");
		}

		return null;
	}

	public Report water() {

		if ( plantedCrop == null ){
			return new Report(false, "Missing Planted Crop");
		}

		else if ( plantedCrop != null ) {
			Player.playerXP += 0.5;
			plantedCrop.setWater(plantedCrop.getWater() + 1);

			if ( plantedCrop.getWater() > plantedCrop.getWaterLimit() ) {
				return new Report(false, "Water Limit Reached");
			}
		}

		
		return new Report(true, "Watered Successfully");
		
	}
	public Report fertilize() {

		if ( plantedCrop == null ){
			return new Report(false, "Missing Planted Crop");
		}

		else if ( plantedCrop != null ) {
			Player.playerXP += 4;
			plantedCrop.setFertilizer(plantedCrop.getFertilizer() + 1);

			if ( plantedCrop.getFertilizer() > plantedCrop.getFertilizerLimit() ) {
				return new Report(false, "Fertilizer Limit Reached");
			}
		}
		
		return new Report(true, "Fertilized Successfully");
	}
	public Report harvest() {

		if ( plantedCrop.getWater() < plantedCrop.getWaterNeeded() ){
			return new Report(false, "Crop not enough water");
		}

		if ( plantedCrop.getFertilizer() < plantedCrop.getFertilizerNeeded() ){
			return new Report(false, "Crop not enough fertilizer");
		}

		if ( plantedCrop.getCropAge() > plantedCrop.getHarvestDay() ){
			return new Report(false, "Crop too old and withered");
		}

		if ( plantedCrop.getCropAge() < plantedCrop.getHarvestDay() ){
			return new Report(false, "Crop too young");
		}
		
		if ( plantedCrop.getWater() >= plantedCrop.getWaterNeeded() && plantedCrop.getFertilizer() >= plantedCrop.getFertilizerNeeded() && plantedCrop.getCropAge() == plantedCrop.getCropAge() ) {
			plantedCrop.setHarvested(true);
			isPlowed = false;
			plantedCrop = null;
			min = 1;
			max = 2;
			producedCrop = (int)Math.floor(Math.random()*(max-min+1)+min);
			return new Report(true, "Crop harvested - " + producedCrop + " product/s produced");
		}
		
		return new Report(true, "Crop harvested");
	}

	public Crop getPlantedCrop() { 
		return plantedCrop; 
	}

	public boolean getIsPlowed() {
		return isPlowed;
	}

	@Override
	public String toString() { 
		return "[" + plantedCrop + "]"; 
	}
}
