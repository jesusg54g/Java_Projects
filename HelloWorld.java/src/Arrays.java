public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];

        String[][] cities = new String[4][2];


        int [][][] numbers = new int [2][2][2];
        int [][][][] numbers4 = new  int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Bannana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";
        /*
        for (int i = 0; i <= 3; i++) {
            System.out.println(androidVersions[i]);
        }

         */

        for (String androidVersion : androidVersions) {
            System.out.println(androidVersion);
        }

        System.out.println("");
        /*
        System.out.println(androidVersions[0]);
        System.out.println(androidVersions[1]);
        System.out.println(androidVersions[2]);
        System.out.println(androidVersions[3]);
         */

        cities[0][0] = "Colombia";
        cities[0][1] = "Medellin";
        cities[1][0] = "Colombia";
        cities[1][1] = "Bogota";
        cities[2][0] = "Mexico";
        cities[2][1] = "Guadalajara";
        cities[3][0] = "Mexico";
        cities[3][1] = "CDMX";

        /*
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
         }
         */

        for (String[] pair : cities) {
            for (String name : pair) {
                System.out.println(name);
            }
        }

        /*
        System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);

         */

        /** Para definir arreglos de mas de una dimension siempre se toma primero la
         *  dimension de la fila y luego de la columna, si el arreglo posee una
         *  estructura compuesta por otros arreglos definiremos de igual manera los
         *  arreglos internos siempre empezando por la fila.
         * */

        System.out.println("");
        String[][][][] chango = new String[2][3][2][2];
        chango[1][0][0][1] = "Changuito";

        System.out.println(chango[1][0][0][1]);
        System.out.println("");

        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 0; j++) {
                for (int k = 0; k <= 0; k++) {
                    for (int l = 0; l <= 1; l++) {
                        System.out.println(chango[i][j][k][l]);
                    }

                }

            }

        }

    }
}
