package erpscm.modelscm.scmeo;

import erpadm.modeladm.admeo.AdminCompanyImpl;

import erpfms.modelfms.fmseo.GlProjectsImpl;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Dec 06 08:58:51 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseDemandHeaderImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DemandHeaderSno,
        DemandHeaderCode,
        DemandDate,
        Remarks,
        CompanyId,
        TempProjectId,
        TempDepartmentId,
        LocationId,
        GlobalCompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        IsSupervised,
        SupervisedBy,
        SupervisedDate,
        UnSupervisedBy,
        UnSupervisedDate,
        IsCancelled,
        CancelledBy,
        CancelledDate,
        StatusId,
        txtProjectName,
        txtTempDepartmentName,
        txtLocationName,
        IsUnsupervised,
        ApprovalStatusSno,
        ScmPurchaseDemandLines,
        GlProjects,
        AdminCompany,
        AdminCompany1,
        ScmPurchaseRfqHeader,
        ScmPurchaseBidHeader,
        ScmPurchaseBidCompHeader,
        ScmPurchaseOrderHeader;
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


    public static final int DEMANDHEADERSNO = AttributesEnum.DemandHeaderSno.index();
    public static final int DEMANDHEADERCODE = AttributesEnum.DemandHeaderCode.index();
    public static final int DEMANDDATE = AttributesEnum.DemandDate.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int TEMPPROJECTID = AttributesEnum.TempProjectId.index();
    public static final int TEMPDEPARTMENTID = AttributesEnum.TempDepartmentId.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int ISCANCELLED = AttributesEnum.IsCancelled.index();
    public static final int CANCELLEDBY = AttributesEnum.CancelledBy.index();
    public static final int CANCELLEDDATE = AttributesEnum.CancelledDate.index();
    public static final int STATUSID = AttributesEnum.StatusId.index();
    public static final int TXTPROJECTNAME = AttributesEnum.txtProjectName.index();
    public static final int TXTTEMPDEPARTMENTNAME = AttributesEnum.txtTempDepartmentName.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int APPROVALSTATUSSNO = AttributesEnum.ApprovalStatusSno.index();
    public static final int SCMPURCHASEDEMANDLINES = AttributesEnum.ScmPurchaseDemandLines.index();
    public static final int GLPROJECTS = AttributesEnum.GlProjects.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int ADMINCOMPANY1 = AttributesEnum.AdminCompany1.index();
    public static final int SCMPURCHASERFQHEADER = AttributesEnum.ScmPurchaseRfqHeader.index();
    public static final int SCMPURCHASEBIDHEADER = AttributesEnum.ScmPurchaseBidHeader.index();
    public static final int SCMPURCHASEBIDCOMPHEADER = AttributesEnum.ScmPurchaseBidCompHeader.index();
    public static final int SCMPURCHASEORDERHEADER = AttributesEnum.ScmPurchaseOrderHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseDemandHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseDemandHeader");
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
     * Gets the attribute value for DemandHeaderCode, using the alias name DemandHeaderCode.
     * @return the value of DemandHeaderCode
     */
    public Integer getDemandHeaderCode() {
        return (Integer) getAttributeInternal(DEMANDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandHeaderCode.
     * @param value value to set the DemandHeaderCode
     */
    public void setDemandHeaderCode(Integer value) {
        setAttributeInternal(DEMANDHEADERCODE, value);
    }

    /**
     * Gets the attribute value for DemandDate, using the alias name DemandDate.
     * @return the value of DemandDate
     */
    public Timestamp getDemandDate() {
        return (Timestamp) getAttributeInternal(DEMANDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandDate.
     * @param value value to set the DemandDate
     */
    public void setDemandDate(Timestamp value) {
        setAttributeInternal(DEMANDDATE, value);
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
     * Gets the attribute value for CompanyId, using the alias name CompanyId.
     * @return the value of CompanyId
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyId.
     * @param value value to set the CompanyId
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for TempProjectId, using the alias name TempProjectId.
     * @return the value of TempProjectId
     */
    public Integer getTempProjectId() {
        return (Integer) getAttributeInternal(TEMPPROJECTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TempProjectId.
     * @param value value to set the TempProjectId
     */
    public void setTempProjectId(Integer value) {
        setAttributeInternal(TEMPPROJECTID, value);
    }

    /**
     * Gets the attribute value for TempDepartmentId, using the alias name TempDepartmentId.
     * @return the value of TempDepartmentId
     */
    public Integer getTempDepartmentId() {
        return (Integer) getAttributeInternal(TEMPDEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for TempDepartmentId.
     * @param value value to set the TempDepartmentId
     */
    public void setTempDepartmentId(Integer value) {
        setAttributeInternal(TEMPDEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for LocationId, using the alias name LocationId.
     * @return the value of LocationId
     */
    public Integer getLocationId() {
        return (Integer) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as the attribute value for LocationId.
     * @param value value to set the LocationId
     */
    public void setLocationId(Integer value) {
        setAttributeInternal(LOCATIONID, value);
    }

    /**
     * Gets the attribute value for GlobalCompanyId, using the alias name GlobalCompanyId.
     * @return the value of GlobalCompanyId
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlobalCompanyId.
     * @param value value to set the GlobalCompanyId
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
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
     * Gets the attribute value for IsSupervised, using the alias name IsSupervised.
     * @return the value of IsSupervised
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsSupervised.
     * @param value value to set the IsSupervised
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for SupervisedBy, using the alias name SupervisedBy.
     * @return the value of SupervisedBy
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisedBy.
     * @param value value to set the SupervisedBy
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for SupervisedDate, using the alias name SupervisedDate.
     * @return the value of SupervisedDate
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisedDate.
     * @param value value to set the SupervisedDate
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }


    /**
     * Gets the attribute value for UnSupervisedBy, using the alias name UnSupervisedBy.
     * @return the value of UnSupervisedBy
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnSupervisedBy.
     * @param value value to set the UnSupervisedBy
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for UnSupervisedDate, using the alias name UnSupervisedDate.
     * @return the value of UnSupervisedDate
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnSupervisedDate.
     * @param value value to set the UnSupervisedDate
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for IsCancelled, using the alias name IsCancelled.
     * @return the value of IsCancelled
     */
    public String getIsCancelled() {
        return (String) getAttributeInternal(ISCANCELLED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsCancelled.
     * @param value value to set the IsCancelled
     */
    public void setIsCancelled(String value) {
        setAttributeInternal(ISCANCELLED, value);
    }

    /**
     * Gets the attribute value for CancelledBy, using the alias name CancelledBy.
     * @return the value of CancelledBy
     */
    public Integer getCancelledBy() {
        return (Integer) getAttributeInternal(CANCELLEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CancelledBy.
     * @param value value to set the CancelledBy
     */
    public void setCancelledBy(Integer value) {
        setAttributeInternal(CANCELLEDBY, value);
    }

    /**
     * Gets the attribute value for CancelledDate, using the alias name CancelledDate.
     * @return the value of CancelledDate
     */
    public Timestamp getCancelledDate() {
        return (Timestamp) getAttributeInternal(CANCELLEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CancelledDate.
     * @param value value to set the CancelledDate
     */
    public void setCancelledDate(Timestamp value) {
        setAttributeInternal(CANCELLEDDATE, value);
    }

    /**
     * Gets the attribute value for StatusId, using the alias name StatusId.
     * @return the value of StatusId
     */
    public Integer getStatusId() {
        return (Integer) getAttributeInternal(STATUSID);
    }

    /**
     * Sets <code>value</code> as the attribute value for StatusId.
     * @param value value to set the StatusId
     */
    public void setStatusId(Integer value) {
        setAttributeInternal(STATUSID, value);
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
     * Gets the attribute value for txtTempDepartmentName, using the alias name txtTempDepartmentName.
     * @return the value of txtTempDepartmentName
     */
    public String gettxtTempDepartmentName() {
        return (String) getAttributeInternal(TXTTEMPDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtTempDepartmentName.
     * @param value value to set the txtTempDepartmentName
     */
    public void settxtTempDepartmentName(String value) {
        setAttributeInternal(TXTTEMPDEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for txtLocationName, using the alias name txtLocationName.
     * @return the value of txtLocationName
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtLocationName.
     * @param value value to set the txtLocationName
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for IsUnsupervised, using the alias name IsUnsupervised.
     * @return the value of IsUnsupervised
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsUnsupervised.
     * @param value value to set the IsUnsupervised
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for ApprovalStatusSno, using the alias name ApprovalStatusSno.
     * @return the value of ApprovalStatusSno
     */
    public Integer getApprovalStatusSno() {
        return (Integer) getAttributeInternal(APPROVALSTATUSSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ApprovalStatusSno.
     * @param value value to set the ApprovalStatusSno
     */
    public void setApprovalStatusSno(Integer value) {
        setAttributeInternal(APPROVALSTATUSSNO, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseDemandLines() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEDEMANDLINES);
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
     * @return the associated entity erpadm.modeladm.admeo.AdminCompanyImpl.
     */
    public AdminCompanyImpl getAdminCompany1() {
        return (AdminCompanyImpl) getAttributeInternal(ADMINCOMPANY1);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.AdminCompanyImpl.
     */
    public void setAdminCompany1(AdminCompanyImpl value) {
        setAttributeInternal(ADMINCOMPANY1, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseRfqHeader() {
        return (RowIterator) getAttributeInternal(SCMPURCHASERFQHEADER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidHeader() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDHEADER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidCompHeader() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDCOMPHEADER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseOrderHeader() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEORDERHEADER);
    }


    /**
     * @param demandHeaderSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer demandHeaderSno) {
        return new Key(new Object[] { demandHeaderSno });
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
            
            /* String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "DEMAND_HEADER_SNO",
                                                              this.getEntityDef().getSource(), null, null);

            populateAttributeAsChanged(DEMANDHEADERSNO, Integer.parseInt(result)); */
            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "DEMAND_HEADER_CODE",
                                                              this.getEntityDef().getSource(), "COMPANY_ID",
                                                              getCompanyId().toString());
            populateAttributeAsChanged(DEMANDHEADERCODE, Integer.parseInt(result));

        }        
        super.doDML(operation, e);
    }
}

