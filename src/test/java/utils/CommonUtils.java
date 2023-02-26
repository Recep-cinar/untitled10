package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonUtils {
    public static String GetUrl(String PropFileName)throws IOException {
        Properties LoginProp=new Properties();
        FileInputStream in=new FileInputStream(PropFileName);
        LoginProp.load(in);
        return LoginProp.getProperty("url");
    }

    public static void GetScreenshot(WebDriver driver,String FileName){
        File ScreenshotFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String directoryName="src/test/resources/Screenshots/";
        String fileName=directoryName+FileName+","+System.currentTimeMillis()+".png";
        try {
            FileUtils.copyFile(ScreenshotFile,new File(fileName));
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
