package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewRowImpl;

import erpscm.modelscm.scmeo.ScmPurchaseDemandHeaderImpl;

import java.sql.Timestamp;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Dec 06 14:47:47 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseDemandHeaderVORowImpl extends ERPViewRowImpl {


    public static final int ENTITY_SCMPURCHASEDEMANDHEADER = 0;

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
        ScmPurchaseDemandLinesVO,
        GlProjectsVO,
        AdminCompanyVO,
        AdminCompanyVO1,
        AccAdminCompany,
        AccAdminCompanyDept,
        AccGlProjectsVO,
        AccSysSystemParameterVO,
        AccAdminCompanyForCompVO,
        AccSysGeneralValueVO,
        AccScmTransactionStatusVO;
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
    public static final int SCMPURCHASEDEMANDLINESVO = AttributesEnum.ScmPurchaseDemandLinesVO.index();
    public static final int GLPROJECTSVO = AttributesEnum.GlProjectsVO.index();
    public static final int ADMINCOMPANYVO = AttributesEnum.AdminCompanyVO.index();
    public static final int ADMINCOMPANYVO1 = AttributesEnum.AdminCompanyVO1.index();
    public static final int ACCADMINCOMPANY = AttributesEnum.AccAdminCompany.index();
    public static final int ACCADMINCOMPANYDEPT = AttributesEnum.AccAdminCompanyDept.index();
    public static final int ACCGLPROJECTSVO = AttributesEnum.AccGlProjectsVO.index();
    public static final int ACCSYSSYSTEMPARAMETERVO = AttributesEnum.AccSysSystemParameterVO.index();
    public static final int ACCADMINCOMPANYFORCOMPVO = AttributesEnum.AccAdminCompanyForCompVO.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();
    public static final int ACCSCMTRANSACTIONSTATUSVO = AttributesEnum.AccScmTransactionStatusVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseDemandHeaderVORowImpl() {
    }

    /**
     * Gets ScmPurchaseDemandHeader entity object.
     * @return the ScmPurchaseDemandHeader
     */
    public ScmPurchaseDemandHeaderImpl getScmPurchaseDemandHeader() {
        return (ScmPurchaseDemandHeaderImpl) getEntity(ENTITY_SCMPURCHASEDEMANDHEADER);
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
     * Gets the attribute value for DEMAND_HEADER_CODE using the alias name DemandHeaderCode.
     * @return the DEMAND_HEADER_CODE
     */
    public Integer getDemandHeaderCode() {
        return (Integer) getAttributeInternal(DEMANDHEADERCODE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_HEADER_CODE using the alias name DemandHeaderCode.
     * @param value value to set the DEMAND_HEADER_CODE
     */
    public void setDemandHeaderCode(Integer value) {
        setAttributeInternal(DEMANDHEADERCODE, value);
    }

    /**
     * Gets the attribute value for DEMAND_DATE using the alias name DemandDate.
     * @return the DEMAND_DATE
     */
    public Timestamp getDemandDate() {
        return (Timestamp) getAttributeInternal(DEMANDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for DEMAND_DATE using the alias name DemandDate.
     * @param value value to set the DEMAND_DATE
     */
    public void setDemandDate(Timestamp value) {
        setAttributeInternal(DEMANDDATE, value);
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
     * Gets the attribute value for TXT_TEMP_DEPARTMENT_NAME using the alias name txtTempDepartmentName.
     * @return the TXT_TEMP_DEPARTMENT_NAME
     */
    public String gettxtTempDepartmentName() {
        return (String) getAttributeInternal(TXTTEMPDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_TEMP_DEPARTMENT_NAME using the alias name txtTempDepartmentName.
     * @param value value to set the TXT_TEMP_DEPARTMENT_NAME
     */
    public void settxtTempDepartmentName(String value) {
        setAttributeInternal(TXTTEMPDEPARTMENTNAME, value);
    }

    /**
     * Gets the attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @return the TXT_LOCATION_NAME
     */
    public String gettxtLocationName() {
        return (String) getAttributeInternal(TXTLOCATIONNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for TXT_LOCATION_NAME using the alias name txtLocationName.
     * @param value value to set the TXT_LOCATION_NAME
     */
    public void settxtLocationName(String value) {
        setAttributeInternal(TXTLOCATIONNAME, value);
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
     * Gets the associated <code>RowIterator</code> using master-detail link ScmPurchaseDemandLinesVO.
     */
    public RowIterator getScmPurchaseDemandLinesVO() {
        return (RowIterator) getAttributeInternal(SCMPURCHASEDEMANDLINESVO);
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
     * Gets the view accessor <code>RowSet</code> AccAdminCompany.
     */
    public RowSet getAccAdminCompany() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANY);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyDept.
     */
    public RowSet getAccAdminCompanyDept() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYDEPT);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccGlProjectsVO.
     */
    public RowSet getAccGlProjectsVO() {
        return (RowSet) getAttributeInternal(ACCGLPROJECTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysSystemParameterVO.
     */
    public RowSet getAccSysSystemParameterVO() {
        return (RowSet) getAttributeInternal(ACCSYSSYSTEMPARAMETERVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccAdminCompanyForCompVO.
     */
    public RowSet getAccAdminCompanyForCompVO() {
        return (RowSet) getAttributeInternal(ACCADMINCOMPANYFORCOMPVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueVO.
     */
    public RowSet getAccSysGeneralValueVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccScmTransactionStatusVO.
     */
    public RowSet getAccScmTransactionStatusVO() {
        return (RowSet) getAttributeInternal(ACCSCMTRANSACTIONSTATUSVO);
    }

    @Override
    public boolean isAttributeUpdateable(int i) {
        // TODO Implement this method
        if (getIsSupervised().equals("Y")) {
            return false;
       }
        return super.isAttributeUpdateable(i);
    }
}

