import java.util.*;
//import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String args[]){
        TreeMap<String,Integer> tmap=new TreeMap<String,Integer>();

        //ADDING ELEMENTS INTO TREE MAP
        tmap.put("EMPLOYEE 1",101);
        tmap.put("EMPLOYEE 2",102);
        tmap.put("EMPLOYEE 3",103);
        tmap.put("EMPLOYEE 4",104);
        tmap.put("EMPLOYEE 5",105);
        tmap.put("EMPLOYEE 6",107);
        System.out.println("INITIAL TREE MAP -> "+tmap);

        //ACCESSING ELEMENTS FROM TREE MAP
        System.out.println("RETURN EMPLOYEE ID OR EMPLOYEE 2 "+tmap.get("EMPLOYEE 2"));

        //UPDATING EMPLOYEE ID OF EMPLOYEE 6
        tmap.put("EMPLOYEE 6",106);
        System.out.println("TREE MAP AFTER UPDATION -> "+tmap);

        //CHECKING IF A KEY EXISTS OR NOT
        if(tmap.containsKey("EMPLOYEE 7")){
            System.out.println("YES IT EXISTS");
        }
        else{
            System.out.println("NO IT DOESN'T EXISTS");
        }

        //REMOVING A KEY AND ITS VALUE
        tmap.remove("EMPLOYEE 6");
        System.out.println("TREE MAP AFTER DELETION -> "+tmap);

        //PRINTING FIRST AND LAST KEYS OF TREE MAP
        System.out.println("FIRST KEY IS = "+tmap.firstKey());
        System.out.println("LAST KEY IS = "+tmap.lastKey());

        //DISPLAY KEYS&VALUE LESS THAN EMPLOYEE 4
        System.out.println(tmap.headMap("EMPLOYEE 4"));

        //DISPLAY KEYS&VALUE GREATER THAN EMPLOYEE 2
        System.out.println(tmap.tailMap("EMPLOYEE 2"));

        //EXTRACT KEYS&VALUES FROM EMPLOYEE 3 TO EMPLOYEE 5
        System.out.println(tmap.subMap("EMPLOYEE 3","EMPLOYEE 5"));

        //ITERATING TREE MAP
        for(Map.Entry<String,Integer> i : tmap.entrySet()){
            System.out.println(i.getKey()+" : "+i.getValue());
        }

        //FINALIZED TREE MAP 
        System.out.println(tmap);
    }
}
