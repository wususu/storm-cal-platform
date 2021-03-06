package model;

import java.util.Date;

public class AttrConf {

    private String aid;
    private Integer tableId;
    private Integer attrType;  //实时 复合 
    private Integer calType;  //替换最新值 最大值 最小值 字符串拼接 替换最新
    private String dbName;
    private String tblName;
    private String dimensionType;
    private String dimensionKey;
    private String field; //列名
    private String fieldType; // 字符串 整数 浮点数 日期 
    private String calExpression;
    private Date createTime;
    private Integer isOnline;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public Integer getTableId() {
        return tableId;
    }

    public void setTableId(Integer tableId) {
        this.tableId = tableId;
    }

    public Integer getAttrType() {
        return attrType;
    }

    public void setAttrType(Integer attrType) {
        this.attrType = attrType;
    }

    public int getCalType() {
        return calType;
    }

    public void setCalType(Integer calType) {
        this.calType = calType;
    }

    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public String getTblName() {
        return tblName;
    }

    public void setTblName(String tblName) {
        this.tblName = tblName;
    }

    public String getDimensionType() {
        return dimensionType;
    }

    public void setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
    }

    public String getDimensionKey() {
        return dimensionKey;
    }

    public void setDimensionKey(String dimensionKey) {
        this.dimensionKey = dimensionKey;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getCalExpression() {
        return calExpression;
    }

    public void setCalExpression(String calExpression) {
        this.calExpression = calExpression;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getIsOnline() {
        return isOnline;
    }

    public void setIsOnline(Integer isOnline) {
        this.isOnline = isOnline;
    }

	@Override
	public String toString() {
		return "AttrConf [aid=" + aid + ", tableId=" + tableId + ", attrType=" + attrType + ", calType=" + calType
				+ ", dbName=" + dbName + ", tblName=" + tblName + ", dimensionType=" + dimensionType + ", dimensionKey="
				+ dimensionKey + ", field=" + field + ", calExpression=" + calExpression + ", createTime=" + createTime
				+ ", isOnline=" + isOnline + "]";
	}

	public String getFieldType() {
		return fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}
}
