import java.util.HashMap;
import java.util.Scanner;
public class PhoneBook {
    private    HashMap<String,String> namesAndNumbers = new HashMap<>();
    private static  final Scanner input = new Scanner(System.in);
   private  String phoneNumber;
   private  String names;

    public void welcomeDisplay(){
        System.out.print("""
                 Welcome to our Phonebook App! Your go-to hub for smooth and efficient contact management.
                 Keep your connections close, organized, and always at your fingertips.
                 Enjoy the simplicity of staying in touch!
                        """);
    }

    public String saveContactsToPhonebook() {
        while (true) {

            System.out.print("Enter name to save.");
            names = input.nextLine();

            System.out.print("Enter the number you wish to save(enter an eleven digit number).");
            phoneNumber = input.nextLine();

            if (phoneNumber.length() < 11 || phoneNumber.length() > 11) {
                System.out.print("Invalid number, enter an eleven digit number.");
            } else {
                namesAndNumbers.put(names, phoneNumber);
            }
            System.out.print("Do you wish to add more contacts?");
            String response = input.nextLine();
            while (response.equalsIgnoreCase("yes")) {
                names = input.nextLine();
                phoneNumber = String.valueOf(input.nextInt());
            }
            return phoneNumber;
        }

    }
   public  boolean checkIfPhoneNumberIsEmpty(){
        if(namesAndNumbers.isEmpty()) {
          //namesAndNumbers.put(names, phoneNumber);
            return true;
        }else{
            return false;
        }
    }
    public void displayPhoneBook(){
        System.out.print(namesAndNumbers);
    }
    public boolean checkIfNumberAlreadyExist() {
        if (namesAndNumbers.containsValue(phoneNumber)) {
            return true;
        }else{
            boolean valuePresence = false;
            return valuePresence;
        }
    }

    public String  searchForNumber(){
        System.out.println("Enter name to search in phonebook.");
        String searchName = input.nextLine();
        if(namesAndNumbers.containsKey(searchName)){
           return namesAndNumbers.get(searchName);

        } else  {
            return null;
        }

    }





}