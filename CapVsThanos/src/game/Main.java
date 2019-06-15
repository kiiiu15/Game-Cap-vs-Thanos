package game;
import org.json.JSONString;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;

import org.json.JSONObject;


/**
 * 
 * @author Agustin Bulzomi
 * The main method to get the shit going on..
 *
 */

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Hero>listOfHeroes = new ArrayList<>();
		
		Hero hero=new Hero("Thor", 100);
		
		JSONObject myheroes = new JSONObject();
		try {
			myheroes.put("Name",hero.obtainName());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// error for exception 
		try {
			myheroes.put("Life", hero.obtainLife());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Hero heroes : listOfHeroes)
		{
			listOfHeroes.add(heroes);
		}
		try {
			myheroes.put("Marvel's Heroes",listOfHeroes);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String output=myheroes.toString();
		System.out.print(output);
		
		ArrayList<Villain>ListOfVillain = new ArrayList<>();
		Villain villain= new Villain("Thanos", 100);
		JSONObject myVillain = new JSONObject();
		try {
			myVillain.put("Name", villain.obtainName());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			myVillain.put("Life", 100);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Villain villians : ListOfVillain)
		{
			ListOfVillain.add(villians);
		}
		try {
			myVillain.put("Marvel's Villains", ListOfVillain);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String exit=myVillain.toString();
		System.out.print(exit);
		
		/*JSONArray listOfCharacters = new JSONArray();
		listOfCharacters.put(myhero);
		listOfCharacters.put(myVillain);
		System.out.print(myhero);
		System.out.print(myVillain);*/
     		
	  Welcome welcome = new Welcome();
	  welcome.setBounds(0,0,1000,700);
	  welcome.setVisible(true);
	  welcome.setResizable(false);
	  welcome.setLocationRelativeTo(null);

		

	}

}
