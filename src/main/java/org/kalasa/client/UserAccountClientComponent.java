package org.kalasa.client;

import org.kalasa.annotation.Autowired;
import org.kalasa.annotation.Component;
import org.kalasa.annotation.Qualifier;
import org.kalasa.services.AccountService;
import org.kalasa.services.UserService;

@Component
public class UserAccountClientComponent {
    @Autowired
    private UserService userService;

    @Autowired
    @Qualifier(value = "accountServiceImpl")
    private AccountService accountService;

    public void displayUserAccount() {
        String username = userService.getUserName();
        Long accountNumber = accountService.getAccountNumber(username);
        System.out.println("\n\tUser Name: " + username + "\n\tAccount Number: " + accountNumber);
    }
}
