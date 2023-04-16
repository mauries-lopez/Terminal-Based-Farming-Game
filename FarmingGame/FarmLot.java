public class FarmLot {

    public void unplowedTile() {

        char[][] farmTile = new char[][]{{'+', '-', '-', '-', '-', '-', '+'},
                                         {'|', ' ', ' ', ' ', ' ', ' ', '|'},
                                         {'|', ' ', ' ', ' ', ' ', ' ', '|'},
                                         {'+', '-', '-', '-', '-', '-', '+'}};

        for (char[] row : farmTile) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
    public void plowedTile() {

        char[][] farmTile = new char[][]{{'+', '-', '-', '-', '-', '-', '+'},
                                         {'|', '=', '=', '=', '=', '=', '|'},
                                         {'|', '=', '=', '=', '=', '=', '|'},
                                         {'+', '-', '-', '-', '-', '-', '+'}};

        for (char[] row : farmTile) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void plantedTile() {

        char[][] farmTile = new char[][]{{'+', '-', '-', '-', '-', '-', '+'},
                                         {'|', 't', 't', 't', 't', 't', '|'},
                                         {'|', 't', 't', 't', 't', 't', '|'},
                                         {'+', '-', '-', '-', '-', '-', '+'}};

        for (char[] row : farmTile) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void grownPlantTile() {

        char[][] farmTile = new char[][]{{'+', '-', '-', '-', '-', '-', '+'},
                                         {'|', 'T', 'T', 'T', 'T', 'T', '|'},
                                         {'|', 'T', 'T', 'T', 'T', 'T', '|'},
                                         {'+', '-', '-', '-', '-', '-', '+'}};

        for (char[] row : farmTile) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public void harvestTile() {

        char[][] farmTile = new char[][]{{'+', '-', '-', '-', '-', '-', '+'},
                                         {'|', '$', '$', '$', '$', '$', '|'},
                                         {'|', '$', '$', '$', '$', '$', '|'},
                                         {'+', '-', '-', '-', '-', '-', '+'}};

        for (char[] row : farmTile) {
            for (char col : row) {
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
