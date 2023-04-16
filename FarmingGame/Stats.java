// DO NOT EDIT	
public class Stats { // DO NOT EDIT

	private static int gameDay = 1;
	private int timesPlanted = 0; // DO NOT EDIT
	private int timesPlowed = 0; // DO NOT EDIT
	private int timesWatered = 0; // DO NOT EDIT
	private int timesFertilized = 0; // DO NOT EDIT
	private int timesHarvested = 0; // DO NOT EDIT
	private int timesHarvestedSuccessfully = 0; // DO NOT EDIT
	
	/* Convenience methods for value++ */

	public static int addGameDay(){
		return ++gameDay;
	}
	public int addTimesPlowed() { // DO NOT EDIT
		return ++timesPlowed; // DO NOT EDIT
	}
	public int addTimesWatered() { // DO NOT EDIT
		return ++timesWatered; // DO NOT EDIT
	}
	public int addTimesFertilized() { // DO NOT EDIT
		return ++timesFertilized; // DO NOT EDIT
	}
	public int addTimesPlanted() { // DO NOT EDIT
		return ++timesPlanted; // DO NOT EDIT
	}
	public int addTimesHarvested() { // DO NOT EDIT
		return ++timesHarvested; // DO NOT EDIT
	}
	public int addTimesHarvestedSuccessfully() { // DO NOT EDIT
		return ++timesHarvestedSuccessfully; // DO NOT EDIT
	}

	public int getGameDay() {
		return gameDay;
	}
	public void setGameDay(int gameDay) {this.gameDay = gameDay;
	}
	
	public int getTimesPlowed() { // DO NOT EDIT
		return timesPlowed; // DO NOT EDIT
	}
	public void setTimesPlowed(int timesPlowed) { // DO NOT EDIT
		this.timesPlowed = timesPlowed; // DO NOT EDIT
	}
	
	public int getTimesWatered() { // DO NOT EDIT
		return timesWatered; // DO NOT EDIT
	}
	public void setTimesWatered(int timesWatered) { // DO NOT EDIT
		this.timesWatered = timesWatered; // DO NOT EDIT
	}
	
	public int getTimesFertilized() { // DO NOT EDIT
		return timesFertilized; // DO NOT EDIT
	}
	public void setTimesFertilized(int timesFertilized) { // DO NOT EDIT
		this.timesFertilized = timesFertilized; // DO NOT EDIT
	}
	
	public int getTimesPlanted() { // DO NOT EDIT
		return timesPlanted; // DO NOT EDIT
	}
	public void setTimesPlanted(int timesPlanted) { // DO NOT EDIT
		this.timesPlanted = timesPlanted; // DO NOT EDIT
	}
	
	public int getTimesHarvested() { // DO NOT EDIT
		return timesHarvested; // DO NOT EDIT
	}
	public void setTimesHarvested(int timesHarvested) { // DO NOT EDIT
		this.timesHarvested = timesHarvested; // DO NOT EDIT
	}
	
	public int getTimesHarvestedSuccessfully() { // DO NOT EDIT
		return timesHarvestedSuccessfully; // DO NOT EDIT
	}
	public void setTimesHarvestedSuccessfully(int timesHarvestedSuccessfully) { // DO NOT EDIT
		this.timesHarvestedSuccessfully = timesHarvestedSuccessfully; // DO NOT EDIT
	}
	
	@Override
	public String toString() { // YOU COULD EDIT
		return "[Game Day: "  + gameDay + " | Times Planted: " + timesPlanted + " | Times Plowed: " + timesPlowed + " | Times Watered: " + timesWatered
				+ " | Times Fertilized: " + timesFertilized + " | Times Harvested: " + timesHarvested
				+ " | Times Harvested Successfully: " + timesHarvestedSuccessfully + "]"; // YOU COULD EDIT
	}
}
