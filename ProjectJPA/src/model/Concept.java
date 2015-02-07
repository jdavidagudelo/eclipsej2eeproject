package model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


/**
 * The persistent class for the concept database table.
 * 
 */
@Entity
@NamedQuery(name="Concept.findAll", query="SELECT c FROM Concept c")
public class Concept implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="concept_id")
	private Integer conceptId;

	@Column(name="changed_by")
	private Integer changedBy;

	private Integer creator;

	@Column(name="date_changed")
	private Timestamp dateChanged;

	@Column(name="date_created")
	private Timestamp dateCreated;

	@Column(name="date_retired")
	private Timestamp dateRetired;

	@Column(name="default_charge")
	private Integer defaultCharge;

	private String description;

	@Column(name="form_text")
	private String formText;

	@Column(name="is_set")
	private Integer isSet;

	@Column(name="retire_reason")
	private String retireReason;

	private Integer retired;

	@Column(name="retired_by")
	private Integer retiredBy;

	@Column(name="short_name")
	private String shortName;

	private String uuid;

	private String version;

	
	public Concept() {
	}

	public Integer getConceptId() {
		return this.conceptId;
	}

	public void setConceptId(Integer conceptId) {
		this.conceptId = conceptId;
	}

	public Integer getChangedBy() {
		return this.changedBy;
	}

	public void setChangedBy(Integer changedBy) {
		this.changedBy = changedBy;
	}

	public Integer getCreator() {
		return this.creator;
	}

	public void setCreator(Integer creator) {
		this.creator = creator;
	}

	public Timestamp getDateChanged() {
		return this.dateChanged;
	}

	public void setDateChanged(Timestamp dateChanged) {
		this.dateChanged = dateChanged;
	}

	public Timestamp getDateCreated() {
		return this.dateCreated;
	}

	public void setDateCreated(Timestamp dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Timestamp getDateRetired() {
		return this.dateRetired;
	}

	public void setDateRetired(Timestamp dateRetired) {
		this.dateRetired = dateRetired;
	}

	public Integer getDefaultCharge() {
		return this.defaultCharge;
	}

	public void setDefaultCharge(Integer defaultCharge) {
		this.defaultCharge = defaultCharge;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFormText() {
		return this.formText;
	}

	public void setFormText(String formText) {
		this.formText = formText;
	}

	public Integer getIsSet() {
		return this.isSet;
	}

	public void setIsSet(Integer isSet) {
		this.isSet = isSet;
	}

	public String getRetireReason() {
		return this.retireReason;
	}

	public void setRetireReason(String retireReason) {
		this.retireReason = retireReason;
	}

	public Integer getRetired() {
		return this.retired;
	}

	public void setRetired(Integer retired) {
		this.retired = retired;
	}

	public Integer getRetiredBy() {
		return this.retiredBy;
	}

	public void setRetiredBy(Integer retiredBy) {
		this.retiredBy = retiredBy;
	}

	public String getShortName() {
		return this.shortName;
	}

	public void setShortName(String shortName) {
		this.shortName = shortName;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}


}