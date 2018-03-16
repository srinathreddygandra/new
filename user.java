public class users {
private String username;
private String password;
private String[][] accounts = {{"jesper", "abc123"},{"christian", "abc123"}};

public users(String user, String pass){
    username = user;
    password = pass;
}

public boolean auth(){
    if((username == accounts[0][0]) && (password == accounts[0][1]))
        return true;
    else
        return false;
}

}