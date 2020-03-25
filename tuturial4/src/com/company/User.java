package com.company;

public class User {

    private String Name;
    private String Lastname;
    private String Email;
    private String Password;
    boolean Userguest;


    public User(String Name, String Lastname, String Email, String Password) {
        this.Name = Name;
        this.Lastname = Lastname;
        this.Email = Email;
        this.Password = Password;
        this.Userguest = false;
    }

    public User(String Email) {
        this.Email = Email;
        this.Userguest = true;
    }
    public boolean UserGuest() {
        if (this.Email == Email) {
            return false;
        } else {
            return true;

        }
}
       public String getName() {
        return Name;
    }

     public String getLastName() {
        return Lastname;
    }

        public String getEmail() {
        return Email;
    }

      public String getPassword() {
        return Password;
    }

      public boolean isUserguest() {
        return Userguest;
    }


       public void setName(String name) {
        Name = Name;
    }

      public void setLastname(String lastName) {
        Lastname = Lastname;
    }

      public void setEmail(String email) {
        Email = Email;
    }

      public void setPassword(String password) {
        Password = Password;
    }

      public void setUserguest(boolean userGuest) {
        Userguest = Userguest;
    }
}

