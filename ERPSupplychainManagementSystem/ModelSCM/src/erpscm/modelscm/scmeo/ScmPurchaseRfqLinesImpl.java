package erpscm.modelscm.scmeo;

import erpadm.modeladm.admeo.AdminCompanyImpl;

import erpfms.modelfms.fmseo.GlProjectsImpl;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import erpims.modelims.imseo.InvItemImpl;
import erpims.modelims.imseo.InvUnitTypeImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue May 17 15:36:30 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqLinesImpl extends ERPEntityImpl {
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
        txtItemName,
        txtUnitTypeName,
        txtDepartmentName,
        txtProjectName,
        StatusSno,
        txtTotalBids,
        txtBidPrice,
        txtGenerateBID,
        ScmPurchaseRfqHeader,
        InvItem,
        InvUnitType,
        GlProjects,
        AdminCompany,
        ScmPurchaseDemandLines,
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
    public static final int TXTITEMNAME = AttributesEnum.txtItemName.index();
    public static final int TXTUNITTYPENAME = AttributesEnum.txtUnitTypeName.index();
    public static final int TXTDEPARTMENTNAME = AttributesEnum.txtDepartmentName.index();
    public static final int TXTPROJECTNAME = AttributesEnum.txtProjectName.index();
    public static final int STATUSSNO = AttributesEnum.StatusSno.index();
    public static final int TXTTOTALBIDS = AttributesEnum.txtTotalBids.index();
    public static final int TXTBIDPRICE = AttributesEnum.txtBidPrice.index();
    public static final int TXTGENERATEBID = AttributesEnum.txtGenerateBID.index();
    public static final int SCMPURCHASERFQHEADER = AttributesEnum.ScmPurchaseRfqHeader.index();
    public static final int INVITEM = AttributesEnum.InvItem.index();
    public static final int INVUNITTYPE = AttributesEnum.InvUnitType.index();
    public static final int GLPROJECTS = AttributesEnum.GlProjects.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int SCMPURCHASEDEMANDLINES = AttributesEnum.ScmPurchaseDemandLines.index();
    public static final int SCMPURCHASEBIDLINES = AttributesEnum.ScmPurchaseBidLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqLinesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseRfqLines");
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
     * Gets the attribute value for RequiredBy, using the alias name RequiredBy.
     * @return the value of RequiredBy
     */
    public Timestamp getRequiredBy() {
        return (Timestamp) getAttributeInternal(REQUIREDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for RequiredBy.
     * @param value value to set the RequiredBy
     */
    public void setRequiredBy(Timestamp value) {
        setAttributeInternal(REQUIREDBY, value);
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
     * Gets the attribute value for Remarks, using the alias name Remarks.
     * @return the value of Remarks
     */
    public String getRemarks() {
        return (String) getAttributeInternal(REMARKS);
    }

    /**
     * Sets <code>value</code> as the attribute value for Remarks.
     * @param value value to set the Remarks
     */
    public void setRemarks(String value) {
        setAttributeInternal(REMARKS, value);
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
     * Gets the attribute value for txtTotalBids, using the alias name txtTotalBids.
     * @return the value of txtTotalBids
     */
    public Integer gettxtTotalBids() {
        return (Integer) getAttributeInternal(TXTTOTALBIDS);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtTotalBids.
     * @param value value to set the txtTotalBids
     */
    public void settxtTotalBids(Integer value) {
        setAttributeInternal(TXTTOTALBIDS, value);
    }

    /**
     * Gets the attribute value for txtBidPrice, using the alias name txtBidPrice.
     * @return the value of txtBidPrice
     */
    public BigDecimal gettxtBidPrice() {
        if (getAttributeInternal(TXTBIDPRICE)==null) {
           return (BigDecimal) getAttributeInternal(APROXPRICE);
       }
        return (BigDecimal) getAttributeInternal(TXTBIDPRICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtBidPrice.
     * @param value value to set the txtBidPrice
     */
    public void settxtBidPrice(BigDecimal value) {
        setAttributeInternal(TXTBIDPRICE, value);
    }

    /**
     * Gets the attribute value for txtGenerateBID, using the alias name txtGenerateBID.
     * @return the value of txtGenerateBID
     */
    public String gettxtGenerateBID() {
        return (String) getAttributeInternal(TXTGENERATEBID);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtGenerateBID.
     * @param value value to set the txtGenerateBID
     */
    public void settxtGenerateBID(String value) {
        setAttributeInternal(TXTGENERATEBID, value);
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
     * @return the associated entity ScmPurchaseDemandLinesImpl.
     */
    public ScmPurchaseDemandLinesImpl getScmPurchaseDemandLines() {
        return (ScmPurchaseDemandLinesImpl) getAttributeInternal(SCMPURCHASEDEMANDLINES);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseDemandLinesImpl.
     */
    public void setScmPurchaseDemandLines(ScmPurchaseDemandLinesImpl value) {
        setAttributeInternal(SCMPURCHASEDEMANDLINES, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidLines() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDLINES);
    }


    /**
     * @param rfqLinesSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer rfqLinesSno) {
        return new Key(new Object[] { rfqLinesSno });
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
//            populateAttributeAsChanged(RFQHEADERSNO, getScmPurchaseRfqHeader().getAttribute("RfqHeaderSno"));
//            String result =
//                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "RFQ_LINES_SNO",
//                                                              this.getEntityDef().getSource(), null, null);
//
//            populateAttributeAsChanged(RFQLINESSNO, Integer.parseInt(result));

            if (getDemandLinesSno() != null) {
                getScmPurchaseDemandLines().setAttribute("StatusSno", 2);
//                getScmPurchaseDemandLines().populateAttributeAsChanged(getScmPurchaseDemandLines().STATUSSNO, 2);
            }

        }
        if (operation == DML_DELETE && getDemandLinesSno() != null) {
            getScmPurchaseDemandLines().setAttribute("StatusSno", 1);
        }
        super.doDML(operation, e);
    }
}

