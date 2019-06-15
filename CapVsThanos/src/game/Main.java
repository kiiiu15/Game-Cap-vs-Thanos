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
		
		Hero hero=new Hero("Thor", 100);
		JSONObject myhero = new JSONObject();
		try {
			myhero.put("Name",hero.obtainName());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// error for exception 
		try {
			myhero.put("Life", hero.obtainLife());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Villain villian= new Villain("Thanos", 100);
				
		
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
