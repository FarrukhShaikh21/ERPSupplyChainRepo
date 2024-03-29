package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun May 08 12:37:57 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmFreightTermVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ScmFreightTermVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_COMPANY_ID.
     * @return variable value for P_ADF_COMPANY_ID
     */
    public Integer getP_ADF_COMPANY_ID() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_COMPANY_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_COMPANY_ID.
     * @param value value to bind as P_ADF_COMPANY_ID
     */
    public void setP_ADF_COMPANY_ID(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_COMPANY_ID", value);
    }

    /**
     * Returns the variable value for P_ADF_FREIGHT_TERM_SNO.
     * @return variable value for P_ADF_FREIGHT_TERM_SNO
     */
    public Integer getP_ADF_FREIGHT_TERM_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_FREIGHT_TERM_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_FREIGHT_TERM_SNO.
     * @param value value to bind as P_ADF_FREIGHT_TERM_SNO
     */
    public void setP_ADF_FREIGHT_TERM_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_FREIGHT_TERM_SNO", value);
    }
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        setErpPkColumn("FreightTermSno");
        setErpParameterId("P_ADF_FREIGHT_TERM_SNO");
        setErpViewObjectName("ScmFreightTermCRUD");
        
        super.afterRollback(transactionEvent);
    }       
}

