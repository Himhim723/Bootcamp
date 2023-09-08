package com.vtxlab.g2307;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor

public class Checkout {
//Dependency injection 向外移 ?
  @NonNull
  private Calculator calculator ;


  public int add(int x, int y){
    if (x>1) return x + this.calculator.substract(x,y);
    return x + y;
  }
  public String print(){
    StringBuilder a = new StringBuilder();
    for(int i=0;i<10;i++){
      a.append(Checkout.addChar());
    }
    return a.toString();
  }
  public static String addChar(){
    return "k";
  }

  public int multiply(int x, int y){
    if(x>1) return y+this.calculator.multiply(x, y);
    return x*y;
  }

  public static void main(String[] args) {
    
    int[] nums = new int[]{64,65,64,65,64,65,66,65,66,65};
    
    int alt = 1;
        int altMax = 0;
        int count = 1;
        int start = 0;
        while(start<nums.length-1){
        for(int i=start;i<nums.length-1;i++){
            if(count%2==1 && nums[i+1]-nums[i]==1){
                alt++;
                count++;
                System.out.println(start + "  odd count "+i+"alt = "+ alt);
            } else if(count%2==0 && nums[i+1]-nums[i]==-1){
                alt++;
                count++;
                System.out.println(start + "  alt = "+ alt);
            } else{
                if(altMax < alt){
                    altMax = alt;
                }
                    alt = 1;
                    count = 1;
            }
        }
        if(altMax < alt)
        altMax = alt;
        alt=1;
        count =1;
        start++;
        }
      System.out.println(altMax);
  }

}
