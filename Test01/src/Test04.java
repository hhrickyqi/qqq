import java.util.*;

public class Test04 {
    public static void main(String[] args) {
        List<Account> list = new ArrayList<>();
        list.add(new Account(52.5,"145234"));
        list.add(new Account(2586744.5,"990111"));
        list.add(new Account(321210,"741358"));
        Map<Integer,Account> map = new HashMap<>();
        for (int i = 0; i < list.size();i++){
            map.put(list.get(i).getId(),list.get(i));
        }
        Set<Map.Entry<Integer, Account>> entries = map.entrySet();
        entries.forEach(s -> System.out.println("id:" + s.getKey()
         + "\t余额:" + s.getValue().getBalance()));
       /* Iterator<Map.Entry<Integer, Account>> iterator = entries.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
*/
    }
}
class Account{
    private int id;
    private double balance;
    private String password;

    public Account(double balance, String password) {
        this.id = (int)(Math.random()*1000);
        this.balance = balance;
        this.password = password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance='" + balance + '\'' +
                '}';
    }
}