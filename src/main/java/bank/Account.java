package bank;

public class Account {
  private int id;
  private String type;
  private Long balance;

  public Account(int id, String type, Long balance) {
    setId(id);
    setType(type);
    setBalance(balance);
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Long getBalance() {
    return this.balance;
  }

  public void setBalance(Long balance) {
    this.balance = balance;
  }

}
