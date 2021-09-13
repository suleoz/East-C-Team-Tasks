package Task1September;

public class Registration {
    //Create  Registration  Class  in  which  you would have variables as email,
    // userName and password that have an access scope only within its own class.
    // After creating an object of the class user should be able to call  methods
    // and  in  each  method separately pass values to set users email, username and password.
    // Requirements:
    // A.Valid email consider to be only yahoo
    // B. Valid userName and password cannot be empty and should be of length larger than 6 characters.
    // Also valid password cannot contain userName.

    private String email;
    private String userName;
    private String password;


    public void setName(String userName){
        if(userName.length()<6 ){
            System.out.println("Username must be longer than 6 character");
        }else if(userName.isEmpty()){
            System.out.println("User name cannot be empty");
        }else{
           this.userName=userName;
        }
    }

    public void setPassword(String password){

        if(!(userName.isEmpty())) {
            if (password.length() < 6) {
                System.out.println("Password has to be longer than 6 characters");
            } else if (password.isEmpty()) {
                System.out.println("password cannot be empty");
            } else if (password.contains(userName)) {
                System.out.println("password cannot contain username");
            } else {
                this.password = password;
            }
        } else{
            System.out.println("please set username");
        }
    }

public void setEmail(String email){
        if(email.contains("@yahoo.com")){

            this.email=email;
        }else{
            System.out.println("Invalid Email.Please enter YAHOO email address");
        }

}
//
//    public String getUserName() {
//        return userName;
//    }
//    public String getEmail() {
//        return email;
//    }
//    public String getPassword() {
//        return password;
//    }

}
class RegistrationTester{
    public static void main(String[] args) {

        Registration registration=new Registration();
        registration.setEmail("eastcteam@yahoo.com");
        registration.setName("far");
        registration.setPassword("farfarfar");


//        System.out.println("username is "+ registration.getUserName());
//        System.out.println("email is "+ registration.getEmail());
//        System.out.println("password is "+ registration.getPassword());





    }

}
