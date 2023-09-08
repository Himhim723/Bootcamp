package com.vtxlab.g2307;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

@TestInstance (value = Lifecycle.PER_CLASS)
@DisplayName("Assert Method Tests")
public class BeforeAfterTest {
  
  // private static int count =0;
  // private int x = 0;

  
  // @BeforeEach
  // void beforeEach(){
  //   //assertEquals(0,x);
  //   x+=5;
  // }

  // @AfterEach
  // void afterEach(){
  //   x+=4;
  // }

  // @Test
  // @DisplayName("Add1")
  // void testAdd(){
  //   System.out.println("Test 1 Started x = "+x);
  //   count++;
  //   assertEquals(8,App.add(x, 3));
  //   x+=3;
  //   System.out.println("TestAdd1 Start count = "+count);
  // }

  // @Test
  // void testAdd2(){
  //   System.out.println("Test 2 Started x =  "+x);
  //   count++;
  //   assertEquals(22,App.add(x, 5));
  //   x+=5;
  //   System.out.println("TestAdd2 Start count = "+count);
  // }

  
}
