package anuroop.vaxalert.domain;

import javax.annotation.Generated;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"vaccine",
	"fee"
})
@Generated("jsonschema2pojo")
public class VaccineFee {

	@JsonProperty("vaccine")
	private String vaccine;
	@JsonProperty("fee")
	private String fee;

	@JsonProperty("vaccine")
	public String getVaccine() {
		return vaccine;
	}

	@JsonProperty("vaccine")
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	@JsonProperty("fee")
	public String getFee() {
		return fee;
	}

	@JsonProperty("fee")
	public void setFee(String fee) {
		this.fee = fee;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(VaccineFee.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("vaccine");
		sb.append('=');
		sb.append(((this.vaccine == null)?"<null>":this.vaccine));
		sb.append(',');
		sb.append("fee");
		sb.append('=');
		sb.append(((this.fee == null)?"<null>":this.fee));
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
		result = ((result* 31)+((this.vaccine == null)? 0 :this.vaccine.hashCode()));
		result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof VaccineFee) == false) {
			return false;
		}
		VaccineFee rhs = ((VaccineFee) other);
		return (((this.vaccine == rhs.vaccine)||((this.vaccine!= null)&&this.vaccine.equals(rhs.vaccine)))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))));
	}

}