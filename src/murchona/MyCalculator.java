package murchona;

class MyCalculator implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum=0,i=0;
        for(i=1;i<=n;i++){
            if(n%i==0) sum = sum+i;
        }
        return sum;
    }

    public int findFactorial(int n)
    {
        if ((n==0)||(n==1))
            return 1;
        else
            return n*findFactorial(n-1);
    }
}