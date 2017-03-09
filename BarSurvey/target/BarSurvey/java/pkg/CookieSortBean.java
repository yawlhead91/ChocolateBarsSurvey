package pkg;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.Cookie;

//Class used to organize order of cookie arrays and name them correctly, 
//filtering out JSESSIONID data also
public class CookieSortBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Cookie cookies[];
	private Map<String, Integer> map;
	private Map<String, Integer> ingedients;
	private Map<String, String>names;

	
	//To satisfy bean rule  
	public CookieSortBean() {
		initMap();
		initName();
		initIngedients();
		//Init Naming conventions
	}
	
	public void setCookies(Cookie[] cookies) {
		this.cookies = cookies;
		setMap(cookies);
		
		
	}

	public Map<String, Integer> getMap() {
		return map;
	}
	
	public Map<String, Integer> getIngedients() {
		
		return sortByValue(ingedients);
	}

	private Map<String, Integer> setMap(Cookie[] cookies){
		// 2. sort using comparator: sort by id
		for(int i=0; i<cookies.length;i++){
			if(!cookies[i].getName().equals("JSESSIONID")){
				String name = names.get(cookies[i].getName());
				if(name != null){
					map.put(name, Integer.parseInt(cookies[i].getValue()));
					setIng(name, Integer.parseInt(cookies[i].getValue()));
				}
			}
		}
		
		map = sortByValue(map);
		return map;
	}
	
	private void setIng(String name, int value){
		// 2. sort using comparator: sort by id
		 switch (name) {
		 	case "Dark chocolate with hazelnut and nougat":
		 		ingedients.put("Dark chocolate", ingedients.get("Dark chocolate")+value);
		 		ingedients.put("Hazelnut", ingedients.get("Hazelnut")+value);
		 		ingedients.put("Nougat", ingedients.get("Nougat")+value);
		 		break;
		 	case "White chocolate with raspberry and caramel":
		 		ingedients.put("White chocolate", ingedients.get("White chocolate")+value);
	 			ingedients.put("Raspberry", ingedients.get("Raspberry")+value);
	 			ingedients.put("Caramel", ingedients.get("Caramel")+value);
		 		break;
		 	case "Milk chocolate with caramel and peanut":
		 		ingedients.put("Milk chocolat", ingedients.get("Milk chocolat")+value);
	 			ingedients.put("Peanut", ingedients.get("Peanut")+value);
	 			ingedients.put("Caramel", ingedients.get("Caramel")+value);
	 			break;
		 	case "Dark chocolate with nougat and orange":
		 		ingedients.put("Dark chocolate", ingedients.get("Dark chocolate")+value);
		 		ingedients.put("Orange", ingedients.get("Orange")+value);
		 		ingedients.put("Nougat", ingedients.get("Nougat")+value);
		 		break;
		 	case  "White chocolate with orange and hazelnut":
		 		ingedients.put("White chocolate", ingedients.get("White chocolate")+value);
		 		ingedients.put("Orange", ingedients.get("Orange")+value);
		 		ingedients.put("Hazelnut", ingedients.get("Hazelnut")+value);
		 		break;
		 	case  "Milk chocolate with peanut and raspberry":
		 		ingedients.put("Milk chocolat", ingedients.get("Milk chocolat")+value);
		 		ingedients.put("Peanut", ingedients.get("Peanut")+value);
		 		ingedients.put("Raspberry", ingedients.get("Raspberry")+value);
		 		break;
		 }
	}
	
	private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o2.getValue()).compareTo(o1.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<String, Integer> sortedMap = new LinkedHashMap<String, Integer>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }
	
	private void initMap(){
		map = new HashMap<String, Integer>();
		map.put("Dark chocolate with hazelnut and nougat", 0);
		map.put("White chocolate with raspberry and caramel", 0);
		map.put("Milk chocolate with caramel and peanut", 0);
		map.put("Dark chocolate with nougat and orange", 0);
		map.put("White chocolate with orange and hazelnut", 0);
		map.put("Milk chocolate with peanut and raspberry", 0);
	}
	
	private void initName(){
		names = new HashMap<String, String>();
		names.put("dchn", "Dark chocolate with hazelnut and nougat");
		names.put("wcrc", "White chocolate with raspberry and caramel");
		names.put("mccp", "Milk chocolate with caramel and peanut");
		names.put("dcno", "Dark chocolate with nougat and orange");
		names.put("wcoh", "White chocolate with orange and hazelnut");
		names.put("mcpr", "Milk chocolate with peanut and raspberry");
	}
	
	private void initIngedients(){
		ingedients = new HashMap<String, Integer>();
		ingedients.put("Dark chocolate", 0);
		ingedients.put("Hazelnut", 0);
		ingedients.put("Nougat", 0);
		ingedients.put("White chocolate", 0);
		ingedients.put("Raspberry", 0);
		ingedients.put("Caramel", 0);
		ingedients.put("Milk chocolat", 0);
		ingedients.put("Peanut", 0);
		ingedients.put("Orange", 0);
	}
	
	
	
	
	
}
