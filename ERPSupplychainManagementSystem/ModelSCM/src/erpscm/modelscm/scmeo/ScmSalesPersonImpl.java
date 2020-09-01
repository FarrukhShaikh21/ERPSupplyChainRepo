package erpscm.modelscm.scmeo;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Aug 31 14:54:23 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmSalesPersonImpl extends ERPEntityImpl {
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
        txtSalesPersonName;
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

    /**
     * This is the default constructor (do not remove).
     */
    public ScmSalesPersonImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmSalesPerson");
    }


    /**
     * Gets the attribute value for SalesPersonSno, using the alias name SalesPersonSno.
     * @return the value of SalesPersonSno
     */
    public Integer getSalesPersonSno() {
        return (Integer) getAttributeInternal(SALESPERSONSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesPersonSno.
     * @param value value to set the SalesPersonSno
     */
    public void setSalesPersonSno(Integer value) {
        setAttributeInternal(SALESPERSONSNO, value);
    }

    /**
     * Gets the attribute value for SalesPersonShortCode, using the alias name SalesPersonShortCode.
     * @return the value of SalesPersonShortCode
     */
    public Integer getSalesPersonShortCode() {
        return (Integer) getAttributeInternal(SALESPERSONSHORTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesPersonShortCode.
     * @param value value to set the SalesPersonShortCode
     */
    public void setSalesPersonShortCode(Integer value) {
        setAttributeInternal(SALESPERSONSHORTCODE, value);
    }

    /**
     * Gets the attribute value for SalesPersonShortName, using the alias name SalesPersonShortName.
     * @return the value of SalesPersonShortName
     */
    public String getSalesPersonShortName() {
        return (String) getAttributeInternal(SALESPERSONSHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesPersonShortName.
     * @param value value to set the SalesPersonShortName
     */
    public void setSalesPersonShortName(String value) {
        setAttributeInternal(SALESPERSONSHORTNAME, value);
    }

    /**
     * Gets the attribute value for SalesPersonName, using the alias name SalesPersonName.
     * @return the value of SalesPersonName
     */
    public String getSalesPersonName() {
        return (String) getAttributeInternal(SALESPERSONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SalesPersonName.
     * @param value value to set the SalesPersonName
     */
    public void setSalesPersonName(String value) {
        setAttributeInternal(SALESPERSONNAME, value);
    }

    /**
     * Gets the attribute value for MobileNo, using the alias name MobileNo.
     * @return the value of MobileNo
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for MobileNo.
     * @param value value to set the MobileNo
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for EmployeeId, using the alias name EmployeeId.
     * @return the value of EmployeeId
     */
    public Integer getEmployeeId() {
        return (Integer) getAttributeInternal(EMPLOYEEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for EmployeeId.
     * @param value value to set the EmployeeId
     */
    public void setEmployeeId(Integer value) {
        setAttributeInternal(EMPLOYEEID, value);
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
     * Gets the attribute value for FirstName, using the alias name FirstName.
     * @return the value of FirstName
     */
    public String getFirstName() {
        return (String) getAttributeInternal(FIRSTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for FirstName.
     * @param value value to set the FirstName
     */
    public void setFirstName(String value) {
        setAttributeInternal(FIRSTNAME, value);
    }

    /**
     * Gets the attribute value for LastName, using the alias name LastName.
     * @return the value of LastName
     */
    public String getLastName() {
        return (String) getAttributeInternal(LASTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastName.
     * @param value value to set the LastName
     */
    public void setLastName(String value) {
        setAttributeInternal(LASTNAME, value);
    }

    /**
     * Gets the attribute value for txtSalesPersonName, using the alias name txtSalesPersonName.
     * @return the value of txtSalesPersonName
     */
    public String gettxtSalesPersonName() {
        return (String) getAttributeInternal(TXTSALESPERSONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSalesPersonName.
     * @param value value to set the txtSalesPersonName
     */
    public void settxtSalesPersonName(String value) {
        setAttributeInternal(TXTSALESPERSONNAME, value);
    }

    /**
     * @param salesPersonSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer salesPersonSno) {
        return new Key(new Object[] { salesPersonSno });
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
        if (operation == DML_INSERT) {
            
            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "SALES_PERSON_SNO",
                                                              this.getEntityDef().getSource(), null, null);

            populateAttributeAsChanged(SALESPERSONSNO, Integer.parseInt(result));
            result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "SALES_PERSON_SHORT_CODE",
                                                              this.getEntityDef().getSource(), "COMPANY_ID",
                                                              getCompanyId().toString());
            populateAttributeAsChanged(SALESPERSONSHORTCODE, Integer.parseInt(result));

        }
        if (operation!=DML_DELETE) {
            populateAttributeAsChanged(SALESPERSONNAME, gettxtSalesPersonName());
       }
        super.doDML(operation, e);
    }
}

