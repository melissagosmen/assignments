import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

public class TestUtil {
  Util c;

  @Before
  public void setUp() { c = new Util(); }

  @Test
  public void example() { assertTrue(true); }

  @Test
  public void testComputeLengthOne() {
    Util u = new Util();
    assertFalse(u.compute(new int[1]));
  }
  @Test
  public void testComputeLengthDivisibleTwo() {
    Util u = new Util();
    assertFalse(u.compute(new int[2]));
  }
  @Test (expected = RuntimeException.class)
  public void testRunTime() throws Exception {
    Util u = new Util();
    int[]arr = {0 , 0 , 0 , 0 , 0 };
    u.compute(arr);
  }
  @Test
  public void testSumDivisibleFalse() throws Exception {
    Util u = new Util();
    int[]arr = {4 , 8 , 5 , 5 , 5};
    assertFalse(u.compute(arr));
  }
  @Test
  public void testSumDivisibleTrue() throws Exception {
    Util u = new Util();
    int[]arr = {2 , 4 , 6 , 8 , 10};
    assertTrue(u.compute(arr));
  }
}
