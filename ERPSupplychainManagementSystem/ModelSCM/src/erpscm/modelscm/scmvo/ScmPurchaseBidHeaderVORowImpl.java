package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewRowImpl;

import erpscm.modelscm.scmeo.ScmPurchaseBidHeaderImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.domain.Date;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Feb 18 00:41:04 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidHeaderVORowImpl extends ERPViewRowImpl {


    public static final int ENTITY_SCMPURCHASEBIDHEADER = 0;

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
        txtLocationName,
        txtTempDepartmentName,
        txtTempProjectName,
        txtSumBidQuantity,
        txtRfqHeaderCode,
        SupplierSno,
        txtIsSelected,
        txtDemandHeaderCode,
        txtSupplierName,
        ScmPurchaseBidLinesVO,
        ScmPurchaseRfqHeaderVO,
        AdminCompanyVO,
        AdminCompanyVO1,
        GlProjectsVO,
        ScmPurchaseDemandHeaderVO,
        ScmSupplierVO,
        AccSysApprovalStatusVO,
        AccAdminCompanyVO,
        AccSysGeneralValueYesNoVO,
        AccScmSupplierVO,
        AccScmPurchaseRfqSupplierVO,
        AccScmPurchaseRfqForBidSupplierWiseQVO,
        AccAdminCompanyForCompVO,
        AccSysSystemParameterVO,
        AccGlProjectsVO,
        AccAdminCompanyDept,
        AccScmPurchaseRfqForLinesVO;
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
    public static final int TXTLOCATIONNAME = AttributesEnum.txtLocationName.index();
    public static final int TXTTEMPDEPARTMENTNAME = AttributesEnum.txtTempDepartmentName.index();
    public static final int TXTTEMPPROJECTNAME = AttributesEnum.txtTempProjectName.index();
    public static final int TXTSUMBIDQUANTITY = AttributesEnum.txtSumBidQuantity.index();
    public static final int TXTRFQHEADERCODE = AttributesEnum.txtRfqHeaderCode.index();
    public static final int SUPPLIERSNO = AttributesEnum.SupplierSno.index();
    public static final int TXTISSELECTED = AttributesEnum.txtIsSelected.index();
    public static final int TXTDEMANDHEADERCODE = AttributesEnum.txtDemandHeaderCode.index();
    public static final int TXTSUPPLIERNAME = AttributesEnum.txtSupplierName.index();
    public static final int SCMPURCHASEBIDLINESVO = AttributesEnum.ScmPurchaseBidLinesVO.index();
    public static final int SCMPURCHASERFQHEADERVO = AttributesEnum.ScmPurchaseRfqHeaderVO.index();
    public static final int ADMINCOMPANYVO = AttributesEnum.AdminCompanyVO.index();
    public static final int ADMINCOMPANYVO1 = AttributesEnum.AdminCompanyVO1.index();
    public static final int GLPROJECTSVO = AttributesEnum.GlProjectsVO.index();
    public static final int SCMPURCHASEDEMANDHEADERVO = AttributesEnum.ScmPurchaseDemandHeaderVO.index();
    public static final int SCMSUPPLIERVO = AttributesEnum.ScmSupplierVO.index();
    public static final int ACCSYSAPPROVALSTATUSVO = AttributesEnum.AccSysApprovalStatusVO.index();
    public static final int ACCADMINCOMPANYVO = AttributesEnum.AccAdminCompanyVO.index();
    public static final int ACCSYSGENERALVALUEYESNOVO = AttributesEnum.AccSysGeneralValueYesNoVO.index();
    public static final int ACCSCMSUPPLIERVO = AttributesEnum.AccScmSupplierVO.index();
    public static final int ACCSCMPURCHASERFQSUPPLIERVO = AttributesEnum.AccScmPurchaseRfqSupplierVO.index();
    public static final int ACCSCMPURCHASERFQFORBIDSUPPLIERWISEQVO =
        AttributesEnum.AccScmPurchaseRfqForBidSupplierWiseQVO.index();
    public static final int ACCADMINCOMPANYFORCOMPVO = AttributesEnum.AccAdminCompanyForCompVO.index();
    public static final int ACCSYSSYSTEMPARAMETERVO = AttributesEnum.AccSysSystemParameterVO.index();
    public static final int ACCGLPROJECTSVO = AttributesEnum.AccGlProjectsVO.index();
    public static final int ACCADMINCOMPANYDEPT = AttributesEnum.AccAdminCompanyDept.index();
    public static final int ACCSCMPURCHASERFQFORLINESVO = AttributesEnum.AccScmPurchaseRfqForLinesVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidHeaderVORowImpl() {
    }

    /**
     * Gets ScmPurchaseBidHeader entity object.
     * @return the ScmPurchaseBidHeader
     */
    public ScmPurchaseBidHeaderImpl getScmPurchaseBidHeader() {
        return (ScmPurchaseBidHeaderImpl) getEntity(ENTITY_SCMPURCHASEBIDHEADER);
    }

    /**
     * Gets the attribute value for BID_HEADER_SNO using the alias name BidHeaderSno.
     * @return the BID_HEADER_SNO
     */
    public Integer getBidHeaderSno() {
        return (Integer) getAttributeInternal(BIDHEADERSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BID_HEADER_SNO using the alias name BidHeaderSno.
     * @param value value to set the BID_HEADER_SNO
     */
    public void setBidHeaderSno(Integer value) {
        setAttributeInternal(BIDHEADERSNO, value);
    }

    /**
     * Gets the attribute value for BID_HEADER_CODE using the alias name BidHeaderCode.
     * @return the BID_HEADER_CODE
     */
    public Integer getBidHeaderCode() {
        return (Integer) getAttributeInternal(BIDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for BID_HEADER_CODE using the alias name BidHeaderCode.
     * @param value value to set the BID_HEADER_CODE
     */
    public void setBidHeaderCode(Integer value) {
        setAttributeInternal(BIDHEADERCODE, value);
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
        getAccScmPurchaseRfqForLinesVO().setNamedWhereClauseParam("P_RFQ_HEADER_SNO", value==null?-1:value);
        getAccScmPurchaseRfqForLinesVO().setNamedWhereClauseParam("P_ADF_SUPPLIER_SNO", getSupplierSno());
        getAccScmPurchaseRfqForLinesVO().executeQuery();
        RowSetIterator rsi=getAccScmPurchaseRfqForLinesVO();
        while(getScmPurchaseBidLinesVO().getRowCount()>0) {
            getScmPurchaseBidLinesVO().first().remove();
        }
        System.out.println(rsi.getRowCount()+ "getRowCount:"+value+":"+getSupplierSno());
        while(rsi.hasNext()) {
            Row erpRfqrow=rsi.next();
            Row newRow=getScmPurchaseBidLinesVO().createRow();
            newRow.setAttribute("RfqLinesSno", erpRfqrow.getAttribute("RfqLinesSno"));
            newRow.setAttribute("ItemId", erpRfqrow.getAttribute("ItemId"));
            newRow.setAttribute("UnitTypeSno", erpRfqrow.getAttribute("UnitTypeSno"));
            newRow.setAttribute("Quantity", erpRfqrow.getAttribute("Quantity"));
            newRow.setAttribute("BidPrice", erpRfqrow.getAttribute("AproxPrice"));
            newRow.setAttribute("ProjectId", erpRfqrow.getAttribute("ProjectId"));
            newRow.setAttribute("DepartmentId", erpRfqrow.getAttribute("DepartmentId"));
            newRow.setAttribute("DemandLinesSno", erpRfqrow.getAttribute("DemandLinesSno"));
            newRow.setAttribute("SupplierItemName", erpRfqrow.getAttribute("SupplierItemName"));
            newRow.setAttribute("Remarks", erpRfqrow.getAttribute("Remarks"));
            newRow.setAttribute("StatusSno", erpRfqrow.getAttribute("StatusSno"));
            
            getScmPurchaseBidLinesVO().insertRow(newRow);
        }
//            getScmPurchaseBidLinesVO().ex
        
    }

    /**
     * Gets the attribute value for BILL_TO_SNO using the alias name BillToSno.
     * @return the BILL_TO_SNO
     */
    public Integer getBillToSno() {
        return (Integer) getAttributeInternal(BILLTOSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for BILL_TO_SNO using the alias name BillToSno.
     * @param value value to set the BILL_TO_SNO
     */
    public void setBillToSno(Integer value) {
        setAttributeInternal(BILLTOSNO, value);
    }

    /**
     * Gets the attribute value for SHIP_TO_SNO using the alias name ShipToSno.
     * @return the SHIP_TO_SNO
     */
    public Integer getShipToSno() {
        return (Integer) getAttributeInternal(SHIPTOSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for SHIP_TO_SNO using the alias name ShipToSno.
     * @param value value to set the SHIP_TO_SNO
     */
    public void setShipToSno(Integer value) {
        setAttributeInternal(SHIPTOSNO, value);
    }

    /**
     * Gets the attribute value for BID_DATE using the alias name BidDate.
     * @return the BID_DATE
     */
    public Timestamp getBidDate() {
        return (Timestamp) getAttributeInternal(BIDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for BID_DATE using the alias name BidDate.
     * @param value value to set the BID_DATE
     */
    public void setBidDate(Timestamp value) {
        setAttributeInternal(BIDDATE, value);
    }

    /**
     * Gets the attribute value for RESPONSE_DATE using the alias name ResponseDate.
     * @return the RESPONSE_DATE
     */
    public Timestamp getResponseDate() {
        return (Timestamp) getAttributeInternal(RESPONSEDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for RESPONSE_DATE using the alias name ResponseDate.
     * @param value value to set the RESPONSE_DATE
     */
    public void setResponseDate(Timestamp value) {
        setAttributeInternal(RESPONSEDATE, value);
    }

    /**
     * Gets the attribute value for SUPPLIER_QUOTE_NO using the alias name SupplierQuoteNo.
     * @return the SUPPLIER_QUOTE_NO
     */
    public String getSupplierQuoteNo() {
        return (String) getAttributeInternal(SUPPLIERQUOTENO);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPPLIER_QUOTE_NO using the alias name SupplierQuoteNo.
     * @param value value to set the SUPPLIER_QUOTE_NO
     */
    public void setSupplierQuoteNo(String value) {
        setAttributeInternal(SUPPLIERQUOTENO, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_FROM using the alias name EffectiveFrom.
     * @return the EFFECTIVE_FROM
     */
    public Date getEffectiveFrom() {
        return (Date) getAttributeInternal(EFFECTIVEFROM);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_FROM using the alias name EffectiveFrom.
     * @param value value to set the EFFECTIVE_FROM
     */
    public void setEffectiveFrom(Date value) {
        setAttributeInternal(EFFECTIVEFROM, value);
    }

    /**
     * Gets the attribute value for EFFECTIVE_TO using the alias name EffectiveTo.
     * @return the EFFECTIVE_TO
     */
    public Date getEffectiveTo() {
        return (Date) getAttributeInternal(EFFECTIVETO);
    }

    /**
     * Sets <code>value</code> as attribute value for EFFECTIVE_TO using the alias name EffectiveTo.
     * @param value value to set the EFFECTIVE_TO
     */
    public void setEffectiveTo(Date value) {
        setAttributeInternal(EFFECTIVETO, value);
    }

    /**
     * Gets the attribute value for STATUS_ID using the alias name StatusId.
     * @return the STATUS_ID
     */
    public Integer getStatusId() {
        return (Integer) getAttributeInternal(STATUSID);
    }

    /**
     * Sets <code>value</code> as attribute value for STATUS_ID using the alias name StatusId.
     * @param value value to set the STATUS_ID
     */
    public void setStatusId(Integer value) {
        setAttributeInternal(STATUSID, value);
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
     * Gets the attribute value for LOCATION_ID using the alias name LocationId.
     * @return the LOCATION_ID
     */
    public Integer getLocationId() {
        return (Integer) getAttributeInternal(LOCATIONID);
    }

    /**
     * Sets <code>value</code> as attribute value for LOCATION_ID using the alias name LocationId.
     * @param value value to set the LOCATION_ID
     */
    public void setLocationId(Integer value) {
        setAttributeInternal(LOCATIONID, value);
        setCompanyId(doGetCompanyIDByLocation(value, getGlobalCompanyId()));
    }

    /**
     * Gets the attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @return the GLOBAL_COMPANY_ID
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @param value value to set the GLOBAL_COMPANY_ID
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
    }

    /**
     * Gets the attribute value for COMPANY_ID using the alias name CompanyId.
     * @return the COMPANY_ID
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_ID using the alias name CompanyId.
     * @param value value to set the COMPANY_ID
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
        getAccGlProjectsVO().setNamedWhereClauseParam("P_ADF_COMPANY_ID", value);
        getAccGlProjectsVO().executeQuery();
        getAccAdminCompanyDept().setNamedWhereClauseParam("P_ADF_COMP_CODE", value);
        getAccAdminCompanyDept().setNamedWhereClauseParam("P_ADF_USER_ID", erpglobals.modelglobals.ERPGlobalPLSQLClass.doGetModelUserSno());
        getAccAdminCompanyDept().executeQuery();
//       
    }

    /**
     * Gets the attribute value for TEMP_PROJECT_ID using the alias name TempProjectId.
     * @return the TEMP_PROJECT_ID
     */
    public Integer getTempProjectId() {
        return (Integer) getAttributeInternal(TEMPPROJECTID);
    }

    /**
     * Sets <code>value</code> as attribute value for TEMP_PROJECT_ID using the alias name TempProjectId.
     * @param value value to set the TEMP_PROJECT_ID
     */
    public void setTempProjectId(Integer value) {
        setAttributeInternal(TEMPPROJECTID, value);
    }

    /**
     * Gets the attribute value for TEMP_DEPARTMENT_ID using the alias name TempDepartmentId.
     * @return the TEMP_DEPARTMENT_ID
     */
    public Integer getTempDepartmentId() {
        return (Integer) getAttributeInternal(TEMPDEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as attribute value for TEMP_DEPARTMENT_ID using the alias name TempDepartmentId.
     * @param value value to set the TEMP_DEPARTMENT_ID
     */
    public void setTempDepartmentId(Integer value) {
        setAttributeInternal(TEMPDEPARTMENTID, value);
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
     * Gets the attribute value for IS_SUPERVISED using the alias name IsSupervised.
     * @return the IS_SUPERVISED
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_SUPERVISED using the alias name IsSupervised.
     * @param value value to set the IS_SUPERVISED
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for SUPERVISED_BY using the alias name SupervisedBy.
     * @return the SUPERVISED_BY
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISED_BY using the alias name SupervisedBy.
     * @param value value to set the SUPERVISED_BY
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for SUPERVISED_DATE using the alias name SupervisedDate.
     * @return the SUPERVISED_DATE
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for SUPERVISED_DATE using the alias name SupervisedDate.
     * @param value value to set the SUPERVISED_DATE
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for IS_UNSUPERVISED using the alias name IsUnsupervised.
     * @return the IS_UNSUPERVISED
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_UNSUPERVISED using the alias name IsUnsupervised.
     * @param value value to set the IS_UNSUPERVISED
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for UN_SUPERVISED_BY using the alias name UnSupervisedBy.
     * @return the UN_SUPERVISED_BY
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UN_SUPERVISED_BY using the alias name UnSupervisedBy.
     * @param value value to set the UN_SUPERVISED_BY
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for UN_SUPERVISED_DATE using the alias name UnSupervisedDate.
     * @return the UN_SUPERVISED_DATE
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for UN_SUPERVISED_DATE using the alias name UnSupervisedDate.
     * @param value value to set the UN_SUPERVISED_DATE
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for IS_CANCELLED using the alias name IsCancelled.
     * @return the IS_CANCELLED
     */
    public String getIsCancelled() {
        return (String) getAttributeInternal(ISCANCELLED);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_CANCELLED using the alias name IsCancelled.
     * @param value value to set the IS_CANCELLED
     */
    public void setIsCancelled(String value) {
        setAttributeInternal(ISCANCELLED, value);
    }

    /**
     * Gets the attribute value for CANCELLED_BY using the alias name CancelledBy.
     * @return the CANCELLED_BY
     */
    public Integer getCancelledBy() {
        return (Integer) getAttributeInternal(CANCELLEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CANCELLED_BY using the alias name CancelledBy.
     * @param value value to set the CANCELLED_BY
     */
    public void setCancelledBy(Integer value) {
        setAttributeInternal(CANCELLEDBY, value);
    }

    /**
     * Gets the attribute value for CANCELLED_DATE using the alias name CancelledDate.
     * @return the CANCELLED_DATE
     */
    public Timestamp getCancelledDate() {
        return (Timestamp) getAttributeInternal(CANCELLEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CANCELLED_DATE using the alias name CancelledDate.
     * @param value value to set the CANCELLED_DATE
     */
    public void setCancelledDate(Timestamp value) {
        setAttributeInternal(CANCELLEDDATE, value);
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
     * Gets the attribute value for APPROVAL_STATUS_SNO using the alias name ApprovalStatusSno.
     * @return the APPROVAL_STATUS_SNO
     */
    public Integer getApprovalStatusSno() {
        return (Integer) getAttributeInternal(APPROVALSTATUSSNO);
    }

    /**
     * Sets <code>value</code> as attribute value for APPROVAL_STATUS_SNO using the alias name ApprovalStatusSno.
     * @param value value to set the APPROVAL_STATUS_SNO
     */
    public void setApprovalStatusSno(Integer value) {
        setAttributeInternal(APPROVALSTATUSSNO, value);
    }

    /**
     * Gets the attribute value for txt_Location_Name using the alias name txtLocationName.
     * @return the txt_Location_Name
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Location_Name using the alias name txtLocationName.
     * @param value value to set the txt_Location_Name
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
    }

    /**
     * Gets the attribute value for txt_Temp_Department_Name using the alias name txtTempDepartmentName.
     * @return the txt_Temp_Department_Name
     */
    public String gettxtTempDepartmentName() {
        return (String) getAttributeInternal(TXTTEMPDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Temp_Department_Name using the alias name txtTempDepartmentName.
     * @param value value to set the txt_Temp_Department_Name
     */
    public void settxtTempDepartmentName(String value) {
        setAttributeInternal(TXTTEMPDEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for txt_Temp_Project_Name using the alias name txtTempProjectName.
     * @return the txt_Temp_Project_Name
     */
    public String gettxtTempProjectName() {
        return (String) getAttributeInternal(TXTTEMPPROJECTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Temp_Project_Name using the alias name txtTempProjectName.
     * @param value value to set the txt_Temp_Project_Name
     */
    public void settxtTempProjectName(String value) {
        setAttributeInternal(TXTTEMPPROJECTNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSumBidQuantity.
     * @return the txtSumBidQuantity
     */
    public BigDecimal gettxtSumBidQuantity() {
        return (BigDecimal) getAttributeInternal(TXTSUMBIDQUANTITY);
    }

    /**
     * Gets the attribute value for txt_Rfq_Header_Code using the alias name txtRfqHeaderCode.
     * @return the txt_Rfq_Header_Code
     */
    public Integer gettxtRfqHeaderCode() {
        return (Integer) getAttributeInternal(TXTRFQHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Rfq_Header_Code using the alias name txtRfqHeaderCode.
     * @param value value to set the txt_Rfq_Header_Code
     */
    public void settxtRfqHeaderCode(Integer value) {
        setAttributeInternal(TXTRFQHEADERCODE, value);
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
     * Gets the attribute value for the calculated attribute txtIsSelected.
     * @return the txtIsSelected
     */
    public String gettxtIsSelected() {
        return (String) getAttributeInternal(TXTISSELECTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtIsSelected.
     * @param value value to set the  txtIsSelected
     */
    public void settxtIsSelected(String value) {
        setAttributeInternal(TXTISSELECTED, value);
    }

    /**
     * Gets the attribute value for txt_Demand_Header_Code using the alias name txtDemandHeaderCode.
     * @return the txt_Demand_Header_Code
     */
    public Integer gettxtDemandHeaderCode() {
        return (Integer) getAttributeInternal(TXTDEMANDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for txt_Demand_Header_Code using the alias name txtDemandHeaderCode.
     * @param value value to set the txt_Demand_Header_Code
     */
    public void settxtDemandHeaderCode(Integer value) {
        setAttributeInternal(TXTDEMANDHEADERCODE, value);
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
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseBidLinesVO.
     */
    public RowIterator getScmPurchaseBidLinesVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEBIDLINESVO);
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
     * Gets the associated <code>Row</code> using master-detail link AdminCompanyVO1.
     */
    public Row getAdminCompanyVO1() {
        return (Row) getAttributeInternal(ADMINCOMPANYVO1);
    }

    /**
     * Sets the master-detail link AdminCompanyVO1 between this object and <code>value</code>.
     */
    public void setAdminCompanyVO1(Row value) {
        setAttributeInternal(ADMINCOMPANYVO1, value);
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
     * Gets the view accessor <code>RowSet</code> AccSysApprovalStatusVO.
     */
    public RowSet getAccSysApprovalStatusVO() {
        return (RowSet) getAttributeInternal(ACCSYSAPPROVALSTATUSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyVO.
     */
    public RowSet getAccAdminCompanyVO() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYVO);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueYesNoVO.
     */
    public RowSet getAccSysGeneralValueYesNoVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEYESNOVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmSupplierVO.
     */
    public RowSet getAccScmSupplierVO() {
        return (RowSet) getAttributeInternal(ACCSCMSUPPLIERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmPurchaseRfqSupplierVO.
     */
    public RowSet getAccScmPurchaseRfqSupplierVO() {
        return (RowSet) getAttributeInternal(ACCSCMPURCHASERFQSUPPLIERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmPurchaseRfqForBidSupplierWiseQVO.
     */
    public RowSet getAccScmPurchaseRfqForBidSupplierWiseQVO() {
        return (RowSet) getAttributeInternal(ACCSCMPURCHASERFQFORBIDSUPPLIERWISEQVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyForCompVO.
     */
    public RowSet getAccAdminCompanyForCompVO() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYFORCOMPVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysSystemParameterVO.
     */
    public RowSet getAccSysSystemParameterVO() {
        return (RowSet) getAttributeInternal(ACCSYSSYSTEMPARAMETERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccGlProjectsVO.
     */
    public RowSet getAccGlProjectsVO() {
        return (RowSet) getAttributeInternal(ACCGLPROJECTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyDept.
     */
    public RowSet getAccAdminCompanyDept() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYDEPT);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmPurchaseRfqForLinesVO.
     */
    public RowSet getAccScmPurchaseRfqForLinesVO() {
        return (RowSet) getAttributeInternal(ACCSCMPURCHASERFQFORLINESVO);
    }
}

