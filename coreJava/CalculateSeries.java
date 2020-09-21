// 19.	Calculate  series : 12+22+32+42+.........+n2

class CalculateSeries{
    public static void main(String args[])
    {
        int n =12;
        int m=0;
        for(int i=1;i<=10;i++){
            
            int s = n* i-m;
            m=m+2;
            System.out.print(" "+s);
        }
    }
}