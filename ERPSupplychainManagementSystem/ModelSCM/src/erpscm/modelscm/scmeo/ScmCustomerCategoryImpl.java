package erpscm.modelscm.scmeo;

import erpglobals.modelglobals.ERPEntityImpl;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Sep 05 15:17:02 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmCustomerCategoryImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CategorySno,
        CategoryShortCode,
        CategoryShortName,
        CategoryTypeName,
        OpenDate,
        IsActive,
        CompanyId,
        GlobalCompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        IsSupervised,
        SupervisedDate,
        IsUnsupervised,
        UnSupervisedDate,
        SupervisedBy,
        UnSupervisedBy,
        ScmCustomer,
        ScmCustomerCategotyTax;
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


    public static final int CATEGORYSNO = AttributesEnum.CategorySno.index();
    public static final int CATEGORYSHORTCODE = AttributesEnum.CategoryShortCode.index();
    public static final int CATEGORYSHORTNAME = AttributesEnum.CategoryShortName.index();
    public static final int CATEGORYTYPENAME = AttributesEnum.CategoryTypeName.index();
    public static final int OPENDATE = AttributesEnum.OpenDate.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int SCMCUSTOMER = AttributesEnum.ScmCustomer.index();
    public static final int SCMCUSTOMERCATEGOTYTAX = AttributesEnum.ScmCustomerCategotyTax.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmCustomerCategoryImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmCustomerCategory");
    }


    /**
     * Gets the attribute value for CategorySno, using the alias name CategorySno.
     * @return the value of CategorySno
     */
    public Integer getCategorySno() {
        return (Integer) getAttributeInternal(CATEGORYSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategorySno.
     * @param value value to set the CategorySno
     */
    public void setCategorySno(Integer value) {
        setAttributeInternal(CATEGORYSNO, value);
    }

    /**
     * Gets the attribute value for CategoryShortCode, using the alias name CategoryShortCode.
     * @return the value of CategoryShortCode
     */
    public Integer getCategoryShortCode() {
        return (Integer) getAttributeInternal(CATEGORYSHORTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryShortCode.
     * @param value value to set the CategoryShortCode
     */
    public void setCategoryShortCode(Integer value) {
        setAttributeInternal(CATEGORYSHORTCODE, value);
    }

    /**
     * Gets the attribute value for CategoryShortName, using the alias name CategoryShortName.
     * @return the value of CategoryShortName
     */
    public String getCategoryShortName() {
        return (String) getAttributeInternal(CATEGORYSHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryShortName.
     * @param value value to set the CategoryShortName
     */
    public void setCategoryShortName(String value) {
        setAttributeInternal(CATEGORYSHORTNAME, value);
    }

    /**
     * Gets the attribute value for CategoryTypeName, using the alias name CategoryTypeName.
     * @return the value of CategoryTypeName
     */
    public String getCategoryTypeName() {
        return (String) getAttributeInternal(CATEGORYTYPENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryTypeName.
     * @param value value to set the CategoryTypeName
     */
    public void setCategoryTypeName(String value) {
        setAttributeInternal(CATEGORYTYPENAME, value);
    }

    /**
     * Gets the attribute value for OpenDate, using the alias name OpenDate.
     * @return the value of OpenDate
     */
    public Timestamp getOpenDate() {
        return (Timestamp) getAttributeInternal(OPENDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpenDate.
     * @param value value to set the OpenDate
     */
    public void setOpenDate(Timestamp value) {
        setAttributeInternal(OPENDATE, value);
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
     * Gets the attribute value for IsSupervised, using the alias name IsSupervised.
     * @return the value of IsSupervised
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsSupervised.
     * @param value value to set the IsSupervised
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for SupervisedDate, using the alias name SupervisedDate.
     * @return the value of SupervisedDate
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisedDate.
     * @param value value to set the SupervisedDate
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for IsUnsupervised, using the alias name IsUnsupervised.
     * @return the value of IsUnsupervised
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsUnsupervised.
     * @param value value to set the IsUnsupervised
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for UnSupervisedDate, using the alias name UnSupervisedDate.
     * @return the value of UnSupervisedDate
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnSupervisedDate.
     * @param value value to set the UnSupervisedDate
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for SupervisedBy, using the alias name SupervisedBy.
     * @return the value of SupervisedBy
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisedBy.
     * @param value value to set the SupervisedBy
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for UnSupervisedBy, using the alias name UnSupervisedBy.
     * @return the value of UnSupervisedBy
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnSupervisedBy.
     * @param value value to set the UnSupervisedBy
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmCustomer() {
        return (RowIterator) getAttributeInternal(SCMCUSTOMER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmCustomerCategotyTax() {
        return (RowIterator) getAttributeInternal(SCMCUSTOMERCATEGOTYTAX);
    }

    /**
     * @param categorySno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer categorySno) {
        return new Key(new Object[] { categorySno });
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
        if (operation==DML_INSERT ) {
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "CATEGORY_SNO",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(CATEGORYSNO,  Integer.parseInt(result));
           result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "CATEGORY_SHORT_CODE",this.getEntityDef().getSource(), "COMPANY_ID", getCompanyId().toString());
           populateAttributeAsChanged(CATEGORYSHORTCODE,  Integer.parseInt(result));

        }        
        super.doDML(operation, e);
    }
}

