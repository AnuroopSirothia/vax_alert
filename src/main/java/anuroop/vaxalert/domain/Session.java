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
	"center_id",
	"name",
	"address",
	"state_name",
	"district_name",
	"block_name",
	"pincode",
	"from",
	"to",
	"lat",
	"long",
	"fee_type",
	"session_id",
	"date",
	"available_capacity_dose1",
	"available_capacity_dose2",
	"available_capacity",
	"fee",
	"min_age_limit",
	"vaccine",
	"slots"
})
@Generated("jsonschema2pojo")
public class Session {

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
	@JsonProperty("from")
	private String from;
	@JsonProperty("to")
	private String to;
	@JsonProperty("lat")
	private Integer lat;
	@JsonProperty("long")
	private Integer _long;
	@JsonProperty("fee_type")
	private String feeType;
	@JsonProperty("session_id")
	private String sessionId;
	@JsonProperty("date")
	private String date;
	@JsonProperty("available_capacity_dose1")
	private Integer availableCapacityDose1;
	@JsonProperty("available_capacity_dose2")
	private Integer availableCapacityDose2;
	@JsonProperty("available_capacity")
	private Integer availableCapacity;
	@JsonProperty("fee")
	private String fee;
	@JsonProperty("min_age_limit")
	private Integer minAgeLimit;
	@JsonProperty("vaccine")
	private String vaccine;
	@JsonProperty("slots")
	private List<String> slots = null;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	@JsonProperty("fee_type")
	public String getFeeType() {
		return feeType;
	}

	@JsonProperty("fee_type")
	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	@JsonProperty("session_id")
	public String getSessionId() {
		return sessionId;
	}

	@JsonProperty("session_id")
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
	}

	@JsonProperty("available_capacity_dose1")
	public Integer getAvailableCapacityDose1() {
		return availableCapacityDose1;
	}

	@JsonProperty("available_capacity_dose1")
	public void setAvailableCapacityDose1(Integer availableCapacityDose1) {
		this.availableCapacityDose1 = availableCapacityDose1;
	}

	@JsonProperty("available_capacity_dose2")
	public Integer getAvailableCapacityDose2() {
		return availableCapacityDose2;
	}

	@JsonProperty("available_capacity_dose2")
	public void setAvailableCapacityDose2(Integer availableCapacityDose2) {
		this.availableCapacityDose2 = availableCapacityDose2;
	}

	@JsonProperty("available_capacity")
	public Integer getAvailableCapacity() {
		return availableCapacity;
	}

	@JsonProperty("available_capacity")
	public void setAvailableCapacity(Integer availableCapacity) {
		this.availableCapacity = availableCapacity;
	}

	@JsonProperty("fee")
	public String getFee() {
		return fee;
	}

	@JsonProperty("fee")
	public void setFee(String fee) {
		this.fee = fee;
	}

	@JsonProperty("min_age_limit")
	public Integer getMinAgeLimit() {
		return minAgeLimit;
	}

	@JsonProperty("min_age_limit")
	public void setMinAgeLimit(Integer minAgeLimit) {
		this.minAgeLimit = minAgeLimit;
	}

	@JsonProperty("vaccine")
	public String getVaccine() {
		return vaccine;
	}

	@JsonProperty("vaccine")
	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	@JsonProperty("slots")
	public List<String> getSlots() {
		return slots;
	}

	@JsonProperty("slots")
	public void setSlots(List<String> slots) {
		this.slots = slots;
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
		sb.append(Session.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
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
		sb.append("from");
		sb.append('=');
		sb.append(((this.from == null)?"<null>":this.from));
		sb.append(',');
		sb.append("to");
		sb.append('=');
		sb.append(((this.to == null)?"<null>":this.to));
		sb.append(',');
		sb.append("lat");
		sb.append('=');
		sb.append(((this.lat == null)?"<null>":this.lat));
		sb.append(',');
		sb.append("_long");
		sb.append('=');
		sb.append(((this._long == null)?"<null>":this._long));
		sb.append(',');
		sb.append("feeType");
		sb.append('=');
		sb.append(((this.feeType == null)?"<null>":this.feeType));
		sb.append(',');
		sb.append("sessionId");
		sb.append('=');
		sb.append(((this.sessionId == null)?"<null>":this.sessionId));
		sb.append(',');
		sb.append("date");
		sb.append('=');
		sb.append(((this.date == null)?"<null>":this.date));
		sb.append(',');
		sb.append("availableCapacityDose1");
		sb.append('=');
		sb.append(((this.availableCapacityDose1 == null)?"<null>":this.availableCapacityDose1));
		sb.append(',');
		sb.append("availableCapacityDose2");
		sb.append('=');
		sb.append(((this.availableCapacityDose2 == null)?"<null>":this.availableCapacityDose2));
		sb.append(',');
		sb.append("availableCapacity");
		sb.append('=');
		sb.append(((this.availableCapacity == null)?"<null>":this.availableCapacity));
		sb.append(',');
		sb.append("fee");
		sb.append('=');
		sb.append(((this.fee == null)?"<null>":this.fee));
		sb.append(',');
		sb.append("minAgeLimit");
		sb.append('=');
		sb.append(((this.minAgeLimit == null)?"<null>":this.minAgeLimit));
		sb.append(',');
		sb.append("vaccine");
		sb.append('=');
		sb.append(((this.vaccine == null)?"<null>":this.vaccine));
		sb.append(',');
		sb.append("slots");
		sb.append('=');
		sb.append(((this.slots == null)?"<null>":this.slots));
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
		result = ((result* 31)+((this.date == null)? 0 :this.date.hashCode()));
		result = ((result* 31)+((this.centerId == null)? 0 :this.centerId.hashCode()));
		result = ((result* 31)+((this.pincode == null)? 0 :this.pincode.hashCode()));
		result = ((result* 31)+((this.availableCapacity == null)? 0 :this.availableCapacity.hashCode()));
		result = ((result* 31)+((this.minAgeLimit == null)? 0 :this.minAgeLimit.hashCode()));
		result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
		result = ((result* 31)+((this.districtName == null)? 0 :this.districtName.hashCode()));
		result = ((result* 31)+((this.blockName == null)? 0 :this.blockName.hashCode()));
		result = ((result* 31)+((this.fee == null)? 0 :this.fee.hashCode()));
		result = ((result* 31)+((this.sessionId == null)? 0 :this.sessionId.hashCode()));
		result = ((result* 31)+((this.feeType == null)? 0 :this.feeType.hashCode()));
		result = ((result* 31)+((this.availableCapacityDose1 == null)? 0 :this.availableCapacityDose1 .hashCode()));
		result = ((result* 31)+((this.availableCapacityDose2 == null)? 0 :this.availableCapacityDose2 .hashCode()));
		result = ((result* 31)+((this.vaccine == null)? 0 :this.vaccine.hashCode()));
		result = ((result* 31)+((this.slots == null)? 0 :this.slots.hashCode()));
		result = ((result* 31)+((this.stateName == null)? 0 :this.stateName.hashCode()));
		result = ((result* 31)+((this._long == null)? 0 :this._long.hashCode()));
		result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
		result = ((result* 31)+((this.from == null)? 0 :this.from.hashCode()));
		result = ((result* 31)+((this.to == null)? 0 :this.to.hashCode()));
		result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
		result = ((result* 31)+((this.lat == null)? 0 :this.lat.hashCode()));
		return result;
	}

	@Override
	public boolean equals(Object other) {
		if (other == this) {
			return true;
		}
		if ((other instanceof Session) == false) {
			return false;
		}
		Session rhs = ((Session) other);
		return (((((((((((((((((((((((this.date == rhs.date)||((this.date!= null)&&this.date.equals(rhs.date)))&&((this.centerId == rhs.centerId)||((this.centerId!= null)&&this.centerId.equals(rhs.centerId))))&&((this.pincode == rhs.pincode)||((this.pincode!= null)&&this.pincode.equals(rhs.pincode))))&&((this.availableCapacity == rhs.availableCapacity)||((this.availableCapacity!= null)&&this.availableCapacity.equals(rhs.availableCapacity))))&&((this.minAgeLimit == rhs.minAgeLimit)||((this.minAgeLimit!= null)&&this.minAgeLimit.equals(rhs.minAgeLimit))))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.districtName == rhs.districtName)||((this.districtName!= null)&&this.districtName.equals(rhs.districtName))))&&((this.blockName == rhs.blockName)||((this.blockName!= null)&&this.blockName.equals(rhs.blockName))))&&((this.fee == rhs.fee)||((this.fee!= null)&&this.fee.equals(rhs.fee))))&&((this.sessionId == rhs.sessionId)||((this.sessionId!= null)&&this.sessionId.equals(rhs.sessionId))))&&((this.feeType == rhs.feeType)||((this.feeType!= null)&&this.feeType.equals(rhs.feeType))))&&((this.availableCapacityDose1 == rhs.availableCapacityDose1)||((this.availableCapacityDose1 != null)&&this.availableCapacityDose1 .equals(rhs.availableCapacityDose1))))&&((this.availableCapacityDose2 == rhs.availableCapacityDose2)||((this.availableCapacityDose2 != null)&&this.availableCapacityDose2 .equals(rhs.availableCapacityDose2))))&&((this.vaccine == rhs.vaccine)||((this.vaccine!= null)&&this.vaccine.equals(rhs.vaccine))))&&((this.slots == rhs.slots)||((this.slots!= null)&&this.slots.equals(rhs.slots))))&&((this.stateName == rhs.stateName)||((this.stateName!= null)&&this.stateName.equals(rhs.stateName))))&&((this._long == rhs._long)||((this._long!= null)&&this._long.equals(rhs._long))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.from == rhs.from)||((this.from!= null)&&this.from.equals(rhs.from))))&&((this.to == rhs.to)||((this.to!= null)&&this.to.equals(rhs.to))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.lat == rhs.lat)||((this.lat!= null)&&this.lat.equals(rhs.lat))));
	}

}