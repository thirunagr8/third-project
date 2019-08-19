package hooks;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before 
	public void beforeScenario(Scenario sc)
	{
		 System.out.println(sc.getName());
	}
@After
public void AfterScenario(Scenario sc1)
{
	sc1.getStatus();
	sc1.isFailed();
}
}
