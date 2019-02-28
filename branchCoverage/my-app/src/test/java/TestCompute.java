import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class TestCompute {
  Compute c;

  @Test
  public void example() {
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    assertTrue(true);
  }
  @Test
  public void testEqualsZero(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(c.mq.size()).thenReturn(0);
    assertEquals(-1,c.countNumberOfOccurrences(""));
  }
  @Test
  public void testNotEqualsZero(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    when(c.mq.size()).thenReturn(5);
    assertEquals(0,c.countNumberOfOccurrences(""));
  }
  @Test
  public void testContains(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String e = "5";
    when(c.mq.size()).thenReturn(5);
    when(c.mq.contains(e)).thenReturn(true);
    assertEquals(0, c.countNumberOfOccurrences(e));
  }
  @Test
  public void testgetAt(){
    MessageQueue mq = mock(MessageQueue.class);
    c = new Compute(mq);
    String e = "3";
    when(c.mq.size()).thenReturn(2);
    when(c.mq.contains(e)).thenReturn(true);
    when(c.mq.getAt(0)).thenReturn(e);
    when(c.mq.getAt(1)).thenReturn(e);
    assertEquals(2, c.countNumberOfOccurrences(e));
  }
}
