

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// You could import additional Classes

public class Application {
	
	// Input
	public static final Scanner input = new Scanner(System.in);

	// Global state
	public static final FarmLot farmLot = new FarmLot(); //NEWLY ADDED
	public static boolean isRunning = true;
	public static final Stats stats = new Stats();
	public static final Tile tile = new Tile();
	public static final Player player = new Player("Farmer", 100, 0,  0, 0, 0 ,0, 0);

	//Global Variable
	public static int gameDay = 1;
	public static Crop boughtSeed = null;
	
	public static final List<Crop> seedList = new ArrayList<Crop>(Arrays.asList());
	public static final List<Crop> seedHarvested = new ArrayList<Crop>(Arrays.asList());

	public static void main(String[] args) {

		while (isRunning) {
			printState();
			var cmd = player.userInput();
			player.checkLevelUp();
			performCommand(cmd);
			//checkConditions();
		}
		printFinalState();
		input.close();
	}
	
	public static void printState() {
		System.out.println("[Player] = " + player);
		System.out.println("[Current Plant] = "+ tile);
		System.out.println("[Game Progress] = "+ stats);
	}
	
	public static void performCommand(String cmd) {
		switch(cmd) 
		{
		case "S": // Planting seed

			System.out.println("\n[Choose the crop number to plant]");

			for (int i = 0; i < seedList.size(); i++) {
				System.out.println("[" + (i) + "] " + seedList.get(i).getName());
			}

			var index = input.nextInt();
			
			if ( tile.getIsPlowed() == false ) {
				System.out.println("[Tile is unplowed]");
			}
			else if ( tile.getPlantedCrop() != null ) {
				System.out.println("[Tile has plant]");
			}
			else if ( tile.getIsPlowed() == true && tile.getPlantedCrop() == null ) {
				boughtSeed = seedList.remove(index);
				tile.plantSeed(boughtSeed);
				stats.addTimesPlanted();
				System.out.println("[Planted Successfully]");
				farmLot.plantedTile();
			}
			
			break;
		case "P":
			var tilePlow = tile.plow();
			stats.addTimesPlowed();
			System.out.println(tilePlow);
			farmLot.plowedTile(); // NEWLY ADDED
			break;
		case "W":
			var tileReport = tile.water();
			stats.addTimesWatered();
			System.out.println(tileReport);
			break;
		case "F":
			var tileFertilize = tile.fertilize();
			stats.addTimesFertilized();
			System.out.println(tileFertilize);
			break;
		case "H":
			var tileHarvest = tile.harvest();
			seedHarvested.add(boughtSeed);
			stats.addTimesHarvested();
			stats.addTimesHarvestedSuccessfully();
			System.out.println(tileHarvest);
			farmLot.harvestTile(); // NEWLY ADDED
			break;

		case "M":
			Market market = new Market();
			System.out.println("[Market]");
			System.out.println("[0] Buy Seed");
			System.out.println("[1] Sell Crop");
			int choice = input.nextInt();
			switch(choice)
			{
				case 0:
					boughtSeed = market.buySeed();
					seedList.add(boughtSeed);
					break;
				case 1:
					market.sellCrop(seedHarvested);
					break;
			}
			break;	

		case "N":
			gameDay++;
			Crop.growCrop();
			Stats.addGameDay();
			farmLot.grownPlantTile();  //NEWLY ADDED
			break;
		case "Q":
			isRunning = false;
			System.out.println("Exiting the game");
			break;

		default:
			System.out.println("Unknown command: " + cmd);
		}
	}
	
	public static void checkConditions() {
		if ( seedList.isEmpty() == true && tile.getPlantedCrop() == null ){
			isRunning = false;
		}
	}
	
	public static void printFinalState() {
		System.out.println("[GAMEOVER]");
		System.out.println("[LATEST PLANTED PLANT]: " + tile);
		System.out.println("[OVERALL PROGRESS]: " + stats);
	}
}
