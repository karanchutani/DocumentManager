package com.assignment.InstaIndex.DTO;

import java.util.*;

public class CoinProblem {
    public static void main(String[] args) {
        int[] coins = {10,5,2,1};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount.");
        int amount = sc.nextInt();
        System.out.println(findMinimumReqCoins(amount, coins));
    }

    private static int findMinimumReqCoins(int amount, int[] coins) {
        final List<Integer> usedCoins = new ArrayList<>();
        for(int i = 0;i<coins.length;i++){
            int value = coins[i];
            while(amount>=value){
                amount = amount-value;
                usedCoins.add(value);
            }
            if(amount==0){
                break;
            }
        }

        System.out.println("Used Coins are : ");
        for(Integer data : usedCoins){
            System.out.print(data + "   ");
        }
        System.out.println();
        System.out.println("Total count of all Coins are : ");
        return usedCoins.size();
    }
}
