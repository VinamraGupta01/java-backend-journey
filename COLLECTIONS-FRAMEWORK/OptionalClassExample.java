import java.util.*;
//import java.util.Optional;

public class OptionalClassExample {
    public static void main(String args[]){

        //EMPTY OPTIONAL
        Optional<String> empty=Optional.empty();
        System.out.println("EMPTY OPTIONAL : "+empty);

        //optional.of() (MUST NOT BE NULL)
        Optional<String> name=Optional.of("Vinamra");
        System.out.println("NAME : "+name.get());

        //optional.ofNullable()
        String email=null;
        Optional<String> optionalEmail=Optional.ofNullable(email);

        //CHECKING IF THE MAIL IS PRESENT OR NOT
        System.out.println("CHECK IF THE MAIL IS PRESENT OR NOT : "+optionalEmail.isPresent());

        //IF MAIL NOT PRESENT
        System.out.println(optionalEmail.orElse("MAIL IS NOT PRESENT"));

        //ifPresent()
        name.ifPresent(n -> System.out.println("Hello " + n));

        //map() (TRANSFORM VALUE)
        Optional<Integer> length = name.map(String::length);
        System.out.println("Length of name: " + length.get());

        //orElseThrow()
        Optional<String> city = Optional.empty();
        try {
            city.orElseThrow(() -> new RuntimeException("City not found"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}