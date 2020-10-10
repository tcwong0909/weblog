package org.example;

import com.plutext.merge.pptx.PresentationBuilder;
import com.plutext.merge.pptx.SlideRange;
import org.docx4j.openpackaging.packages.OpcPackage;
import org.docx4j.openpackaging.packages.PresentationMLPackage;

import java.io.File;
import java.io.FileOutputStream;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        PresentationBuilder builder = new PresentationBuilder();
        SlideRange slideRange = new SlideRange((PresentationMLPackage) OpcPackage.load(new File("")));
        builder.addSlideRange(slideRange);
        builder.getResult().save(new FileOutputStream(new File("")));
        System.out.println("Hello World!");
    }
}
