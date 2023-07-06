package testcases;

import org.testng.annotations.Test;

public class DataStorage {

    @Test
    public void data(){
        String name = "Daniel";
        String[] names = new String[3];
        names[0] = "Leslie";
        names[1] = "Jullie";
        names[2] = "David";
        names[3] = "whatever";

        System.out.println(names[0]);
        System.out.println(names.length);
        System.out.println(names);
    }
}
