package test.java.yaksha;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.java.entity.Hosteller;

import main.java.yaksha.Main;

class MainTest {

	@Test
	void testGetHostellerDetails() {
		Hosteller h=Main.getHostellerDetails();  
	 
		assertTrue(true, h instanceof Hosteller);
				TestUtils.yakshaAssert(TestUtils.currentTest(),v.issueLoan()==150000.0==true?"true":"false",TestUtils.businessTestFile);

			}
	}

}
