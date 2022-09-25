package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Control {
    String[] catsArray = {"Rifat Ismailov", "Rif ISI", "Rifat Zeynalov", "Natsha Zagrebelnaya"};

    List<String> catsList = new ArrayList<>(Arrays.asList(catsArray));

    public boolean check(String check) {
        return catsList.contains(check);
    }

    public List getAccount() {
        return catsList;
    }

    public void setAccount(String user) {
        catsList.add(user);
    }
}
