package maindisplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lab.Lab;
import models.Pacient;
import models.TypeOfResearch;
import service.Service;


public class MainDisplayClass {

    private Lab lab = new Lab();
    private Service service = new Service();

    private Pacient pacient = new Pacient();

    private List<TypeOfResearch> lstTypeOfResearch = new ArrayList<>();

    private List<Pacient> lstPacient = new ArrayList<>();
    private boolean exit;
    private void setNameLab() {
        lab.setNameOfLab("City Clicnik");

    }

    private void printHeader() {
        setNameLab();
        System.out.println("+----------------------------------------------+");
        System.out.println("|                     Welcome to Laboratory    |");
        System.out.println("|                         " + lab.getNameOfLab() +"         |");
        System.out.println("+----------------------------------------------+");

    }

    private void printMenu() {
        System.out.println("\nPlease make a selection:  ");
        System.out.println("1. Type of research.");
        System.out.println("2. List of Pacints.");
        System.out.println("3. Add Pacient.");
        System.out.println("4. Remove Pacient.");
        System.out.println("5. Add MedicalTechnologist.");
        System.out.println("6. Remove MedicalTechnologist");
        System.out.println("7. Researching at the moment.");
        System.out.println("8. Research Income now.");
        System.out.println("9. Exit.");

    }

    public void runMenu() {
        printHeader();
        while(!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 9) {
            try {
                System.out.print("\nEnter your choice:");
                choice = Integer.parseInt(sc.nextLine());

            } catch(NumberFormatException e) {
                System.out.println("Invalid selection. Please try again.");

            }

        }

        return choice;

    }

    private void performAction(int choice) {
        switch(choice) {

            case 1:
                setListOfTypeOfResearch();
                lstTypeOfResearch = service.getListOfResearch();
                for (int i = 0; i < lstTypeOfResearch.size(); i++){
                    System.out.println("Type of Research : " + lstTypeOfResearch.get(i).getNameOfResearch() + " "
                                      + "Price of Research : " + lstTypeOfResearch.get(i).getPriceOfResearch());
                }

                break;
            case 2:
                setListOfPacient();
                this.lstPacient = service.getListOfPacient();
                for(int i = 0; i < lstPacient.size(); i++){
                    System.out.println("Pacient Name : " + lstPacient.get(i).getName() + " Amount of Health Insurance : " +
                            lstPacient.get(i).getHealthInsuranceAmount());
                }
                break;
            case 3:
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter Pacient name: ");
                String name = scan.nextLine();
                System.out.println("Enter Pacient Insurance Health Amount : ");
                double amount = scan.nextDouble();
                this.lstPacient.add(new Pacient(name,amount));

                break;
            case 4:

                break;
            case 5:
                //
                break;
            case 6:
                //
                break;
            case 7:
                //
                break;
            case 8:
                //
                break;
            case 9:
                System.out.println("Thank you for using our application");
                this.exit = true;
                break;
            default:
                System.out.println("An unknown error has occured.");

        }
    }

    private void setListOfTypeOfResearch(){

        service.setListOfResearch();
    }

    private void setListOfPacient(){
       this.service.setListOfPacient(this.lstPacient);

    }


}
