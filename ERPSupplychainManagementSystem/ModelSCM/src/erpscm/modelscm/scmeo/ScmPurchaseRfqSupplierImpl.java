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
// ---    Mon May 16 12:26:27 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqSupplierImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        RfqSupplierSno,
        RfqHeaderSno,
        SupplierSno,
        BidReceived,
        ContactNo,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtSupplierName,
        txtDemandHeaderCode,
        txtRfqHeaderCode,
        txtDemandHeaderSno,
        ScmPurchaseRfqHeader,
        ScmSupplier,
        ScmPurchaseBidCompSupplier;
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


    public static final int RFQSUPPLIERSNO = AttributesEnum.RfqSupplierSno.index();
    public static final int RFQHEADERSNO = AttributesEnum.RfqHeaderSno.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int BIDRECEIVED = AttributesEnum.BidReceived.index();
    public static final int CONTACTNO = AttributesEnum.ContactNo.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int TXTDEMANDHEADERCODE = AttributesEnum.txtDemandHeaderCode.index();
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int TXTDEMANDHEADERSNO = AttributesEnum.txtDemandHeaderSno.index();
    public static final int SCMPURCHASERFQHEADER = AttributesEnum.ScmPurchaseRfqHeader.index();
    public static final int SCMSUPPLIER = AttributesEnum.ScmSupplier.index();
    public static final int SCMPURCHASEBIDCOMPSUPPLIER = AttributesEnum.ScmPurchaseBidCompSupplier.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqSupplierImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseRfqSupplier");
    }


    /**
     * Gets the attribute value for RfqSupplierSno, using the alias name RfqSupplierSno.
     * @return the value of RfqSupplierSno
     */
    public Integer getRfqSupplierSno() {
        return (Integer) getAttributeInternal(RFQSUPPLIERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RfqSupplierSno.
     * @param value value to set the RfqSupplierSno
     */
    public void setRfqSupplierSno(Integer value) {
        setAttributeInternal(RFQSUPPLIERSNO, value);
    }

    /**
     * Gets the attribute value for RfqHeaderSno, using the alias name RfqHeaderSno.
     * @return the value of RfqHeaderSno
     */
    public Integer getRfqHeaderSno() {
        return (Integer) getAttributeInternal(RFQHEADERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RfqHeaderSno.
     * @param value value to set the RfqHeaderSno
     */
    public void setRfqHeaderSno(Integer value) {
        setAttributeInternal(RFQHEADERSNO, value);
    }

    /**
     * Gets the attribute value for SupplierSno, using the alias name SupplierSno.
     * @return the value of SupplierSno
     */
    public Integer getSupplierSno() {
        return (Integer) getAttributeInternal(SUPPLIERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierSno.
     * @param value value to set the SupplierSno
     */
    public void setSupplierSno(Integer value) {
        setAttributeInternal(SUPPLIERSNO, value);
    }

    /**
     * Gets the attribute value for BidReceived, using the alias name BidReceived.
     * @return the value of BidReceived
     */
    public String getBidReceived() {
        return (String) getAttributeInternal(BIDRECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidReceived.
     * @param value value to set the BidReceived
     */
    public void setBidReceived(String value) {
        setAttributeInternal(BIDRECEIVED, value);
    }

    /**
     * Gets the attribute value for ContactNo, using the alias name ContactNo.
     * @return the value of ContactNo
     */
    public String getContactNo() {
        return (String) getAttributeInternal(CONTACTNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactNo.
     * @param value value to set the ContactNo
     */
    public void setContactNo(String value) {
        setAttributeInternal(CONTACTNO, value);
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
     * Gets the attribute value for txtSupplierName, using the alias name txtSupplierName.
     * @return the value of txtSupplierName
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtSupplierName.
     * @param value value to set the txtSupplierName
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for txtDemandHeaderCode, using the alias name txtDemandHeaderCode.
     * @return the value of txtDemandHeaderCode
     */
    public Integer gettxtDemandHeaderCode() {
        return (Integer) getAttributeInternal(TXTDEMANDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtDemandHeaderCode.
     * @param value value to set the txtDemandHeaderCode
     */
    public void settxtDemandHeaderCode(Integer value) {
        setAttributeInternal(TXTDEMANDHEADERCODE, value);
    }

    /**
     * Gets the attribute value for txtRfqHeaderCode, using the alias name txtRfqHeaderCode.
     * @return the value of txtRfqHeaderCode
     */
    public Integer gettxtRfqHeaderCode() {
        return (Integer) getAttributeInternal(TXTRFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtRfqHeaderCode.
     * @param value value to set the txtRfqHeaderCode
     */
    public void settxtRfqHeaderCode(Integer value) {
        setAttributeInternal(TXTRFQHEADERCODE, value);
    }

    /**
     * Gets the attribute value for txtDemandHeaderSno, using the alias name txtDemandHeaderSno.
     * @return the value of txtDemandHeaderSno
     */
    public Integer gettxtDemandHeaderSno() {
        return (Integer) getAttributeInternal(TXTDEMANDHEADERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtDemandHeaderSno.
     * @param value value to set the txtDemandHeaderSno
     */
    public void settxtDemandHeaderSno(Integer value) {
        setAttributeInternal(TXTDEMANDHEADERSNO, value);
    }

    /**
     * @return the associated entity ScmPurchaseRfqHeaderImpl.
     */
    public ScmPurchaseRfqHeaderImpl getScmPurchaseRfqHeader() {
        return (ScmPurchaseRfqHeaderImpl) getAttributeInternal(SCMPURCHASERFQHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseRfqHeaderImpl.
     */
    public void setScmPurchaseRfqHeader(ScmPurchaseRfqHeaderImpl value) {
        setAttributeInternal(SCMPURCHASERFQHEADER, value);
    }

    /**
     * @return the associated entity ScmSupplierImpl.
     */
    public ScmSupplierImpl getScmSupplier() {
        return (ScmSupplierImpl) getAttributeInternal(SCMSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmSupplierImpl.
     */
    public void setScmSupplier(ScmSupplierImpl value) {
        setAttributeInternal(SCMSUPPLIER, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidCompSupplier() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDCOMPSUPPLIER);
    }


    /**
     * @param rfqSupplierSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer rfqSupplierSno) {
        return new Key(new Object[] { rfqSupplierSno });
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
            populateAttributeAsChanged(RFQHEADERSNO, getScmPurchaseRfqHeader().getAttribute("RfqHeaderSno"));
            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "RFQ_SUPPLIER_SNO",
                                                              this.getEntityDef().getSource(), null, null);

            populateAttributeAsChanged(RFQSUPPLIERSNO, Integer.parseInt(result));


        }
        super.doDML(operation, e);
    }
}

