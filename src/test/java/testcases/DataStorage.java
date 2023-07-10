package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//homework5
public class DataStorage extends BaseTest {
    @Test
    public void roles() {

        List<Object> jobTitle = new ArrayList<>();
        jobTitle.add("Junior level Developer");
        jobTitle.add("Middle level Developer");
        jobTitle.add("Senior level Developer");
        jobTitle.add("Leading Developer");
        jobTitle.add("QA Analyst");
        jobTitle.add("Software Tester");
        jobTitle.add("QA Engineer");
        jobTitle.add("Senior QA Engineer");
        jobTitle.add("Automation QA Engineer");
        jobTitle.add("Test Lead");
        jobTitle.add("Business Analyst");
        jobTitle.add("Senior Business Analyst");
        jobTitle.add("Designer");

        System.out.println(jobTitle.contains("Designer"));

    }


    }
        /* Map<String,Integer> zooAnimals = new HashMap<>();
        zooAnimals.put("Bear",2);
        zooAnimals.put("Alligator",5);
        zooAnimals.put("Monkey",12);
        zooAnimals.put("Elephant",3);

        System.out.println(zooAnimals);
        System.out.println(zooAnimals.get("Elephant"));
        System.out.println(zooAnimals.get("Monkey"));
        System.out.println(zooAnimals.size());
    }
*/



    }
}




