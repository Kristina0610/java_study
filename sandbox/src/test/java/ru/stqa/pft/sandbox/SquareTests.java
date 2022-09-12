package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Square;

import static ru.stqa.pft.sandbox.MyFirstProgram.area;

public class SquareTests {
  @Test
  public void testArea() {
    Square s = new Square(3);
    Assert.assertEquals(area(s), 9);
  }
}
