package course3.classwork2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String login;
    private String pass;
    private String nick;

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", pass='" + pass + '\'' +
                ", nick='" + nick + '\'' +
                '}';
    }
}
