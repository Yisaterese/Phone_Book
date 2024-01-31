import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testCanSearchIfContactsPresent(){
        PhoneBook phonebook = new PhoneBook();

        String phoneNumberName = phonebook.searchForNumber();
        assertNotNull(phoneNumberName);

    }

    @Test
    public void testCanCheckIfPhoneBookSearchIsNull(){
        PhoneBook phonebook = new PhoneBook();

        String phoneNumberName = phonebook.searchForNumber();
        assertNull(phoneNumberName);
    }

    @Test
    public void testIfNamesAndNumbersEmpty(){
        PhoneBook phonebook = new PhoneBook();

        boolean validity = phonebook.checkIfPhoneNumberIsEmpty();
        assertTrue(validity);
    }


    @Test
    public void testIfNamesAndNumbersIsNotEmpty() {
        PhoneBook phonebook = new PhoneBook();

        boolean validity = phonebook.checkIfPhoneNumberIsEmpty();
        assertFalse(validity);
    }

    @Test
    public void testIfPhonebookCanSaveContacts(){
        PhoneBook phonebook = new PhoneBook();

        String contacts = phonebook.saveContactsToPhonebook();
        assertNotNull(contacts);

    }

    @Test
    public void testIfPhoneNumberAlreadyExist(){
        PhoneBook phonebook = new PhoneBook();

        boolean phoneNumber = phonebook.checkIfNumberAlreadyExist();
        assertTrue(phoneNumber);
    }




}