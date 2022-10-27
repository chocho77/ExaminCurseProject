package service;

import models.Pacient;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddRemovePacientService {
    private Pacient pacient = new Pacient();
    private List<Pacient> lstPacient = new ArrayList<>();

    private String name;

    private double insuranceHealthAmount;

    public AddRemovePacientService() {

    }

    public void AddPacient(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a Pacient name : ");
        this.name = scan.nextLine();
        this.pacient.setName(this.name);
        System.out.println("Enter insurance health amount : ");
        this.insuranceHealthAmount = scan.nextDouble();
        this.pacient.setHealthInsuranceAmount(this.insuranceHealthAmount);

    }

    public Pacient getPacient(){
        return this.pacient;
    }

}
