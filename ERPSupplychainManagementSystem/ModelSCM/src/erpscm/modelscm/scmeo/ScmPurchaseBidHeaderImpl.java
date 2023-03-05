package erpscm.modelscm.scmeo;

import erpadm.modeladm.admeo.AdminCompanyImpl;

import erpfms.modelfms.fmseo.GlProjectsImpl;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.domain.Date;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 24 08:48:22 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidHeaderImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BidHeaderSno,
        BidHeaderCode,
        RfqHeaderSno,
        BillToSno,
        ShipToSno,
        BidDate,
        ResponseDate,
        SupplierQuoteNo,
        EffectiveFrom,
        EffectiveTo,
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
        txtTempProjectName,
        txtTempDepartmentName,
        txtLocationName,
        txtDemandHeaderCode,
        txtRfqHeaderCode,
        SupplierSno,
        txtSupplierName,
        txtNoBidPriceCount,
        ScmPurchaseBidLines,
        ScmPurchaseRfqHeader,
        AdminCompany,
        AdminCompany1,
        GlProjects,
        ScmPurchaseDemandHeader,
        ScmSupplier;
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


    public static final int BIDHEADERSNO = AttributesEnum.BidHeaderSno.index();
    public static final int BIDHEADERCODE = AttributesEnum.BidHeaderCode.index();
    public static final int RFQHEADERSNO = AttributesEnum.RfqHeaderSno.index();
    public static final int BILLTOSNO = AttributesEnum.BillToSno.index();
    public static final int SHIPTOSNO = AttributesEnum.ShipToSno.index();
    public static final int BIDDATE = AttributesEnum.BidDate.index();
    public static final int RESPONSEDATE = AttributesEnum.ResponseDate.index();
    public static final int SUPPLIERQUOTENO = AttributesEnum.SupplierQuoteNo.index();
    public static final int EFFECTIVEFROM = AttributesEnum.EffectiveFrom.index();
    public static final int EFFECTIVETO = AttributesEnum.EffectiveTo.index();
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
    public static final int TXTTEMPPROJECTNAME = AttributesEnum.txtTempProjectName.index();
    public static final int TXTTEMPDEPARTMENTNAME = AttributesEnum.txtTempDepartmentName.index();
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTDEMANDHEADERCODE = AttributesEnum.txtDemandHeaderCode.index();
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int TXTNOBIDPRICECOUNT = AttributesEnum.txtNoBidPriceCount.index();
    public static final int SCMPURCHASEBIDLINES = AttributesEnum.ScmPurchaseBidLines.index();
    public static final int SCMPURCHASERFQHEADER = AttributesEnum.ScmPurchaseRfqHeader.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int ADMINCOMPANY1 = AttributesEnum.AdminCompany1.index();
    public static final int GLPROJECTS = AttributesEnum.GlProjects.index();
    public static final int SCMPURCHASEDEMANDHEADER = AttributesEnum.ScmPurchaseDemandHeader.index();
    public static final int SCMSUPPLIER = AttributesEnum.ScmSupplier.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidHeaderImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseBidHeader");
    }


    /**
     * Gets the attribute value for BidHeaderSno, using the alias name BidHeaderSno.
     * @return the value of BidHeaderSno
     */
    public Integer getBidHeaderSno() {
        return (Integer) getAttributeInternal(BIDHEADERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidHeaderSno.
     * @param value value to set the BidHeaderSno
     */
    public void setBidHeaderSno(Integer value) {
        setAttributeInternal(BIDHEADERSNO, value);
    }

    /**
     * Gets the attribute value for BidHeaderCode, using the alias name BidHeaderCode.
     * @return the value of BidHeaderCode
     */
    public Integer getBidHeaderCode() {
        return (Integer) getAttributeInternal(BIDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidHeaderCode.
     * @param value value to set the BidHeaderCode
     */
    public void setBidHeaderCode(Integer value) {
        setAttributeInternal(BIDHEADERCODE, value);
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
     * Gets the attribute value for BillToSno, using the alias name BillToSno.
     * @return the value of BillToSno
     */
    public Integer getBillToSno() {
        return (Integer) getAttributeInternal(BILLTOSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for BillToSno.
     * @param value value to set the BillToSno
     */
    public void setBillToSno(Integer value) {
        setAttributeInternal(BILLTOSNO, value);
    }

    /**
     * Gets the attribute value for ShipToSno, using the alias name ShipToSno.
     * @return the value of ShipToSno
     */
    public Integer getShipToSno() {
        return (Integer) getAttributeInternal(SHIPTOSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ShipToSno.
     * @param value value to set the ShipToSno
     */
    public void setShipToSno(Integer value) {
        setAttributeInternal(SHIPTOSNO, value);
    }

    /**
     * Gets the attribute value for BidDate, using the alias name BidDate.
     * @return the value of BidDate
     */
    public Timestamp getBidDate() {
        return (Timestamp) getAttributeInternal(BIDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BidDate.
     * @param value value to set the BidDate
     */
    public void setBidDate(Timestamp value) {
        setAttributeInternal(BIDDATE, value);
    }

    /**
     * Gets the attribute value for ResponseDate, using the alias name ResponseDate.
     * @return the value of ResponseDate
     */
    public Timestamp getResponseDate() {
        return (Timestamp) getAttributeInternal(RESPONSEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ResponseDate.
     * @param value value to set the ResponseDate
     */
    public void setResponseDate(Timestamp value) {
        setAttributeInternal(RESPONSEDATE, value);
    }

    /**
     * Gets the attribute value for SupplierQuoteNo, using the alias name SupplierQuoteNo.
     * @return the value of SupplierQuoteNo
     */
    public String getSupplierQuoteNo() {
        return (String) getAttributeInternal(SUPPLIERQUOTENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupplierQuoteNo.
     * @param value value to set the SupplierQuoteNo
     */
    public void setSupplierQuoteNo(String value) {
        setAttributeInternal(SUPPLIERQUOTENO, value);
    }

    /**
     * Gets the attribute value for EffectiveFrom, using the alias name EffectiveFrom.
     * @return the value of EffectiveFrom
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveFrom.
     * @param value value to set the EffectiveFrom
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for EffectiveTo, using the alias name EffectiveTo.
     * @return the value of EffectiveTo
     */
    public Date getEffectiveTo() {
        return (Date) getAttributeInternal(EFFECTIVETO);
    }

    /**
     * Sets <code>value</code> as the attribute value for EffectiveTo.
     * @param value value to set the EffectiveTo
     */
    public void setEffectiveTo(Date value) {
        setAttributeInternal(EFFECTIVETO, value);
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
     * Gets the attribute value for txtNoBidPriceCount, using the alias name txtNoBidPriceCount.
     * @return the value of txtNoBidPriceCount
     */
    public Integer gettxtNoBidPriceCount() {
        return (Integer) getAttributeInternal(TXTNOBIDPRICECOUNT);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtNoBidPriceCount.
     * @param value value to set the txtNoBidPriceCount
     */
    public void settxtNoBidPriceCount(Integer value) {
        setAttributeInternal(TXTNOBIDPRICECOUNT, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getScmPurchaseBidLines() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDLINES);
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
     * @param bidHeaderSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer bidHeaderSno) {
        return new Key(new Object[] { bidHeaderSno });
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
            
            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "BID_HEADER_CODE",
                                                              this.getEntityDef().getSource(), "COMPANY_ID",
                                                              getCompanyId().toString());
            populateAttributeAsChanged(BIDHEADERCODE, Integer.parseInt(result));

        }         
        super.doDML(operation, e);
    }
}

