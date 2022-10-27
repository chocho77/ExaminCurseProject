package service;

import lab.Lab;
import models.MedicalTechnologist;
import models.Pacient;
import models.TypeOfResearch;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<TypeOfResearch> listOfResearch= new ArrayList<>();

    private List<Pacient> listOfPacient = new ArrayList<>();



    public Service() {

    }


    public List<TypeOfResearch> getListOfResearch() {

        return this.listOfResearch;
    }

    public void setListOfResearch() {
        TypeOfResearch typeOfResearchOne = new TypeOfResearch("Search name one", 45.0);
        TypeOfResearch typeOfResearchTwo = new TypeOfResearch("Search name two", 34.45);
        TypeOfResearch typeOfResearchThree = new TypeOfResearch("Search name three", 65.45);
        TypeOfResearch typeOfResearchFour = new TypeOfResearch("Search name four", 123.22);

        // Add into the list of Research
        listOfResearch.add(typeOfResearchOne);
        listOfResearch.add(typeOfResearchTwo);
        listOfResearch.add(typeOfResearchThree);
        listOfResearch.add(typeOfResearchFour);

    }

    public void setListOfPacient(List<Pacient> listOfPacients) {

         this.listOfPacient = listOfPacients;

    }

    public List<Pacient> getListOfPacient() {
        return this.listOfPacient;

    }
}
