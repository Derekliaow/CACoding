package interface_adapter.clear_users;

// TODO Complete me

import java.util.ArrayList;

public class ClearState {
    private ArrayList<String> user_list;

    public ClearState(ClearState copy) {
        user_list = copy.user_list;
    }
    public ClearState() {
    }

    public ArrayList<String> getUser_list() {return user_list;}
    public void setUser_list(ArrayList<String> user_list) {
        this.user_list = user_list;
    }
    public String toString() {
        String str = "Deleted Users: ";
        for (int i = 0; i < user_list.size(); i++) {
            str = str + user_list.get(i) + "\r\n";
        }
        return str;
    }
}
