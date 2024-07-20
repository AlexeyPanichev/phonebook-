import org.example.PhoneBook;
import org.junit.Test;
public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        int count = phoneBook.add("John", "123456");
        assert count == 1;
    }

    @Test
    public void testAddDuplicate() {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("John", "123456");
        int count = phoneBook.add("John", "123456");
        assert count == 1;
    }
}
