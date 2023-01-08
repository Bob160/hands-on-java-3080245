import javax.security.auth.login.LoginException;

import bank.Customer;
import bank.DataSource;

public class Authenticator {
  
  public static Customer login(String username, String password) throws LoginException {
    //customer = new Customer;
    Customer customer = DataSource.getCustomer(username);
    if (customer == null) {
      throw new LoginException("User does not exist");
    }

    if (password.equals(customer.getPassword())) {
      customer.setAuthenticated(true);
      return customer;
      
    }
    else throw new LoginException("Incorrect Password");
  }

  public static void logout(Customer customer) {
    customer.setAuthenticated(false);
  }
}
