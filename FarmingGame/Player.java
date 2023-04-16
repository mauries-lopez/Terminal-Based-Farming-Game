import java.util.Scanner;

public class Player {

    Scanner input = new Scanner(System.in);

    public static int objectCoin = 100;
    public static double playerXP = 0;
    public static String playerType;
    public static int bonusProduced;
    public static int seedCostReduc;
    public static int waterBonusLimit;
    public static int fertilizerBonusLimit;
    public static int regFee;

    public Player( String playerType, int objectCoin, double playerXP, int bonusProduced, int seedCostReduc, int waterBonusLimit, int fertilizerBonusLimit, int regFee) {
        Player.objectCoin = objectCoin;
        Player.playerXP = playerXP;
        Player.playerType = playerType;
        Player.bonusProduced = bonusProduced;
        Player.seedCostReduc = seedCostReduc;
        Player.waterBonusLimit = waterBonusLimit;
        Player.fertilizerBonusLimit = fertilizerBonusLimit;
        Player.regFee = regFee;
    }

    public void checkLevelUp()
    {
        if ( Player.playerXP >= 5 && Player.playerXP < 10 )
        {
            Player.playerType = "Registered Farmer";
            Player.bonusProduced = 1;
            Player.seedCostReduc = 1;
            Player.waterBonusLimit = 0;
            Player.fertilizerBonusLimit = 0;
            Player.regFee = 200;
        }
        else if ( Player.playerXP >= 10 && Player.playerXP < 15 )
        {
            Player.playerType = "Distinction Farmer";
            Player.bonusProduced = 2;
            Player.seedCostReduc = 2;
            Player.waterBonusLimit = 1;
            Player.fertilizerBonusLimit = 0;
            Player.regFee = 300;
        }
        else if ( Player.playerXP >= 15)
        {
            Player.playerType = " Legendary Farmer";
            Player.bonusProduced = 4;
            Player.seedCostReduc = 3;
            Player.waterBonusLimit = 2;
            Player.fertilizerBonusLimit = 1;
            Player.regFee = 400;
        }

    }

    public String userInput() {
		System.out.println("(Player) [N]: Next Day -- [S]: Plant Seed -- [P]: Plow Tile -- [W]: Water Tile -- [F]: Fertilize Tile -- [H]: Harvest Tile -- [M] -- Open Market -- [Q]: Exit Game");
		return input.next();
	}

    public String toString() {
        return "[" + Player.playerType + " | Object Coin: " + Player.objectCoin + " | Player XP: " + Player.playerXP + "]";
    }

}
