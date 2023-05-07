package erpscm.modelscm.scmeo;

import erpglobals.modelglobals.ERPEntityImpl;

import erpims.modelims.imseo.InvItemImpl;
import erpims.modelims.imseo.InvUnitTypeImpl;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Apr 02 20:37:02 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidCompareItemImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CompareItemSno,
        CompareHeaderSno,
        ItemId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtItemName,
        txtUnitTypeName,
        DemandLinesSno,
        RfqLinesSno,
        UnitTypeSno,
        txtCountBidSelected,
        IncludeComparison,
        ScmPurchaseBidCompHeader,
        ScmPurchaseBidCompSupplier,
        InvItem,
        InvUnitType;
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


    public static final int COMPAREITEMSNO = AttributesEnum.CompareItemSno.index();
    public static final int COMPAREHEADERSNO = AttributesEnum.CompareHeaderSno.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int DEMANDLINESSNO = AttributesEnum.DemandLinesSno.index();
    public static final int RFQLINESSNO = AttributesEnum.RfqLinesSno.index();
    public static final int UNITTYPESNO = AttributesEnum.UnitTypeSno.index();
    public static final int TXTCOUNTBIDSELECTED = AttributesEnum.txtCountBidSelected.index();
    public static final int INCLUDECOMPARISON = AttributesEnum.IncludeComparison.index();
    public static final int SCMPURCHASEBIDCOMPHEADER = AttributesEnum.ScmPurchaseBidCompHeader.index();
    public static final int SCMPURCHASEBIDCOMPSUPPLIER = AttributesEnum.ScmPurchaseBidCompSupplier.index();
    public static final int INVITEM = AttributesEnum.InvItem.index();
    public static final int INVUNITTYPE = AttributesEnum.InvUnitType.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidCompareItemImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseBidCompareItem");
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
     * Gets the attribute value for ItemId, using the alias name ItemId.
     * @return the value of ItemId
     */
    public Integer getItemId() {
        return (Integer) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ItemId.
     * @param value value to set the ItemId
     */
    public void setItemId(Integer value) {
        setAttributeInternal(ITEMID, value);
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
     * Gets the attribute value for UnitTypeSno, using the alias name UnitTypeSno.
     * @return the value of UnitTypeSno
     */
    public Integer getUnitTypeSno() {
        return (Integer) getAttributeInternal(UNITTYPESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnitTypeSno.
     * @param value value to set the UnitTypeSno
     */
    public void setUnitTypeSno(Integer value) {
        setAttributeInternal(UNITTYPESNO, value);
    }

    /**
     * Gets the attribute value for txtCountBidSelected, using the alias name txtCountBidSelected.
     * @return the value of txtCountBidSelected
     */
    public Integer gettxtCountBidSelected() {
        return (Integer) getAttributeInternal(TXTCOUNTBIDSELECTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCountBidSelected.
     * @param value value to set the txtCountBidSelected
     */
    public void settxtCountBidSelected(Integer value) {
        setAttributeInternal(TXTCOUNTBIDSELECTED, value);
    }


    /**
     * Gets the attribute value for IncludeComparison, using the alias name IncludeComparison.
     * @return the value of IncludeComparison
     */
    public String getIncludeComparison() {
        return (String) getAttributeInternal(INCLUDECOMPARISON);
    }

    /**
     * Sets <code>value</code> as the attribute value for IncludeComparison.
     * @param value value to set the IncludeComparison
     */
    public void setIncludeComparison(String value) {
        setAttributeInternal(INCLUDECOMPARISON, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidCompSupplier() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDCOMPSUPPLIER);
    }

    /**
     * @return the associated entity erpims.modelims.imseo.InvItemImpl.
     */
    public InvItemImpl getInvItem() {
        return (InvItemImpl) getAttributeInternal(INVITEM);
    }

    /**
     * Sets <code>value</code> as the associated entity erpims.modelims.imseo.InvItemImpl.
     */
    public void setInvItem(InvItemImpl value) {
        setAttributeInternal(INVITEM, value);
    }

    /**
     * @return the associated entity erpims.modelims.imseo.InvUnitTypeImpl.
     */
    public InvUnitTypeImpl getInvUnitType() {
        return (InvUnitTypeImpl) getAttributeInternal(INVUNITTYPE);
    }

    /**
     * Sets <code>value</code> as the associated entity erpims.modelims.imseo.InvUnitTypeImpl.
     */
    public void setInvUnitType(InvUnitTypeImpl value) {
        setAttributeInternal(INVUNITTYPE, value);
    }


    /**
     * @param compareItemSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer compareItemSno) {
        return new Key(new Object[] { compareItemSno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    @Override
    protected void create(AttributeList attributeList) {
        System.out.println("overrigde");
        setERPTableName("SCM_PURCHASE_BID_COMP_ITEM_SEQ");
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
        super.doDML(operation, e);
    }
}

