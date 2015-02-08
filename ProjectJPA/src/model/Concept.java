package model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author interoperabilidad
 */
@Entity
@Table(name = "concept")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Concept.findAll", query = "SELECT c FROM Concept c"),
    @NamedQuery(name = "Concept.findByConceptId", query = "SELECT c FROM Concept c WHERE c.conceptId = :conceptId"),
    @NamedQuery(name = "Concept.findByRetired", query = "SELECT c FROM Concept c WHERE c.retired = :retired"),
    @NamedQuery(name = "Concept.findByShortName", query = "SELECT c FROM Concept c WHERE c.shortName = :shortName"),
    @NamedQuery(name = "Concept.findByDescription", query = "SELECT c FROM Concept c WHERE c.description = :description"),
    @NamedQuery(name = "Concept.findByFormText", query = "SELECT c FROM Concept c WHERE c.formText = :formText"),
    @NamedQuery(name = "Concept.findByIsSet", query = "SELECT c FROM Concept c WHERE c.isSet = :isSet"),
    @NamedQuery(name = "Concept.findByCreator", query = "SELECT c FROM Concept c WHERE c.creator = :creator"),
    @NamedQuery(name = "Concept.findByDateCreated", query = "SELECT c FROM Concept c WHERE c.dateCreated = :dateCreated"),
    @NamedQuery(name = "Concept.findByDefaultCharge", query = "SELECT c FROM Concept c WHERE c.defaultCharge = :defaultCharge"),
    @NamedQuery(name = "Concept.findByVersion", query = "SELECT c FROM Concept c WHERE c.version = :version"),
    @NamedQuery(name = "Concept.findByChangedBy", query = "SELECT c FROM Concept c WHERE c.changedBy = :changedBy"),
    @NamedQuery(name = "Concept.findByDateChanged", query = "SELECT c FROM Concept c WHERE c.dateChanged = :dateChanged"),
    @NamedQuery(name = "Concept.findByRetiredBy", query = "SELECT c FROM Concept c WHERE c.retiredBy = :retiredBy"),
    @NamedQuery(name = "Concept.findByDateRetired", query = "SELECT c FROM Concept c WHERE c.dateRetired = :dateRetired"),
    @NamedQuery(name = "Concept.findByRetireReason", query = "SELECT c FROM Concept c WHERE c.retireReason = :retireReason"),
    @NamedQuery(name = "Concept.findByUuid", query = "SELECT c FROM Concept c WHERE c.uuid = :uuid")})
public class Concept implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "concept_id")
    private Integer conceptId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "retired")
    private short retired;
    @Size(max = 255)
    @Column(name = "short_name")
    private String shortName;
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 2147483647)
    @Column(name = "form_text")
    private String formText;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_set")
    private short isSet;
    @Basic(optional = false)
    @NotNull
    @Column(name = "creator")
    private int creator;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date_created")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreated;
    @Column(name = "default_charge")
    private Integer defaultCharge;
    @Size(max = 50)
    @Column(name = "version")
    private String version;
    @Column(name = "changed_by")
    private Integer changedBy;
    @Column(name = "date_changed")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateChanged;
    @Column(name = "retired_by")
    private Integer retiredBy;
    @Column(name = "date_retired")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRetired;
    @Size(max = 255)
    @Column(name = "retire_reason")
    private String retireReason;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 38)
    @Column(name = "uuid")
    private String uuid;

    public Concept() {
    }

    public Concept(Integer conceptId) {
        this.conceptId = conceptId;
    }

    public Concept(Integer conceptId, short retired, short isSet, int creator, Date dateCreated, String uuid) {
        this.conceptId = conceptId;
        this.retired = retired;
        this.isSet = isSet;
        this.creator = creator;
        this.dateCreated = dateCreated;
        this.uuid = uuid;
    }

    public Integer getConceptId() {
        return conceptId;
    }

    public void setConceptId(Integer conceptId) {
        this.conceptId = conceptId;
    }

    public short getRetired() {
        return retired;
    }

    public void setRetired(short retired) {
        this.retired = retired;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getFormText() {
        return formText;
    }

    public void setFormText(String formText) {
        this.formText = formText;
    }

    public short getIsSet() {
        return isSet;
    }

    public void setIsSet(short isSet) {
        this.isSet = isSet;
    }

    public int getCreator() {
        return creator;
    }

    public void setCreator(int creator) {
        this.creator = creator;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Integer getDefaultCharge() {
        return defaultCharge;
    }

    public void setDefaultCharge(Integer defaultCharge) {
        this.defaultCharge = defaultCharge;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getChangedBy() {
        return changedBy;
    }

    public void setChangedBy(Integer changedBy) {
        this.changedBy = changedBy;
    }

    public Date getDateChanged() {
        return dateChanged;
    }

    public void setDateChanged(Date dateChanged) {
        this.dateChanged = dateChanged;
    }

    public Integer getRetiredBy() {
        return retiredBy;
    }

    public void setRetiredBy(Integer retiredBy) {
        this.retiredBy = retiredBy;
    }

    public Date getDateRetired() {
        return dateRetired;
    }

    public void setDateRetired(Date dateRetired) {
        this.dateRetired = dateRetired;
    }

    public String getRetireReason() {
        return retireReason;
    }

    public void setRetireReason(String retireReason) {
        this.retireReason = retireReason;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

  
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conceptId != null ? conceptId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Concept)) {
            return false;
        }
        Concept other = (Concept) object;
        if ((this.conceptId == null && other.conceptId != null) || (this.conceptId != null && !this.conceptId.equals(other.conceptId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.artica.example.Concept[ conceptId=" + conceptId + " ]";
    }
    
}
