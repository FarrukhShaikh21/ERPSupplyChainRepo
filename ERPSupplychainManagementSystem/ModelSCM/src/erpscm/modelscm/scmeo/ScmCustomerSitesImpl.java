package erpscm.modelscm.scmeo;

import erpadm.modeladm.admeo.SmCityImpl;
import erpadm.modeladm.admeo.SmCountryImpl;

import erpglobals.modelglobals.ERPEntityImpl;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Sep 10 15:34:28 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmCustomerSitesImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CustomerSitesSno,
        CustomerSno,
        SiteType,
        CustomerSiteCode,
        SiteOpenDate,
        SiteCountrySno,
        SiteCitySno,
        SitePhoneNo,
        SiteFaxNo,
        SiteMobileNo,
        SiteProvienceSno,
        SitePostalCode,
        SiteAddress1,
        SiteAddress2,
        SiteAddress3,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtCityName,
        txtCountryName,
        txtProvienceName,
        SiteName,
        SiteShortName,
        IsActive,
        IsDefault,
        ScmCustomer,
        SmCountry,
        SmCity,
        AdminProvience;
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


    public static final int CUSTOMERSITESSNO = AttributesEnum.CustomerSitesSno.index();
    public static final int CUSTOMERSNO = AttributesEnum.CustomerSno.index();
    public static final int SITETYPE = AttributesEnum.SiteType.index();
    public static final int CUSTOMERSITECODE = AttributesEnum.CustomerSiteCode.index();
    public static final int SITEOPENDATE = AttributesEnum.SiteOpenDate.index();
    public static final int SITECOUNTRYSNO = AttributesEnum.SiteCountrySno.index();
    public static final int SITECITYSNO = AttributesEnum.SiteCitySno.index();
    public static final int SITEPHONENO = AttributesEnum.SitePhoneNo.index();
    public static final int SITEFAXNO = AttributesEnum.SiteFaxNo.index();
    public static final int SITEMOBILENO = AttributesEnum.SiteMobileNo.index();
    public static final int SITEPROVIENCESNO = AttributesEnum.SiteProvienceSno.index();
    public static final int SITEPOSTALCODE = AttributesEnum.SitePostalCode.index();
    public static final int SITEADDRESS1 = AttributesEnum.SiteAddress1.index();
    public static final int SITEADDRESS2 = AttributesEnum.SiteAddress2.index();
    public static final int SITEADDRESS3 = AttributesEnum.SiteAddress3.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTCITYNAME = AttributesEnum.txtCityName.index();
    public static final int TXTCOUNTRYNAME = AttributesEnum.txtCountryName.index();
    public static final int TXTPROVIENCENAME = AttributesEnum.txtProvienceName.index();
    public static final int SITENAME = AttributesEnum.SiteName.index();
    public static final int SITESHORTNAME = AttributesEnum.SiteShortName.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int ISDEFAULT = AttributesEnum.IsDefault.index();
    public static final int SCMCUSTOMER = AttributesEnum.ScmCustomer.index();
    public static final int SMCOUNTRY = AttributesEnum.SmCountry.index();
    public static final int SMCITY = AttributesEnum.SmCity.index();
    public static final int ADMINPROVIENCE = AttributesEnum.AdminProvience.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmCustomerSitesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmCustomerSites");
    }


    /**
     * Gets the attribute value for CustomerSitesSno, using the alias name CustomerSitesSno.
     * @return the value of CustomerSitesSno
     */
    public Integer getCustomerSitesSno() {
        return (Integer) getAttributeInternal(CUSTOMERSITESSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerSitesSno.
     * @param value value to set the CustomerSitesSno
     */
    public void setCustomerSitesSno(Integer value) {
        setAttributeInternal(CUSTOMERSITESSNO, value);
    }

    /**
     * Gets the attribute value for CustomerSno, using the alias name CustomerSno.
     * @return the value of CustomerSno
     */
    public Long getCustomerSno() {
        return (Long) getAttributeInternal(CUSTOMERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerSno.
     * @param value value to set the CustomerSno
     */
    public void setCustomerSno(Long value) {
        setAttributeInternal(CUSTOMERSNO, value);
    }

    /**
     * Gets the attribute value for SiteType, using the alias name SiteType.
     * @return the value of SiteType
     */
    public String getSiteType() {
        return (String) getAttributeInternal(SITETYPE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteType.
     * @param value value to set the SiteType
     */
    public void setSiteType(String value) {
        setAttributeInternal(SITETYPE, value);
    }

    /**
     * Gets the attribute value for CustomerSiteCode, using the alias name CustomerSiteCode.
     * @return the value of CustomerSiteCode
     */
    public Integer getCustomerSiteCode() {
        return (Integer) getAttributeInternal(CUSTOMERSITECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CustomerSiteCode.
     * @param value value to set the CustomerSiteCode
     */
    public void setCustomerSiteCode(Integer value) {
        setAttributeInternal(CUSTOMERSITECODE, value);
    }

    /**
     * Gets the attribute value for SiteOpenDate, using the alias name SiteOpenDate.
     * @return the value of SiteOpenDate
     */
    public Timestamp getSiteOpenDate() {
        return (Timestamp) getAttributeInternal(SITEOPENDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteOpenDate.
     * @param value value to set the SiteOpenDate
     */
    public void setSiteOpenDate(Timestamp value) {
        setAttributeInternal(SITEOPENDATE, value);
    }

    /**
     * Gets the attribute value for SiteCountrySno, using the alias name SiteCountrySno.
     * @return the value of SiteCountrySno
     */
    public Integer getSiteCountrySno() {
        return (Integer) getAttributeInternal(SITECOUNTRYSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteCountrySno.
     * @param value value to set the SiteCountrySno
     */
    public void setSiteCountrySno(Integer value) {
        setAttributeInternal(SITECOUNTRYSNO, value);
    }

    /**
     * Gets the attribute value for SiteCitySno, using the alias name SiteCitySno.
     * @return the value of SiteCitySno
     */
    public Integer getSiteCitySno() {
        return (Integer) getAttributeInternal(SITECITYSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteCitySno.
     * @param value value to set the SiteCitySno
     */
    public void setSiteCitySno(Integer value) {
        setAttributeInternal(SITECITYSNO, value);
    }

    /**
     * Gets the attribute value for SitePhoneNo, using the alias name SitePhoneNo.
     * @return the value of SitePhoneNo
     */
    public String getSitePhoneNo() {
        return (String) getAttributeInternal(SITEPHONENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SitePhoneNo.
     * @param value value to set the SitePhoneNo
     */
    public void setSitePhoneNo(String value) {
        setAttributeInternal(SITEPHONENO, value);
    }

    /**
     * Gets the attribute value for SiteFaxNo, using the alias name SiteFaxNo.
     * @return the value of SiteFaxNo
     */
    public String getSiteFaxNo() {
        return (String) getAttributeInternal(SITEFAXNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteFaxNo.
     * @param value value to set the SiteFaxNo
     */
    public void setSiteFaxNo(String value) {
        setAttributeInternal(SITEFAXNO, value);
    }

    /**
     * Gets the attribute value for SiteMobileNo, using the alias name SiteMobileNo.
     * @return the value of SiteMobileNo
     */
    public String getSiteMobileNo() {
        return (String) getAttributeInternal(SITEMOBILENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteMobileNo.
     * @param value value to set the SiteMobileNo
     */
    public void setSiteMobileNo(String value) {
        setAttributeInternal(SITEMOBILENO, value);
    }

    /**
     * Gets the attribute value for SiteProvienceSno, using the alias name SiteProvienceSno.
     * @return the value of SiteProvienceSno
     */
    public String getSiteProvienceSno() {
        return (String) getAttributeInternal(SITEPROVIENCESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteProvienceSno.
     * @param value value to set the SiteProvienceSno
     */
    public void setSiteProvienceSno(String value) {
        setAttributeInternal(SITEPROVIENCESNO, value);
    }

    /**
     * Gets the attribute value for SitePostalCode, using the alias name SitePostalCode.
     * @return the value of SitePostalCode
     */
    public String getSitePostalCode() {
        return (String) getAttributeInternal(SITEPOSTALCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SitePostalCode.
     * @param value value to set the SitePostalCode
     */
    public void setSitePostalCode(String value) {
        setAttributeInternal(SITEPOSTALCODE, value);
    }

    /**
     * Gets the attribute value for SiteAddress1, using the alias name SiteAddress1.
     * @return the value of SiteAddress1
     */
    public String getSiteAddress1() {
        return (String) getAttributeInternal(SITEADDRESS1);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteAddress1.
     * @param value value to set the SiteAddress1
     */
    public void setSiteAddress1(String value) {
        setAttributeInternal(SITEADDRESS1, value);
    }

    /**
     * Gets the attribute value for SiteAddress2, using the alias name SiteAddress2.
     * @return the value of SiteAddress2
     */
    public String getSiteAddress2() {
        return (String) getAttributeInternal(SITEADDRESS2);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteAddress2.
     * @param value value to set the SiteAddress2
     */
    public void setSiteAddress2(String value) {
        setAttributeInternal(SITEADDRESS2, value);
    }

    /**
     * Gets the attribute value for SiteAddress3, using the alias name SiteAddress3.
     * @return the value of SiteAddress3
     */
    public String getSiteAddress3() {
        return (String) getAttributeInternal(SITEADDRESS3);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteAddress3.
     * @param value value to set the SiteAddress3
     */
    public void setSiteAddress3(String value) {
        setAttributeInternal(SITEADDRESS3, value);
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
     * Gets the attribute value for txtCityName, using the alias name txtCityName.
     * @return the value of txtCityName
     */
    public String gettxtCityName() {
        return (String) getAttributeInternal(TXTCITYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCityName.
     * @param value value to set the txtCityName
     */
    public void settxtCityName(String value) {
        setAttributeInternal(TXTCITYNAME, value);
    }

    /**
     * Gets the attribute value for txtCountryName, using the alias name txtCountryName.
     * @return the value of txtCountryName
     */
    public String gettxtCountryName() {
        return (String) getAttributeInternal(TXTCOUNTRYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCountryName.
     * @param value value to set the txtCountryName
     */
    public void settxtCountryName(String value) {
        setAttributeInternal(TXTCOUNTRYNAME, value);
    }

    /**
     * Gets the attribute value for txtProvienceName, using the alias name txtProvienceName.
     * @return the value of txtProvienceName
     */
    public String gettxtProvienceName() {
        return (String) getAttributeInternal(TXTPROVIENCENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtProvienceName.
     * @param value value to set the txtProvienceName
     */
    public void settxtProvienceName(String value) {
        setAttributeInternal(TXTPROVIENCENAME, value);
    }

    /**
     * Gets the attribute value for SiteName, using the alias name SiteName.
     * @return the value of SiteName
     */
    public String getSiteName() {
        return (String) getAttributeInternal(SITENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteName.
     * @param value value to set the SiteName
     */
    public void setSiteName(String value) {
        setAttributeInternal(SITENAME, value);
    }

    /**
     * Gets the attribute value for SiteShortName, using the alias name SiteShortName.
     * @return the value of SiteShortName
     */
    public String getSiteShortName() {
        return (String) getAttributeInternal(SITESHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SiteShortName.
     * @param value value to set the SiteShortName
     */
    public void setSiteShortName(String value) {
        setAttributeInternal(SITESHORTNAME, value);
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
     * Gets the attribute value for IsDefault, using the alias name IsDefault.
     * @return the value of IsDefault
     */
    public String getIsDefault() {
        return (String) getAttributeInternal(ISDEFAULT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsDefault.
     * @param value value to set the IsDefault
     */
    public void setIsDefault(String value) {
        setAttributeInternal(ISDEFAULT, value);
    }

    /**
     * @return the associated entity ScmCustomerImpl.
     */
    public ScmCustomerImpl getScmCustomer() {
        return (ScmCustomerImpl) getAttributeInternal(SCMCUSTOMER);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmCustomerImpl.
     */
    public void setScmCustomer(ScmCustomerImpl value) {
        setAttributeInternal(SCMCUSTOMER, value);
    }

    /**
     * @return the associated entity erpadm.modeladm.admeo.SmCountryImpl.
     */
    public SmCountryImpl getSmCountry() {
        return (SmCountryImpl) getAttributeInternal(SMCOUNTRY);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.SmCountryImpl.
     */
    public void setSmCountry(SmCountryImpl value) {
        setAttributeInternal(SMCOUNTRY, value);
    }

    /**
     * @return the associated entity erpadm.modeladm.admeo.SmCityImpl.
     */
    public SmCityImpl getSmCity() {
        return (SmCityImpl) getAttributeInternal(SMCITY);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.SmCityImpl.
     */
    public void setSmCity(SmCityImpl value) {
        setAttributeInternal(SMCITY, value);
    }

    /**
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getAdminProvience() {
        return (EntityImpl) getAttributeInternal(ADMINPROVIENCE);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setAdminProvience(EntityImpl value) {
        setAttributeInternal(ADMINPROVIENCE, value);
    }


    /**
     * @param customerSitesSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer customerSitesSno) {
        return new Key(new Object[] { customerSitesSno });
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {

        if (operation==DML_INSERT ) {
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "CUSTOMER_SITES_SNO",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(CUSTOMERSITESSNO,  Integer.parseInt(result));
           result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "CUSTOMER_SITE_CODE",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(CUSTOMERSITECODE,  Integer.parseInt(result));

        }
        
        super.doDML(operation, e);
    }
}

