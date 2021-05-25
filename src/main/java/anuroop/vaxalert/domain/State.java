package anuroop.vaxalert.domain;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"state_id",
	"state_name"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class State {

	@JsonProperty("state_id")
	private Integer stateId;
	@JsonProperty("state_name")
	private String stateName;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("state_id")
	public Integer getStateId() {
		return stateId;
	}

	@JsonProperty("state_id")
	public void setStateId(Integer stateId) {
		this.stateId = stateId;
	}

	@JsonProperty("state_name")
	public String getStateName() {
		return stateName;
	}

	@JsonProperty("state_name")
	public void setStateName(String stateName) {
		this.stateName = stateName;
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
		sb.append(State.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("stateId");
		sb.append('=');
		sb.append(((this.stateId == null)?"<null>":this.stateId));
		sb.append(',');
		sb.append("stateName");
		sb.append('=');
		sb.append(((this.stateName == null)?"<null>":this.stateName));
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
		result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
		result = ((result* 31)+((this.stateName == null)? 0 :this.stateName.hashCode()));
		result = ((result* 31)+((this.stateId == null)? 0 :this.stateId.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof State) == false) {
			return false;
		}
		State rhs = ((State) other);
		return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.stateName == rhs.stateName)||((this.stateName!= null)&&this.stateName.equals(rhs.stateName))))&&((this.stateId == rhs.stateId)||((this.stateId!= null)&&this.stateId.equals(rhs.stateId))));
	}

}
