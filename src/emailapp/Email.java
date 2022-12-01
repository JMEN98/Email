package emailapp;
import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity;
    private String alternateEmail;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        System.out.println("EMAIL CREATED" + this.firstName + "" + this.lastName);
        this.department=setDepartment();
        System.out.println("department"+this.department);
        this.password=randomPassword(8);
        System.out.println("password"+this.password);

        email= firstName.toLowerCase()+""+lastName.toLowerCase()+"@"+".com";


    }

    private String setDepartment() {
        System.out.println("Enter the department/n1 for sales/n2 for development/n3 for Accounting/n0 for none");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "none";
        }




    }

    private String randomPassword(int length){
        String passworsSet="ABCDEFGHIJKLMNOPQRSTVVWXYZ0123456789!@#$%^&*()+_-";
        char [] password = new char[length];

        for (int i=0; i<length;i++){
            int rand =(int) (Math.random()* passworsSet.length());
            password[i]=passworsSet.charAt(rand);
        }
        return  new String(password);
    }

    public void  setMailboxCapacity(int capacity){
        this.mailboxCapacity=capacity;
    }

    public void setAlternateEmail(String alternateEmail){
        this.alternateEmail=alternateEmail;
    }

    public  void  changPassword(String password){
        this.password=password;

    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Email{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", password='" + password + '\'' +
                ", department='" + department + '\'' +
                ", email='" + email + '\'' +
                ", mailboxCapacity=" + mailboxCapacity +
                ", alternateEmail='" + alternateEmail + '\'' +
                '}';
    }
}

