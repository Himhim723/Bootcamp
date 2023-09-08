package com.vtxlab.g2307;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Calculator {
  private int weight;

  public int substract(int x,int y){
    return y-x;
  }

  public int multiply(int x, int y){
    return x*y;
  }
  
}
