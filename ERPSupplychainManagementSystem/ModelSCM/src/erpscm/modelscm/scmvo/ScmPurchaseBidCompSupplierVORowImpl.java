package erpscm.modelscm.scmvo;

import erpscm.modelscm.scmeo.ScmPurchaseBidCompSupplierImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.JboException;
import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 10 22:48:59 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidCompSupplierVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SCMPURCHASEBIDCOMPSUPPLIER = 0;

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
        RfqLinesSno,
        DemandLinesSno,
        SupplierSno,
        txtSupplierName,
        IsSelect,
        IsBidReceived,
        BidCriteriaSno,
        txtBidCriteriaName,
        Quantity,
        txtMinimumRate,
        txtUnitTypeName,
        txtItemName,
        txtGeneratePO,
        txtPOQuantity,
        BidLinesSno,
        txtUnitTypeSno,
        txtItemId,
        RfqSupplierSno,
        txtDepartmentId,
        txtProjectId,
        txtGeneratePOQty,
        txtRemainingQtyForPO,
        IsComplete,
        RemainingBalance,
        txtSubOrgDescription,
        txtOrgDescription,
        txtSubinventoryOrgSno,
        txtInventoryOrgSno,
        txtChartOfAccountId,
        ScmSupplierVO,
        ScmBidCriteriaVO,
        ScmPurchaseBidCompHeaderVO,
        ScmPurchaseRfqSupplierVO,
        ScmPurchaseOrderLinesVO,
        ScmPurchaseBidLinesVO,
        ScmPurchaseBidCompareItemVO,
        AccSysGeneralValueVO,
        AccScmBidCriteriaVO;
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


    public static final int COMPARESUPPLIERSNO = AttributesEnum.CompareSupplierSno.index();
    public static final int COMPAREITEMSNO = AttributesEnum.CompareItemSno.index();
    public static final int COMPAREHEADERSNO = AttributesEnum.CompareHeaderSno.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int RATE = AttributesEnum.Rate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int RFQLINESSNO = AttributesEnum.RfqLinesSno.index();
    public static final int DEMANDLINESSNO = AttributesEnum.DemandLinesSno.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int ISSELECT = AttributesEnum.IsSelect.index();
    public static final int ISBIDRECEIVED = AttributesEnum.IsBidReceived.index();
    public static final int BIDCRITERIASNO = AttributesEnum.BidCriteriaSno.index();
    public static final int TXTBIDCRITERIANAME = AttributesEnum.txtBidCriteriaName.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int TXTMINIMUMRATE = AttributesEnum.txtMinimumRate.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTGENERATEPO = AttributesEnum.txtGeneratePO.index();
    public static final int TXTPOQUANTITY = AttributesEnum.txtPOQuantity.index();
    public static final int BIDLINESSNO = AttributesEnum.BidLinesSno.index();
    public static final int TXTUNITTYPESNO = AttributesEnum.txtUnitTypeSno.index();
    public static final int TXTITEMID = AttributesEnum.txtItemId.index();
    public static final int RFQSUPPLIERSNO = AttributesEnum.RfqSupplierSno.index();
    public static final int TXTDEPARTMENTID = AttributesEnum.txtDepartmentId.index();
    public static final int TXTPROJECTID = AttributesEnum.txtProjectId.index();
    public static final int TXTGENERATEPOQTY = AttributesEnum.txtGeneratePOQty.index();
    public static final int TXTREMAININGQTYFORPO = AttributesEnum.txtRemainingQtyForPO.index();
    public static final int ISCOMPLETE = AttributesEnum.IsComplete.index();
    public static final int REMAININGBALANCE = AttributesEnum.RemainingBalance.index();
    public static final int TXTSUBORGDESCRIPTION = AttributesEnum.txtSubOrgDescription.index();
    public static final int TXTORGDESCRIPTION = AttributesEnum.txtOrgDescription.index();
    public static final int TXTSUBINVENTORYORGSNO = AttributesEnum.txtSubinventoryOrgSno.index();
    public static final int TXTINVENTORYORGSNO = AttributesEnum.txtInventoryOrgSno.index();
    public static final int TXTCHARTOFACCOUNTID = AttributesEnum.txtChartOfAccountId.index();
    public static final int SCMSUPPLIERVO = AttributesEnum.ScmSupplierVO.index();
    public static final int SCMBIDCRITERIAVO = AttributesEnum.ScmBidCriteriaVO.index();
    public static final int SCMPURCHASEBIDCOMPHEADERVO = AttributesEnum.ScmPurchaseBidCompHeaderVO.index();
    public static final int SCMPURCHASERFQSUPPLIERVO = AttributesEnum.ScmPurchaseRfqSupplierVO.index();
    public static final int SCMPURCHASEORDERLINESVO = AttributesEnum.ScmPurchaseOrderLinesVO.index();
    public static final int SCMPURCHASEBIDLINESVO = AttributesEnum.ScmPurchaseBidLinesVO.index();
    public static final int SCMPURCHASEBIDCOMPAREITEMVO = AttributesEnum.ScmPurchaseBidCompareItemVO.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();
    public static final int ACCSCMBIDCRITERIAVO = AttributesEnum.AccScmBidCriteriaVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidCompSupplierVORowImpl() {
    }

    /**
     * Gets ScmPurchaseBidCompSupplier entity object.
     * @return the ScmPurchaseBidCompSupplier
     */
    public ScmPurchaseBidCompSupplierImpl getScmPurchaseBidCompSupplier() {
        return (ScmPurchaseBidCompSupplierImpl) getEntity(ENTITY_SCMPURCHASEBIDCOMPSUPPLIER);
    }

    /**
     * Gets the attribute value for COMPARE_SUPPLIER_SNO using the alias name CompareSupplierSno.
     * @return the COMPARE_SUPPLIER_SNO
     */
    public Integer getCompareSupplierSno() {
        return (Integer) getAttributeInternal(COMPARESUPPLIERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPARE_SUPPLIER_SNO using the alias name CompareSupplierSno.
     * @param value value to set the COMPARE_SUPPLIER_SNO
     */
    public void setCompareSupplierSno(Integer value) {
        setAttributeInternal(COMPARESUPPLIERSNO, value);
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
     * Gets the attribute value for RATE using the alias name Rate.
     * @return the RATE
     */
    public BigDecimal getRate() {
        return (BigDecimal) getAttributeInternal(RATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RATE using the alias name Rate.
     * @param value value to set the RATE
     */
    public void setRate(BigDecimal value) {
        setAttributeInternal(RATE, value);
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
     * Gets the attribute value for txt_Supplier_Name using the alias name txtSupplierName.
     * @return the txt_Supplier_Name
     */
    public String gettxtSupplierName() {
        return (String) getAttributeInternal(TXTSUPPLIERNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Supplier_Name using the alias name txtSupplierName.
     * @param value value to set the txt_Supplier_Name
     */
    public void settxtSupplierName(String value) {
        setAttributeInternal(TXTSUPPLIERNAME, value);
    }

    /**
     * Gets the attribute value for IS_SELECT using the alias name IsSelect.
     * @return the IS_SELECT
     */
    public String getIsSelect() {
        return (String) getAttributeInternal(ISSELECT);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_SELECT using the alias name IsSelect.
     * @param value value to set the IS_SELECT
     */
    public void setIsSelect(String value) {
       
        if (getScmPurchaseBidCompareItemVO().getAttribute("IsMultipleItem").toString().equals("Y")) {
           setAttributeInternal(ISSELECT, value);
            return;
       }
        System.out.println(getCompareItemSno());
        System.out.println(getIsSelect());
         if (value.equals("Y")) {
            Row r[] = this.getRowSet().getFilteredRows("IsSelect", "Y");
            if (r.length>0) {
                r[0].setAttribute("IsSelect", "N");
            }

        } 
//         this.getRowSet().reset();
        setAttributeInternal(ISSELECT, value);
        if (value.equals("N")) {
            setBidCriteriaSno(null);
            settxtBidCriteriaName(null);
        }
    }

    /**
     * Gets the attribute value for IS_BID_RECEIVED using the alias name IsBidReceived.
     * @return the IS_BID_RECEIVED
     */
    public String getIsBidReceived() {
        return (String) getAttributeInternal(ISBIDRECEIVED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_BID_RECEIVED using the alias name IsBidReceived.
     * @param value value to set the IS_BID_RECEIVED
     */
    public void setIsBidReceived(String value) {
        setAttributeInternal(ISBIDRECEIVED, value);
    }

    /**
     * Gets the attribute value for BID_CRITERIA_SNO using the alias name BidCriteriaSno.
     * @return the BID_CRITERIA_SNO
     */
    public Integer getBidCriteriaSno() {
        return (Integer) getAttributeInternal(BIDCRITERIASNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BID_CRITERIA_SNO using the alias name BidCriteriaSno.
     * @param value value to set the BID_CRITERIA_SNO
     */
    public void setBidCriteriaSno(Integer value) {
        setAttributeInternal(BIDCRITERIASNO, value);
        if (getScmPurchaseBidCompareItemVO().getAttribute("IsMultipleItem").toString().equals("Y") || getScmPurchaseBidCompHeaderVO().getAttribute("CompareHeaderSno")==null) {
            return;
       }
        ApplicationModule am=getDBTransaction().getRootApplicationModule();
        ViewObject vo=am.findViewObject("ScmPurchBidCompSuppSetSameRateCRUD");
        vo.setNamedWhereClauseParam("P_ADF_ITEM_ID", getScmPurchaseBidCompareItemVO().getAttribute("ItemId"));
        vo.setNamedWhereClauseParam("P_ADF_COMPARE_HEADER_SNO", getCompareHeaderSno());
        //            vo.executeQuery();
        vo.setWhereClause("IS_SELECT='Y'");
        vo.executeQuery();
//        Row r[]=vo.getFilteredRows("IsSelect", "Y");
        vo.setRangeSize(-1);
        
        for (int i = 0; i < vo.getEstimatedRowCount(); i++) {
            vo.getRowAtRangeIndex(i).setAttribute("IsSelect", "N");
        }
        vo.setWhereClause(null);
        vo.setWhereClause("Supplier_Sno="+getSupplierSno());
        vo.executeQuery();

        //            Row rr[]=vo.getFilteredRows("SupplierSno", getSupplierSno());
        vo.setRangeSize(-1);           
        for (int i = 0; i < vo.getEstimatedRowCount(); i++) {
            System.out.println(vo.getRowAtRangeIndex(i).getAttribute("CompareItemSno"));
            System.out.println(getIsSelect()+ "isele");
            vo.getRowAtRangeIndex(i).setAttribute("IsSelect", getIsSelect());
            vo.getRowAtRangeIndex(i).setAttribute("BidCriteriaSno", getBidCriteriaSno());
        }

        System.out.println(vo.getRowCount()+ "grc");
        //            Row r=vo.getFilteredRows("IsSelect", "Y")[0];
        
    }

    /**
     * Gets the attribute value for txt_Bid_Criteria_Name using the alias name txtBidCriteriaName.
     * @return the txt_Bid_Criteria_Name
     */
    public String gettxtBidCriteriaName() {
        return (String) getAttributeInternal(TXTBIDCRITERIANAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Bid_Criteria_Name using the alias name txtBidCriteriaName.
     * @param value value to set the txt_Bid_Criteria_Name
     */
    public void settxtBidCriteriaName(String value) {
        setAttributeInternal(TXTBIDCRITERIANAME, value);
    }

    /**
     * Gets the attribute value for QUANTITY using the alias name Quantity.
     * @return the QUANTITY
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for QUANTITY using the alias name Quantity.
     * @param value value to set the QUANTITY
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for txt_Minimum_Rate using the alias name txtMinimumRate.
     * @return the txt_Minimum_Rate
     */
    public BigDecimal gettxtMinimumRate() {
        return (BigDecimal) getAttributeInternal(TXTMINIMUMRATE);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Minimum_Rate using the alias name txtMinimumRate.
     * @param value value to set the txt_Minimum_Rate
     */
    public void settxtMinimumRate(BigDecimal value) {
        setAttributeInternal(TXTMINIMUMRATE, value);
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
     * Gets the attribute value for txt_Item_Name using the alias name txtItemName.
     * @return the txt_Item_Name
     */
    public String gettxtItemName() {
        return (String) getAttributeInternal(TXTITEMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Item_Name using the alias name txtItemName.
     * @param value value to set the txt_Item_Name
     */
    public void settxtItemName(String value) {
        setAttributeInternal(TXTITEMNAME, value);
    }

    /**
     * Gets the attribute value for txt_Generate_PO using the alias name txtGeneratePO.
     * @return the txt_Generate_PO
     */
    public String gettxtGeneratePO() {
        return (String) getAttributeInternal(TXTGENERATEPO);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Generate_PO using the alias name txtGeneratePO.
     * @param value value to set the txt_Generate_PO
     */
    public void settxtGeneratePO(String value) {
        setAttributeInternal(TXTGENERATEPO, value);
    }

    /**
     * Gets the attribute value for txt_POQuantity using the alias name txtPOQuantity.
     * @return the txt_POQuantity
     */
    public BigDecimal gettxtPOQuantity() {
        return (BigDecimal) getAttributeInternal(TXTPOQUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_POQuantity using the alias name txtPOQuantity.
     * @param value value to set the txt_POQuantity
     */
    public void settxtPOQuantity(BigDecimal value) {
        setAttributeInternal(TXTPOQUANTITY, value);
    }

    /**
     * Gets the attribute value for BID_LINES_SNO using the alias name BidLinesSno.
     * @return the BID_LINES_SNO
     */
    public Integer getBidLinesSno() {
        return (Integer) getAttributeInternal(BIDLINESSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BID_LINES_SNO using the alias name BidLinesSno.
     * @param value value to set the BID_LINES_SNO
     */
    public void setBidLinesSno(Integer value) {
        setAttributeInternal(BIDLINESSNO, value);
          }

    /**
     * Gets the attribute value for txt_Unit_Type_Sno using the alias name txtUnitTypeSno.
     * @return the txt_Unit_Type_Sno
     */
    public Integer gettxtUnitTypeSno() {
        return (Integer) getAttributeInternal(TXTUNITTYPESNO);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Unit_Type_Sno using the alias name txtUnitTypeSno.
     * @param value value to set the txt_Unit_Type_Sno
     */
    public void settxtUnitTypeSno(Integer value) {
        setAttributeInternal(TXTUNITTYPESNO, value);
    }

    /**
     * Gets the attribute value for txt_Item_Id using the alias name txtItemId.
     * @return the txt_Item_Id
     */
    public Integer gettxtItemId() {
        return (Integer) getAttributeInternal(TXTITEMID);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Item_Id using the alias name txtItemId.
     * @param value value to set the txt_Item_Id
     */
    public void settxtItemId(Integer value) {
        setAttributeInternal(TXTITEMID, value);
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
     * Gets the attribute value for txt_Department_Id using the alias name txtDepartmentId.
     * @return the txt_Department_Id
     */
    public Integer gettxtDepartmentId() {
        return (Integer) getAttributeInternal(TXTDEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Department_Id using the alias name txtDepartmentId.
     * @param value value to set the txt_Department_Id
     */
    public void settxtDepartmentId(Integer value) {
        setAttributeInternal(TXTDEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for txt_Project_Id using the alias name txtProjectId.
     * @return the txt_Project_Id
     */
    public Integer gettxtProjectId() {
        return (Integer) getAttributeInternal(TXTPROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Project_Id using the alias name txtProjectId.
     * @param value value to set the txt_Project_Id
     */
    public void settxtProjectId(Integer value) {
        setAttributeInternal(TXTPROJECTID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtGeneratePOQty.
     * @return the txtGeneratePOQty
     */
    public BigDecimal gettxtGeneratePOQty() {
        return (BigDecimal) getAttributeInternal(TXTGENERATEPOQTY);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtGeneratePOQty.
     * @param value value to set the  txtGeneratePOQty
     */
    public void settxtGeneratePOQty(BigDecimal value) {
        try {
            if (value != null && value.compareTo(new BigDecimal(0))==-1) {
                ;
           }
            if (value != null && value.compareTo(gettxtRemainingQtyForPO()) ==1) {
                throw new JboException("PO Quantity Should not be greater than Remaining Quantity.");
            }
        } catch (Exception e) {
            // TODO: Add catch code
            e.printStackTrace();
            throw new JboException("PO Quantity Should not be greater than Remaining Quantity.");
        }
        setAttributeInternal(TXTGENERATEPOQTY, value);
    }

    /**
     * Gets the attribute value for txt_Remaining_Qty_For_PO using the alias name txtRemainingQtyForPO.
     * @return the txt_Remaining_Qty_For_PO
     */
    public BigDecimal gettxtRemainingQtyForPO() {
        return (BigDecimal) getAttributeInternal(TXTREMAININGQTYFORPO);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Remaining_Qty_For_PO using the alias name txtRemainingQtyForPO.
     * @param value value to set the txt_Remaining_Qty_For_PO
     */
    public void settxtRemainingQtyForPO(BigDecimal value) {
        setAttributeInternal(TXTREMAININGQTYFORPO, value);
    }

    /**
     * Gets the attribute value for IS_COMPLETE using the alias name IsComplete.
     * @return the IS_COMPLETE
     */
    public String getIsComplete() {
        return (String) getAttributeInternal(ISCOMPLETE);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_COMPLETE using the alias name IsComplete.
     * @param value value to set the IS_COMPLETE
     */
    public void setIsComplete(String value) {
        setAttributeInternal(ISCOMPLETE, value);
    }

    /**
     * Gets the attribute value for REMAINING_BALANCE using the alias name RemainingBalance.
     * @return the REMAINING_BALANCE
     */
    public BigDecimal getRemainingBalance() {
        return (BigDecimal) getAttributeInternal(REMAININGBALANCE);
    }

    /**
     * Sets <code>value</code> as attribute value for REMAINING_BALANCE using the alias name RemainingBalance.
     * @param value value to set the REMAINING_BALANCE
     */
    public void setRemainingBalance(BigDecimal value) {
        setAttributeInternal(REMAININGBALANCE, value);
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
     * Gets the attribute value for txt_Subinventory_Org_Sno using the alias name txtSubinventoryOrgSno.
     * @return the txt_Subinventory_Org_Sno
     */
    public Integer gettxtSubinventoryOrgSno() {
        return (Integer) getAttributeInternal(TXTSUBINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Subinventory_Org_Sno using the alias name txtSubinventoryOrgSno.
     * @param value value to set the txt_Subinventory_Org_Sno
     */
    public void settxtSubinventoryOrgSno(Integer value) {
        setAttributeInternal(TXTSUBINVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for txt_Inventory_Org_Sno using the alias name txtInventoryOrgSno.
     * @return the txt_Inventory_Org_Sno
     */
    public Integer gettxtInventoryOrgSno() {
        return (Integer) getAttributeInternal(TXTINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Inventory_Org_Sno using the alias name txtInventoryOrgSno.
     * @param value value to set the txt_Inventory_Org_Sno
     */
    public void settxtInventoryOrgSno(Integer value) {
        setAttributeInternal(TXTINVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for TXT_CHART_OF_ACCOUNT_ID using the alias name txtChartOfAccountId.
     * @return the TXT_CHART_OF_ACCOUNT_ID
     */
    public Integer gettxtChartOfAccountId() {
        return (Integer) getAttributeInternal(TXTCHARTOFACCOUNTID);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_CHART_OF_ACCOUNT_ID using the alias name txtChartOfAccountId.
     * @param value value to set the TXT_CHART_OF_ACCOUNT_ID
     */
    public void settxtChartOfAccountId(Integer value) {
        setAttributeInternal(TXTCHARTOFACCOUNTID, value);
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
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseBidCompareItemVO.
     */
    public Row getScmPurchaseBidCompareItemVO() {
        return (Row) getAttributeInternal(SCMPURCHASEBIDCOMPAREITEMVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseBidCompareItemVO between this object and <code>value</code>.
     */
    public void setScmPurchaseBidCompareItemVO(Row value) {
        setAttributeInternal(SCMPURCHASEBIDCOMPAREITEMVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseBidLinesVO.
     */
    public Row getScmPurchaseBidLinesVO() {
        return (Row) getAttributeInternal(SCMPURCHASEBIDLINESVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseBidLinesVO between this object and <code>value</code>.
     */
    public void setScmPurchaseBidLinesVO(Row value) {
        setAttributeInternal(SCMPURCHASEBIDLINESVO, value);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseOrderLinesVO.
     */
    public RowIterator getScmPurchaseOrderLinesVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEORDERLINESVO);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link ScmBidCriteriaVO.
     */
    public Row getScmBidCriteriaVO() {
        return (Row) getAttributeInternal(SCMBIDCRITERIAVO);
    }

    /**
     * Sets the master-detail link ScmBidCriteriaVO between this object and <code>value</code>.
     */
    public void setScmBidCriteriaVO(Row value) {
        setAttributeInternal(SCMBIDCRITERIAVO, value);
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
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseRfqSupplierVO.
     */
    public Row getScmPurchaseRfqSupplierVO() {
        return (Row) getAttributeInternal(SCMPURCHASERFQSUPPLIERVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseRfqSupplierVO between this object and <code>value</code>.
     */
    public void setScmPurchaseRfqSupplierVO(Row value) {
        setAttributeInternal(SCMPURCHASERFQSUPPLIERVO, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueVO.
     */
    public RowSet getAccSysGeneralValueVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmBidCriteriaVO.
     */
    public RowSet getAccScmBidCriteriaVO() {
        return (RowSet) getAttributeInternal(ACCSCMBIDCRITERIAVO);
    }
    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if ((i!=TXTGENERATEPO &&i!=TXTGENERATEPOQTY ) && getScmPurchaseBidCompHeaderVO().getAttribute("IsSupervised").equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

