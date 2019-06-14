package game;
import org.json.JSONString;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.json.JSONObject;

public class PuebaJson {//usamos array de personajes tambien.
	public static void Main (String[] args)
	{
		Thor mithor=new Thor();
		JSONObject myhero = new JSONObject();
		myhero.put("Name",mithor.obtainName());
		myhero.put("Life", mithor.thorLife());
		
		JSONArray listOfCharacters = new JSONArray();
		
	
	}

}
