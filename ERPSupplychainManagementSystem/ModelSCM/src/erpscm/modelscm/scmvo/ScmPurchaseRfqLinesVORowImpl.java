package erpscm.modelscm.scmvo;

import erpscm.modelscm.scmeo.ScmPurchaseRfqLinesImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jul 15 22:23:00 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqLinesVORowImpl extends ViewRowImpl {
    public static final int ENTITY_SCMPURCHASERFQLINES = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        RfqLinesSno,
        RfqHeaderSno,
        DemandLinesSno,
        RequiredBy,
        NoteToBuyer,
        NoteToSupplier,
        SupplierItemName,
        RequesterId,
        UnitTypeSno,
        Quantity,
        AproxPrice,
        Remarks,
        ProjectId,
        DepartmentId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        ItemId,
        txtUnitTypeName,
        txtItemName,
        txtDepartmentName,
        txtProjectName,
        StatusSno,
        txtSumQuantity,
        txtTotalRecord,
        InvItemVO,
        InvUnitTypeVO,
        GlProjectsVO,
        AdminCompanyVO,
        ScmPurchaseRfqHeaderVO,
        ScmPurchaseDemandLinesVO,
        AccInvItemVO,
        AccInvUnitTypeVO,
        AccGlProjectsVO,
        AccAdminCompanyVO;
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
    public static final int RFQLINESSNO = AttributesEnum.RfqLinesSno.index();
    public static final int RFQHEADERSNO = AttributesEnum.RfqHeaderSno.index();
    public static final int DEMANDLINESSNO = AttributesEnum.DemandLinesSno.index();
    public static final int REQUIREDBY = AttributesEnum.RequiredBy.index();
    public static final int NOTETOBUYER = AttributesEnum.NoteToBuyer.index();
    public static final int NOTETOSUPPLIER = AttributesEnum.NoteToSupplier.index();
    public static final int SUPPLIERITEMNAME = AttributesEnum.SupplierItemName.index();
    public static final int REQUESTERID = AttributesEnum.RequesterId.index();
    public static final int UNITTYPESNO = AttributesEnum.UnitTypeSno.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int APROXPRICE = AttributesEnum.AproxPrice.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int PROJECTID = AttributesEnum.ProjectId.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ITEMID = AttributesEnum.ItemId.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTDEPARTMENTNAME = AttributesEnum.txtDepartmentName.index();
    public static final int TXTPROJECTNAME = AttributesEnum.txtProjectName.index();
    public static final int STATUSSNO = AttributesEnum.StatusSno.index();
    public static final int TXTSUMQUANTITY = AttributesEnum.txtSumQuantity.index();
    public static final int TXTTOTALRECORD = AttributesEnum.txtTotalRecord.index();
    public static final int INVITEMVO = AttributesEnum.InvItemVO.index();
    public static final int INVUNITTYPEVO = AttributesEnum.InvUnitTypeVO.index();
    public static final int GLPROJECTSVO = AttributesEnum.GlProjectsVO.index();
    public static final int ADMINCOMPANYVO = AttributesEnum.AdminCompanyVO.index();
    public static final int SCMPURCHASERFQHEADERVO = AttributesEnum.ScmPurchaseRfqHeaderVO.index();
    public static final int SCMPURCHASEDEMANDLINESVO = AttributesEnum.ScmPurchaseDemandLinesVO.index();
    public static final int ACCINVITEMVO = AttributesEnum.AccInvItemVO.index();
    public static final int ACCINVUNITTYPEVO = AttributesEnum.AccInvUnitTypeVO.index();
    public static final int ACCGLPROJECTSVO = AttributesEnum.AccGlProjectsVO.index();
    public static final int ACCADMINCOMPANYVO = AttributesEnum.AccAdminCompanyVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqLinesVORowImpl() {
    }

    /**
     * Gets ScmPurchaseRfqLines entity object.
     * @return the ScmPurchaseRfqLines
     */
    public ScmPurchaseRfqLinesImpl getScmPurchaseRfqLines() {
        return (ScmPurchaseRfqLinesImpl) getEntity(ENTITY_SCMPURCHASERFQLINES);
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
     * Gets the attribute value for REQUIRED_BY using the alias name RequiredBy.
     * @return the REQUIRED_BY
     */
    public Timestamp getRequiredBy() {
        return (Timestamp) getAttributeInternal(REQUIREDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for REQUIRED_BY using the alias name RequiredBy.
     * @param value value to set the REQUIRED_BY
     */
    public void setRequiredBy(Timestamp value) {
        setAttributeInternal(REQUIREDBY, value);
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
     * Gets the attribute value for REMARKS using the alias name Remarks.
     * @return the REMARKS
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as attribute value for REMARKS using the alias name Remarks.
     * @param value value to set the REMARKS
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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
     * Gets the attribute value for TXT_UNIT_TYPE_NAME using the alias name txtUnitTypeName.
     * @return the TXT_UNIT_TYPE_NAME
     */
    public String gettxtUnitTypeName() {
        return (String) getAttributeInternal(TXTUNITTYPENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_UNIT_TYPE_NAME using the alias name txtUnitTypeName.
     * @param value value to set the TXT_UNIT_TYPE_NAME
     */
    public void settxtUnitTypeName(String value) {
        setAttributeInternal(TXTUNITTYPENAME, value);
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
     * Gets the attribute value for TXT_DEPARTMENT_NAME using the alias name txtDepartmentName.
     * @return the TXT_DEPARTMENT_NAME
     */
    public String gettxtDepartmentName() {
        return (String) getAttributeInternal(TXTDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_DEPARTMENT_NAME using the alias name txtDepartmentName.
     * @param value value to set the TXT_DEPARTMENT_NAME
     */
    public void settxtDepartmentName(String value) {
        setAttributeInternal(TXTDEPARTMENTNAME, value);
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
     * Gets the attribute value for the calculated attribute txtSumQuantity.
     * @return the txtSumQuantity
     */
    public BigDecimal gettxtSumQuantity() {
        return (BigDecimal) getAttributeInternal(TXTSUMQUANTITY);
    }

    /**
     * Gets the attribute value for the calculated attribute txtTotalRecord.
     * @return the txtTotalRecord
     */
    public Integer gettxtTotalRecord() {
        return (Integer) getAttributeInternal(TXTTOTALRECORD);
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
     * Gets the associated <code>Row</code> using master-detail link ScmPurchaseDemandLinesVO.
     */
    public Row getScmPurchaseDemandLinesVO() {
        return (Row) getAttributeInternal(SCMPURCHASEDEMANDLINESVO);
    }

    /**
     * Sets the master-detail link ScmPurchaseDemandLinesVO between this object and <code>value</code>.
     */
    public void setScmPurchaseDemandLinesVO(Row value) {
        setAttributeInternal(SCMPURCHASEDEMANDLINESVO, value);
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
     * Gets the view accessor <code>RowSet</code> AccGlProjectsVO.
     */
    public RowSet getAccGlProjectsVO() {
        return (RowSet) getAttributeInternal(ACCGLPROJECTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyVO.
     */
    public RowSet getAccAdminCompanyVO() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYVO);
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
}
