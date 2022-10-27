package maindisplay;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lab.Lab;
import models.Pacient;
import models.TypeOfResearch;
import service.Service;
import subdisplays.SubAddRemMedTechnologist;
import subdisplays.SubAddRemPacient;

public class MainDisplayClass {

    private Lab lab = new Lab();
    private SubAddRemMedTechnologist subAddRemMedTechnologist = new SubAddRemMedTechnologist();
    private SubAddRemPacient subAddRemPacient = new SubAddRemPacient();

    private Service service = new Service();

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
        System.out.println("3. Add / Remove Patients.");
        System.out.println("4. Add / Remove MedicalTechnologist.");
        System.out.println("5. Researching at the moment.");
        System.out.println("6. Research Income now.");
        System.out.println("7. Exit.");

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
        while(choice < 0 || choice > 7) {
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
                lstPacient = service.getListOfPacient();
                for(int i = 0; i < lstPacient.size(); i++){
                    System.out.println("Pacient Name : " + lstPacient.get(i).getName() + " Amount of Health Insurance : " +
                            lstPacient.get(i).getHealthInsuranceAmount());
                }
                break;
            case 3:
                subAddRemPacient.runMenu();
                this.exit = true;
                break;
            case 4:
                subAddRemMedTechnologist.runMenu();
                this.exit = true;
                break;
            case 7:
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
        service.setListOfPacient();
    }

    private void pickColor() {
        int num = (int) (Math.random() * 4);
        switch(num) {
            case 0:
                System.out.println("Green");
                break;
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Blue");
                break;
            case 3:
                System.out.println("White");
                break;
            default:
                System.out.println("Black");
        }
    }

    private void pickShape() {
        int num = (int) (Math.random() * 4);
        switch(num) {
            case 0:
                System.out.println("Square");
                break;
            case 1:
                System.out.println("Circle");
                break;
            case 2:
                System.out.println("Triangle");
                break;
            case 3:
                System.out.println("Pyramid");
                break;
            default:
        }

    }



}
