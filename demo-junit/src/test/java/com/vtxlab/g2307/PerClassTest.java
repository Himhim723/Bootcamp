package com.vtxlab.g2307;

import java.time.Duration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance(value = Lifecycle.PER_CLASS)
// @TestMethodOrder

// Job Title: [Scrum Maste(PM/BA)]
// Project 運作模式 (Senior 先要學)
// pmp (project management professional)
// agile

//Scope timeLine resources

// How to manage project
// system integrated test (sit)
// uat 
// feature (for developer to code)
// simulation 


public class PerClassTest {

  @Test
  void test1(){
    Assertions.assertEquals(35,App.add(33, 2));
  }
  @Test
  void test2(){
    Assertions.assertThrows(ArithmeticException.class,()-> App.add(2, 1));
    Assertions.assertTimeout(Duration.ofMinutes(1), ()-> Thread.sleep(1000), ()-> "Timeout");
  }

}
