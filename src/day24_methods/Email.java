package day24_methods;

public class Email {

    /*create a method that takes 2 arguments as name and domain
    * and prints out the email address made out of the name and domain*/

    public static void generateEmail (String name, String domain){
        String email = name.toLowerCase() + "@" + domain.toLowerCase() + ".com";
        System.out.println("Your email address: " + email);
    }

    /*
     create a method that take two arguments as full name and domain
     And print out the email address made out of the name and domain.
  */

    public static void generateEmailFromName (String fullName, String domain){
        String email = fullName.substring(0, fullName.indexOf(" ")).toLowerCase() + "@" + domain.toLowerCase() + ".com";
        System.out.println("Your email address: " + email);
    }

    public static void main(String[] args) {

        generateEmail("Gunel", "Gmail");
        System.out.println();
        generateEmailFromName("Natalie Shilin", "hotmail");
    }
}
