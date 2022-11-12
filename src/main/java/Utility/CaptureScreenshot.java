package Utility;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.TestBase;

public class CaptureScreenshot extends TestBase {
	
	public static void Screenshot(String name) throws Exception
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\hp\\eclipse-workspace\\Frame25June\\Screenshot\\"+name+".jpeg");
		FileHandler.copy(src, dest);
	}


	

	
		
		
	

}
