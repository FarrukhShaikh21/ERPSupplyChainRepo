package erpscm.modelscm.scmeo;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Oct 10 21:21:23 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmCategoryTaxRateImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CategoryTaxRateSno,
        CategoryId,
        TaxTypeSno,
        OpenDate,
        FromDate,
        ToDate,
        FilerRate,
        NonFilerRate,
        GlobalCompanyId,
        CompanyId,
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
        ScmCustomerCategory,
        AccScmCatTaxRateDateCheck;
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


    public static final int CATEGORYTAXRATESNO = AttributesEnum.CategoryTaxRateSno.index();
    public static final int CATEGORYID = AttributesEnum.CategoryId.index();
    public static final int TAXTYPESNO = AttributesEnum.TaxTypeSno.index();
    public static final int OPENDATE = AttributesEnum.OpenDate.index();
    public static final int FROMDATE = AttributesEnum.FromDate.index();
    public static final int TODATE = AttributesEnum.ToDate.index();
    public static final int FILERRATE = AttributesEnum.FilerRate.index();
    public static final int NONFILERRATE = AttributesEnum.NonFilerRate.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
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
    public static final int SCMCUSTOMERCATEGORY = AttributesEnum.ScmCustomerCategory.index();
    public static final int ACCSCMCATTAXRATEDATECHECK = AttributesEnum.AccScmCatTaxRateDateCheck.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmCategoryTaxRateImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmCategoryTaxRate");
    }


    /**
     * Gets the attribute value for CategoryTaxRateSno, using the alias name CategoryTaxRateSno.
     * @return the value of CategoryTaxRateSno
     */
    public Integer getCategoryTaxRateSno() {
        return (Integer) getAttributeInternal(CATEGORYTAXRATESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryTaxRateSno.
     * @param value value to set the CategoryTaxRateSno
     */
    public void setCategoryTaxRateSno(Integer value) {
        setAttributeInternal(CATEGORYTAXRATESNO, value);
    }

    /**
     * Gets the attribute value for CategoryId, using the alias name CategoryId.
     * @return the value of CategoryId
     */
    public Integer getCategoryId() {
        return (Integer) getAttributeInternal(CATEGORYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CategoryId.
     * @param value value to set the CategoryId
     */
    public void setCategoryId(Integer value) {
        setAttributeInternal(CATEGORYID, value);
    }

    /**
     * Gets the attribute value for TaxTypeSno, using the alias name TaxTypeSno.
     * @return the value of TaxTypeSno
     */
    public Integer getTaxTypeSno() {
        return (Integer) getAttributeInternal(TAXTYPESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for TaxTypeSno.
     * @param value value to set the TaxTypeSno
     */
    public void setTaxTypeSno(Integer value) {
        setAttributeInternal(TAXTYPESNO, value);
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
     * Gets the attribute value for FromDate, using the alias name FromDate.
     * @return the value of FromDate
     */
    public Timestamp getFromDate() {
        return (Timestamp) getAttributeInternal(FROMDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FromDate.
     * @param value value to set the FromDate
     */
    public void setFromDate(Timestamp value) {
        setAttributeInternal(FROMDATE, value);
    }

    /**
     * Gets the attribute value for ToDate, using the alias name ToDate.
     * @return the value of ToDate
     */
    public Timestamp getToDate() {
        return (Timestamp) getAttributeInternal(TODATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ToDate.
     * @param value value to set the ToDate
     */
    public void setToDate(Timestamp value) {
        setAttributeInternal(TODATE, value);
    }

    /**
     * Gets the attribute value for FilerRate, using the alias name FilerRate.
     * @return the value of FilerRate
     */
    public BigDecimal getFilerRate() {
        return (BigDecimal) getAttributeInternal(FILERRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FilerRate.
     * @param value value to set the FilerRate
     */
    public void setFilerRate(BigDecimal value) {
        setAttributeInternal(FILERRATE, value);
    }

    /**
     * Gets the attribute value for NonFilerRate, using the alias name NonFilerRate.
     * @return the value of NonFilerRate
     */
    public BigDecimal getNonFilerRate() {
        return (BigDecimal) getAttributeInternal(NONFILERRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for NonFilerRate.
     * @param value value to set the NonFilerRate
     */
    public void setNonFilerRate(BigDecimal value) {
        setAttributeInternal(NONFILERRATE, value);
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
     * @return the associated entity ScmCustomerCategoryImpl.
     */
    public ScmCustomerCategoryImpl getScmCustomerCategory() {
        return (ScmCustomerCategoryImpl) getAttributeInternal(SCMCUSTOMERCATEGORY);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmCustomerCategoryImpl.
     */
    public void setScmCustomerCategory(ScmCustomerCategoryImpl value) {
        setAttributeInternal(SCMCUSTOMERCATEGORY, value);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccScmCatTaxRateDateCheck.
     */
    public RowSet getAccScmCatTaxRateDateCheck() {
        return (RowSet) getAttributeInternal(ACCSCMCATTAXRATEDATECHECK);
    }

    /**
     * @param categoryTaxRateSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer categoryTaxRateSno) {
        return new Key(new Object[] { categoryTaxRateSno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
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
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "CATEGORY_TAX_RATE_SNO",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(CATEGORYTAXRATESNO,  Integer.parseInt(result));
        }        
        super.doDML(operation, e);
    }
}

