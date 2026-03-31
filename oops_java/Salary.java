class Salary {
    int [][] department = new int [3][];
    {// we need to use an initialization block to initialize an jagged array
    department[0]= new int [2];
    department[1]= new int [4];
    department[2]= new int [3];
    }

    void totx(int[][] department){
        for (int i = 0 ; i < 3 ; i++){
            int totalx= 0;
            for ( int j : department[i]){
                totalx+=j;
            }
            System.out.println("Department "+i+"'s expenses are = "+totalx);
        }
    }
    void highest(int[][]department){
        int highest = 0 ;
        int depn = 0;
        for (int i = 0 ; i < 3 ; i++){
            int totalx= 0;
            for ( int j : department[i]){
                totalx+=j;
            }
            if(highest<totalx){
                highest = totalx;
                depn = i;
            }
        }
        System.out.println("Department with highest expenses is "+depn);
    }
}