package service;

import enumeration.TypeResearch;
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

    public TypeOfResearch returnTypeOfResearch(TypeResearch myResearch) {

        switch(myResearch) {
            case RED:
                TypeOfResearch typeOfResearch1 = new TypeOfResearch("Red", 34.90);
                return typeOfResearch1;

            case BLUE:
                TypeOfResearch typeOfResearch2 = new TypeOfResearch("Blue",56.89);
                return typeOfResearch2;

            case GREEN:
                TypeOfResearch typeOfResearch3 = new TypeOfResearch("Green",67.89);
                return typeOfResearch3;

            case YELLOW:
                TypeOfResearch typeOfResearch4 = new TypeOfResearch("Yellow",78.90);
                return typeOfResearch4;

            default:
                TypeOfResearch typeOfResearch5 = new TypeOfResearch("July",100.0);
                return typeOfResearch5;
        }
    }




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
