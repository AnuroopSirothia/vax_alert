package anuroop.vaxalert.domain;

import java.util.List;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
	"center_id",
	"name",
	"address",
	"state_name",
	"district_name",
	"block_name",
	"pincode",
	"lat",
	"long",
	"from",
	"to",
	"fee_type",
	"sessions",
	"vaccine_fees"
})
@Generated("jsonschema2pojo")
public class Center {

	@JsonProperty("center_id")
	private Integer centerId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("address")
	private String address;
	@JsonProperty("state_name")
	private String stateName;
	@JsonProperty("district_name")
	private String districtName;
	@JsonProperty("block_name")
	private String blockName;
	@JsonProperty("pincode")
	private Integer pincode;
	@JsonProperty("lat")
	private Integer lat;
	@JsonProperty("long")
	private Integer _long;
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("fee_type")
	private String feeType;
	@JsonProperty("sessions")
	private List<Session> sessions = null;
	@JsonProperty("vaccine_fees")
	private List<VaccineFee> vaccineFees = null;

	@JsonProperty("center_id")
	public Integer getCenterId() {
		return centerId;
	}

	@JsonProperty("center_id")
	public void setCenterId(Integer centerId) {
		this.centerId = centerId;
	}

	@JsonProperty("name")
	public String getName() {
		return name;
	}

	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	@JsonProperty("address")
	public String getAddress() {
		return address;
	}

	@JsonProperty("address")
	public void setAddress(String address) {
		this.address = address;
	}

	@JsonProperty("state_name")
	public String getStateName() {
		return stateName;
	}

	@JsonProperty("state_name")
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@JsonProperty("district_name")
	public String getDistrictName() {
		return districtName;
	}

	@JsonProperty("district_name")
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	@JsonProperty("block_name")
	public String getBlockName() {
		return blockName;
	}

	@JsonProperty("block_name")
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	@JsonProperty("pincode")
	public Integer getPincode() {
		return pincode;
	}

	@JsonProperty("pincode")
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@JsonProperty("lat")
	public Integer getLat() {
		return lat;
	}

	@JsonProperty("lat")
	public void setLat(Integer lat) {
		this.lat = lat;
	}

	@JsonProperty("long")
	public Integer getLong() {
		return _long;
	}

	@JsonProperty("long")
	public void setLong(Integer _long) {
		this._long = _long;
	}

	@JsonProperty("from")
	public String getFrom() {
		return from;
	}

	@JsonProperty("from")
	public void setFrom(String from) {
		this.from = from;
	}

	@JsonProperty("to")
	public String getTo() {
		return to;
	}

	@JsonProperty("to")
	public void setTo(String to) {
		this.to = to;
	}

	@JsonProperty("fee_type")
	public String getFeeType() {
		return feeType;
	}

	@JsonProperty("fee_type")
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	@JsonProperty("sessions")
	public List<Session> getSessions() {
		return sessions;
	}

	@JsonProperty("sessions")
	public void setSessions(List<Session> sessions) {
		this.sessions = sessions;
	}

	@JsonProperty("vaccine_fees")
	public List<VaccineFee> getVaccineFees() {
		return vaccineFees;
	}

	@JsonProperty("vaccine_fees")
	public void setVaccineFees(List<VaccineFee> vaccineFees) {
		this.vaccineFees = vaccineFees;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(Center.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
		sb.append("centerId");
		sb.append('=');
		sb.append(((this.centerId == null)?"<null>":this.centerId));
		sb.append(',');
		sb.append("name");
		sb.append('=');
		sb.append(((this.name == null)?"<null>":this.name));
		sb.append(',');
		sb.append("address");
		sb.append('=');
		sb.append(((this.address == null)?"<null>":this.address));
		sb.append(',');
		sb.append("stateName");
		sb.append('=');
		sb.append(((this.stateName == null)?"<null>":this.stateName));
		sb.append(',');
		sb.append("districtName");
		sb.append('=');
		sb.append(((this.districtName == null)?"<null>":this.districtName));
		sb.append(',');
		sb.append("blockName");
		sb.append('=');
		sb.append(((this.blockName == null)?"<null>":this.blockName));
		sb.append(',');
		sb.append("pincode");
		sb.append('=');
		sb.append(((this.pincode == null)?"<null>":this.pincode));
		sb.append(',');
		sb.append("lat");
		sb.append('=');
		sb.append(((this.lat == null)?"<null>":this.lat));
		sb.append(',');
		sb.append("_long");
		sb.append('=');
		sb.append(((this._long == null)?"<null>":this._long));
		sb.append(',');
		sb.append("from");
		sb.append('=');
		sb.append(((this.from == null)?"<null>":this.from));
		sb.append(',');
		sb.append("to");
		sb.append('=');
		sb.append(((this.to == null)?"<null>":this.to));
		sb.append(',');
		sb.append("feeType");
		sb.append('=');
		sb.append(((this.feeType == null)?"<null>":this.feeType));
		sb.append(',');
		sb.append("sessions");
		sb.append('=');
		sb.append(((this.sessions == null)?"<null>":this.sessions));
		sb.append(',');
		sb.append("vaccineFees");
		sb.append('=');
		sb.append(((this.vaccineFees == null)?"<null>":this.vaccineFees));
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
		result = ((result* 31)+((this.centerId == null)? 0 :this.centerId.hashCode()));
		result = ((result* 31)+((this.pincode == null)? 0 :this.pincode.hashCode()));
		result = ((result* 31)+((this.sessions == null)? 0 :this.sessions.hashCode()));
		result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
		result = ((result* 31)+((this.districtName == null)? 0 :this.districtName.hashCode()));
		result = ((result* 31)+((this.blockName == null)? 0 :this.blockName.hashCode()));
		result = ((result* 31)+((this.feeType == null)? 0 :this.feeType.hashCode()));
		result = ((result* 31)+((this.stateName == null)? 0 :this.stateName.hashCode()));
		result = ((result* 31)+((this._long == null)? 0 :this._long.hashCode()));
		result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
		result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
		result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
		result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
		result = ((result* 31)+((this.vaccineFees == null)? 0 :this.vaccineFees.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Center) == false) {
			return false;
		}
		Center rhs = ((Center) other);
		return (((((((((((((((this.centerId == rhs.centerId)||((this.centerId!= null)&&this.centerId.equals(rhs.centerId)))&&((this.pincode == rhs.pincode)||((this.pincode!= null)&&this.pincode.equals(rhs.pincode))))&&((this.sessions == rhs.sessions)||((this.sessions!= null)&&this.sessions.equals(rhs.sessions))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.districtName == rhs.districtName)||((this.districtName!= null)&&this.districtName.equals(rhs.districtName))))&&((this.blockName == rhs.blockName)||((this.blockName!= null)&&this.blockName.equals(rhs.blockName))))&&((this.feeType == rhs.feeType)||((this.feeType!= null)&&this.feeType.equals(rhs.feeType))))&&((this.stateName == rhs.stateName)||((this.stateName!= null)&&this.stateName.equals(rhs.stateName))))&&((this._long == rhs._long)||((this._long!= null)&&this._long.equals(rhs._long))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))))&&((this.vaccineFees == rhs.vaccineFees)||((this.vaccineFees!= null)&&this.vaccineFees.equals(rhs.vaccineFees))));
	}

}