package erpscm.modelscm.scmeo;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Sep 14 19:24:43 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmOrderTypeImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        OrderTypeSno,
        OrderTypeCode,
        OrderTypeShortName,
        OrderTypeName,
        OrderTypeFor,
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
        ScmPurchaseOrderHeader;
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


    public static final int ORDERTYPESNO = AttributesEnum.OrderTypeSno.index();
    public static final int ORDERTYPECODE = AttributesEnum.OrderTypeCode.index();
    public static final int ORDERTYPESHORTNAME = AttributesEnum.OrderTypeShortName.index();
    public static final int ORDERTYPENAME = AttributesEnum.OrderTypeName.index();
    public static final int ORDERTYPEFOR = AttributesEnum.OrderTypeFor.index();
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
    public static final int SCMPURCHASEORDERHEADER = AttributesEnum.ScmPurchaseOrderHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmOrderTypeImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmOrderType");
    }


    /**
     * Gets the attribute value for OrderTypeSno, using the alias name OrderTypeSno.
     * @return the value of OrderTypeSno
     */
    public Integer getOrderTypeSno() {
        return (Integer) getAttributeInternal(ORDERTYPESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderTypeSno.
     * @param value value to set the OrderTypeSno
     */
    public void setOrderTypeSno(Integer value) {
        setAttributeInternal(ORDERTYPESNO, value);
    }

    /**
     * Gets the attribute value for OrderTypeCode, using the alias name OrderTypeCode.
     * @return the value of OrderTypeCode
     */
    public Integer getOrderTypeCode() {
        return (Integer) getAttributeInternal(ORDERTYPECODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderTypeCode.
     * @param value value to set the OrderTypeCode
     */
    public void setOrderTypeCode(Integer value) {
        setAttributeInternal(ORDERTYPECODE, value);
    }

    /**
     * Gets the attribute value for OrderTypeShortName, using the alias name OrderTypeShortName.
     * @return the value of OrderTypeShortName
     */
    public String getOrderTypeShortName() {
        return (String) getAttributeInternal(ORDERTYPESHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderTypeShortName.
     * @param value value to set the OrderTypeShortName
     */
    public void setOrderTypeShortName(String value) {
        setAttributeInternal(ORDERTYPESHORTNAME, value);
    }

    /**
     * Gets the attribute value for OrderTypeName, using the alias name OrderTypeName.
     * @return the value of OrderTypeName
     */
    public String getOrderTypeName() {
        return (String) getAttributeInternal(ORDERTYPENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderTypeName.
     * @param value value to set the OrderTypeName
     */
    public void setOrderTypeName(String value) {
        setAttributeInternal(ORDERTYPENAME, value);
    }

    /**
     * Gets the attribute value for OrderTypeFor, using the alias name OrderTypeFor.
     * @return the value of OrderTypeFor
     */
    public String getOrderTypeFor() {
        return (String) getAttributeInternal(ORDERTYPEFOR);
    }

    /**
     * Sets <code>value</code> as the attribute value for OrderTypeFor.
     * @param value value to set the OrderTypeFor
     */
    public void setOrderTypeFor(String value) {
        setAttributeInternal(ORDERTYPEFOR, value);
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
    public RowIterator getScmPurchaseOrderHeader() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEORDERHEADER);
    }


    /**
     * @param orderTypeSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer orderTypeSno) {
        return new Key(new Object[] { orderTypeSno });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }


    @Override
    protected void create(AttributeList attributeList) {
       super.create(attributeList);
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        if (operation == DML_INSERT) {
            String result ;/*=
            /* =

                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "ORDER_TYPE_SNO",
                                                              this.getEntityDef().getSource(), null, null);


            populateAttributeAsChanged(ORDERTYPESNO, Integer.parseInt(result));*/
            result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "ORDER_TYPE_CODE",
                                                              this.getEntityDef().getSource(), "COMPANY_ID",
                                                              getCompanyId().toString());
            populateAttributeAsChanged(ORDERTYPECODE, Integer.parseInt(result));

        }
        super.doDML(operation, e);
    }
}