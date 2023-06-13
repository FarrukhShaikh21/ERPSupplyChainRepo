package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewRowImpl;

import erpscm.modelscm.scmeo.ScmPurchaseBidCompareItemImpl;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Apr 05 21:39:18 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidCompareItemVORowImpl extends ERPViewRowImpl {


    public static final int ENTITY_SCMPURCHASEBIDCOMPAREITEM = 0;

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
        IsMultipleItem,
        InventoryOrgSno,
        SubinventoryOrgSno,
        txtSubOrgDescription,
        txtOrgDescription,
        ScmPurchaseBidCompHeaderVO,
        InvItemVO,
        InvUnitTypeVO,
        ScmPurchaseBidCompSupplierVO,
        InvInventoryOrgVO,
        InvSubinventoryOrgVO,
        AccInvItemVO,
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
    public static final int ISMULTIPLEITEM = AttributesEnum.IsMultipleItem.index();
    public static final int INVENTORYORGSNO = AttributesEnum.InventoryOrgSno.index();
    public static final int SUBINVENTORYORGSNO = AttributesEnum.SubinventoryOrgSno.index();
    public static final int TXTSUBORGDESCRIPTION = AttributesEnum.txtSubOrgDescription.index();
    public static final int TXTORGDESCRIPTION = AttributesEnum.txtOrgDescription.index();
    public static final int SCMPURCHASEBIDCOMPHEADERVO = AttributesEnum.ScmPurchaseBidCompHeaderVO.index();
    public static final int INVITEMVO = AttributesEnum.InvItemVO.index();
    public static final int INVUNITTYPEVO = AttributesEnum.InvUnitTypeVO.index();
    public static final int SCMPURCHASEBIDCOMPSUPPLIERVO = AttributesEnum.ScmPurchaseBidCompSupplierVO.index();
    public static final int INVINVENTORYORGVO = AttributesEnum.InvInventoryOrgVO.index();
    public static final int INVSUBINVENTORYORGVO = AttributesEnum.InvSubinventoryOrgVO.index();
    public static final int ACCINVITEMVO = AttributesEnum.AccInvItemVO.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidCompareItemVORowImpl() {
    }

    /**
     * Gets ScmPurchaseBidCompareItem entity object.
     * @return the ScmPurchaseBidCompareItem
     */
    public ScmPurchaseBidCompareItemImpl getScmPurchaseBidCompareItem() {
        return (ScmPurchaseBidCompareItemImpl) getEntity(ENTITY_SCMPURCHASEBIDCOMPAREITEM);
    }

    /**
     * Gets the attribute value for COMPARE_ITEM_SNO using the alias name CompareItemSno.
     * @return the COMPARE_ITEM_SNO
     */
    public Integer getCompareItemSno() {
        return (Integer) getAttributeInternal(COMPAREITEMSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPARE_ITEM_SNO using the alias name CompareItemSno.
     * @param value value to set the COMPARE_ITEM_SNO
     */
    public void setCompareItemSno(Integer value) {
        setAttributeInternal(COMPAREITEMSNO, value);
    }

    /**
     * Gets the attribute value for COMPARE_HEADER_SNO using the alias name CompareHeaderSno.
     * @return the COMPARE_HEADER_SNO
     */
    public Integer getCompareHeaderSno() {
        return (Integer) getAttributeInternal(COMPAREHEADERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPARE_HEADER_SNO using the alias name CompareHeaderSno.
     * @param value value to set the COMPARE_HEADER_SNO
     */
    public void setCompareHeaderSno(Integer value) {
        setAttributeInternal(COMPAREHEADERSNO, value);
    }

    /**
     * Gets the attribute value for ITEM_ID using the alias name ItemId.
     * @return the ITEM_ID
     */
    public Integer getItemId() {
        return (Integer) getAttributeInternal(ITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for ITEM_ID using the alias name ItemId.
     * @param value value to set the ITEM_ID
     */
    public void setItemId(Integer value) {
        setAttributeInternal(ITEMID, value);
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
     * Gets the attribute value for TXT_ITEM_NAME using the alias name txtItemName.
     * @return the TXT_ITEM_NAME
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_ITEM_NAME using the alias name txtItemName.
     * @param value value to set the TXT_ITEM_NAME
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * Gets the attribute value for txt_Unit_Type_Name using the alias name txtUnitTypeName.
     * @return the txt_Unit_Type_Name
     */
    public String gettxtUnitTypeName() {
        return (String) getAttributeInternal(TXTUNITTYPENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Unit_Type_Name using the alias name txtUnitTypeName.
     * @param value value to set the txt_Unit_Type_Name
     */
    public void settxtUnitTypeName(String value) {
        setAttributeInternal(TXTUNITTYPENAME, value);
    }

    /**
     * Gets the attribute value for DEMAND_LINES_SNO using the alias name DemandLinesSno.
     * @return the DEMAND_LINES_SNO
     */
    public Integer getDemandLinesSno() {
        return (Integer) getAttributeInternal(DEMANDLINESSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_LINES_SNO using the alias name DemandLinesSno.
     * @param value value to set the DEMAND_LINES_SNO
     */
    public void setDemandLinesSno(Integer value) {
        setAttributeInternal(DEMANDLINESSNO, value);
    }

    /**
     * Gets the attribute value for RFQ_LINES_SNO using the alias name RfqLinesSno.
     * @return the RFQ_LINES_SNO
     */
    public Integer getRfqLinesSno() {
        return (Integer) getAttributeInternal(RFQLINESSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for RFQ_LINES_SNO using the alias name RfqLinesSno.
     * @param value value to set the RFQ_LINES_SNO
     */
    public void setRfqLinesSno(Integer value) {
        setAttributeInternal(RFQLINESSNO, value);
    }

    /**
     * Gets the attribute value for UNIT_TYPE_SNO using the alias name UnitTypeSno.
     * @return the UNIT_TYPE_SNO
     */
    public Integer getUnitTypeSno() {
        return (Integer) getAttributeInternal(UNITTYPESNO);
    }

    /**
     * Sets <code>value</code> as attribute value for UNIT_TYPE_SNO using the alias name UnitTypeSno.
     * @param value value to set the UNIT_TYPE_SNO
     */
    public void setUnitTypeSno(Integer value) {
        setAttributeInternal(UNITTYPESNO, value);
    }

    /**
     * Gets the attribute value for txt_Count_Bid_Selected using the alias name txtCountBidSelected.
     * @return the txt_Count_Bid_Selected
     */
    public Integer gettxtCountBidSelected() {
        return (Integer) getAttributeInternal(TXTCOUNTBIDSELECTED);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Count_Bid_Selected using the alias name txtCountBidSelected.
     * @param value value to set the txt_Count_Bid_Selected
     */
    public void settxtCountBidSelected(Integer value) {
        setAttributeInternal(TXTCOUNTBIDSELECTED, value);
    }


    /**
     * Gets the attribute value for INCLUDE_COMPARISON using the alias name IncludeComparison.
     * @return the INCLUDE_COMPARISON
     */
    public String getIncludeComparison() {
        return (String) getAttributeInternal(INCLUDECOMPARISON);
    }

    /**
     * Sets <code>value</code> as attribute value for INCLUDE_COMPARISON using the alias name IncludeComparison.
     * @param value value to set the INCLUDE_COMPARISON
     */
    public void setIncludeComparison(String value) {
        setAttributeInternal(INCLUDECOMPARISON, value);
    }

    /**
     * Gets the attribute value for IS_MULTIPLE_ITEM using the alias name IsMultipleItem.
     * @return the IS_MULTIPLE_ITEM
     */
    public String getIsMultipleItem() {
        return (String) getAttributeInternal(ISMULTIPLEITEM);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_MULTIPLE_ITEM using the alias name IsMultipleItem.
     * @param value value to set the IS_MULTIPLE_ITEM
     */
    public void setIsMultipleItem(String value) {
        setAttributeInternal(ISMULTIPLEITEM, value);
    }

    /**
     * Gets the attribute value for INVENTORY_ORG_SNO using the alias name InventoryOrgSno.
     * @return the INVENTORY_ORG_SNO
     */
    public Integer getInventoryOrgSno() {
        return (Integer) getAttributeInternal(INVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for INVENTORY_ORG_SNO using the alias name InventoryOrgSno.
     * @param value value to set the INVENTORY_ORG_SNO
     */
    public void setInventoryOrgSno(Integer value) {
        setAttributeInternal(INVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for SUBINVENTORY_ORG_SNO using the alias name SubinventoryOrgSno.
     * @return the SUBINVENTORY_ORG_SNO
     */
    public Long getSubinventoryOrgSno() {
        return (Long) getAttributeInternal(SUBINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBINVENTORY_ORG_SNO using the alias name SubinventoryOrgSno.
     * @param value value to set the SUBINVENTORY_ORG_SNO
     */
    public void setSubinventoryOrgSno(Long value) {
        setAttributeInternal(SUBINVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for txt_Sub_Org_Description using the alias name txtSubOrgDescription.
     * @return the txt_Sub_Org_Description
     */
    public String gettxtSubOrgDescription() {
        return (String) getAttributeInternal(TXTSUBORGDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Sub_Org_Description using the alias name txtSubOrgDescription.
     * @param value value to set the txt_Sub_Org_Description
     */
    public void settxtSubOrgDescription(String value) {
        setAttributeInternal(TXTSUBORGDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for txt_Org_Description using the alias name txtOrgDescription.
     * @return the txt_Org_Description
     */
    public String gettxtOrgDescription() {
        return (String) getAttributeInternal(TXTORGDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Org_Description using the alias name txtOrgDescription.
     * @param value value to set the txt_Org_Description
     */
    public void settxtOrgDescription(String value) {
        setAttributeInternal(TXTORGDESCRIPTION, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseBidCompHeaderVO.
     */
    public Row getScmPurchaseBidCompHeaderVO() {
        return (Row) getAttributeInternal(SCMPURCHASEBIDCOMPHEADERVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseBidCompHeaderVO between this object and <code>value</code>.
     */
    public void setScmPurchaseBidCompHeaderVO(Row value) {
        setAttributeInternal(SCMPURCHASEBIDCOMPHEADERVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InvItemVO.
     */
    public Row getInvItemVO() {
        return (Row) getAttributeInternal(INVITEMVO);
    }

    /**
     * Sets the master-detail link InvItemVO between this object and <code>value</code>.
     */
    public void setInvItemVO(Row value) {
        setAttributeInternal(INVITEMVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InvUnitTypeVO.
     */
    public Row getInvUnitTypeVO() {
        return (Row) getAttributeInternal(INVUNITTYPEVO);
    }

    /**
     * Sets the master-detail link InvUnitTypeVO between this object and <code>value</code>.
     */
    public void setInvUnitTypeVO(Row value) {
        setAttributeInternal(INVUNITTYPEVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseBidCompSupplierVO.
     */
    public RowIterator getScmPurchaseBidCompSupplierVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDCOMPSUPPLIERVO);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InvInventoryOrgVO.
     */
    public Row getInvInventoryOrgVO() {
        return (Row) getAttributeInternal(INVINVENTORYORGVO);
    }

    /**
     * Sets the master-detail link InvInventoryOrgVO between this object and <code>value</code>.
     */
    public void setInvInventoryOrgVO(Row value) {
        setAttributeInternal(INVINVENTORYORGVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link InvSubinventoryOrgVO.
     */
    public Row getInvSubinventoryOrgVO() {
        return (Row) getAttributeInternal(INVSUBINVENTORYORGVO);
    }

    /**
     * Sets the master-detail link InvSubinventoryOrgVO between this object and <code>value</code>.
     */
    public void setInvSubinventoryOrgVO(Row value) {
        setAttributeInternal(INVSUBINVENTORYORGVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInvItemVO.
     */
    public RowSet getAccInvItemVO() {
        return (RowSet) getAttributeInternal(ACCINVITEMVO);
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
        if (getScmPurchaseBidCompHeaderVO().getAttribute("IsSupervised").equals("Y")) {
            return false;
        }
        return super.isAttributeUpdateable(i);
    }
}

