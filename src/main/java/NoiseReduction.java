/**
 * Created by rodsouza9 on 10/15/2016.
 */
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.ArrayList;
import javax.imageio.*;
public class NoiseReduction {
    static void noiseReduction(String name, int border) throws IOException {
        File image = new File(name);
        int width = (border * 2) + 1;
        ArrayList<Color> pixArr = new ArrayList<Color>(width * width);
        BufferedImage img = ImageIO.read(image);
        for (int i = 0; i < img.getWidth(); i++) {
            for (int j = 0; j < img.getHeight(); j++) {

            }
        }
    }
    public static void main(String[] args) {
    }
}