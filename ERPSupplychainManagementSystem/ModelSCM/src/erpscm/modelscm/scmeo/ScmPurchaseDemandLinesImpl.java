package erpscm.modelscm.scmeo;

import erpadm.modeladm.admeo.AdminCompanyImpl;

import erpfms.modelfms.fmseo.GlProjectsImpl;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import erpims.modelims.imseo.InvInventoryOrgImpl;
import erpims.modelims.imseo.InvItemImpl;
import erpims.modelims.imseo.InvUnitTypeImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Dec 10 15:20:03 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseDemandLinesImpl extends ERPEntityImpl {
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
        txtProjectName,
        txtItemName,
        txtUnitTypeName,
        txtDepartmentName,
        AproxPrice,
        NoteToBuyer,
        NoteToSupplier,
        SupplierItemName,
        txtSupplierName,
        SupplierSno,
        StatusSno,
        InventoryOrgSno,
        SubinventoryOrgSno,
        txtInvOrgDescription,
        txtCoaInventory,
        txtIsDuplicateItem,
        ChartOfAccountId,
        ScmPurchaseDemandHeader,
        GlProjects,
        AdminCompany,
        InvItem,
        InvUnitType,
        ScmSupplier,
        ScmPurchaseRfqLines,
        InvInventoryOrg,
        ScmPurchaseBidLines;
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
    public static final int TXTPROJECTNAME = AttributesEnum.txtProjectName.index();
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int TXTDEPARTMENTNAME = AttributesEnum.txtDepartmentName.index();
    public static final int APROXPRICE = AttributesEnum.AproxPrice.index();
    public static final int NOTETOBUYER = AttributesEnum.NoteToBuyer.index();
    public static final int NOTETOSUPPLIER = AttributesEnum.NoteToSupplier.index();
    public static final int SUPPLIERITEMNAME = AttributesEnum.SupplierItemName.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int STATUSSNO = AttributesEnum.StatusSno.index();
    public static final int INVENTORYORGSNO = AttributesEnum.InventoryOrgSno.index();
    public static final int SUBINVENTORYORGSNO = AttributesEnum.SubinventoryOrgSno.index();
    public static final int TXTINVORGDESCRIPTION = AttributesEnum.txtInvOrgDescription.index();
    public static final int TXTCOAINVENTORY = AttributesEnum.txtCoaInventory.index();
    public static final int TXTISDUPLICATEITEM = AttributesEnum.txtIsDuplicateItem.index();
    public static final int CHARTOFACCOUNTID = AttributesEnum.ChartOfAccountId.index();
    public static final int SCMPURCHASEDEMANDHEADER = AttributesEnum.ScmPurchaseDemandHeader.index();
    public static final int GLPROJECTS = AttributesEnum.GlProjects.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int INVITEM = AttributesEnum.InvItem.index();
    public static final int INVUNITTYPE = AttributesEnum.InvUnitType.index();
    public static final int SCMSUPPLIER = AttributesEnum.ScmSupplier.index();
    public static final int SCMPURCHASERFQLINES = AttributesEnum.ScmPurchaseRfqLines.index();
    public static final int INVINVENTORYORG = AttributesEnum.InvInventoryOrg.index();
    public static final int SCMPURCHASEBIDLINES = AttributesEnum.ScmPurchaseBidLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseDemandLinesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseDemandLines");
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
     * Gets the attribute value for DemandHeaderSno, using the alias name DemandHeaderSno.
     * @return the value of DemandHeaderSno
     */
    public Integer getDemandHeaderSno() {
        return (Integer) getAttributeInternal(DEMANDHEADERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandHeaderSno.
     * @param value value to set the DemandHeaderSno
     */
    public void setDemandHeaderSno(Integer value) {
        setAttributeInternal(DEMANDHEADERSNO, value);
    }

    /**
     * Gets the attribute value for LineNo, using the alias name LineNo.
     * @return the value of LineNo
     */
    public Integer getLineNo() {
        return (Integer) getAttributeInternal(LINENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for LineNo.
     * @param value value to set the LineNo
     */
    public void setLineNo(Integer value) {
        setAttributeInternal(LINENO, value);
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
     * Gets the attribute value for RequiredByDate, using the alias name RequiredByDate.
     * @return the value of RequiredByDate
     */
    public Timestamp getRequiredByDate() {
        return (Timestamp) getAttributeInternal(REQUIREDBYDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequiredByDate.
     * @param value value to set the RequiredByDate
     */
    public void setRequiredByDate(Timestamp value) {
        setAttributeInternal(REQUIREDBYDATE, value);
    }

    /**
     * Gets the attribute value for DemandQuantity, using the alias name DemandQuantity.
     * @return the value of DemandQuantity
     */
    public BigDecimal getDemandQuantity() {
        return (BigDecimal) getAttributeInternal(DEMANDQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandQuantity.
     * @param value value to set the DemandQuantity
     */
    public void setDemandQuantity(BigDecimal value) {
        setAttributeInternal(DEMANDQUANTITY, value);
    }

    /**
     * Gets the attribute value for ApproveQuantity, using the alias name ApproveQuantity.
     * @return the value of ApproveQuantity
     */
    public BigDecimal getApproveQuantity() {
        return (BigDecimal) getAttributeInternal(APPROVEQUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApproveQuantity.
     * @param value value to set the ApproveQuantity
     */
    public void setApproveQuantity(BigDecimal value) {
        setAttributeInternal(APPROVEQUANTITY, value);
    }

    /**
     * Gets the attribute value for RequesterId, using the alias name RequesterId.
     * @return the value of RequesterId
     */
    public Integer getRequesterId() {
        return (Integer) getAttributeInternal(REQUESTERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequesterId.
     * @param value value to set the RequesterId
     */
    public void setRequesterId(Integer value) {
        setAttributeInternal(REQUESTERID, value);
    }

    /**
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public Integer getDepartmentId() {
        return (Integer) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(Integer value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for ProjectId, using the alias name ProjectId.
     * @return the value of ProjectId
     */
    public Integer getProjectId() {
        return (Integer) getAttributeInternal(PROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectId.
     * @param value value to set the ProjectId
     */
    public void setProjectId(Integer value) {
        setAttributeInternal(PROJECTID, value);
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
     * Gets the attribute value for txtProjectName, using the alias name txtProjectName.
     * @return the value of txtProjectName
     */
    public String gettxtProjectName() {
        return (String) getAttributeInternal(TXTPROJECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtProjectName.
     * @param value value to set the txtProjectName
     */
    public void settxtProjectName(String value) {
        setAttributeInternal(TXTPROJECTNAME, value);
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
     * Gets the attribute value for txtDepartmentName, using the alias name txtDepartmentName.
     * @return the value of txtDepartmentName
     */
    public String gettxtDepartmentName() {
        return (String) getAttributeInternal(TXTDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtDepartmentName.
     * @param value value to set the txtDepartmentName
     */
    public void settxtDepartmentName(String value) {
        setAttributeInternal(TXTDEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for AproxPrice, using the alias name AproxPrice.
     * @return the value of AproxPrice
     */
    public BigDecimal getAproxPrice() {
        return (BigDecimal) getAttributeInternal(APROXPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for AproxPrice.
     * @param value value to set the AproxPrice
     */
    public void setAproxPrice(BigDecimal value) {
        setAttributeInternal(APROXPRICE, value);
    }

    /**
     * Gets the attribute value for NoteToBuyer, using the alias name NoteToBuyer.
     * @return the value of NoteToBuyer
     */
    public String getNoteToBuyer() {
        return (String) getAttributeInternal(NOTETOBUYER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteToBuyer.
     * @param value value to set the NoteToBuyer
     */
    public void setNoteToBuyer(String value) {
        setAttributeInternal(NOTETOBUYER, value);
    }

    /**
     * Gets the attribute value for NoteToSupplier, using the alias name NoteToSupplier.
     * @return the value of NoteToSupplier
     */
    public String getNoteToSupplier() {
        return (String) getAttributeInternal(NOTETOSUPPLIER);
    }

    /**
     * Sets <code>value</code> as the attribute value for NoteToSupplier.
     * @param value value to set the NoteToSupplier
     */
    public void setNoteToSupplier(String value) {
        setAttributeInternal(NOTETOSUPPLIER, value);
    }


    /**
     * Gets the attribute value for SupplierItemName, using the alias name SupplierItemName.
     * @return the value of SupplierItemName
     */
    public String getSupplierItemName() {
        return (String) getAttributeInternal(SUPPLIERITEMNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierItemName.
     * @param value value to set the SupplierItemName
     */
    public void setSupplierItemName(String value) {
        setAttributeInternal(SUPPLIERITEMNAME, value);
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
     * Gets the attribute value for StatusSno, using the alias name StatusSno.
     * @return the value of StatusSno
     */
    public Integer getStatusSno() {
        return (Integer) getAttributeInternal(STATUSSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for StatusSno.
     * @param value value to set the StatusSno
     */
    public void setStatusSno(Integer value) {
        setAttributeInternal(STATUSSNO, value);
    }

    /**
     * Gets the attribute value for InventoryOrgSno, using the alias name InventoryOrgSno.
     * @return the value of InventoryOrgSno
     */
    public Integer getInventoryOrgSno() {
        return (Integer) getAttributeInternal(INVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for InventoryOrgSno.
     * @param value value to set the InventoryOrgSno
     */
    public void setInventoryOrgSno(Integer value) {
        setAttributeInternal(INVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for SubinventoryOrgSno, using the alias name SubinventoryOrgSno.
     * @return the value of SubinventoryOrgSno
     */
    public Integer getSubinventoryOrgSno() {
        return (Integer) getAttributeInternal(SUBINVENTORYORGSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SubinventoryOrgSno.
     * @param value value to set the SubinventoryOrgSno
     */
    public void setSubinventoryOrgSno(Integer value) {
        setAttributeInternal(SUBINVENTORYORGSNO, value);
    }

    /**
     * Gets the attribute value for txtInvOrgDescription, using the alias name txtInvOrgDescription.
     * @return the value of txtInvOrgDescription
     */
    public String gettxtInvOrgDescription() {
        return (String) getAttributeInternal(TXTINVORGDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtInvOrgDescription.
     * @param value value to set the txtInvOrgDescription
     */
    public void settxtInvOrgDescription(String value) {
        setAttributeInternal(TXTINVORGDESCRIPTION, value);
    }

    /**
     * Gets the attribute value for txtCoaInventory, using the alias name txtCoaInventory.
     * @return the value of txtCoaInventory
     */
    public Integer gettxtCoaInventory() {
        return (Integer) getAttributeInternal(TXTCOAINVENTORY);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCoaInventory.
     * @param value value to set the txtCoaInventory
     */
    public void settxtCoaInventory(Integer value) {
        setAttributeInternal(TXTCOAINVENTORY, value);
    }

    /**
     * Gets the attribute value for txtIsDuplicateItem, using the alias name txtIsDuplicateItem.
     * @return the value of txtIsDuplicateItem
     */
    public String gettxtIsDuplicateItem() {
        return (String) getAttributeInternal(TXTISDUPLICATEITEM);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtIsDuplicateItem.
     * @param value value to set the txtIsDuplicateItem
     */
    public void settxtIsDuplicateItem(String value) {
        setAttributeInternal(TXTISDUPLICATEITEM, value);
    }


    /**
     * Gets the attribute value for ChartOfAccountId, using the alias name ChartOfAccountId.
     * @return the value of ChartOfAccountId
     */
    public Integer getChartOfAccountId() {
        return (Integer) getAttributeInternal(CHARTOFACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChartOfAccountId.
     * @param value value to set the ChartOfAccountId
     */
    public void setChartOfAccountId(Integer value) {
        setAttributeInternal(CHARTOFACCOUNTID, value);
    }

    /**
     * @return the associated entity ScmPurchaseDemandHeaderImpl.
     */
    public ScmPurchaseDemandHeaderImpl getScmPurchaseDemandHeader() {
        return (ScmPurchaseDemandHeaderImpl) getAttributeInternal(SCMPURCHASEDEMANDHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseDemandHeaderImpl.
     */
    public void setScmPurchaseDemandHeader(ScmPurchaseDemandHeaderImpl value) {
        setAttributeInternal(SCMPURCHASEDEMANDHEADER, value);
    }

    /**
     * @return the associated entity erpfms.modelfms.fmseo.GlProjectsImpl.
     */
    public GlProjectsImpl getGlProjects() {
        return (GlProjectsImpl) getAttributeInternal(GLPROJECTS);
    }

    /**
     * Sets <code>value</code> as the associated entity erpfms.modelfms.fmseo.GlProjectsImpl.
     */
    public void setGlProjects(GlProjectsImpl value) {
        setAttributeInternal(GLPROJECTS, value);
    }

    /**
     * @return the associated entity erpadm.modeladm.admeo.AdminCompanyImpl.
     */
    public AdminCompanyImpl getAdminCompany() {
        return (AdminCompanyImpl) getAttributeInternal(ADMINCOMPANY);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.AdminCompanyImpl.
     */
    public void setAdminCompany(AdminCompanyImpl value) {
        setAttributeInternal(ADMINCOMPANY, value);
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
    public RowIterator getScmPurchaseRfqLines() {
        return (RowIterator) getAttributeInternal(SCMPURCHASERFQLINES);
    }


    /**
     * @return the associated entity erpims.modelims.imseo.InvInventoryOrgImpl.
     */
    public InvInventoryOrgImpl getInvInventoryOrg() {
        return (InvInventoryOrgImpl) getAttributeInternal(INVINVENTORYORG);
    }

    /**
     * Sets <code>value</code> as the associated entity erpims.modelims.imseo.InvInventoryOrgImpl.
     */
    public void setInvInventoryOrg(InvInventoryOrgImpl value) {
        setAttributeInternal(INVINVENTORYORG, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidLines() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDLINES);
    }


    /**
     * @param demandLinesSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer demandLinesSno) {
        return new Key(new Object[] { demandLinesSno });
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
            /* populateAttributeAsChanged(DEMANDHEADERSNO, getScmPurchaseDemandHeader().getAttribute("DemandHeaderSno"));
            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "DEMAND_LINES_SNO",
                                                              this.getEntityDef().getSource(), null, null);

            populateAttributeAsChanged(DEMANDLINESSNO, Integer.parseInt(result)); */

            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "LINE_NO",
                                                              this.getEntityDef().getSource(), "DEMAND_HEADER_SNO", getDemandHeaderSno().toString());

            populateAttributeAsChanged(LINENO, Integer.parseInt(result));
            

        }  
        if (operation!=DML_DELETE) {
           populateAttributeAsChanged(APPROVEQUANTITY, getDemandQuantity());
           populateAttributeAsChanged(TXTISDUPLICATEITEM, "ERPNO");
       }
        System.out.println("this is purchase demand lines impl");
        super.doDML(operation, e);
    }
}

