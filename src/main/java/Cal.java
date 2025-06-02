public class Cal {
    int getSumSum(int a,int b, int c) {
        return a + b + c;
    }

    public int getSum(int a, int b) {
        //precondition
        if (a < 0) return -1;
        if (b < 0) return -1;

        return a + b;
    }
  
    int getMinus(int a, int b) {
        return a - b;
    }
}
