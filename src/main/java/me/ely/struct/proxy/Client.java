package me.ely.struct.proxy;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author <a href="mailto:xiaochunyong@gmail.com">Ely</a>
 * @see
 * @since 2020/3/21
 */
public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL imageUrl = new URL("http://image.jpg");
        HighResolutionImage highResolutionImage = new HighResolutionImage(imageUrl);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}
