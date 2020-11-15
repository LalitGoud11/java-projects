import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;

public class Main {

	public static void main(String[] args) {
		try {
			Main.call_me();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void call_me() throws Exception {

		Map<String, Integer> map = new HashMap<>();
		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		int arrlen=0;
		final int initialValue = 1;

		String url = "https://sheets.googleapis.com/v4/spreadsheets/1lpiyYeEEv91_pphMkmgO48gkTix2a4NcSQ2kzzVR7w8/values/test!A1:D23?key=AIzaSyC_DzMrJ8GhRamRnuBjAGpakryrw_HoOdw";
		
		URL obj = new URL(url);
		
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
		
		// optional default is GET
		con.setRequestMethod("GET");
		
		// add request header
		con.setRequestProperty("User-Agent", "Mozilla/5.0");
		
		int responseCode = con.getResponseCode();
		// System.out.println("\nSending 'GET' request to URL : " + url);
		// System.out.println("Response Code : " + responseCode);
		
		BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
		
		String inputLine;
		
		StringBuffer response = new StringBuffer();
		
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
		}
		
		in.close();

		// print in String
		// System.out.println(response.toString());
		// Read JSON response and print
		JSONObject myResponse = new JSONObject(response.toString());

		// System.out.println(myResponse.getString("range"));
		// JSONObject jsonArray = new JSONObject(myResponse.getJSONArray("values"));
		JSONArray arrObj = myResponse.getJSONArray("values");

		//System.out.println(arrObj.toString());

		//getting 1,2,3
	
		for (int i = 1; i < arrObj.length(); i++) {
			JSONArray js = (JSONArray) arrObj.opt(i);
			String d = (String) js.opt(0);

			if (map.containsKey(d)) {

				map.put(d, map.get(d) + 1);
			} else {
				map.put(d, initialValue);
			}
				
		}
		
		System.out.println("Total number of fruits : "+ (arrObj.length()-1) );
		
		 Set<Entry<String, Integer>> set = map.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(
	                set);
	        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
	            public int compare(Map.Entry<String, Integer> o1,
	                    Map.Entry<String, Integer> o2) {
	                return o2.getValue().compareTo(o1.getValue());
	            }
	        });

	        

		System.out.println("Types of fruits :"+ map.size());
		
		System.out.println("The number of each type of fruit in descending order :-");
		for (Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() +" : "+ entry.getValue());

        }
		
		  //---------------------
		
		for (int i = 1; i < arrObj.length(); i++) {
			JSONArray js = (JSONArray) arrObj.opt(i);
			
			String concat = (String) js.opt(0) +": "+ (String) js.opt(2) +","+ (String) js.opt(3);
			String concat1 = (String) js.opt(0) +": "+(String) js.opt(3)  +","+ (String) js.opt(2) ;
			
			if (map1.containsKey(concat)) {
				map1.put(concat, map1.get(concat) + 1);
			}
			else if(map1.containsKey(concat1)) {
				map1.put(concat1, map1.get(concat1) + 1);
			}
			else {
				map1.put(concat, initialValue);
			}
			
		}
		System.out.println("The characteristics (size, color, shape, etc.) of each fruit by type :-");
		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
		    System.out.println(entry.getValue()+" : "+entry.getKey());
		}
		
		for (int i = 1; i < arrObj.length(); i++) {
			JSONArray js = (JSONArray) arrObj.opt(i);
			String d = (String) js.opt(0);
			String d1 = (String) js.opt(1);
			int inn = Integer.parseInt(d1);
			
			if(inn>3) {
				if (map2.containsKey(d)) {

					map2.put(d, map2.get(d) + 1);
				} else {
					map2.put(d, initialValue);
				}
			}
		}
		
		 
		for (Map.Entry<String, Integer> entry : map2.entrySet()) {
		    System.out.print(entry.getValue()+" "+entry.getKey());
		   
		   if(map2.size()-1!=arrlen) {
			   arrlen++;
			   System.out.print(" and ");
		}
		}
		System.out.print("  are over 3 days old");
		
	}
}
