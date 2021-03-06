package task4;

public class HouseConstructionEstimationTest {

	    
	    HouseConstructionEstimation HCE = new HouseConstructionEstimation();
	    
	    @Test
	    public void testCalculation() {
			assertEquals(3000000, HCE.Calculation("Standard Materials", 2500, "Fully Automated Home"));
			assertEquals(3000000, HCE.Calculation("Standard Materials", 2500, "Not Fully Automated Home"));
			assertEquals(4500000, HCE.Calculation("High Standard Materials", 2500, "Not Fully Automated Home"));
			assertEquals(6250000, HCE.Calculation("High Standard Materials", 2500, "Fully Automated Home"));
			assertEquals(3750000, HCE.Calculation("Above Standard Materials", 2500, "Fully Automated Home"));
			assertEquals(3750000, HCE.Calculation("Above Standard Materials", 2500, "Not Fully Automated Home"));	
		}
	    
	}
