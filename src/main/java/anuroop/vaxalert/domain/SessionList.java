package anuroop.vaxalert.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"sessions"
})
@Generated("jsonschema2pojo")
public class SessionList {

	@JsonProperty("sessions")
	private List<Session> sessions = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("sessions")
	public List<Session> getSessions() {
		return sessions;
	}

	@JsonProperty("sessions")
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(SessionList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("sessions");
		sb.append('=');
		sb.append(((this.sessions == null)?"<null>":this.sessions));
		sb.append(',');
		sb.append("additionalProperties");
		sb.append('=');
		sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
		sb.append(',');
		if (sb.charAt((sb.length()- 1)) == ',') {
			sb.setCharAt((sb.length()- 1), ']');
		} else {
			sb.append(']');
		}
		return sb.toString();
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = ((result* 31)+((this.sessions == null)? 0 :this.sessions.hashCode()));
		result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof SessionList) == false) {
			return false;
		}
		SessionList rhs = ((SessionList) other);
		return (((this.sessions == rhs.sessions)||((this.sessions!= null)&&this.sessions.equals(rhs.sessions)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
	}

}