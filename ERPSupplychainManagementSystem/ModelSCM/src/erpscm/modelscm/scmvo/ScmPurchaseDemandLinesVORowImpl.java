package erpscm.modelscm.scmvo;

import erpscm.modelscm.scmeo.ScmPurchaseDemandLinesImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Dec 15 18:36:45 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseDemandLinesVORowImpl extends ViewRowImpl {


    public static final int ENTITY_SCMPURCHASEDEMANDLINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DemandLinesSno,
        DemandHeaderSno,
        LineNo,
        ItemId,
        UnitTypeSno,
        RequiredByDate,
        DemandQuantity,
        ApproveQuantity,
        RequesterId,
        DepartmentId,
        ProjectId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtItemName,
        txtUnitTypeName,
        txtProjectName,
        txtDepartmentName,
        txtSumDemandQty,
        txtSumApproveQty,
        AproxPrice,
        NoteToBuyer,
        NoteToSupplier,
        SupplierItemName,
        txtSupplierName,
        SupplierSno,
        StatusSno,
        SubinventoryOrgSno,
        InventoryOrgSno,
        txtInvOrgDescription,
        txtLineCount,
        txtIsDuplicateItem,
        GlProjectsVO,
        AdminCompanyVO,
        InvItemVO,
        InvUnitTypeVO,
        ScmPurchaseDemandHeaderVO,
        ScmSupplierVO,
        ScmPurchaseRfqLinesVO,
        InvInventoryOrgVO,
        ScmPurchaseDemandAccountVO,
        ScmPurchaseBidLinesVO,
        AccInvItemVO,
        AccInvUnitTypeVO,
        AccGlProjectsQVO,
        AccAdminCompanyVO,
        AccGlProjectsVO,
        AccScmSupplierVO,
        AccInvInventoryOrgVO;
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


    public static final int DEMANDLINESSNO = AttributesEnum.DemandLinesSno.index();
    public static final int DEMANDHEADERSNO = AttributesEnum.DemandHeaderSno.index();
    public static final int LINENO = AttributesEnum.LineNo.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int UNITTYPESNO = AttributesEnum.UnitTypeSno.index();
    public static final int REQUIREDBYDATE = AttributesEnum.RequiredByDate.index();
    public static final int DEMANDQUANTITY = AttributesEnum.DemandQuantity.index();
    public static final int APPROVEQUANTITY = AttributesEnum.ApproveQuantity.index();
    public static final int REQUESTERID = AttributesEnum.RequesterId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int TXTPROJECTNAME = AttributesEnum.txtProjectName.index();
    public static final int TXTDEPARTMENTNAME = AttributesEnum.txtDepartmentName.index();
    public static final int TXTSUMDEMANDQTY = AttributesEnum.txtSumDemandQty.index();
    public static final int TXTSUMAPPROVEQTY = AttributesEnum.txtSumApproveQty.index();
    public static final int APROXPRICE = AttributesEnum.AproxPrice.index();
    public static final int NOTETOBUYER = AttributesEnum.NoteToBuyer.index();
    public static final int NOTETOSUPPLIER = AttributesEnum.NoteToSupplier.index();
    public static final int SUPPLIERITEMNAME = AttributesEnum.SupplierItemName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int STATUSSNO = AttributesEnum.StatusSno.index();
    public static final int SUBINVENTORYORGSNO = AttributesEnum.SubinventoryOrgSno.index();
    public static final int INVENTORYORGSNO = AttributesEnum.InventoryOrgSno.index();
    public static final int TXTINVORGDESCRIPTION = AttributesEnum.txtInvOrgDescription.index();
    public static final int TXTLINECOUNT = AttributesEnum.txtLineCount.index();
    public static final int TXTISDUPLICATEITEM = AttributesEnum.txtIsDuplicateItem.index();
    public static final int GLPROJECTSVO = AttributesEnum.GlProjectsVO.index();
    public static final int ADMINCOMPANYVO = AttributesEnum.AdminCompanyVO.index();
    public static final int INVITEMVO = AttributesEnum.InvItemVO.index();
    public static final int INVUNITTYPEVO = AttributesEnum.InvUnitTypeVO.index();
    public static final int SCMPURCHASEDEMANDHEADERVO = AttributesEnum.ScmPurchaseDemandHeaderVO.index();
    public static final int SCMSUPPLIERVO = AttributesEnum.ScmSupplierVO.index();
    public static final int SCMPURCHASERFQLINESVO = AttributesEnum.ScmPurchaseRfqLinesVO.index();
    public static final int INVINVENTORYORGVO = AttributesEnum.InvInventoryOrgVO.index();
    public static final int SCMPURCHASEDEMANDACCOUNTVO = AttributesEnum.ScmPurchaseDemandAccountVO.index();
    public static final int SCMPURCHASEBIDLINESVO = AttributesEnum.ScmPurchaseBidLinesVO.index();
    public static final int ACCINVITEMVO = AttributesEnum.AccInvItemVO.index();
    public static final int ACCINVUNITTYPEVO = AttributesEnum.AccInvUnitTypeVO.index();
    public static final int ACCGLPROJECTSQVO = AttributesEnum.AccGlProjectsQVO.index();
    public static final int ACCADMINCOMPANYVO = AttributesEnum.AccAdminCompanyVO.index();
    public static final int ACCGLPROJECTSVO = AttributesEnum.AccGlProjectsVO.index();
    public static final int ACCSCMSUPPLIERVO = AttributesEnum.AccScmSupplierVO.index();
    public static final int ACCINVINVENTORYORGVO = AttributesEnum.AccInvInventoryOrgVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseDemandLinesVORowImpl() {
    }

    /**
     * Gets ScmPurchaseDemandLines entity object.
     * @return the ScmPurchaseDemandLines
     */
    public ScmPurchaseDemandLinesImpl getScmPurchaseDemandLines() {
        return (ScmPurchaseDemandLinesImpl) getEntity(ENTITY_SCMPURCHASEDEMANDLINES);
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
     * Gets the attribute value for DEMAND_HEADER_SNO using the alias name DemandHeaderSno.
     * @return the DEMAND_HEADER_SNO
     */
    public Integer getDemandHeaderSno() {
        return (Integer) getAttributeInternal(DEMANDHEADERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_HEADER_SNO using the alias name DemandHeaderSno.
     * @param value value to set the DEMAND_HEADER_SNO
     */
    public void setDemandHeaderSno(Integer value) {
        setAttributeInternal(DEMANDHEADERSNO, value);
    }

    /**
     * Gets the attribute value for LINE_NO using the alias name LineNo.
     * @return the LINE_NO
     */
    public Integer getLineNo() {
        return (Integer) getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as attribute value for LINE_NO using the alias name LineNo.
     * @param value value to set the LINE_NO
     */
    public void setLineNo(Integer value) {
        setAttributeInternal(LINENO, value);
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
        setUnitTypeSno((Integer)getInvItemVO().getAttribute("PurchaseUnitTypeSno"));
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
     * Gets the attribute value for REQUIRED_BY_DATE using the alias name RequiredByDate.
     * @return the REQUIRED_BY_DATE
     */
    public Timestamp getRequiredByDate() {
        return (Timestamp) getAttributeInternal(REQUIREDBYDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUIRED_BY_DATE using the alias name RequiredByDate.
     * @param value value to set the REQUIRED_BY_DATE
     */
    public void setRequiredByDate(Timestamp value) {
        setAttributeInternal(REQUIREDBYDATE, value);
    }

    /**
     * Gets the attribute value for DEMAND_QUANTITY using the alias name DemandQuantity.
     * @return the DEMAND_QUANTITY
     */
    public BigDecimal getDemandQuantity() {
        return (BigDecimal) getAttributeInternal(DEMANDQUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_QUANTITY using the alias name DemandQuantity.
     * @param value value to set the DEMAND_QUANTITY
     */
    public void setDemandQuantity(BigDecimal value) {
        setAttributeInternal(DEMANDQUANTITY, value);
    }

    /**
     * Gets the attribute value for APPROVE_QUANTITY using the alias name ApproveQuantity.
     * @return the APPROVE_QUANTITY
     */
    public BigDecimal getApproveQuantity() {
        return (BigDecimal) getAttributeInternal(APPROVEQUANTITY);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVE_QUANTITY using the alias name ApproveQuantity.
     * @param value value to set the APPROVE_QUANTITY
     */
    public void setApproveQuantity(BigDecimal value) {
        setAttributeInternal(APPROVEQUANTITY, value);
    }

    /**
     * Gets the attribute value for REQUESTER_ID using the alias name RequesterId.
     * @return the REQUESTER_ID
     */
    public Integer getRequesterId() {
        return (Integer) getAttributeInternal(REQUESTERID);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUESTER_ID using the alias name RequesterId.
     * @param value value to set the REQUESTER_ID
     */
    public void setRequesterId(Integer value) {
        setAttributeInternal(REQUESTERID, value);
    }

    /**
     * Gets the attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @return the DEPARTMENT_ID
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for DEPARTMENT_ID using the alias name DepartmentId.
     * @param value value to set the DEPARTMENT_ID
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for PROJECT_ID using the alias name ProjectId.
     * @return the PROJECT_ID
     */
    public Integer getProjectId() {
        return (Integer) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for PROJECT_ID using the alias name ProjectId.
     * @param value value to set the PROJECT_ID
     */
    public void setProjectId(Integer value) {
        setAttributeInternal(PROJECTID, value);
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
     * Gets the attribute value for TXT_PROJECT_NAME using the alias name txtProjectName.
     * @return the TXT_PROJECT_NAME
     */
    public String gettxtProjectName() {
        return (String) getAttributeInternal(TXTPROJECTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_PROJECT_NAME using the alias name txtProjectName.
     * @param value value to set the TXT_PROJECT_NAME
     */
    public void settxtProjectName(String value) {
        setAttributeInternal(TXTPROJECTNAME, value);
    }

    /**
     * Gets the attribute value for txt_Department_Name using the alias name txtDepartmentName.
     * @return the txt_Department_Name
     */
    public String gettxtDepartmentName() {
        return (String) getAttributeInternal(TXTDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Department_Name using the alias name txtDepartmentName.
     * @param value value to set the txt_Department_Name
     */
    public void settxtDepartmentName(String value) {
        setAttributeInternal(TXTDEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSumDemandQty.
     * @return the txtSumDemandQty
     */
    public BigDecimal gettxtSumDemandQty() {
        return (BigDecimal) getAttributeInternal(TXTSUMDEMANDQTY);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSumApproveQty.
     * @return the txtSumApproveQty
     */
    public BigDecimal gettxtSumApproveQty() {
        return (BigDecimal) getAttributeInternal(TXTSUMAPPROVEQTY);
    }

    /**
     * Gets the attribute value for APROX_PRICE using the alias name AproxPrice.
     * @return the APROX_PRICE
     */
    public BigDecimal getAproxPrice() {
        return (BigDecimal) getAttributeInternal(APROXPRICE);
    }

    /**
     * Sets <code>value</code> as attribute value for APROX_PRICE using the alias name AproxPrice.
     * @param value value to set the APROX_PRICE
     */
    public void setAproxPrice(BigDecimal value) {
        setAttributeInternal(APROXPRICE, value);
    }

    /**
     * Gets the attribute value for NOTE_TO_BUYER using the alias name NoteToBuyer.
     * @return the NOTE_TO_BUYER
     */
    public String getNoteToBuyer() {
        return (String) getAttributeInternal(NOTETOBUYER);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE_TO_BUYER using the alias name NoteToBuyer.
     * @param value value to set the NOTE_TO_BUYER
     */
    public void setNoteToBuyer(String value) {
        setAttributeInternal(NOTETOBUYER, value);
    }

    /**
     * Gets the attribute value for NOTE_TO_SUPPLIER using the alias name NoteToSupplier.
     * @return the NOTE_TO_SUPPLIER
     */
    public String getNoteToSupplier() {
        return (String) getAttributeInternal(NOTETOSUPPLIER);
    }

    /**
     * Sets <code>value</code> as attribute value for NOTE_TO_SUPPLIER using the alias name NoteToSupplier.
     * @param value value to set the NOTE_TO_SUPPLIER
     */
    public void setNoteToSupplier(String value) {
        setAttributeInternal(NOTETOSUPPLIER, value);
    }

    /**
     * Gets the attribute value for SUPPLIER_ITEM_NAME using the alias name SupplierItemName.
     * @return the SUPPLIER_ITEM_NAME
     */
    public String getSupplierItemName() {
        return (String) getAttributeInternal(SUPPLIERITEMNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIER_ITEM_NAME using the alias name SupplierItemName.
     * @param value value to set the SUPPLIER_ITEM_NAME
     */
    public void setSupplierItemName(String value) {
        setAttributeInternal(SUPPLIERITEMNAME, value);
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
     * Gets the attribute value for STATUS_SNO using the alias name StatusSno.
     * @return the STATUS_SNO
     */
    public Integer getStatusSno() {
        return (Integer) getAttributeInternal(STATUSSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS_SNO using the alias name StatusSno.
     * @param value value to set the STATUS_SNO
     */
    public void setStatusSno(Integer value) {
        setAttributeInternal(STATUSSNO, value);
    }

    /**
     * Gets the attribute value for SUBINVENTORY_ORG_SNO using the alias name SubinventoryOrgSno.
     * @return the SUBINVENTORY_ORG_SNO
     */
    public Integer getSubinventoryOrgSno() {
        return (Integer) getAttributeInternal(SUBINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SUBINVENTORY_ORG_SNO using the alias name SubinventoryOrgSno.
     * @param value value to set the SUBINVENTORY_ORG_SNO
     */
    public void setSubinventoryOrgSno(Integer value) {
        setAttributeInternal(SUBINVENTORYORGSNO, value);
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
     * Gets the attribute value for txt_Inv_Org_Description using the alias name txtInvOrgDescription.
     * @return the txt_Inv_Org_Description
     */
    public String gettxtInvOrgDescription() {
        return (String) getAttributeInternal(TXTINVORGDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Inv_Org_Description using the alias name txtInvOrgDescription.
     * @param value value to set the txt_Inv_Org_Description
     */
    public void settxtInvOrgDescription(String value) {
        setAttributeInternal(TXTINVORGDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtLineCount.
     * @return the txtLineCount
     */
    public BigDecimal gettxtLineCount() {
        return (BigDecimal) getAttributeInternal(TXTLINECOUNT);
    }

    /**
     * Gets the attribute value for txt_Is_Duplicate_Item using the alias name txtIsDuplicateItem.
     * @return the txt_Is_Duplicate_Item
     */
    public String gettxtIsDuplicateItem() {
        return (String) getAttributeInternal(TXTISDUPLICATEITEM);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Is_Duplicate_Item using the alias name txtIsDuplicateItem.
     * @param value value to set the txt_Is_Duplicate_Item
     */
    public void settxtIsDuplicateItem(String value) {
        setAttributeInternal(TXTISDUPLICATEITEM, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link GlProjectsVO.
     */
    public Row getGlProjectsVO() {
        return (Row) getAttributeInternal(GLPROJECTSVO);
    }

    /**
     * Sets the master-detail link GlProjectsVO between this object and <code>value</code>.
     */
    public void setGlProjectsVO(Row value) {
        setAttributeInternal(GLPROJECTSVO, value);
    }

    /**
     * Gets the associated <code>Row</code> using master-detail link AdminCompanyVO.
     */
    public Row getAdminCompanyVO() {
        return (Row) getAttributeInternal(ADMINCOMPANYVO);
    }

    /**
     * Sets the master-detail link AdminCompanyVO between this object and <code>value</code>.
     */
    public void setAdminCompanyVO(Row value) {
        setAttributeInternal(ADMINCOMPANYVO, value);
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
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseDemandHeaderVO.
     */
    public Row getScmPurchaseDemandHeaderVO() {
        return (Row) getAttributeInternal(SCMPURCHASEDEMANDHEADERVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseDemandHeaderVO between this object and <code>value</code>.
     */
    public void setScmPurchaseDemandHeaderVO(Row value) {
        setAttributeInternal(SCMPURCHASEDEMANDHEADERVO, value);
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
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseRfqLinesVO.
     */
    public RowIterator getScmPurchaseRfqLinesVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASERFQLINESVO);
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
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseDemandAccountVO.
     */
    public RowIterator getScmPurchaseDemandAccountVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEDEMANDACCOUNTVO);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseBidLinesVO.
     */
    public RowIterator getScmPurchaseBidLinesVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDLINESVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInvItemVO.
     */
    public RowSet getAccInvItemVO() {
        return (RowSet) getAttributeInternal(ACCINVITEMVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInvUnitTypeVO.
     */
    public RowSet getAccInvUnitTypeVO() {
        return (RowSet) getAttributeInternal(ACCINVUNITTYPEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccGlProjectsQVO.
     */
    public RowSet getAccGlProjectsQVO() {
        return (RowSet) getAttributeInternal(ACCGLPROJECTSQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyVO.
     */
    public RowSet getAccAdminCompanyVO() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccGlProjectsVO.
     */
    public RowSet getAccGlProjectsVO() {
        return (RowSet) getAttributeInternal(ACCGLPROJECTSVO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccScmSupplierVO.
     */
    public RowSet getAccScmSupplierVO() {
        return (RowSet) getAttributeInternal(ACCSCMSUPPLIERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccInvInventoryOrgVO.
     */
    public RowSet getAccInvInventoryOrgVO() {
        return (RowSet) getAttributeInternal(ACCINVINVENTORYORGVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getScmPurchaseDemandHeaderVO().getAttribute("IsSupervised").equals("Y")||
        (Integer)getScmPurchaseDemandHeaderVO().getAttribute("ApprovalStatusSno") >2) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }

    public void doCheckDuplicateItem(Integer pItemId) {
        if (1==1) {
            return;
       }
        settxtIsDuplicateItem("ERPNO");
        RowSetIterator rs = this.getViewObject().createRowSetIterator(null);
        rs.reset();
        rs.setRangeSize(-1);
        Integer count = 0;
        try {
            for (int i=0;i<rs.getRowCount();i++) {
                Row r = rs.getRowAtRangeIndex(i);
                if (Integer.parseInt(r.getAttribute("ItemId").toString()) == pItemId /*&&
                    Integer.parseInt(r.getAttribute("UnitTypeSno").toString()) == pUnitTypeSno*/) {
                    count++;
                }
                if (count > 1) {
                    String strMessage="This Item And Unit Type Is Already Entered In This Transaction.("+gettxtItemName()+"-"+gettxtUnitTypeName()+")";
//                    setItemId(null);
//                    settxtItemName(null);
                    settxtIsDuplicateItem("ERPYES");
//                    throw new JboException(strMessage);
                }
            }
        } catch (NullPointerException nfe) {
            // TODO: Add catch code
            nfe.printStackTrace();
        } finally {
            rs.closeRowSetIterator();
        }


    }
}

