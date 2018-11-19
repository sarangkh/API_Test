package validateapi;

import org.testng.annotations.Test;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class APITest {
	private JsonPath jsonPathEvaluator;
	
	String expectedName = "Carbon credits";
	boolean CanRelist  = true; 
//API connection details which will run before each test 
@BeforeTest
    public void connection()
    {
        RestAssured.baseURI = "https://api.tmsandbox.co.nz/v1/Categories/6327/Details.json?catalogue=false";
        RequestSpecification httpRequest = RestAssured.given();
        Response response = httpRequest.get();
        jsonPathEvaluator = response.jsonPath();
    }

@Test(priority=0)// This test validates the Name
    public void nameTest()
    {
        String name = jsonPathEvaluator.get("Name");
        Assert.assertEquals(name, expectedName);
    }

@Test(priority=1)// This test validates the CanRelist has value "true"
	public void canRelist_booleanTest()
    {
        Boolean canRelist  = jsonPathEvaluator.get("CanRelist");
        Assert.assertTrue(canRelist);
    }
    
@Test(priority=2)//This test validates that element with Name = "Gallery" has a Description that contains the text "2x larger image"
 	public void descriptionTest()
    {
	    Boolean PramotionElement = false;
	    ArrayList<String> promotionslist = jsonPathEvaluator.get("Promotions");
	    Object[] obj=promotionslist.toArray();
	    for(int i=0;i<obj.length;i++)
	    	{
	    		if(obj[i].toString().contains("Name=Gallery")&&obj[i].toString().contains("2x larger image")==true)
	    		{
	    			PramotionElement=true;
	    		}
	    	}
	    Assert.assertTrue(PramotionElement);
	    	
    }
}

