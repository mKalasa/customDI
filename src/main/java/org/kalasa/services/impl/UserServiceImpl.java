package org.kalasa.services.impl;

import org.kalasa.annotation.Component;
import org.kalasa.services.UserService;

@Component
public class UserServiceImpl implements UserService {
    @Override
    public String getUserName() {
        return "kalasa";
    }
}
