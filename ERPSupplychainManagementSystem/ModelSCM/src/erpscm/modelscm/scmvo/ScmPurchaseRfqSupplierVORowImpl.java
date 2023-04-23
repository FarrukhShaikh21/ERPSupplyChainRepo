package erpscm.modelscm.scmvo;

import erpscm.modelscm.scmeo.ScmPurchaseRfqSupplierImpl;

import erpscm.modelscm.scmvo.common.ScmPurchaseRfqSupplierVORow;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Jul 17 12:55:57 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqSupplierVORowImpl extends ViewRowImpl implements ScmPurchaseRfqSupplierVORow {


    public static final int ENTITY_SCMPURCHASERFQSUPPLIER = 0;

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
        txtRfqHeaderCode,
        txtDemandHeaderCode,
        txtDemandHeaderSno,
        txtPurchaseOrderNo,
        txtIsMerge,
        txtPurchaseOrderSno,
        txtMergePONumber,
        txtMergePOSno,
        ScmSupplierVO,
        ScmPurchaseRfqHeaderVO,
        ScmPurchaseBidCompSupplierVO,
        AccScmSupplierVO;
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
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int TXTDEMANDHEADERCODE = AttributesEnum.txtDemandHeaderCode.index();
    public static final int TXTDEMANDHEADERSNO = AttributesEnum.txtDemandHeaderSno.index();
    public static final int TXTPURCHASEORDERNO = AttributesEnum.txtPurchaseOrderNo.index();
    public static final int TXTISMERGE = AttributesEnum.txtIsMerge.index();
    public static final int TXTPURCHASEORDERSNO = AttributesEnum.txtPurchaseOrderSno.index();
    public static final int TXTMERGEPONUMBER = AttributesEnum.txtMergePONumber.index();
    public static final int TXTMERGEPOSNO = AttributesEnum.txtMergePOSno.index();
    public static final int SCMSUPPLIERVO = AttributesEnum.ScmSupplierVO.index();
    public static final int SCMPURCHASERFQHEADERVO = AttributesEnum.ScmPurchaseRfqHeaderVO.index();
    public static final int SCMPURCHASEBIDCOMPSUPPLIERVO = AttributesEnum.ScmPurchaseBidCompSupplierVO.index();
    public static final int ACCSCMSUPPLIERVO = AttributesEnum.AccScmSupplierVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqSupplierVORowImpl() {
    }

    /**
     * Gets ScmPurchaseRfqSupplier entity object.
     * @return the ScmPurchaseRfqSupplier
     */
    public ScmPurchaseRfqSupplierImpl getScmPurchaseRfqSupplier() {
        return (ScmPurchaseRfqSupplierImpl) getEntity(ENTITY_SCMPURCHASERFQSUPPLIER);
    }

    /**
     * Gets the attribute value for RFQ_SUPPLIER_SNO using the alias name RfqSupplierSno.
     * @return the RFQ_SUPPLIER_SNO
     */
    public Integer getRfqSupplierSno() {
        return (Integer) getAttributeInternal(RFQSUPPLIERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_SUPPLIER_SNO using the alias name RfqSupplierSno.
     * @param value value to set the RFQ_SUPPLIER_SNO
     */
    public void setRfqSupplierSno(Integer value) {
        setAttributeInternal(RFQSUPPLIERSNO, value);
    }

    /**
     * Gets the attribute value for RFQ_HEADER_SNO using the alias name RfqHeaderSno.
     * @return the RFQ_HEADER_SNO
     */
    public Integer getRfqHeaderSno() {
        return (Integer) getAttributeInternal(RFQHEADERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_HEADER_SNO using the alias name RfqHeaderSno.
     * @param value value to set the RFQ_HEADER_SNO
     */
    public void setRfqHeaderSno(Integer value) {
        setAttributeInternal(RFQHEADERSNO, value);
    }

    /**
     * Gets the attribute value for SUPPLIER_SNO using the alias name SupplierSno.
     * @return the SUPPLIER_SNO
     */
    public Integer getSupplierSno() {
        return (Integer) getAttributeInternal(SUPPLIERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIER_SNO using the alias name SupplierSno.
     * @param value value to set the SUPPLIER_SNO
     */
    public void setSupplierSno(Integer value) {
        setAttributeInternal(SUPPLIERSNO, value);
    }

    /**
     * Gets the attribute value for BID_RECEIVED using the alias name BidReceived.
     * @return the BID_RECEIVED
     */
    public String getBidReceived() {
        return (String) getAttributeInternal(BIDRECEIVED);
    }

    /**
     * Sets <code>value</code> as attribute value for BID_RECEIVED using the alias name BidReceived.
     * @param value value to set the BID_RECEIVED
     */
    public void setBidReceived(String value) {
        setAttributeInternal(BIDRECEIVED, value);
    }

    /**
     * Gets the attribute value for CONTACT_NO using the alias name ContactNo.
     * @return the CONTACT_NO
     */
    public String getContactNo() {
        return (String) getAttributeInternal(CONTACTNO);
    }

    /**
     * Sets <code>value</code> as attribute value for CONTACT_NO using the alias name ContactNo.
     * @param value value to set the CONTACT_NO
     */
    public void setContactNo(String value) {
        setAttributeInternal(CONTACTNO, value);
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
     * Gets the attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @return the TXT_SUPPLIER_NAME
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_SUPPLIER_NAME using the alias name txtSupplierName.
     * @param value value to set the TXT_SUPPLIER_NAME
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for txt_Rfq_Header_Code using the alias name txtRfqHeaderCode.
     * @return the txt_Rfq_Header_Code
     */
    public Integer gettxtRfqHeaderCode() {
        return (Integer) getAttributeInternal(TXTRFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Rfq_Header_Code using the alias name txtRfqHeaderCode.
     * @param value value to set the txt_Rfq_Header_Code
     */
    public void settxtRfqHeaderCode(Integer value) {
        setAttributeInternal(TXTRFQHEADERCODE, value);
    }

    /**
     * Gets the attribute value for txt_Demand_Header_Code using the alias name txtDemandHeaderCode.
     * @return the txt_Demand_Header_Code
     */
    public Integer gettxtDemandHeaderCode() {
        return (Integer) getAttributeInternal(TXTDEMANDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Demand_Header_Code using the alias name txtDemandHeaderCode.
     * @param value value to set the txt_Demand_Header_Code
     */
    public void settxtDemandHeaderCode(Integer value) {
        setAttributeInternal(TXTDEMANDHEADERCODE, value);
    }

    /**
     * Gets the attribute value for txt_Demand_Header_Sno using the alias name txtDemandHeaderSno.
     * @return the txt_Demand_Header_Sno
     */
    public Integer gettxtDemandHeaderSno() {
        return (Integer) getAttributeInternal(TXTDEMANDHEADERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Demand_Header_Sno using the alias name txtDemandHeaderSno.
     * @param value value to set the txt_Demand_Header_Sno
     */
    public void settxtDemandHeaderSno(Integer value) {
        setAttributeInternal(TXTDEMANDHEADERSNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtPurchaseOrderNo.
     * @return the txtPurchaseOrderNo
     */
    public Integer gettxtPurchaseOrderNo() {
        return (Integer) getAttributeInternal(TXTPURCHASEORDERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtPurchaseOrderNo.
     * @param value value to set the  txtPurchaseOrderNo
     */
    public void settxtPurchaseOrderNo(Integer value) {
        setAttributeInternal(TXTPURCHASEORDERNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtIsMerge.
     * @return the txtIsMerge
     */
    public String gettxtIsMerge() {
        return (String) getAttributeInternal(TXTISMERGE);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtIsMerge.
     * @param value value to set the  txtIsMerge
     */
    public void settxtIsMerge(String value) {
        setAttributeInternal(TXTISMERGE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtPurchaseOrderSno.
     * @return the txtPurchaseOrderSno
     */
    public Integer gettxtPurchaseOrderSno() {
        return (Integer) getAttributeInternal(TXTPURCHASEORDERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtPurchaseOrderSno.
     * @param value value to set the  txtPurchaseOrderSno
     */
    public void settxtPurchaseOrderSno(Integer value) {
        setAttributeInternal(TXTPURCHASEORDERSNO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtMergePONumber.
     * @return the txtMergePONumber
     */
    public Integer gettxtMergePONumber() {
        return (Integer) getAttributeInternal(TXTMERGEPONUMBER);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtMergePONumber.
     * @param value value to set the  txtMergePONumber
     */
    public void settxtMergePONumber(Integer value) {
        setAttributeInternal(TXTMERGEPONUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtMergePOSno.
     * @return the txtMergePOSno
     */
    public Integer gettxtMergePOSno() {
        return (Integer) getAttributeInternal(TXTMERGEPOSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtMergePOSno.
     * @param value value to set the  txtMergePOSno
     */
    public void settxtMergePOSno(Integer value) {
        setAttributeInternal(TXTMERGEPOSNO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ScmSupplierVO.
     */
    public Row getScmSupplierVO() {
        return (Row) getAttributeInternal(SCMSUPPLIERVO);
    }

    /**
     * Sets the master-detail link ScmSupplierVO between this object and <code>value</code>.
     */
    public void setScmSupplierVO(Row value) {
        setAttributeInternal(SCMSUPPLIERVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseRfqHeaderVO.
     */
    public Row getScmPurchaseRfqHeaderVO() {
        return (Row) getAttributeInternal(SCMPURCHASERFQHEADERVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseRfqHeaderVO between this object and <code>value</code>.
     */
    public void setScmPurchaseRfqHeaderVO(Row value) {
        setAttributeInternal(SCMPURCHASERFQHEADERVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseBidCompSupplierVO.
     */
    public RowIterator getScmPurchaseBidCompSupplierVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDCOMPSUPPLIERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmSupplierVO.
     */
    public RowSet getAccScmSupplierVO() {
        return (RowSet) getAttributeInternal(ACCSCMSUPPLIERVO);
    }


    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getScmPurchaseRfqHeaderVO().getAttribute("IsSupervised").equals("Y")||
        (Integer)getScmPurchaseRfqHeaderVO().getAttribute("ApprovalStatusSno") >2) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    } 
    public void doGeneratePoFromBidComp() {
        ApplicationModule am = getApplicationModule();
        ViewObject vo=am.findViewObject("ScmPurchaseOrderHeaderCRUD");
        ViewObject supcompvo=am.findViewObject("ScmPurchaseBidCompSupplierDetRO");
        supcompvo.setRangeSize(-1);
        
        for (int i = 0; i < supcompvo.getRowCount(); i++) {
            System.out.println(supcompvo.getRowAtRangeIndex(i).getAttribute("txtItemName"));
       }

    }
}

