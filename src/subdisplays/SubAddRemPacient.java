package subdisplays;

import models.Pacient;
import service.AddRemovePacientService;
import service.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubAddRemPacient {

    private boolean exit;
    private AddRemovePacientService addRemovePacientService = new AddRemovePacientService();
    private Service service = new Service();

    private Pacient pacient = new Pacient();
    private List<Pacient>  lstPacient = new ArrayList<>();


    private void printHeader() {
        System.out.println("+----------------------------------------------+");
        System.out.println("|                     Add/Remove               |");
        System.out.println("|                      Pecients                |");
        System.out.println("+----------------------------------------------+");

    }


    public void printMenu() {
        System.out.println("\nPlease make a selection:  ");
        System.out.println("0.Exit");
        System.out.println("1. Add Pecient.");
        System.out.println("2. Remove Pecient.");
        System.out.println("3. List of Pacients.");

    }

    public void runMenu() {
        while(!exit) {
            printHeader();
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    private int getInput() {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while(choice < 0 || choice > 4) {
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
            case 0:
                System.out.println("Goodbye!");
                this.exit = true;
                break;
            case 1:
                this.service.setListOfPacient();
                this.lstPacient = service.getListOfPacient();
                this.addRemovePacientService.AddPacient();
                this.pacient = this.addRemovePacientService.getPacient();
                this.lstPacient.add(this.pacient);

                break;
            case 2:
                System.out.println("Choice 2");
                break;
            case 3:
                for(int i = 0; i < this.lstPacient.size(); i++) {
                    System.out.println("Pacient Name " + this.lstPacient.get(i).getName() + " Insurance Health Amount : " +
                            this.lstPacient.get(i).getHealthInsuranceAmount());
                }
                break;
            default:
                System.out.println("An unknown error has occured.");

        }
    }

}
