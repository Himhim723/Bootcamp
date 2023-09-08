package com.vtxlab.g2307;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

//import static org.junit.Assert.assertTrue;

// import org.junit.jupiter.api.Test;


/**
 * Unit test for simple App.
 */
@TestInstance (value = Lifecycle.PER_METHOD)
// if 有 instance variable
public class AsertTest 
{
    // /**
    //  * Rigorous Test :-)
    //  */
    // @Test
    // public void shouldAnswerWithTrue()
    // {
    //     //assertTrue( true );
    // }

    @Test
    void testAddMethod(){
        //Assertions.assertEquals(actual val, expected val);
        Assertions.assertEquals(13,App.add(5, 8));
        Assertions.assertEquals(3,App.add(1, 2));
        Assertions.assertEquals(11,App.add(9, 2));
    }

    @Test
    void testMinusMethod(){
        //Assertions.assertEquals(expected val, actual val);
        Assertions.assertEquals(-3,App.minus(5, 8));
        Assertions.assertEquals(-1,App.minus(1, 2));
        Assertions.assertEquals(7,App.minus(9, 2));
        
    }

    @Test
    void testMinExtraChar(){
        Assertions.assertEquals(3,App.minExtraChar("sayhelloworld", new String[]{"hello","world"}));
    }



}
