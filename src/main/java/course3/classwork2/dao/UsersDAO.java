package course3.classwork2.dao;

import course3.classwork2.DBConnection;
import course3.classwork2.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsersDAO {

    PreparedStatement ps = null;

    public void addUser(User user) throws SQLException {
        ps = DBConnection
                .getInstance()
                .getConnection()
                .prepareStatement("INSERT INTO users (login, pass, nick) VALUES (?, ?, ?)");
        ps.setString(1, user.getLogin());
        ps.setString(2, user.getPass());
        ps.setString(3, user.getNick());
        int a = ps.executeUpdate();
    }

    public User getUserByNick(String nick) throws SQLException {
        ps = DBConnection
                .getInstance()
                .getConnection()
                .prepareStatement("SELECT * FROM users WHERE nick = ?");
        ps.setString(1, nick);
        ResultSet set = ps.executeQuery();
        User user = new User();
        if (set.next()) {
            user.setLogin(set.getString(1));
            user.setPass(set.getString("PASS"));
            user.setNick(set.getString("NICK"));
        }
        return user;
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        ps = DBConnection
                .getInstance()
                .getConnection()
                .prepareStatement("SELECT * FROM users");
        ResultSet set = ps.executeQuery();
        while (set.next()) {
            User user = new User();
            user.setLogin(set.getString(1));
            user.setPass(set.getString("PASS"));
            user.setNick(set.getString("NICK"));
            users.add(user);
        }
        return users;
    }
}
