package erpscm.modelscm.scmqvo;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Oct 02 12:14:48 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class CustomerTypeForTaxCatQVOImpl extends ViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public CustomerTypeForTaxCatQVOImpl() {
    }

    /**
     * Returns the bind variable value for P_ADF_COMPANY_ID.
     * @return bind variable value for P_ADF_COMPANY_ID
     */
    public Integer getP_ADF_COMPANY_ID() {
        return (Integer) getNamedWhereClauseParam("P_ADF_COMPANY_ID");
    }

    /**
     * Sets <code>value</code> for bind variable P_ADF_COMPANY_ID.
     * @param value value to bind as P_ADF_COMPANY_ID
     */
    public void setP_ADF_COMPANY_ID(Integer value) {
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
}

