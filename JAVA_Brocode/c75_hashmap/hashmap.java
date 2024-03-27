package c75_hashmap;

import java.util.HashMap;

public class hashmap {
    // pair of Key-Value pairs of Wrapper class
    //similar to Array List
      
    public static void main(String[] args){

        HashMap<String,String> counties = new HashMap <String,String> ();
        counties.put("USA"  ,"Washington");
        counties.put("India","New Delhi");
        counties.put("Rusia","Moscou");
        counties.put("China","Beijing");
        //counties.remove("USA");
        //System.out.println(counties.get("Rusia") );
        //counties.clear();
        counties.replace("USA", "Detroit");
        System.out.println(counties.containsKey("England"));      // false
        System.out.println(counties.containsValue("Beijing"));  // true
        System.out.println(counties.size());                           // 4
        
        System.out.println(counties);
        
        for(String i : counties.keySet() ) {
            System.out.print(i+':'+ '\t');             // i contains key "USA","Rusia",...
            System.out.println( counties.get(i) );     // get returns the value "Detroit"...
        }
    }
}
