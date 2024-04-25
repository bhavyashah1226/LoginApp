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
 * UsernamePostRequest
 */

@JsonTypeName("_username_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen",
		date = "2024-03-27T18:23:55.118803+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class UsernamePostRequest {

	private String text;

	public UsernamePostRequest text(String text) {
		this.text = text;
		return this;
	}

	/**
	 * Get text
	 * @return text
	 */

	@Schema(name = "text", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
	@JsonProperty("text")
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		UsernamePostRequest usernamePostRequest = (UsernamePostRequest) o;
		return Objects.equals(this.text, usernamePostRequest.text);
	}

	@Override
	public int hashCode() {
		return Objects.hash(text);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class UsernamePostRequest {\n");
		sb.append("    text: ").append(toIndentedString(text)).append("\n");
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
