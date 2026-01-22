import java.util.*;
//import java.util.LinkedHashMap;

public class LinkedHashMapExample {
    public static void main(String args[]){
        LinkedHashMap<String,Integer> lhm=new LinkedHashMap<String,Integer>();

        //ADDING ELEMENTS IN LINKED HASHMAP
        lhm.put("SHREYA",98);
        lhm.put("AMAN",67);
        lhm.put("HRISHAV",89);
        lhm.put("RIYA",78);
        lhm.put("LAKSHIT",92);
        lhm.put("PAYAL",99);
        System.out.println("INITIAL LINKED HASH MAP -> "+lhm);

        //ACCESSING A SPECIFIC ELEMENT FROM LINKED HASHMAP
        System.out.println("DISPLAY THE MARKS OF RIYA : "+lhm.get("RIYA"));

        //REPLACE MARKS OF LAKSHIT 92->95
        lhm.replace("LAKSHIT", 95);
        System.out.println("LINKED HASH MAP AFTER UPDATION -> "+lhm);

        //DELETE PAYAL'S RECORDS
        lhm.remove("PAYAL");
        System.out.println("LINKED HASH MAP AFTER DELETION -> "+lhm);

        //FINALIZED LINKED HASHMAP 
        System.out.println("FINAL LINKED HASH MAP -> "+lhm);
    }
}