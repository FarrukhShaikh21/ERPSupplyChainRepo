package erpscm.modelscm.scmeo;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Aug 20 13:46:41 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmParameterImpl extends EntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ParameterId,
        ParameterValue,
        ParameterDescrption,
        CompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        GlobalCompanyId,
        IsActive;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int PARAMETERID = AttributesEnum.ParameterId.index();
    public static final int PARAMETERVALUE = AttributesEnum.ParameterValue.index();
    public static final int PARAMETERDESCRPTION = AttributesEnum.ParameterDescrption.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmParameterImpl() {
    }

    /**
     * Gets the attribute value for ParameterId, using the alias name ParameterId.
     * @return the value of ParameterId
     */
    public String getParameterId() {
        return (String) getAttributeInternal(PARAMETERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParameterId.
     * @param value value to set the ParameterId
     */
    public void setParameterId(String value) {
        setAttributeInternal(PARAMETERID, value);
    }

    /**
     * Gets the attribute value for ParameterValue, using the alias name ParameterValue.
     * @return the value of ParameterValue
     */
    public String getParameterValue() {
        return (String) getAttributeInternal(PARAMETERVALUE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParameterValue.
     * @param value value to set the ParameterValue
     */
    public void setParameterValue(String value) {
        setAttributeInternal(PARAMETERVALUE, value);
    }

    /**
     * Gets the attribute value for ParameterDescrption, using the alias name ParameterDescrption.
     * @return the value of ParameterDescrption
     */
    public String getParameterDescrption() {
        return (String) getAttributeInternal(PARAMETERDESCRPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParameterDescrption.
     * @param value value to set the ParameterDescrption
     */
    public void setParameterDescrption(String value) {
        setAttributeInternal(PARAMETERDESCRPTION, value);
    }

    /**
     * Gets the attribute value for CompanyId, using the alias name CompanyId.
     * @return the value of CompanyId
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyId.
     * @param value value to set the CompanyId
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for GlobalCompanyId, using the alias name GlobalCompanyId.
     * @return the value of GlobalCompanyId
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlobalCompanyId.
     * @param value value to set the GlobalCompanyId
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
    }

    /**
     * Gets the attribute value for IsActive, using the alias name IsActive.
     * @return the value of IsActive
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsActive.
     * @param value value to set the IsActive
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * @param parameterId key constituent
     * @param companyId key constituent
     * @param globalCompanyId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(String parameterId, Integer companyId, Integer globalCompanyId) {
        return new Key(new Object[] { parameterId, companyId, globalCompanyId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmParameter");
    }
    
    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        
        super.doDML(operation, e);
    }
    
}

