package edu.guiford;

public class Individual {
    //three attribute for name, email, phone
    private String name;
    private String email;
    private String phone;

    //constructor that gives the default values for the attributes
    public Individual() {
        //set the name attribute to "John Doe"
        name = "John Doe";
        //set the email attribute to "jdoe@guilford"
        email = "jdoe@guilford";
        //set the phone attribute to "555-555-5555"
        phone = "555-555-5555"; 
    }

    //constructor that akes three String parameters
    public Individual(String name, String email, String phone) {
        //set the name attribute to the name parameter
        this.name = name;
        //set the email attribute to the email parameter
        this.email = email;
        //set the phone attribute to the phone parameter
        this.phone = phone;
    }
    
        //getters and setters

        //getter for the name attribute
        public String getName() {
            //return the name attribute
            return name;
        }

        //setter for the name attribute

        public void setName(String name) {
            //set the name attribute to the name parameter
            this.name = name;
        }

        //getter for the email attribute
        public String getEmail() {
            //return the email attribute
            return email;
        }

        //setter for the email attribute
        public void setEmail(String email) {
            //set the email attribute to the email parameter
            this.email = email;
        }

        //getter for the phone attribute
        public String getPhone() {
            //return the phone attribute
            return phone;
        }

        //setter for the phone attribute
        public void setPhone(String phone) {
            //set the phone attribute to the phone parameter
            this.phone = phone;
        }

        //toString method
        @Override 
        public String toString() {
            //return a String representation of the object
            return "Name: " + name + "\nEmail: " + email + "\nPhone: " + phone;
        }
        



    }
    

