package edu.guiford;

import java.io.File;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

//IndividualPane.java is a class that extends the Pane classes
public class IndividualPane extends GridPane {
    //Could have GridPane,TitledPane, StackPane, Pane BorderPane, etc.
    //these organize the components we want to display in different ways

    
    //Individual attribute

    private Individual individual;

    private TextField nameField;
    private TextField emailField;
    private TextField phoneField;

// add a submit button attribute 
private Button submitButton;

//three labels for name, email, phone
    private Label nameLabel;
    private Label emailLabel;
    private Label phoneLabel;
    //Step 1 : Instantiate an ImageView attribute
    private ImageView avatarView;
    //Declare a Slider attribute to manipulate the backround color
    private Slider colorSlider;


    //constructor

    public IndividualPane(Individual individual) {
        //set the name attribute to "John Doe"
       this.individual = individual;

       //instantiate textfield attributes
         nameField = new TextField();
            emailField = new TextField();
            phoneField = new TextField();
    
        //instantiates a submit button
        submitButton = new Button("Submit");

        
        //get the path of the file that contains the image we want to display
        File avatar = new File("avatar.png");
        //Step 2: Instantiate the imageView attribute with the image we want to display
        //URI stantard for Uniform Resource Identifier and it is similar to a URL
        avatarView = new ImageView(avatar.toURI().toString());
   
        //instantiate the labels attributes
        nameLabel = new Label("Name: " + individual.getName());
        emailLabel = new Label("Email: " + individual.getEmail());
        phoneLabel = new Label("Phone: " + individual.getPhone());

        //add the labels to the pane
        this.add(nameLabel, 0, 0);
        this.add(emailLabel, 0, 1);
        this.add(phoneLabel, 0, 2);


        //add a label to the pane
        this.add(nameLabel, 0, 0);
        //add a label to the pane
        this.add(emailLabel, 0, 1);
        //add a label to the pane
        this.add(phoneLabel, 0, 2);
        
        //give the pane a border
        this.setStyle("-fx-border-color: black");
        //give the pane a border width
        this.setStyle("-fx-border-width: 30px");
        //show the border width
        this.setStyle("-fx-border-style: solid");
        //and a background color
        this.setStyle("-fx-background-color: lightblue");
        
        
        // //add a text field to the pane
        // this.add(new TextField(), 1, 0);


        //add the name text field to the pane
        this.add(nameField, 1, 0);
        //add the email text field to the pane
        this.add(emailField, 1, 1);
        //add the phone text field to the pane
        this.add(phoneField, 1, 2);
        //add a submit button to the pane
        this.add(new Button("Submit"), 0, 3);



        //Step 3: add the imageView to the pane to get the right of text fields
        this.add(avatarView, 2, 0, 1, 4);
        //we can the image to be of a different size
        avatarView.setFitHeight(100);
        //and preserve the aspect ratio(The ratio of width to height)
        avatarView.setPreserveRatio(true);
        //rotate it by 45 degrees
        avatarView.setRotate(45);



        //add a listener for the button that changes the labels
        submitButton.setOnAction(e -> {
            //set the name label to the text in the name text field
            nameLabel.setText("Name: " + nameField.getText());
            //set the email label to the text in the email text field
            emailLabel.setText("Email: " + emailField.getText());
            //set the phone label to the text in the phone text field
            phoneLabel.setText("Phone: " + phoneField.getText());
            //update the individual attribute with the new values
            individual.setName(nameField.getText());
            individual.setEmail(emailField.getText());
            individual.setPhone(phoneField.getText());

        });
        
        

        //Step 4 and 5: write an event listener and connect it to the component
        //that triggers the event
        //rotate the image by 180 degrees when the mouse is cliked on it
        avatarView.setOnMouseClicked(e -> {
            avatarView.setRotate(180);
        });


    }



}
