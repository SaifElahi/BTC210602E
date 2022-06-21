package Home_Pack;

import org.testng.annotations.Test;

public class TestBrowser {
	
	@Test
	public void TestExecution() throws InterruptedException 
	{
		Home_Page_Class test = new Home_Page_Class();
		test.OpenBrowser();
		test.CloseBrowser();
		
	}

}
