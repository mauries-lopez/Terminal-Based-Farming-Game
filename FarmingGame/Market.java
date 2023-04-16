import java.util.List;
import java.util.Scanner;

public class Market {

    Scanner input = new Scanner(System.in);
    String plantName;
    int plantPrice;

    public Crop buySeed() 
    {   
        System.out.println("Which seed do you want to buy?");
        System.out.println("[0] Turnip");

        int choice = input.nextInt();

       switch(choice)
       {

            case 0:
                plantPrice = 5;

                if ( Player.objectCoin < plantPrice )
                {
                    System.out.println("[You don't have enough object coin to buy Turnip seed] - [Turnip = 5 object coin]");
                }
                else
                {
                    plantName = "Turnip";
                    Player.objectCoin -= plantPrice;
                    System.out.println("[You have bought a Turnip seed.]");
                    return new Crop("Turnip", 1, 2, 0, 1, 2, 0);
                }
            break;

        }
        return null;
    }

    public void sellCrop(List<Crop> seedHarvested)
    {
        System.out.println("Which crop do you want to sell?");
        
        int i;

        for ( i = 0; i < seedHarvested.size(); i++ )
        {
            System.out.println("[" + i + "] " + seedHarvested.get(i));
        }

        int choice = input.nextInt();

        switch(choice)
        {
            case 0:

                if ( seedHarvested.get(0).isHarvested() == true )
                {
                    Player.objectCoin = Player.objectCoin + 6;
                    Player.playerXP = Player.playerXP + 5;
                    seedHarvested.remove(seedHarvested.get(0));
                    System.out.println("[You have sold a Turnip.]");
                }
                else
                {
                    System.out.println("[You haven't harvested your Turnip yet.]");
                }

            break;
        }
    }
    

}
