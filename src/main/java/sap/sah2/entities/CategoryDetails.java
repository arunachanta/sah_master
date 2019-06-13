package sap.sah2.entities;

import java.io.Serializable;
import java.sql.Clob;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.SequenceGenerator;


//import com.sah.foundation.SAHBean;

@Entity
@Table(name = "\"sah.groups::groups.CategoryDetails\"")
@SequenceGenerator(name = "\"sah.groups::CategoryDetailsUUID\"", initialValue = 1, allocationSize = 2)
public class CategoryDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CategoryDetails(){
		
	}
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "\"sah.groups::CategoryDetailsUUID\"")
	@Column(name = "\"UUID\"")
	private Integer UUID;
	
	@Column(name = "\"ID\"")
	private Integer ID;	
	
	@Column(name = "\"Title\"")
	private String Title;
	
	@Column(name = "\"Description\"")
	private String Description;	
	
	@Column(name = "\"CreatedBy\"")
	private String CreatedBy;
	
	@Column(name = "\"CreatedAt\"")
	private Date CreatedAt;
	
	@Column(name = "\"ChangedBy\"")
	private String ChangedBy;
	
	@Column(name = "\"ChangedAt\"")
	private Date ChangedAt;
	
	@Column(name = "\"Type\"")
	private String Type;
	
	@Column(length=1000, name = "\"Query\"")
	private String Query;
	
	@Column(name = "\"DataModelVersion\"")
	private Integer DataModelVersion;
	
	@Column(name = "\"GroupType\"")
	private String GroupType;
	
	@Column(name = "\"MasterDataField\"")
	private String MasterDataField;
	
	@Column(name = "\"ParentID\"")
	private Integer ParentID;
	
	@Column(name = "\"GroupUpdatedDate\"")
	private Date GroupUpdatedDate;
	
	@Column (name = "\"URL\"")
	private String URL;
	
	@Column(name = "\"GroupRefreshStatus\"")
	private String GroupRefreshStatus;

	
	public Integer getUUID() {
		return UUID;
	}
	public void setUUID(Integer uUID) {
		UUID = uUID;
	}
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCreatedBy() {
		return CreatedBy;
	}
	public void setCreatedBy(String createdBy) {
		CreatedBy = createdBy;
	}
	public Date getCreatedAt() {
		return CreatedAt;
	}
	public void setCreatedAt(Date createdAt) {
		CreatedAt = createdAt;
	}
	public String getChangedBy() {
		return ChangedBy;
	}
	public void setChangedBy(String changedBy) {
		ChangedBy = changedBy;
	}
	public Date getChangedAt() {
		return ChangedAt;
	}
	public void setChangedAt(Date changedAt) {
		ChangedAt = changedAt;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getQuery() {
		return Query;
	}
	public void setQuery(String query) {
		Query = query;
	}
	public String getGroupRefreshStatus() {
		return GroupRefreshStatus;
	}
	public void setGroupRefreshStatus(String groupRefreshStatus) {
		GroupRefreshStatus = groupRefreshStatus;
	}
	public Integer getDataModelVersion() {
		return DataModelVersion;
	}
	public void setDataModelVersion(Integer dataModelVersion) {
		DataModelVersion = dataModelVersion;
	}
	public String getGroupType() {
		return GroupType;
	}
	public void setGroupType(String groupType) {
		GroupType = groupType;
	}
	public String getMasterDataField() {
		return MasterDataField;
	}
	public void setMasterDataField(String masterDataField) {
		MasterDataField = masterDataField;
	}
	public Integer getParentID() {
		return ParentID;
	}
	public void setParentID(Integer parentID) {
		ParentID = parentID;
	}
	public Date getGroupUpdatedDate() {
		return GroupUpdatedDate;
	}
	public void setGroupUpdatedDate(Date groupUpdatedDate) {
		GroupUpdatedDate = groupUpdatedDate;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	
}
