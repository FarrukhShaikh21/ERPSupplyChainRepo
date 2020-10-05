package erpscm.modelscm.scmqvo;

import erpscm.modelscm.scmqvo.common.ScmCustomerCategoryForTaxCatQVORow;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 05 10:46:55 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmCustomerCategoryForTaxCatQVORowImpl extends ViewRowImpl implements ScmCustomerCategoryForTaxCatQVORow {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        CategoryShortCode,
        CategoryTypeName,
        CategoryShortName,
        CategorySno,
        CompanyId,
        txtSelected;
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


    public static final int CATEGORYSHORTCODE = AttributesEnum.CategoryShortCode.index();
    public static final int CATEGORYTYPENAME = AttributesEnum.CategoryTypeName.index();
    public static final int CATEGORYSHORTNAME = AttributesEnum.CategoryShortName.index();
    public static final int CATEGORYSNO = AttributesEnum.CategorySno.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int TXTSELECTED = AttributesEnum.txtSelected.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmCustomerCategoryForTaxCatQVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute CategoryShortCode.
     * @return the CategoryShortCode
     */
    public Integer getCategoryShortCode() {
        return (Integer) getAttributeInternal(CATEGORYSHORTCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute CategoryTypeName.
     * @return the CategoryTypeName
     */
    public String getCategoryTypeName() {
        return (String) getAttributeInternal(CATEGORYTYPENAME);
    }

    /**
     * Gets the attribute value for the calculated attribute CategoryShortName.
     * @return the CategoryShortName
     */
    public String getCategoryShortName() {
        return (String) getAttributeInternal(CATEGORYSHORTNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute CategorySno.
     * @return the CategorySno
     */
    public Integer getCategorySno() {
        return (Integer) getAttributeInternal(CATEGORYSNO);
    }

    /**
     * Gets the attribute value for the calculated attribute CompanyId.
     * @return the CompanyId
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSelected.
     * @return the txtSelected
     */
    public String gettxtSelected() {
        return (String) getAttributeInternal(TXTSELECTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtSelected.
     * @param value value to set the  txtSelected
     */
    public void settxtSelected(String value) {
        setAttributeInternal(TXTSELECTED, value);
    }

    public void doErpAssignSingleCustCatToTaxType() {
            ViewObject vo = getDBTransaction().getRootApplicationModule().findViewObject("ScmCustomerCategotyTaxCRUD");
            Row cr = vo.createRow();
            cr.setAttribute("CompanyId", getCompanyId());
            cr.setAttribute("TaxTypeSno", getDBTransaction().getRootApplicationModule().findViewObject("GlTaxTypeByTaxIDRO").first().getAttribute("TaxTypeSno"));
            cr.setAttribute("CategorySno", getCategorySno());
        //cr.setAttribute("Remarks", "Copied" + getModuleAction());
            settxtSelected("Y");
            vo.insertRow(cr);
            getDBTransaction().commit();
            //getDBTransaction().rollback();
        vo.clearCache();
        vo.executeQuery();
        //executeQuery();
        //getDBTransaction().rollback();        
    }  
}
