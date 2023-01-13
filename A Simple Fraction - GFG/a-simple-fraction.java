//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int numerator = Integer.parseInt(S[0]);
            int denominator = Integer.parseInt(S[1]);
            Solution ob = new Solution();
            String ans = ob.fractionToDecimal(numerator, denominator);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public String  fractionToDecimal(int numerator, int denominator)
    {
        // code here
        String str = "";
        HashMap<Integer, Integer> hm=new HashMap<>();
        boolean flag=false; 
        while(numerator>0){
            int res=numerator/denominator;
            str+=res;
            if(numerator % denominator==0){
                break;
            }
            if(!flag){
                str+='.';
                flag=true;
            }
            numerator = numerator % denominator;
            if(hm.containsKey(numerator*10)){
                int end=  hm.get(numerator*10);
                String left =str.substring(0,end);
                String right = str.substring(end, str.length());
                str = left+'('+right+')';
                break;
            }
            numerator = 10*numerator;
           hm.put(numerator, str.length());
        }
        return str;
    }
}