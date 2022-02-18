package com.example.user_interface;

import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class HelloController{

    MyClient c = new MyClient(3333);
//    Gson gson = new Gson();


    public void setModel(MyClient mc){
        c = mc;
    }
    Person person;

    @FXML
    private TextField tf_Name;
    @FXML
    private TextField tf_Age;
    @FXML
    private TextField tf_ID;
    @FXML
    private TextField tf_Profession;
    @FXML
    private TextField tf_Experience;
    @FXML
    private TextField tf_ID_to_remove;

    @FXML
    private TextArea ta_;

    @FXML
    private TableView<People> tv_people;

    @FXML
    private TableColumn<People, String> col_Name;
    @FXML
    private TableColumn<People, Integer> col_Age;
    @FXML
    private TableColumn<People, Long> col_ID;
    @FXML
    private TableColumn<People, String> col_Profession;
    @FXML
    private TableColumn<People, Integer> col_Experience_years;

    @FXML
    private Button btn_Add;
    @FXML
    private Button btn_Delete;

    @FXML
    protected void onSearchButtonClick(){
        System.out.println(this.tf_Name.getCharacters());
        Person person = new Person(this.tf_Name.getText(), Integer.valueOf(this.tf_Age.getText()), this.tf_ID.getText(),
                this.tf_Profession.getText(), Integer.valueOf(this.tf_Experience.getText()), Operation.ADD);
        if(person.getProfession()!= null && person.getExperience_y()!= 0 && person.getMin_age()!= 0 && person.getMax_age()!= 0 ){
            person.setOperation(Operation.SEARCH_ALL);
        }
        else if(person.getProfession() != null){
            person.setOperation(Operation.SEARCH_BY_PROFESSION);
        }
        else if(person.getExperience_y() != 0){
            person.setOperation(Operation.SEARCH_BY_MIN_YEARS_OF_EXPERIENCE);
        }
        else if(person.getMin_age() != 0){
            person.setOperation(Operation.SEARCH_BY_AGE);
        }
    }

    @FXML
    protected void onAddButtonClick() throws IOException {
        System.out.println(this.tf_Name.getCharacters());
        Person person = new Person(this.tf_Name.getText(), Integer.valueOf(this.tf_Age.getText()), this.tf_ID.getText(),
                this.tf_Profession.getText(), Integer.valueOf(this.tf_Experience.getText()), Operation.ADD);
        ta_.setText(c.sendRecive(this.tf_Name.getText() + "\n"));
        ta_.setText(c.sendRecive(person.toJson()));//NEED TO CHANGE TO SEND JSON NOT STRING
    }

    @FXML
    protected void onRemoveButtonClick() throws IOException {
        Person person = new Person(this.tf_Name.getText(), Integer.valueOf(this.tf_Age.getText()), this.tf_ID_to_remove.getText(),
                this.tf_Profession.getText(), Integer.valueOf(this.tf_Experience.getText()), Operation.REMOVE);
        ta_.setText(c.sendRecive(person.toJson()));
    }

}


