package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu May 05 15:53:13 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqHeaderVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqHeaderVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_RFQ_HEADER_SNO.
     * @return variable value for P_ADF_RFQ_HEADER_SNO
     */
    public Integer getP_ADF_RFQ_HEADER_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_RFQ_HEADER_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_RFQ_HEADER_SNO.
     * @param value value to bind as P_ADF_RFQ_HEADER_SNO
     */
    public void setP_ADF_RFQ_HEADER_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_RFQ_HEADER_SNO", value);
    }
  
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        //System.out.println("i am calling after rollback>>+"/*+getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherHeaderByVoucherIDCRUD").first().getAttribute("VoucherHeaderSno")*/);
        // System.out.println("header:>>"+getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherHeaderByVoucherIDCRUD").first().getAttribute("VoucherHeaderSno"));
        setErpPkColumn("RfqHeaderSno");
        setErpParameterId("P_ADF_RFQ_HEADER_SNO");
        setErpViewObjectName("ScmPurchaseRfqHeaderCRUD");
        
        super.afterRollback(transactionEvent);
    }

    /**
     * Returns the variable value for P_ADF_LOCATION_ID.
     * @return variable value for P_ADF_LOCATION_ID
     */
    public Integer getP_ADF_LOCATION_ID() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_LOCATION_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_LOCATION_ID.
     * @param value value to bind as P_ADF_LOCATION_ID
     */
    public void setP_ADF_LOCATION_ID(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_LOCATION_ID", value);
    }
}

