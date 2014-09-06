package assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class PartATestTest
{

  @Test
  public void testIsMultiple()
  {
    assertEquals(true,assignment.PartA.isMultiple(2,6));
  }

  @Test
  public void testIsOdd()
  {
    assertEquals(true,assignment.PartA.isOdd(1));
  }

  @Test
  public void testOddSumTo()
  {
    assertEquals(4,assignment.PartA.oddSumTo(5));
  }

  @Test
  public void testIsOddProd()
  {
    int[] testArray = {3,1};
    assertEquals(true,assignment.PartA.isOddProd(testArray));
  }

  @Test
  public void testAllDistinct()
  {
    int[] testArray = {3,1};
    assertEquals(true,assignment.PartA.allDistinct(testArray));
  }

  @Test
  public void testReverseInts()
  {
    int[] testArray = {1,2,3};
    int[] testArrayReversed = {3,2,1};
    assertArrayEquals(testArrayReversed,assignment.PartA.reverseInts(testArray));
  }
}
