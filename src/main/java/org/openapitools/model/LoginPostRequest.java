package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.*;
import javax.annotation.Generated;

/**
 * LoginPostRequest
 */

@JsonTypeName("_login_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
		date = "2024-03-27T18:23:55.118803+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class LoginPostRequest {

	private String username;

	private String password;

	public LoginPostRequest username(String username) {
		this.username = username;
		return this;
	}

	/**
	 * Get username
	 * @return username
	 */

	@Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LoginPostRequest password(String password) {
		this.password = password;
		return this;
	}

	/**
	 * Get password
	 * @return password
	 */

	@Schema(name = "password", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoginPostRequest loginPostRequest = (LoginPostRequest) o;
		return Objects.equals(this.username, loginPostRequest.username)
				&& Objects.equals(this.password, loginPostRequest.password);
	}

	@Override
	public int hashCode() {
		return Objects.hash(username, password);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoginPostRequest {\n");
		sb.append("    username: ").append(toIndentedString(username)).append("\n");
		sb.append("    password: ").append(toIndentedString(password)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	/**
	 * Convert the given object to string with each line indented by 4 spaces (except the
	 * first line).
	 */
	private String toIndentedString(Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}

	// implement validateLogin method
	// Check if username is more than 5 characters
	// Check if password is more than 5 characters and contains both letters and numbers
	public boolean validateLogin() {
		if (this.username.length() > 5 && this.password.length() > 5) {
			return this.password.matches(".*[a-zA-Z].*") && this.password.matches(".*[0-9].*");
		}
		return false;
	}

}
