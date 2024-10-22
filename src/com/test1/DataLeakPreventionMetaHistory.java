package com.test1;

public class DataLeakPreventionMetaHistory {
	private String historyDate;
	private String dlpIdentifier;
	private String identifierMeta;
	private String preventionRuleCode;
	private String rootCause;
	private boolean rootCauseAccepted;
	private String causeAnalysis;
	private String plugins;
	private String pluginSystems;
	private String dlpType;
	private String fixDoneForFuture;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public DataLeakPreventionMetaHistory() {

	}

	public DataLeakPreventionMetaHistory(String historyDate, String dlpIdentifier, String identifierMeta,
			String preventionRuleCode, String rootCause, boolean rootCauseAccepted, String causeAnalysis,
			String plugins, String pluginSystems, String dlpType, String fixDoneForFuture, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.historyDate = historyDate;
		this.dlpIdentifier = dlpIdentifier;
		this.identifierMeta = identifierMeta;
		this.preventionRuleCode = preventionRuleCode;
		this.rootCause = rootCause;
		this.rootCauseAccepted = rootCauseAccepted;
		this.causeAnalysis = causeAnalysis;
		this.plugins = plugins;
		this.pluginSystems = pluginSystems;
		this.dlpType = dlpType;
		this.fixDoneForFuture = fixDoneForFuture;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public String getHistoryDate() {
		return historyDate;
	}

	public void setHistoryDate(String historyDate) {
		this.historyDate = historyDate;
	}

	public String getDlpIdentifier() {
		return dlpIdentifier;
	}

	public void setDlpIdentifier(String dlpIdentifier) {
		this.dlpIdentifier = dlpIdentifier;
	}

	public String getIdentifierMeta() {
		return identifierMeta;
	}

	public void setIdentifierMeta(String identifierMeta) {
		this.identifierMeta = identifierMeta;
	}

	public String getPreventionRuleCode() {
		return preventionRuleCode;
	}

	public void setPreventionRuleCode(String preventionRuleCode) {
		this.preventionRuleCode = preventionRuleCode;
	}

	public String getRootCause() {
		return rootCause;
	}

	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}

	public boolean isRootCauseAccepted() {
		return rootCauseAccepted;
	}

	public void setRootCauseAccepted(boolean rootCauseAccepted) {
		this.rootCauseAccepted = rootCauseAccepted;
	}

	public String getCauseAnalysis() {
		return causeAnalysis;
	}

	public void setCauseAnalysis(String causeAnalysis) {
		this.causeAnalysis = causeAnalysis;
	}

	public String getPlugins() {
		return plugins;
	}

	public void setPlugins(String plugins) {
		this.plugins = plugins;
	}

	public String getPluginSystems() {
		return pluginSystems;
	}

	public void setPluginSystems(String pluginSystems) {
		this.pluginSystems = pluginSystems;
	}

	public String getDlpType() {
		return dlpType;
	}

	public void setDlpType(String dlpType) {
		this.dlpType = dlpType;
	}

	public String getFixDoneForFuture() {
		return fixDoneForFuture;
	}

	public void setFixDoneForFuture(String fixDoneForFuture) {
		this.fixDoneForFuture = fixDoneForFuture;
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
