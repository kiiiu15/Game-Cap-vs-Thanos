package game;
import org.json.JSONString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.PrintWriter;
import java.io.StringWriter;

import org.json.JSONObject;


/**
 * 
 * @author Agustin Bulzomi
 * The main method to get the shit going on..
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Thor mithor=new Thor();
		JSONObject myhero = new JSONObject();
		try {
			myhero.put("Name",mithor.obtainName());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// error for exception 
		try {
			myhero.put("Life", mithor.thorLife());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		JSONArray listOfCharacters = new JSONArray();
		listOfCharacters.put(myhero);
		System.out.print(myhero);
     		
	  Welcome welcome = new Welcome();
	  welcome.setBounds(0,0,1000,700);
	  welcome.setVisible(true);
	  welcome.setResizable(false);
	  welcome.setLocationRelativeTo(null);



	}

}
