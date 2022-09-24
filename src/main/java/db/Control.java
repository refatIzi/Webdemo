package db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Control {
    String[] catsArray = {"refaazergmail.com,qwert12345", "refatgmail.com,qwerty12345", "refa@gmail.com,qwerty12345", "ref@gmail.com,qwerty12345"};

    ArrayList<String> catsList = new ArrayList<>(Arrays.asList(catsArray));
    public boolean check(String check){
       return catsList.contains(check);
    }
}
