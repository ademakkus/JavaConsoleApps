public class Main {

    public static void main(String[] args) {




        int[][] dizi={

                {3,5,2353},
                {3,100,4},
                {1,2,3,4,5}

        };
        for (int row = 0; row <dizi.length ; row++) {
            for (int col = 0; col < dizi.length; col++) {
                System.out.print(dizi[row][col]+"\t");
            }
            System.out.println();
        }


    }
}
