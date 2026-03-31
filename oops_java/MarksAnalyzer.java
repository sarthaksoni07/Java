class MarksAnalyzer{
    int total(int [] marks){
        int total = 0;
        for (int i : marks){
            total+=i;
        }
        return total;
    }
    int average(int[] marks){
        int total= 0;
        for (int i : marks){
            total+=i;
        }
         return total/5;
    }
    char getGrade(int[] marks){
        int total = 0;
        for (int i : marks){
            total+=i;
        }
        if(total>=90){
            return 'A';
        }
        else if(90>=total && total>80){
            return 'B';
        }
        else if(80>=total && total>70){
            return 'C';
        }
        else{
            return 'D';
        }
    }
}