package erpscm.modelscm.scmeo;

import erpglobals.modelglobals.ERPEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 05 22:54:24 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidCompSupplierImpl extends ERPEntityImpl {
    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPTableName("SCM_PURCHASE_BID_COMP_SUPP_SEQ");
        super.create(attributeList);

    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CompareSupplierSno,
        CompareItemSno,
        CompareHeaderSno,
        CreatedBy,
        CreatedDate,
        Rate,
        LastUpdatedBy,
        LastUpdatedDate,
        DemandLinesSno,
        RfqLinesSno,
        SupplierSno,
        txtSupplierName,
        BidCriteriaSno,
        IsBidReceived,
        IsSelect,
        txtBidCriteriaName,
        Quantity,
        txtMinimumRate,
        txtItemName,
        txtUnitTypeName,
        txtPOQuantity,
        BidLinesSno,
        txtItemId,
        txtUnitTypeSno,
        RfqSupplierSno,
        txtProjectId,
        txtDepartmentId,
        txtRemainingQtyForPO,
        IsComplete,
        RemainingBalance,
        ScmPurchaseBidCompareItem,
        ScmSupplier,
        ScmBidCriteria,
        ScmPurchaseBidCompHeader,
        ScmPurchaseRfqSupplier,
        ScmPurchaseOrderLines,
        ScmPurchaseBidLines;
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


    public static final int COMPARESUPPLIERSNO = AttributesEnum.CompareSupplierSno.index();
    public static final int COMPAREITEMSNO = AttributesEnum.CompareItemSno.index();
    public static final int COMPAREHEADERSNO = AttributesEnum.CompareHeaderSno.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int DEMANDLINESSNO = AttributesEnum.DemandLinesSno.index();
    public static final int RFQLINESSNO = AttributesEnum.RfqLinesSno.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int BIDCRITERIASNO = AttributesEnum.BidCriteriaSno.index();
    public static final int ISBIDRECEIVED = AttributesEnum.IsBidReceived.index();
    public static final int ISSELECT = AttributesEnum.IsSelect.index();
    public static final int TXTBIDCRITERIANAME = AttributesEnum.txtBidCriteriaName.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int TXTMINIMUMRATE = AttributesEnum.txtMinimumRate.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int TXTPOQUANTITY = AttributesEnum.txtPOQuantity.index();
    public static final int BIDLINESSNO = AttributesEnum.BidLinesSno.index();
    public static final int TXTITEMID = AttributesEnum.txtItemId.index();
    public static final int TXTUNITTYPESNO = AttributesEnum.txtUnitTypeSno.index();
    public static final int RFQSUPPLIERSNO = AttributesEnum.RfqSupplierSno.index();
    public static final int TXTPROJECTID = AttributesEnum.txtProjectId.index();
    public static final int TXTDEPARTMENTID = AttributesEnum.txtDepartmentId.index();
    public static final int TXTREMAININGQTYFORPO = AttributesEnum.txtRemainingQtyForPO.index();
    public static final int ISCOMPLETE = AttributesEnum.IsComplete.index();
    public static final int REMAININGBALANCE = AttributesEnum.RemainingBalance.index();
    public static final int SCMPURCHASEBIDCOMPAREITEM = AttributesEnum.ScmPurchaseBidCompareItem.index();
    public static final int SCMSUPPLIER = AttributesEnum.ScmSupplier.index();
    public static final int SCMBIDCRITERIA = AttributesEnum.ScmBidCriteria.index();
    public static final int SCMPURCHASEBIDCOMPHEADER = AttributesEnum.ScmPurchaseBidCompHeader.index();
    public static final int SCMPURCHASERFQSUPPLIER = AttributesEnum.ScmPurchaseRfqSupplier.index();
    public static final int SCMPURCHASEORDERLINES = AttributesEnum.ScmPurchaseOrderLines.index();
    public static final int SCMPURCHASEBIDLINES = AttributesEnum.ScmPurchaseBidLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidCompSupplierImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseBidCompSupplier");
    }


    /**
     * Gets the attribute value for CompareSupplierSno, using the alias name CompareSupplierSno.
     * @return the value of CompareSupplierSno
     */
    public Integer getCompareSupplierSno() {
        return (Integer) getAttributeInternal(COMPARESUPPLIERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareSupplierSno.
     * @param value value to set the CompareSupplierSno
     */
    public void setCompareSupplierSno(Integer value) {
        setAttributeInternal(COMPARESUPPLIERSNO, value);
    }

    /**
     * Gets the attribute value for CompareItemSno, using the alias name CompareItemSno.
     * @return the value of CompareItemSno
     */
    public Integer getCompareItemSno() {
        return (Integer) getAttributeInternal(COMPAREITEMSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareItemSno.
     * @param value value to set the CompareItemSno
     */
    public void setCompareItemSno(Integer value) {
        setAttributeInternal(COMPAREITEMSNO, value);
    }

    /**
     * Gets the attribute value for CompareHeaderSno, using the alias name CompareHeaderSno.
     * @return the value of CompareHeaderSno
     */
    public Integer getCompareHeaderSno() {
        return (Integer) getAttributeInternal(COMPAREHEADERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareHeaderSno.
     * @param value value to set the CompareHeaderSno
     */
    public void setCompareHeaderSno(Integer value) {
        setAttributeInternal(COMPAREHEADERSNO, value);
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
     * Gets the attribute value for Rate, using the alias name Rate.
     * @return the value of Rate
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Rate.
     * @param value value to set the Rate
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
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
     * Gets the attribute value for DemandLinesSno, using the alias name DemandLinesSno.
     * @return the value of DemandLinesSno
     */
    public Integer getDemandLinesSno() {
        return (Integer) getAttributeInternal(DEMANDLINESSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandLinesSno.
     * @param value value to set the DemandLinesSno
     */
    public void setDemandLinesSno(Integer value) {
        setAttributeInternal(DEMANDLINESSNO, value);
    }

    /**
     * Gets the attribute value for RfqLinesSno, using the alias name RfqLinesSno.
     * @return the value of RfqLinesSno
     */
    public Integer getRfqLinesSno() {
        return (Integer) getAttributeInternal(RFQLINESSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RfqLinesSno.
     * @param value value to set the RfqLinesSno
     */
    public void setRfqLinesSno(Integer value) {
        setAttributeInternal(RFQLINESSNO, value);
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
     * Gets the attribute value for BidCriteriaSno, using the alias name BidCriteriaSno.
     * @return the value of BidCriteriaSno
     */
    public Integer getBidCriteriaSno() {
        return (Integer) getAttributeInternal(BIDCRITERIASNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidCriteriaSno.
     * @param value value to set the BidCriteriaSno
     */
    public void setBidCriteriaSno(Integer value) {
        setAttributeInternal(BIDCRITERIASNO, value);
    }

    /**
     * Gets the attribute value for IsBidReceived, using the alias name IsBidReceived.
     * @return the value of IsBidReceived
     */
    public String getIsBidReceived() {
        return (String) getAttributeInternal(ISBIDRECEIVED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsBidReceived.
     * @param value value to set the IsBidReceived
     */
    public void setIsBidReceived(String value) {
        setAttributeInternal(ISBIDRECEIVED, value);
    }

    /**
     * Gets the attribute value for IsSelect, using the alias name IsSelect.
     * @return the value of IsSelect
     */
    public String getIsSelect() {
        return (String) getAttributeInternal(ISSELECT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsSelect.
     * @param value value to set the IsSelect
     */
    public void setIsSelect(String value) {
        System.out.println(value + " is select");
        setAttributeInternal(ISSELECT, value);
    }

    /**
     * Gets the attribute value for txtBidCriteriaName, using the alias name txtBidCriteriaName.
     * @return the value of txtBidCriteriaName
     */
    public String gettxtBidCriteriaName() {
        return (String) getAttributeInternal(TXTBIDCRITERIANAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtBidCriteriaName.
     * @param value value to set the txtBidCriteriaName
     */
    public void settxtBidCriteriaName(String value) {
        setAttributeInternal(TXTBIDCRITERIANAME, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for txtMinimumRate, using the alias name txtMinimumRate.
     * @return the value of txtMinimumRate
     */
    public BigDecimal gettxtMinimumRate() {
        return (BigDecimal) getAttributeInternal(TXTMINIMUMRATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtMinimumRate.
     * @param value value to set the txtMinimumRate
     */
    public void settxtMinimumRate(BigDecimal value) {
        setAttributeInternal(TXTMINIMUMRATE, value);
    }

    /**
     * Gets the attribute value for txtItemName, using the alias name txtItemName.
     * @return the value of txtItemName
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtItemName.
     * @param value value to set the txtItemName
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * Gets the attribute value for txtUnitTypeName, using the alias name txtUnitTypeName.
     * @return the value of txtUnitTypeName
     */
    public String gettxtUnitTypeName() {
        return (String) getAttributeInternal(TXTUNITTYPENAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtUnitTypeName.
     * @param value value to set the txtUnitTypeName
     */
    public void settxtUnitTypeName(String value) {
        setAttributeInternal(TXTUNITTYPENAME, value);
    }


    /**
     * Gets the attribute value for txtPOQuantity, using the alias name txtPOQuantity.
     * @return the value of txtPOQuantity
     */
    public BigDecimal gettxtPOQuantity() {
        return (BigDecimal) getAttributeInternal(TXTPOQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtPOQuantity.
     * @param value value to set the txtPOQuantity
     */
    public void settxtPOQuantity(BigDecimal value) {
        setAttributeInternal(TXTPOQUANTITY, value);
    }

    /**
     * Gets the attribute value for BidLinesSno, using the alias name BidLinesSno.
     * @return the value of BidLinesSno
     */
    public Integer getBidLinesSno() {
        return (Integer) getAttributeInternal(BIDLINESSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidLinesSno.
     * @param value value to set the BidLinesSno
     */
    public void setBidLinesSno(Integer value) {
        setAttributeInternal(BIDLINESSNO, value);
    }

    /**
     * Gets the attribute value for txtItemId, using the alias name txtItemId.
     * @return the value of txtItemId
     */
    public Integer gettxtItemId() {
        return (Integer) getAttributeInternal(TXTITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtItemId.
     * @param value value to set the txtItemId
     */
    public void settxtItemId(Integer value) {
        setAttributeInternal(TXTITEMID, value);
    }

    /**
     * Gets the attribute value for txtUnitTypeSno, using the alias name txtUnitTypeSno.
     * @return the value of txtUnitTypeSno
     */
    public Integer gettxtUnitTypeSno() {
        return (Integer) getAttributeInternal(TXTUNITTYPESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtUnitTypeSno.
     * @param value value to set the txtUnitTypeSno
     */
    public void settxtUnitTypeSno(Integer value) {
        setAttributeInternal(TXTUNITTYPESNO, value);
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
     * Gets the attribute value for txtProjectId, using the alias name txtProjectId.
     * @return the value of txtProjectId
     */
    public Integer gettxtProjectId() {
        return (Integer) getAttributeInternal(TXTPROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtProjectId.
     * @param value value to set the txtProjectId
     */
    public void settxtProjectId(Integer value) {
        setAttributeInternal(TXTPROJECTID, value);
    }

    /**
     * Gets the attribute value for txtDepartmentId, using the alias name txtDepartmentId.
     * @return the value of txtDepartmentId
     */
    public Integer gettxtDepartmentId() {
        return (Integer) getAttributeInternal(TXTDEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtDepartmentId.
     * @param value value to set the txtDepartmentId
     */
    public void settxtDepartmentId(Integer value) {
        setAttributeInternal(TXTDEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for txtRemainingQtyForPO, using the alias name txtRemainingQtyForPO.
     * @return the value of txtRemainingQtyForPO
     */
    public BigDecimal gettxtRemainingQtyForPO() {
        return (BigDecimal) getAttributeInternal(TXTREMAININGQTYFORPO);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtRemainingQtyForPO.
     * @param value value to set the txtRemainingQtyForPO
     */
    public void settxtRemainingQtyForPO(BigDecimal value) {
        setAttributeInternal(TXTREMAININGQTYFORPO, value);
    }

    /**
     * Gets the attribute value for IsComplete, using the alias name IsComplete.
     * @return the value of IsComplete
     */
    public String getIsComplete() {
        return (String) getAttributeInternal(ISCOMPLETE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsComplete.
     * @param value value to set the IsComplete
     */
    public void setIsComplete(String value) {
        setAttributeInternal(ISCOMPLETE, value);
    }

    /**
     * Gets the attribute value for RemainingBalance, using the alias name RemainingBalance.
     * @return the value of RemainingBalance
     */
    public BigDecimal getRemainingBalance() {
        return (BigDecimal) getAttributeInternal(REMAININGBALANCE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RemainingBalance.
     * @param value value to set the RemainingBalance
     */
    public void setRemainingBalance(BigDecimal value) {
        setAttributeInternal(REMAININGBALANCE, value);
    }

    /**
     * @return the associated entity ScmPurchaseBidCompareItemImpl.
     */
    public ScmPurchaseBidCompareItemImpl getScmPurchaseBidCompareItem() {
        return (ScmPurchaseBidCompareItemImpl) getAttributeInternal(SCMPURCHASEBIDCOMPAREITEM);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseBidCompareItemImpl.
     */
    public void setScmPurchaseBidCompareItem(ScmPurchaseBidCompareItemImpl value) {
        setAttributeInternal(SCMPURCHASEBIDCOMPAREITEM, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getScmBidCriteria() {
        return (EntityImpl) getAttributeInternal(SCMBIDCRITERIA);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setScmBidCriteria(EntityImpl value) {
        setAttributeInternal(SCMBIDCRITERIA, value);
    }


    /**
     * @return the associated entity ScmPurchaseBidCompHeaderImpl.
     */
    public ScmPurchaseBidCompHeaderImpl getScmPurchaseBidCompHeader() {
        return (ScmPurchaseBidCompHeaderImpl) getAttributeInternal(SCMPURCHASEBIDCOMPHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseBidCompHeaderImpl.
     */
    public void setScmPurchaseBidCompHeader(ScmPurchaseBidCompHeaderImpl value) {
        setAttributeInternal(SCMPURCHASEBIDCOMPHEADER, value);
    }


    /**
     * @return the associated entity ScmPurchaseRfqSupplierImpl.
     */
    public ScmPurchaseRfqSupplierImpl getScmPurchaseRfqSupplier() {
        return (ScmPurchaseRfqSupplierImpl) getAttributeInternal(SCMPURCHASERFQSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseRfqSupplierImpl.
     */
    public void setScmPurchaseRfqSupplier(ScmPurchaseRfqSupplierImpl value) {
        setAttributeInternal(SCMPURCHASERFQSUPPLIER, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseOrderLines() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEORDERLINES);
    }


    /**
     * @return the associated entity ScmPurchaseBidLinesImpl.
     */
    public ScmPurchaseBidLinesImpl getScmPurchaseBidLines() {
        return (ScmPurchaseBidLinesImpl) getAttributeInternal(SCMPURCHASEBIDLINES);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseBidLinesImpl.
     */
    public void setScmPurchaseBidLines(ScmPurchaseBidLinesImpl value) {
        setAttributeInternal(SCMPURCHASEBIDLINES, value);
    }


    /**
     * @param compareSupplierSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer compareSupplierSno) {
        return new Key(new Object[] { compareSupplierSno });
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
        System.out.println("scmpurchasebidcompsupplierchancheck");
        if (operation==DML_INSERT) {
           populateAttributeAsChanged(REMAININGBALANCE, getQuantity());      
       }
        else if (operation==DML_UPDATE) {
            populateAttributeAsChanged(ISCOMPLETE, getRemainingBalance().compareTo(new BigDecimal(0))==1?"N":"Y"); 
           
       }
        super.doDML(operation, e);
    }
}

