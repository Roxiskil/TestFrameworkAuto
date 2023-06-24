package testcases;

import org.testng.annotations.Test;

public class JavaMethodsTest {

    //HomeWork Part-2 if/else conditionals
    @Test
    public void testJavaMethods() {

        boolean taxPrinted = true;
        int income = 8675;
        boolean printed = true;
        boolean noTax = false;

        String tax10IsDisplayed = "Your tax will be 10%";
        String tax12IsDisplayed = "Your tax will be 12%";
        String tax22IsDisplayed = "Your tax will be 22%";
        String taxIsNotDisplayed = "Please call your CPA";


        if (income >= 0 && income <= 10275) {
            System.out.println(tax10IsDisplayed);
        } else if (income >= 10276 && income <= 41775) {
            System.out.println(tax12IsDisplayed);
        } else if (income >= 41775 && income <= 89.075) {
            System.out.println(tax22IsDisplayed);
        } else {
            System.out.println(taxIsNotDisplayed);
        }


    }

    //switch statement

    @Test
    public void testSwitch() {

        int department = 1;
        switch (department) {
            case 1:
                System.out.println("Sales department works from 8am to 12pm.");
            case 2:
                System.out.println("Operations department works from 8am to 12pm.");
            case 3:
                System.out.println("Accounting department works from 8am to 12pm.");
            case 4:
                System.out.println("HR department works from 8am to 12pm.");
            case 5:
                System.out.println("Analysis department works from 8am to 12pm.");
                break;
            case 6:
                System.out.println("Management department works from 8am to 12pm.");
        }

    }

    //for loop
    @Test
    public void forLoop() {
        for (int hour = 0; hour < 24; hour = hour + 2){
            System.out.println(hour);

        }
    }
}






