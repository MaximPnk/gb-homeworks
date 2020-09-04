package course3.classwork2;

import course3.classwork2.dao.UsersDAO;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) throws SQLException {

        /*DBConnection
                .getInstance()
                .getConnection()
                .prepareStatement("create TABLE USERS ( " +
                        "    LOGIN VARCHAR(30) UNIQUE NOT NULL, " +
                        "    PASS VARCHAR(10) NOT NULL, " +
                        "    NICK VARCHAR(10) UNIQUE NOT NULL " +
                        " );").execute();*/

        UsersDAO usersDAO = new UsersDAO();
//        usersDAO.addUser(new User("asd", "asd", "asd"));
//        usersDAO.addUser(new User("asd2", "asd2", "asd2"));
//        System.out.println(usersDAO.getUserByNick("asd" ));
        System.out.println(usersDAO.getAllUsers());
    }
}
