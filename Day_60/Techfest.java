/*
A Techfest is underway, and each participant is given a ticket with a unique number. Organizers decide to award prize points to everyone who has a ticket ID between a and b (inclusive). The points given to a participant with ticket number x will be the sum of powers of the prime factors of x.

For instance, if points are to be awarded to a participant with ticket number 12, the amount of points given out will be equal to the sum of powers in the prime factorization of 12 (22 × 31), which will be 2 + 1 = 3.

Given a and b, determine the sum of all the points that will be awarded to the participants with ticket numbers between a and b (inclusive).

Example 1:

Input: 
a = 9
b = 12
Output: 
8
Explanation: 
For 9, prime factorization is:32 
So, sum of the powers of primes is: 2
For 10, prime factorization is : 21x51 
So, sum of the powers of primes is: 2
For 11, prime factorization is : 111 
So, sum of the powers of primes is: 1
For 12, prime factorization is : 22x 31 
So, sum of powers of primes is: 3
Therefore the total sum is 2+2+1+3=8.
Example 2:

Input: 
a = 24, b = 27
Output: 
11
Explanation: 
For 24, prime factorization is: 23x31 
So, sum of the powers of primes is: 4
For 25, prime factorization is : 52 
So, sum of the powers of primes is: 2
For 26, prime factorization is : 131x21 
So, sum of the powers of primes is: 2
For 27, prime factorization is : 33  
So, sum of powers of primes is: 3
Therefore the total sum is 4+2+2+3=11.
*/

//Code

class Solution {
    public static long sumOfPowers(long a, long b) {
        boolean[]Nprime=new boolean[(int)(b+1)];
        Nprime[0]=true;
        Nprime[1]=true;
        seive(Nprime);
        int cost=0;
        for(int i=(int)a;i<=(int)b;i++){
            if(Nprime[i]==false){
                cost++;
            }
            else{
                
            
            int take=(int)i;
            int fl=0;
            for(int j=2;j*j<=i;j++){
                if(take%j==0){
                    while(take%j==0){
                        cost=cost+1;
                        take=take/j;
                        fl++;
                    }
                }
            }
            if( take>=2){
                cost=cost+1;
            }
            }
            
        }
        
        return (long)cost;
    }
     public static void seive(boolean[]Nprime){
        int n = Nprime.length;
        for(int i=2;i<Math.sqrt(n);i++){
            for(int j=2*i;j<n;j=j+i){
                if(!Nprime[j]){
                    Nprime[j]=true;
                }
            }
        }
     }
}
        
