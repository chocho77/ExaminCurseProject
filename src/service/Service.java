package service;

import lab.Lab;
import models.MedicalTechnologist;
import models.Pacient;
import models.TypeOfResearch;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private TypeOfResearch typeOfResearch = new TypeOfResearch();

    private List<TypeOfResearch> listOfResearch= new ArrayList<>();

    private List<Pacient> listOfPacient = new ArrayList<>();

    private List<MedicalTechnologist> listOfMedical = new ArrayList<>();




    public Service() {

    }

    public void LoadListOfTypeOfResearch(){
        this.listOfResearch.add(this.typeOfResearch);
    }
    public List<TypeOfResearch> getListOfResearch() {

        return this.listOfResearch;
    }

    public void setListOfPacient(List<Pacient> listOfPacients) {

         this.listOfPacient = listOfPacients;

    }

    public void setTypeOfResearch(TypeOfResearch typeOfResearch){
        this.typeOfResearch = typeOfResearch;
    }

    public TypeOfResearch getTypeOfResearch() {
        return this.typeOfResearch;
    }

    public List<Pacient> getListOfPacient() {
        return this.listOfPacient;

    }
}
