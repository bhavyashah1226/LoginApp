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
 * LoginButtonStatusGet200Response
 */

@JsonTypeName("_login_button_status_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
		date = "2024-03-27T18:23:55.118803+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class LoginButtonStatusGet200Response {

	private String status;

	public LoginButtonStatusGet200Response status(String status) {
		this.status = status;
		return this;
	}

	/**
	 * Get status
	 * @return status
	 */

	@Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		LoginButtonStatusGet200Response loginButtonStatusGet200Response = (LoginButtonStatusGet200Response) o;
		return Objects.equals(this.status, loginButtonStatusGet200Response.status);
	}

	@Override
	public int hashCode() {
		return Objects.hash(status);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class LoginButtonStatusGet200Response {\n");
		sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

}
