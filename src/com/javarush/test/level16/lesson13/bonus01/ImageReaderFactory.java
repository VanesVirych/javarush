package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by vanes on 15.10.16.
 */
public class ImageReaderFactory
{
    public static ImageReader getReader(ImageTypes imageTypes) {
        if (imageTypes == ImageTypes.BMP)
            return new BmpReader();
        else if (imageTypes == ImageTypes.PNG)
            return new PngReader();
        else if (imageTypes == ImageTypes.JPG)
            return new JpgReader();
        else
            throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
