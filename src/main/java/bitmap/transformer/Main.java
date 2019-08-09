package bitmap.transformer;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Bitmap coffee = new Bitmap("Coffee", "CopyCoffee");
    coffee.convertBW();
  }
}
