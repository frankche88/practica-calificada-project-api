package project.security.domain.entity;

import java.util.Set;

import org.mindrot.jbcrypt.BCrypt;

public class User {

	private String username;
	private String password;
	private String email;

	public User() {
	}

	public User(String username, String password, String email) {

		this.username = username;

		this.password = BCrypt.hashpw(password, BCrypt.gensalt(15));

		this.email = email;
	}

	public User(String username, String password, String email,

			boolean enabled, Set<UserRole> userRole) {

		this.username = username;

		this.password = BCrypt.hashpw(password, BCrypt.gensalt(15));

		this.email = email;
	}

	public boolean verifyIdentity(String plainPassword) {

		return BCrypt.checkpw(plainPassword, password);
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
