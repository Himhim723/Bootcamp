package com.vtxlab.g2307;

import static org.mockito.Mockito.RETURNS_SMART_NULLS;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Answers;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import lombok.NonNull;


@ExtendWith(value = MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT)
public class CalculatorTest {

  @Mock 
  Calculator calculator;
  @InjectMocks
  Checkout checkout;
  
  
  
  // @Test
  // void testSubtract(){oo
  //   Assertions.assertEquals(5, calculator.substract(2,7));
  // }

  @Test
  void testAdd(){
    for(int i=3;i<=5;i++)
    when(calculator.substract(i, 4)).thenReturn(100);
    Checkout check = new Checkout(calculator);
    for(int i=3;i<=5;i++)
    Assertions.assertEquals(100+i, check.add(i, 4));
    Assertions.assertEquals(6, checkout.add(6, 4));

  }

  @Test
  void testPrint(){
    //when(checkout.addChar()).thenReturn("k");
    Checkout ad = new Checkout(calculator);
    Assertions.assertEquals("kkkkkkkkkk", checkout.print());
    //verify(checkout, never()).addChar();
  }

  @Test
  void testMultiply(){
    Assertions.assertEquals(3, checkout.multiply(2, 3));
  }
}
