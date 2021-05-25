package anuroop.vaxalert.domain;

import java.util.HashMap;
import java.util.List;
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
	"states",
	"ttl"
})
@Generated("jsonschema2pojo")
@JsonIgnoreProperties(ignoreUnknown = true)
public class StateList {

	@JsonProperty("states")
	private List<State> states = null;
	@JsonProperty("ttl")
	private Integer ttl;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("states")
	public List<State> getStates() {
		return states;
	}

	@JsonProperty("states")
	public void setStates(List<State> states) {
		this.states = states;
	}

	@JsonProperty("ttl")
	public Integer getTtl() {
		return ttl;
	}

	@JsonProperty("ttl")
	public void setTtl(Integer ttl) {
		this.ttl = ttl;
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
		sb.append(StateList.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("states");
		sb.append('=');
		sb.append(((this.states == null)?"<null>":this.states));
		sb.append(',');
		sb.append("ttl");
		sb.append('=');
		sb.append(((this.ttl == null)?"<null>":this.ttl));
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
		result = ((result* 31)+((this.ttl == null)? 0 :this.ttl.hashCode()));
		result = ((result* 31)+((this.states == null)? 0 :this.states.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof StateList) == false) {
			return false;
		}
		StateList rhs = ((StateList) other);
		return ((((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties)))&&((this.ttl == rhs.ttl)||((this.ttl!= null)&&this.ttl.equals(rhs.ttl))))&&((this.states == rhs.states)||((this.states!= null)&&this.states.equals(rhs.states))));
	}

}