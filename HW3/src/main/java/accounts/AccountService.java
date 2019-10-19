package accounts;

import dbService.DBException;
import dbService.DBService;
import dbService.dataSets.UsersDataSet;

public class AccountService {
   private final DBService dbService;

    public AccountService() {
        dbService = new DBService();
        dbService.printConnectInfo();
    }

    public void addNewUser(UsersDataSet user) {
        try {
            dbService.addUser(user);
        } catch (DBException e) {
            e.printStackTrace();
        }
    }

    public UsersDataSet getUserByLogin(String login) {
        UsersDataSet user = null;
        try {
            user = dbService.getUser(login);
        } catch (DBException e) {
            e.printStackTrace();
        }
        return user;
    }

}
