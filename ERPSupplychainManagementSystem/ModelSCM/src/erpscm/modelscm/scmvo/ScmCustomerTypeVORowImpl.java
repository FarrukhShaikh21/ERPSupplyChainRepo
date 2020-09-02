package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewRowImpl;

import java.sql.Timestamp;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Sep 02 13:58:09 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmCustomerTypeVORowImpl extends ERPViewRowImpl {


    public static final int ENTITY_SCMCUSTOMERTYPE = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CustomerTypeSno,
        CustomerTypeCode,
        CustomerTypeShortName,
        CustomerTypeName,
        OpenDate,
        IsActive,
        CompanyId,
        GlobalCompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        IsSupervised,
        SupervisedDate,
        IsUnsupervised,
        UnSupervisedDate,
        SupervisedBy,
        UnSupervisedBy,
        AccSysGeneralValueVO;
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


    public static final int CUSTOMERTYPESNO = AttributesEnum.CustomerTypeSno.index();
    public static final int CUSTOMERTYPECODE = AttributesEnum.CustomerTypeCode.index();
    public static final int CUSTOMERTYPESHORTNAME = AttributesEnum.CustomerTypeShortName.index();
    public static final int CUSTOMERTYPENAME = AttributesEnum.CustomerTypeName.index();
    public static final int OPENDATE = AttributesEnum.OpenDate.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmCustomerTypeVORowImpl() {
    }
}

