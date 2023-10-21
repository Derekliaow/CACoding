package use_case.clear_users;

// TODO Complete me

import java.lang.reflect.Array;
import java.util.ArrayList;

public class   ClearOutputData {
    private ArrayList<String> user_list;

    public ClearOutputData(ArrayList<String> user_list) {
        this.user_list = user_list;
    }

    public ArrayList<String> getUser_list() {
        return this.user_list;
    }
}
