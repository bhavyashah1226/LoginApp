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
 * CredentialsObscuredGet200Response
 */

@JsonTypeName("_credentials_obscured_get_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
		date = "2024-03-27T18:23:55.118803+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class CredentialsObscuredGet200Response {

	private Boolean obscured;

	public CredentialsObscuredGet200Response obscured(Boolean obscured) {
		this.obscured = obscured;
		return this;
	}

	/**
	 * Get obscured
	 * @return obscured
	 */

	@Schema(name = "obscured", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("obscured")
	public Boolean getObscured() {
		return obscured;
	}

	public void setObscured(Boolean obscured) {
		this.obscured = obscured;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CredentialsObscuredGet200Response credentialsObscuredGet200Response = (CredentialsObscuredGet200Response) o;
		return Objects.equals(this.obscured, credentialsObscuredGet200Response.obscured);
	}

	@Override
	public int hashCode() {
		return Objects.hash(obscured);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CredentialsObscuredGet200Response {\n");
		sb.append("    obscured: ").append(toIndentedString(obscured)).append("\n");
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
