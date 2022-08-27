class Solution {
    public double myPow(double x, int n) {
        
    //Fuddu Code using Math Function:
        // double res =  Math.pow(x,n);
        // return res;
        
        //Recursion1
        //: This code runs for TC: o(n)
        //Below the solution divides the problem into subproblems
        // of size y/2 and call the subproblems recursively.
        
        //BaseCase
        // if(n == 0) {return 1;}
        // else if(n % 2 == 0){
        //     return myPow(x, n/2) * myPow(x, n/2);
        // }else{
        //     return x * myPow(x, n/2) * myPow(x, n/2);
        // }
        
        //Algorithmic Paradigm: Divide and conquer.
// Above function can be optimized to O(logn) by calculating power(x, y/2) only once and storing it. 
        
            
        if(n==0){return 1;}
        
        double temp = myPow(x, n/2);
        
        if(n % 2 == 0){
            return temp * temp;
        }
        else{
            
            if(n > 0)
            return x * temp * temp;
            else
                return (temp*temp) / x;
        }
    }
}