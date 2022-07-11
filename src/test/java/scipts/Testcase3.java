package scipts;

import java.io.IOException;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtowishlist;
import pomPages.CorejavaPage;
import pomPages.SkillraryLoginPage;

public class Testcase3 extends BaseClass{
	@Test
	public void tc3() throws IOException, InterruptedException {
		SkillraryLoginPage s=new SkillraryLoginPage(driver);
		s.serachtb(pdata.getPropertyfile("coursename"));
		s.serachbutton();
		
		CorejavaPage c=new CorejavaPage(driver);
		c.corejavacourse();
		
		Addtowishlist a=new Addtowishlist(driver);
		driverutilies.switchtoframe(driver);
		a.playbutton();
		Thread.sleep(8000);
		a.pausebutton();
		driverutilies.switchback(driver);
		a.addtowishlist();
		
		
	}

}
