import java.util.*;
//import java.util.HashMap;

public class HashMapExample {
    public static void main(String args[]){
        HashMap<String,Integer> map=new HashMap<String,Integer>();

        //ADDING ELEMENTS IN HASHMAP
        map.put("TEA", 20);
        map.put("COFFEE",40);
        map.put("CHEESECAKE",120);
        map.put("COKE",40);
        map.put("RICE CAKE",150);
        System.out.println("INITIAL HASH MAP -> "+map);

        //UPDATING VALUE IN HASHMAP
        map.put("RICE CAKE",135);
        System.out.println("HASH MAP AFTER UPDATION -> "+map);

        //RETURNING THE SIZE OF HASHMAP
        System.out.println("SIZE OF HASHMAP IS = "+map.size());

        //CHECKING IF A KEY IS PRESENT IN THE HASH MAP OR NOT
        if(map.containsKey("COFFEE")){
            System.out.println("YES COFFEE KEY IS PRESENT IN THE HASH MAP");
        }
        else{
            System.out.println("NO COFFEE KEY ISNT PRESENT");
        }

        //ACCESSING THE VALUE OF A KEY
        System.out.println(map.get("TEA"));
        //System.out.println(map.get("BISCUITS")); (IT WILL BE NULL AS THERE'S NO KEY EXISTING AS BISCUITS)

        //DELETING AN ELEMENT FROM HASHMAP
        map.remove("RICE CAKE");
        System.out.println("HASH MAP AFTER REMOVAL OF AN ELEMENT -> "+map);

        //ITERATING HASH MAP
        for(Map.Entry<String,Integer> i : map.entrySet()){
            System.out.print(i.getKey()+" : "+i.getValue()+" , ");
        }
        System.out.println();
    }
}