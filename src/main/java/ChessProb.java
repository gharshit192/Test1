
    class ChessProb {

        void RedPath(int a, int b, int[][]arr){
            System.out.println("Starting Point ("+a+","+b+")");
//make const for jump coordinates
            int initial = 1;
            int finalValue = 9;
            for (int i = initial; i <=finalValue ;) {
                for (int j = initial; j<=finalValue ;) {
                    if (a > i){
                        i++;
                    }
                    if (b > j ){
                        j++;
                    }
                    if (arr[j][i] == 1){
                        arr[j][i] = -1;
                        initial = j;
                        finalValue = i;
                    }

                }
            }

        }
        public static void main(String[] args) {
            int[][] arr = new int[10][10];
            System.out.println("Length = " + arr.length);
            arr[1][1] = 1;
            arr[8][9] = 1;
            arr[1][9] = 1;
            arr[4][1] = 1;
            arr[4][2] = 1;
            arr[4][8] = 1;
            arr[2][6] = 1;
            arr[5][6] = 1;
            arr[8][2] = 1;
            arr[5][9] = 1;
            arr[2][8] = 1;
            arr[1][2] = 9;
            for (int j = 1; j <=9; j++) {
            for (int i = 1; i <=9; i++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            ChessProb chess = new ChessProb();
            chess.RedPath(1,2,arr);
        }

    }

