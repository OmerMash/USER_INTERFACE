package com.example.user_interface;

import com.google.gson.Gson;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.IOException;

public class HelloController{

    MyClient c = new MyClient(3333);
    Gson gson = new Gson();


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
    private TextField tf_search_profession;
    @FXML
    private TextField tf_search_experience;
    @FXML
    private TextField tf_search_min_age;
    @FXML
    private TextField tf_search_max_age;

    @FXML
    private TextArea ta_;

    @FXML
    private Button btn_Add;
    @FXML
    private Button btn_Delete;

    @FXML
    protected void onSearchButtonClick() throws IOException {
        String str = tf_search_profession.getText() + "," +
                tf_search_experience.getText() + "," +
                tf_search_min_age.getText() + "," +
                tf_search_max_age.getText();
        ta_.setText(c.sendRecive("SEARCH" + str));
    }

    @FXML
    protected void onAddButtonClick() throws IOException {
        System.out.println(this.tf_Name.getCharacters());
        Person person = new Person(this.tf_Name.getText(), Integer.valueOf(this.tf_Age.getText()), this.tf_ID.getText(),
                this.tf_Profession.getText(), Integer.valueOf(this.tf_Experience.getText()), Operation.ADD);
        ta_.setText(c.sendRecive("ADD" + person.toJson()));
    }

    @FXML
    protected void onRemoveButtonClick() throws IOException {
        ta_.setText(c.sendRecive("REMOVE" + tf_ID_to_remove.getText().trim()));
    }


//    @FXML
//    protected void onRemoveButtonClick() throws IOException {
//        Person person = new Person(this.tf_Name.getText(), Integer.valueOf(this.tf_Age.getText()), this.tf_ID_to_remove.getText(),
//                this.tf_Profession.getText(), Integer.valueOf(this.tf_Experience.getText()), Operation.REMOVE);
//        ta_.setText(c.sendRecive(person.toJson()));
//    }

}


