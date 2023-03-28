package erpscm.modelscm.scmeo;

import erpadm.modeladm.admeo.AdminCompanyImpl;

import erpfms.modelfms.fmseo.GlProjectsImpl;

import erpglobals.modelglobals.ERPEntityImpl;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Mar 25 15:15:14 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidCompHeaderImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CompareHeaderSno,
        CompareHeaderCode,
        RfqHeaderSno,
        CompareDate,
        StatusId,
        Remarks,
        LocationId,
        GlobalCompanyId,
        CompanyId,
        TempProjectId,
        TempDepartmentId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        IsSupervised,
        SupervisedBy,
        SupervisedDate,
        IsUnsupervised,
        UnSupervisedBy,
        UnSupervisedDate,
        IsCancelled,
        CancelledBy,
        CancelledDate,
        DemandHeaderSno,
        ApprovalStatusSno,
        txtLocationName,
        txtTempDepartmentName,
        txtTempProjectName,
        txtRfqHeaderCode,
        txtDemandHeaderCode,
        AdminCompany,
        AdminCompany1,
        GlProjects,
        ScmPurchaseRfqHeader,
        ScmPurchaseDemandHeader;
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


    public static final int COMPAREHEADERSNO = AttributesEnum.CompareHeaderSno.index();
    public static final int COMPAREHEADERCODE = AttributesEnum.CompareHeaderCode.index();
    public static final int RFQHEADERSNO = AttributesEnum.RfqHeaderSno.index();
    public static final int COMPAREDATE = AttributesEnum.CompareDate.index();
    public static final int STATUSID = AttributesEnum.StatusId.index();
    public static final int REMARKS = AttributesEnum.Remarks.index();
    public static final int LOCATIONID = AttributesEnum.LocationId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int TEMPPROJECTID = AttributesEnum.TempProjectId.index();
    public static final int TEMPDEPARTMENTID = AttributesEnum.TempDepartmentId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int ISCANCELLED = AttributesEnum.IsCancelled.index();
    public static final int CANCELLEDBY = AttributesEnum.CancelledBy.index();
    public static final int CANCELLEDDATE = AttributesEnum.CancelledDate.index();
    public static final int DEMANDHEADERSNO = AttributesEnum.DemandHeaderSno.index();
    public static final int APPROVALSTATUSSNO = AttributesEnum.ApprovalStatusSno.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTTEMPDEPARTMENTNAME = AttributesEnum.txtTempDepartmentName.index();
    public static final int TXTTEMPPROJECTNAME = AttributesEnum.txtTempProjectName.index();
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int TXTDEMANDHEADERCODE = AttributesEnum.txtDemandHeaderCode.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int ADMINCOMPANY1 = AttributesEnum.AdminCompany1.index();
    public static final int GLPROJECTS = AttributesEnum.GlProjects.index();
    public static final int SCMPURCHASERFQHEADER = AttributesEnum.ScmPurchaseRfqHeader.index();
    public static final int SCMPURCHASEDEMANDHEADER = AttributesEnum.ScmPurchaseDemandHeader.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidCompHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseBidCompHeader");
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
     * Gets the attribute value for CompareHeaderCode, using the alias name CompareHeaderCode.
     * @return the value of CompareHeaderCode
     */
    public Integer getCompareHeaderCode() {
        return (Integer) getAttributeInternal(COMPAREHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareHeaderCode.
     * @param value value to set the CompareHeaderCode
     */
    public void setCompareHeaderCode(Integer value) {
        setAttributeInternal(COMPAREHEADERCODE, value);
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
     * Gets the attribute value for CompareDate, using the alias name CompareDate.
     * @return the value of CompareDate
     */
    public Timestamp getCompareDate() {
        return (Timestamp) getAttributeInternal(COMPAREDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompareDate.
     * @param value value to set the CompareDate
     */
    public void setCompareDate(Timestamp value) {
        setAttributeInternal(COMPAREDATE, value);
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
     * Gets the attribute value for txtTempProjectName, using the alias name txtTempProjectName.
     * @return the value of txtTempProjectName
     */
    public String gettxtTempProjectName() {
        return (String) getAttributeInternal(TXTTEMPPROJECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtTempProjectName.
     * @param value value to set the txtTempProjectName
     */
    public void settxtTempProjectName(String value) {
        setAttributeInternal(TXTTEMPPROJECTNAME, value);
    }

    /**
     * Gets the attribute value for txtRfqHeaderCode, using the alias name txtRfqHeaderCode.
     * @return the value of txtRfqHeaderCode
     */
    public Integer gettxtRfqHeaderCode() {
        return (Integer) getAttributeInternal(TXTRFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtRfqHeaderCode.
     * @param value value to set the txtRfqHeaderCode
     */
    public void settxtRfqHeaderCode(Integer value) {
        setAttributeInternal(TXTRFQHEADERCODE, value);
    }

    /**
     * Gets the attribute value for txtDemandHeaderCode, using the alias name txtDemandHeaderCode.
     * @return the value of txtDemandHeaderCode
     */
    public Integer gettxtDemandHeaderCode() {
        return (Integer) getAttributeInternal(TXTDEMANDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtDemandHeaderCode.
     * @param value value to set the txtDemandHeaderCode
     */
    public void settxtDemandHeaderCode(Integer value) {
        setAttributeInternal(TXTDEMANDHEADERCODE, value);
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
     * @param compareHeaderSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer compareHeaderSno) {
        return new Key(new Object[] { compareHeaderSno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        setERPTableName("SCM_PURCHASE_BID_COMP_HEAD_SEQ");
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

