/* feito com a ajuda do link:
 * https://glysns.gitbook.io/spring-framework/spring-web/primeiro-controller
 */

package dio.myfirstwebapi.controller.model;

public class Usuario {
    private Integer id;
    private String login;
    private String password;
    public Usuario() {}
    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }
    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public Integer getId() {
        return id;
    }
}
/*impossível ver na aula... */