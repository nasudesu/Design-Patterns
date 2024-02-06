package Account;

import org.junit.Test;

import static org.junit.Assert.*;
public class AccountTest {
    Account acc = new Account(50);
    @Test
    public void getBalance() {
        assertEquals(50, acc.getBalance(), 0);
    }
    @Test
    public void deposit() {
        assertEquals(100, acc.deposit(50), 0);
    }
    @Test
    public void withdraw() {
        assertEquals(40, acc.withdraw(10), 0);
    }
}