import java.util.*;
import java.awt.*;

public class TurtleTest2 {
  public static void main(String[] args) {
      // Don't edit the habitat or turtle declarations:
      World habitat = new World(300,300);
      Turtle yertle = new Turtle(habitat);

      // Edit these directions:
      yertle.forward();
      yertle.forward(); // Go forward twice
      yertle.turnRight(); // Turn right

      // Don't edit the below:
      habitat.show(true);
  }
}

