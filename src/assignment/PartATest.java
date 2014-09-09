package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment.PartA;

public class PartATest
{

  @Test
  public void testIsMultiple()
  {
    for(int i = 1; i < 9999999; i++)
      {
        assertEquals(true,assignment.PartA.isMultiple(1,i));
      }
  }

  @Test
  public void testIsOdd()
  {
    for(int i = 1; i < 9999999; i += 2)
      {
        assertEquals(true,assignment.PartA.isOdd(i));
      }
    
  }

  @Test
  public void testOddSumTo()
  {
    assertEquals(4,assignment.PartA.oddSumTo(5));
    assertEquals(4,assignment.PartA.oddSumTo(4));
    assertEquals(9,assignment.PartA.oddSumTo(6));
    assertEquals(100,assignment.PartA.oddSumTo(20));
  }

  @Test
  public void testIsOddProd()
  {
    int[] testArray = {3,1};
    int[] testArray2 = {3,5};
    int[] testArray3 = {5,7};
    int[] testArray4 = {25, 5}
    assertEquals(true,assignment.PartA.isOddProd(testArray));
    assertEquals(true,assignment.PartA.isOddProd(testArray2));
    assertEquals(true,assignment.PartA.isOddProd(testArray3));
    assertEquals(true,assignment.PartA.isOddProd(testArray4));
  }

  @Test
  public void testAllDistinct()
  {
    int[] testArray = {3,1};
    int[] testArray2 = {1,2,3,4,5,6};
    int[] testArray3 = {88, -93, 64, 2, 44};
    assertEquals(true,assignment.PartA.allDistinct(testArray));
    assertEquals(true,assignment.PartA.allDistinct(testArray2));
    assertEquals(true,assignment.PartA.allDistinct(testArray3));
  }

  @Test
  public void testReverseInts()
  {
    int[] testArray = {1,2,3};
    int[] testArrayReversed = {3,2,1};
    int[] testArray2 = {1,2,3,4,5};
    int[] testArrayReversed2 = {5,4,3,2,1};
    int[] testArray3 = {8,12,5,1,4,4,13,12};
    int[] testArrayReversed3 = {12,13,4,4,1,5,12,8};
    assertArrayEquals(testArrayReversed,assignment.PartA.reverseInts(testArray));
    assertArrayEquals(testArrayReversed2,assignment.PartA.reverseInts(testArray2));
    assertArrayEquals(testArrayReversed3,assignment.PartA.reverseInts(testArray3));
  }
}