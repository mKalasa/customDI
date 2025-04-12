package org.kalasa.services.impl;

import org.kalasa.annotation.Component;
import org.kalasa.services.AccountService;

@Component
public class AccountServiceImpl implements AccountService {
    @Override
    public Long getAccountNumber(String userName) {
        return 12345689L;
    }
}
