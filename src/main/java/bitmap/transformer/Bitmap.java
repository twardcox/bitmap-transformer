/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.file.Files;

public class Bitmap {

//    transform: object.method()
//    modify image
//        rotate, change color, change size
//    copy image
//    instance variables
    private String originalFileName;
    private String newFileName;

    public Bitmap(String originalFileName, String newFileName) {
        this.originalFileName = "./src/main/resources/"+ originalFileName + ".bmp";
        this.newFileName = "./src/main/resources/"+ newFileName + ".bmp";
    }

    public void copyfile(String src, String dest) throws IOException{
//        create copy of each image automagicaly
        File source = new File(src);
        File destination = new File(dest);
        Files.copy(source.toPath(), destination.toPath());
    }

//    public void modSpecificColorByPixel() throws IOException {
//////        modify new copy
////        copyfile(originalFileName, newFileName);
////        BufferedImage img = ImageIO.read(new File(newFileName));
////        int height = img.getHeight();
////        int width = img.getWidth();
////
////        System.out.println(height + " " + width + " " + img.getRGB(30, 30));
////
////        for (int h =1; h < height; h++){
////            for (int w = 1; w < width; w++){
////                int rgb = img.getRGB(w, h);
////                int red = (rgb >> 16) & 0x000000FF;
////                int green = (rgb >> 8) & 0x000000FF;
////                int blue = (rgb) & 0x000000FF;
////                System.out.println(rgb);
////            }
////        }
////
////    }


    public void convertBW(){
        try {
            File input = new File(originalFileName);
            BufferedImage image = ImageIO.read(input);

            BufferedImage result = new BufferedImage(image.getWidth(), image.getHeight(), BufferedImage.TYPE_BYTE_BINARY);

            Graphics2D graphic = result.createGraphics();
            graphic.drawImage(image, 0, 0, Color.WHITE, null);
            graphic.dispose();

            File output = new File(newFileName);
            ImageIO.write(result, "bmp", output);

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}