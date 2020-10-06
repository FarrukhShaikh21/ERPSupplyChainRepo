package erpscm.modelscm.scmqvo;

import oracle.jbo.Row;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Oct 05 10:46:55 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmCustomerCategoryForTaxCatQVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ScmCustomerCategoryForTaxCatQVOImpl() {
    }

    /**
     * Returns the bind variable value for P_ADF_COMPANY_ID.
     * @return bind variable value for P_ADF_COMPANY_ID
     */
    public String getP_ADF_COMPANY_ID() {
        return (String) getNamedWhereClauseParam("P_ADF_COMPANY_ID");
    }

    /**
     * Sets <code>value</code> for bind variable P_ADF_COMPANY_ID.
     * @param value value to bind as P_ADF_COMPANY_ID
     */
    public void setP_ADF_COMPANY_ID(String value) {
        setNamedWhereClauseParam("P_ADF_COMPANY_ID", value);
    }

    /**
     * Returns the bind variable value for P_ADF_TAX_TYPE_SNO.
     * @return bind variable value for P_ADF_TAX_TYPE_SNO
     */
    public Integer getP_ADF_TAX_TYPE_SNO() {
        return (Integer) getNamedWhereClauseParam("P_ADF_TAX_TYPE_SNO");
    }

    /**
     * Sets <code>value</code> for bind variable P_ADF_TAX_TYPE_SNO.
     * @param value value to bind as P_ADF_TAX_TYPE_SNO
     */
    public void setP_ADF_TAX_TYPE_SNO(Integer value) {
        setNamedWhereClauseParam("P_ADF_TAX_TYPE_SNO", value);
    }

    public void doErpAssignAllCustCategoryToTaxType() {
         ViewObject vo = getRootApplicationModule().findViewObject("ScmCustomerCategotyTaxCRUD");
         RowSetIterator rsi =this.getRowSet();
         rsi.setRangeSize(-1);
         for (int i=0;i<rsi.getRowCount();i++) {
             Row r = rsi.getRowAtRangeIndex(i);
             //record might be assigned through single assignment
             if (r.getAttribute("txtSelected")== null || r.getAttribute("txtSelected").toString().equals("N")) {
                 r.setAttribute("txtSelected", "Y");
                 Row cr = vo.createRow();/*GlTaxTypeByTaxIDRO*/
                 cr.setAttribute("CompanyId", getDBTransaction().getRootApplicationModule().findViewObject("AdminCompanyVOByCompanyRO").first().getAttribute("CompCode"));
                 cr.setAttribute("TaxTypeSno", getDBTransaction().getRootApplicationModule().findViewObject("GlTaxTypeByTaxIDRO").first().getAttribute("TaxTypeSno"));
                 cr.setAttribute("IsActive", "Y");
                 cr.setAttribute("CategorySno", r.getAttribute("CategorySno"));
                 vo.insertRow(cr);
             }
         }
         getDBTransaction().commit();
         vo.executeQuery();
         this.executeQuery();
         //executeQuery();
         //getDBTransaction().rollback();        
     }
    
}

