package school;

public class ControlFlowPractice {
    public static void main(String[] args){

        int x = 10;
        int y = 12;

        System.out.println("if statements: ");

        System.out.println("True Condition: ");
        if(x + y > 20){
            System.out.println("Sum of x and y is greater than 20");
        }

        System.out.println("False Condition: ");
        if(x + y == 20){
            System.out.println("Sum of x and y is equal to 20");
        }
        System.out.println("This statement is outside the if block.");

        System.out.println("\nif-else statements: ");// else block will be executed if the condition inside if is false.

        System.out.println("True if Condition: ");
        if(x + y > 20){
            System.out.println("Sum of x and y is greater than 20");
        }
        else{
            System.out.println("Sum of x and y is not greater than 20");
        }

        System.out.println("False if Condition: ");
        if(x + y < 20){
            System.out.println("Sum of x and y is less than 20");
        }
        else{
            System.out.println("Sum of x and y is not less than 20");
        }

        String city = "Delhi";

        System.out.println("\nelse-if statements: ");

        if(city.equals("Meerut")){
            System.out.println("city is meerut");
        }
        else if(city == "Noida"){
            System.out.println("city is noida");
        }
        else if(city == "Agra"){
            System.out.println("city is agra");
        }
        else{
            System.out.println(city);
        }
        
        System.out.println("\nUsing operators: ");

        String cityPh = "Mandaluyong, Philippines";

        if(cityPh.contains("Manda") && city.contains ("luyong")){
            System.out.println(city.split(",") [0]);// Splits "Mandaluyong" and "Philippines" then prints the [0] index 
        }
        else if(cityPh.endsWith("Philip")){
            System.out.println("Region" + cityPh.split(",")[2].trim());
        }
        else if(cityPh.startsWith ("Manda")){
            System.out.println("Your city is Mandaluyong");
        }
        else{
            System.out.println(cityPh);
        }

        String cityBGC = "Makati, BGC, Philippines";

        if(cityBGC.contentEquals("mak") | cityBGC.contains ("BGC")){
            System.out.println(cityBGC.split(",") [1].trim());// Splits "Makati", "BGC", and "Philippines" then prints the [1] index then trims the whitespaces before and after that index.
        }
        else if(cityPh.endsWith("Philip")){
            System.out.println("Region" + cityBGC.split(",")[2].trim());
        }
        else if(cityBGC.startsWith ("Manda")){
            System.out.println("Your city is Mandaluyong");
        }
        else{
            System.out.println(city.split(",")[0].trim());
        }

        System.out.println("\nNested if statements: ");

        String address = "Shaw Boulevard, Mandaluyong, Phillipines";

    if(address.endsWith("Philippines") | (address.contains("Manda"))){
            System.out.println("You can enter to Mandaluyong");
        if(address.equalsIgnoreCase("MANDALUYONGS")){
            if (address.contains ("Shaw")){
                System.out.println("Street: " + address.split(",")[0].trim());
            }
            else{
                System.out.println("City: " + address.split(",")[1].trim());
            }
        }
        else if (address.contains("Manda")){
            System.out.println("Your City is " + address.split(",")[1].trim());
            if(address.contains("Shaw")){
                System.out.println("Street: " + address.split(",") [0].trim());
            }
            else{
                System.out.println("City: " + address.split(",")[1].trim());
            }
        }
    }
        else{
            System.out.println("Region: " + address.split(",")[2].trim());
        }
    
        System.out.println("\nSwitch-case: ");

        int expression = 1;
        switch(expression){
            case 1: 
                System.out.println("The number is 1");
            break;

            case 2:
                System.out.println("The number is 2");
            break;
            
            case 3:
                System.out.println("The number is 3");
            break;

            default:
                System.out.println("Invalid Number");
            }

        System.out.println("\n");
    }
}



//Notes:
//Control flow/ Control Structure: 1. Decision making, Loop Statement, 3. Jump Statement