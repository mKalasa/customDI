package org.kalasa;

import org.kalasa.client.UserAccountClientComponent;
import org.kalasa.di.Injector;

public class UserAccountApplication {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Injector.startApplication(UserAccountApplication.class);
        Injector.getService(UserAccountClientComponent.class).displayUserAccount();
        long endime = System.currentTimeMillis();
    }
}
