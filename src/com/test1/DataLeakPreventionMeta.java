package com.test1;

public class DataLeakPreventionMeta {
	private String dlpIdentifier;
	private String source;
	private String dataBreach;
	private String exfiltration;
	private boolean keypart;
	private Integer dataLossRiskIdentifier;
	private boolean severeRiskFlag;
	private String preventionMeasure;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataLeakPreventionMeta() {

	}

	public DataLeakPreventionMeta(String dlpIdentifier, String source, String dataBreach, String exfiltration,
			boolean keypart, Integer dataLossRiskIdentifier, boolean severeRiskFlag, String preventionMeasure,
			String creationDate, String modifiedDate, String entityState) {
		super();
		this.dlpIdentifier = dlpIdentifier;
		this.source = source;
		this.dataBreach = dataBreach;
		this.exfiltration = exfiltration;
		this.keypart = keypart;
		this.dataLossRiskIdentifier = dataLossRiskIdentifier;
		this.severeRiskFlag = severeRiskFlag;
		this.preventionMeasure = preventionMeasure;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getDlpIdentifier() {
		return dlpIdentifier;
	}

	public void setDlpIdentifier(String dlpIdentifier) {
		this.dlpIdentifier = dlpIdentifier;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDataBreach() {
		return dataBreach;
	}

	public void setDataBreach(String dataBreach) {
		this.dataBreach = dataBreach;
	}

	public String getExfiltration() {
		return exfiltration;
	}

	public void setExfiltration(String exfiltration) {
		this.exfiltration = exfiltration;
	}

	public boolean isKeypart() {
		return keypart;
	}

	public void setKeypart(boolean keypart) {
		this.keypart = keypart;
	}

	public Integer getDataLossRiskIdentifier() {
		return dataLossRiskIdentifier;
	}

	public void setDataLossRiskIdentifier(Integer dataLossRiskIdentifier) {
		this.dataLossRiskIdentifier = dataLossRiskIdentifier;
	}

	public boolean isSevereRiskFlag() {
		return severeRiskFlag;
	}

	public void setSevereRiskFlag(boolean severeRiskFlag) {
		this.severeRiskFlag = severeRiskFlag;
	}

	public String getPreventionMeasure() {
		return preventionMeasure;
	}

	public void setPreventionMeasure(String preventionMeasure) {
		this.preventionMeasure = preventionMeasure;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
