/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package researchalgo;

import java.util.Scanner;

/**
 *
 * @author Gerges hanna FCI-H
 */
public class ReSearchAlgo {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        System.out.println("Please Enter the size of array");
        int n=scan.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("A["+i+"]= ");
            arr[i]=scan.nextInt();
        }
        System.out.println("please select the type of algorithm you need to use:\n1-bruteforce\n2-Moore Voting  ");
        int y=scan.nextInt();
        FindDominator f=new FindDominator();
        if(y==1)
        {
             System.out.println("the Dominator Elements: "+f.daimondElement(arr));
        }else if(y==2)
        {
             System.out.println("the Dominator Elements: "+f.secondSolution(arr));
        }else
        {
            System.out.println("Sorry, wrong input");
        }
        
    } 
}
