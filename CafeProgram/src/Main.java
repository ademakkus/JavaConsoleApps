import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String choice;
        double portion,price;
        String name;

        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome Cafe Bext Wishes");
        System.out.println("What do you prefer ?");
        System.out.println("MENU");
        System.out.println("-----------------------");
        System.out.println("MEALS       Fish and Chips" +
                "\n            Meatballs");
        System.out.println("DRINKS      Coke" +
                "\n             Soda");
        System.out.println("DESSERTS     Tiramisu " +
                "\n             Panna Cotta");

        System.out.println("-----------------------");
        System.out.println("Please write Done and enter for print a recipe");
        System.out.println("Please enter the items :");
       choice=sc.next();
        while (choice.equalsIgnoreCase("Done")){
            choice=sc.next();
            switch (choice){

                case "Fish and Chips": fishandChips fac=new fishandChips("Fish and Cips",12.0,1.5);
                fac.toString();
                break;
                case "Meatballs":System.out.println("Fish and chips");

                  //  meatballs mb=new meatballs();
                break;
                case "Coke":System.out.println("Fish and chips");
                  //  coke ck=new coke();
                break;
                case "Soda":System.out.println("Fish and chips");
                        //soda sd=new soda();
                break;
                case "Tiramisu":System.out.println("Fish and chips");
                      //  tiramisu trm=new tiramisu();
                break;
                case "Panna Cotta":System.out.println("Fish and chips");
                     //   pannaCotta pnc=new pannaCotta();
                break;
                case "Done":break;
            }
        }
        System.out.println();

    }
}
