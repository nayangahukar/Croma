package utility;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import testbase.WebTestBase;

import java.io.File;
import java.io.IOException;

public class ScreenShotUtility extends WebTestBase {

    public static void takeScreenShot(String fileName){

       // TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
      // File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
      //  File destination = new File(System.getProperty("C:\\Users\\nayan\\IdeaProjects\\CromaProject\\src\\test\\screenshots" + fileName + ".jpg"));
      //  System.out.println("ss captured");
      //  try {
     //       FileHandler.copy(source,destination);
     //   } catch (IOException e) {
     //       throw new RuntimeException(e);
     //   }

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("C:\\Users\\nayan\\IdeaProjects\\CromaProject\\src\\test\\screenshots\\" + fileName + ".jpg"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
