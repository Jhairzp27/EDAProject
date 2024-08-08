package Controlers;

public class Sesion {
    private static Sesion instance;
    private int userId;
    private String userName;

    private Sesion() {
        // Constructor privado para evitar múltiples instancias
    }

    public static Sesion getInstance() {
        if (instance == null) {
            instance = new Sesion();
        }
        return instance;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void clear() {
        userId = 0;
        userName = null;
    }
}
