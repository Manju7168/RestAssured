

import org.junit.Test;
import org.junit.runner.RunWith;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;

@RunWith(SerenityRunner.class)
public class TestingClass {
	
	@Title("Trigger Jenkins new Build")
	@Test
	public void testCases() {
		//HashMap<String, String> param = new  HashMap<>();
		//param.put("delay","0sec");
		//bm.reportCheck("India",param,"manju");
String a = SerenityRest.rest().given().baseUri("http://localhost:8080").queryParam("name", "gfutiyo").queryParam("mode", "hudson.model.FreeStyleProject").authentication().preemptive().basic("Manju_Harakatti", "11729cd24eb45b2a0a610fb95d9e325cb8").log().all().when().post("/view/all/createItem").headers().toString();
//String b = SerenityRest.rest().given().baseUri("http://localhost:8080").queryParam("delay", "0sec").authentication().preemptive().basic("Manju_Harakatti", "1160bf8395c499d561d933fa0ea73ecdc8").log().all().when().post("job/newProj/build").headers().toString();
//Assert.assertTrue(true);
    System.out.println("%%%%%%%%%%%%%%%%%%%%\n"+a);
//Assert.assertTrue(a);
	}

}
