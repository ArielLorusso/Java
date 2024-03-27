package c17_string_methods;

public class stringmeth {


    public static void main(String[] args) {
        
        // String = a reference data type that can store one or more characters
        //   reference data types have access to useful methods
        
        String name = "Bro";

        Boolean res1 = name.equalsIgnoreCase("bro");  
                res1 = name.isEmpty();          System.out.println(res1);

        int     res2 = name.length();
                res2 = name.indexOf("o");   System.out.println(res2);
        
        char    res3 = name.charAt(0);    System.out.println(res3);

        String  res4 = name.toUpperCase();       System.out.println(res4);
                res4 = name.toLowerCase(); 
                res4 = name.trim();              
                res4 = name.replace('o', 'a');
        
        //System.out.println(result);
    }
    
}
