package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewRowImpl;

import erpscm.modelscm.scmeo.ScmSalesPersonImpl;

import java.sql.Timestamp;

import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 02 12:06:21 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmSalesPersonVORowImpl extends ERPViewRowImpl {

    public static final int ENTITY_SCMSALESPERSON = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        SalesPersonSno,
        SalesPersonShortCode,
        SalesPersonShortName,
        SalesPersonName,
        MobileNo,
        Email,
        EmployeeId,
        CompanyId,
        IsActive,
        GlobalCompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        FirstName,
        LastName,
        txtSalesPersonName,
        IsSupervised,
        IsUnsupervised,
        UnSupervisedDate,
        UnSupervisedBy,
        SupervisedDate,
        SupervisedBy,
        AccSysGeneralValueVO;
        static AttributesEnum[] vals = null;
        ;
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

    public static final int SALESPERSONSNO = AttributesEnum.SalesPersonSno.index();
    public static final int SALESPERSONSHORTCODE = AttributesEnum.SalesPersonShortCode.index();
    public static final int SALESPERSONSHORTNAME = AttributesEnum.SalesPersonShortName.index();
    public static final int SALESPERSONNAME = AttributesEnum.SalesPersonName.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int EMPLOYEEID = AttributesEnum.EmployeeId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int FIRSTNAME = AttributesEnum.FirstName.index();
    public static final int LASTNAME = AttributesEnum.LastName.index();
    public static final int TXTSALESPERSONNAME = AttributesEnum.txtSalesPersonName.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmSalesPersonVORowImpl() {
    }

    /**
     * Gets ScmSalesPerson entity object.
     * @return the ScmSalesPerson
     */
    public ScmSalesPersonImpl getScmSalesPerson() {
        return (ScmSalesPersonImpl) getEntity(ENTITY_SCMSALESPERSON);
    }

    /**
     * Gets the attribute value for SALES_PERSON_SNO using the alias name SalesPersonSno.
     * @return the SALES_PERSON_SNO
     */
    public Integer getSalesPersonSno() {
        return (Integer) getAttributeInternal(SALESPERSONSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SALES_PERSON_SNO using the alias name SalesPersonSno.
     * @param value value to set the SALES_PERSON_SNO
     */
    public void setSalesPersonSno(Integer value) {
        setAttributeInternal(SALESPERSONSNO, value);
    }

    /**
     * Gets the attribute value for SALES_PERSON_SHORT_CODE using the alias name SalesPersonShortCode.
     * @return the SALES_PERSON_SHORT_CODE
     */
    public Integer getSalesPersonShortCode() {
        return (Integer) getAttributeInternal(SALESPERSONSHORTCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for SALES_PERSON_SHORT_CODE using the alias name SalesPersonShortCode.
     * @param value value to set the SALES_PERSON_SHORT_CODE
     */
    public void setSalesPersonShortCode(Integer value) {
        setAttributeInternal(SALESPERSONSHORTCODE, value);
    }

    /**
     * Gets the attribute value for SALES_PERSON_SHORT_NAME using the alias name SalesPersonShortName.
     * @return the SALES_PERSON_SHORT_NAME
     */
    public String getSalesPersonShortName() {
        return (String) getAttributeInternal(SALESPERSONSHORTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for SALES_PERSON_SHORT_NAME using the alias name SalesPersonShortName.
     * @param value value to set the SALES_PERSON_SHORT_NAME
     */
    public void setSalesPersonShortName(String value) {
        setAttributeInternal(SALESPERSONSHORTNAME, value);
    }

    /**
     * Gets the attribute value for SALES_PERSON_NAME using the alias name SalesPersonName.
     * @return the SALES_PERSON_NAME
     */
    public String getSalesPersonName() {
        return (String) getAttributeInternal(SALESPERSONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for SALES_PERSON_NAME using the alias name SalesPersonName.
     * @param value value to set the SALES_PERSON_NAME
     */
    public void setSalesPersonName(String value) {
        setAttributeInternal(SALESPERSONNAME, value);
    }

    /**
     * Gets the attribute value for MOBILE_NO using the alias name MobileNo.
     * @return the MOBILE_NO
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as attribute value for MOBILE_NO using the alias name MobileNo.
     * @param value value to set the MOBILE_NO
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for EMAIL using the alias name Email.
     * @return the EMAIL
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as attribute value for EMAIL using the alias name Email.
     * @param value value to set the EMAIL
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @return the EMPLOYEE_ID
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_ID using the alias name EmployeeId.
     * @param value value to set the EMPLOYEE_ID
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
    }

    /**
     * Gets the attribute value for COMPANY_ID using the alias name CompanyId.
     * @return the COMPANY_ID
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_ID using the alias name CompanyId.
     * @param value value to set the COMPANY_ID
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for IS_ACTIVE using the alias name IsActive.
     * @return the IS_ACTIVE
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_ACTIVE using the alias name IsActive.
     * @param value value to set the IS_ACTIVE
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @return the GLOBAL_COMPANY_ID
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @param value value to set the GLOBAL_COMPANY_ID
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for FIRST_NAME using the alias name FirstName.
     * @return the FIRST_NAME
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for FIRST_NAME using the alias name FirstName.
     * @param value value to set the FIRST_NAME
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LAST_NAME using the alias name LastName.
     * @return the LAST_NAME
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_NAME using the alias name LastName.
     * @param value value to set the LAST_NAME
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for TXT_SALES_PERSON_NAME using the alias name txtSalesPersonName.
     * @return the TXT_SALES_PERSON_NAME
     */
    public String gettxtSalesPersonName() {
        return (String) getAttributeInternal(TXTSALESPERSONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_SALES_PERSON_NAME using the alias name txtSalesPersonName.
     * @param value value to set the TXT_SALES_PERSON_NAME
     */
    public void settxtSalesPersonName(String value) {
        setAttributeInternal(TXTSALESPERSONNAME, value);
    }

    /**
     * Gets the attribute value for IS_SUPERVISED using the alias name IsSupervised.
     * @return the IS_SUPERVISED
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_SUPERVISED using the alias name IsSupervised.
     * @param value value to set the IS_SUPERVISED
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for IS_UNSUPERVISED using the alias name IsUnsupervised.
     * @return the IS_UNSUPERVISED
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_UNSUPERVISED using the alias name IsUnsupervised.
     * @param value value to set the IS_UNSUPERVISED
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for UN_SUPERVISED_DATE using the alias name UnSupervisedDate.
     * @return the UN_SUPERVISED_DATE
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for UN_SUPERVISED_DATE using the alias name UnSupervisedDate.
     * @param value value to set the UN_SUPERVISED_DATE
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for UN_SUPERVISED_BY using the alias name UnSupervisedBy.
     * @return the UN_SUPERVISED_BY
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UN_SUPERVISED_BY using the alias name UnSupervisedBy.
     * @param value value to set the UN_SUPERVISED_BY
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for SUPERVISED_DATE using the alias name SupervisedDate.
     * @return the SUPERVISED_DATE
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISED_DATE using the alias name SupervisedDate.
     * @param value value to set the SUPERVISED_DATE
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for SUPERVISED_BY using the alias name SupervisedBy.
     * @return the SUPERVISED_BY
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISED_BY using the alias name SupervisedBy.
     * @param value value to set the SUPERVISED_BY
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueVO.
     */
    public RowSet getAccSysGeneralValueVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getIsSupervised().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

