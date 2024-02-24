import org.junit.jupiter.api.Test;
import ru.makarevich.banks.Bank;

import static org.junit.jupiter.api.Assertions.*;


public class SampleTest {
    @Test
    public void BanksWith4SymbolShouldBeCreated() {
        final String name = "ABCD";

        Bank bank = new Bank(name);

        assertEquals(name, bank.getName());
    }

    @Test
    public void BanksWith2SymbolShouldNotBeCreated() {
        final String name = "AB";

        assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Bank bank = new Bank(name);
                });
    }
}
