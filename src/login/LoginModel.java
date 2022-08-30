package login;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LoginModel {
	 private StringProperty user = new SimpleStringProperty("");
	    private StringProperty password = new SimpleStringProperty("");

	    public String getUser() {
	        return user.get();
	    }

	    public StringProperty userProperty() {
	        return user;
	    }

	    public void setUser(String user) {
	        this.user.set(user);
	    }

	    public String getPassword() {
	        return password.get();
	    }

	    public StringProperty passwordProperty() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password.set(password);
	    }
}
