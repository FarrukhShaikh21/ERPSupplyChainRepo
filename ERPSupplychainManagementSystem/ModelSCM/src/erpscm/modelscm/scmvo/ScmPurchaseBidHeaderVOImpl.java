package erpscm.modelscm.scmvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Feb 26 12:30:08 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseBidHeaderVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseBidHeaderVOImpl() {
    }

    /**
     * Returns the variable value for P_SUPPLIER_SNO.
     * @return variable value for P_SUPPLIER_SNO
     */
    public Integer getP_SUPPLIER_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_SUPPLIER_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_SUPPLIER_SNO.
     * @param value value to bind as P_SUPPLIER_SNO
     */
    public void setP_SUPPLIER_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_SUPPLIER_SNO", value);
    }

    /**
     * Returns the variable value for P_RFQ_HEADER_SNO.
     * @return variable value for P_RFQ_HEADER_SNO
     */
    public Integer getP_RFQ_HEADER_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_RFQ_HEADER_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_RFQ_HEADER_SNO.
     * @param value value to bind as P_RFQ_HEADER_SNO
     */
    public void setP_RFQ_HEADER_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_RFQ_HEADER_SNO", value);
    }

    /**
     * Returns the variable value for P_ADF_APPROVAL_STATUS_SNO.
     * @return variable value for P_ADF_APPROVAL_STATUS_SNO
     */
    public Integer getP_ADF_APPROVAL_STATUS_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_APPROVAL_STATUS_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_APPROVAL_STATUS_SNO.
     * @param value value to bind as P_ADF_APPROVAL_STATUS_SNO
     */
    public void setP_ADF_APPROVAL_STATUS_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_APPROVAL_STATUS_SNO", value);
    }

    /**
     * Returns the variable value for P_ADF_BID_HEADER_SNO.
     * @return variable value for P_ADF_BID_HEADER_SNO
     */
    public Integer getP_ADF_BID_HEADER_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_BID_HEADER_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_BID_HEADER_SNO.
     * @param value value to bind as P_ADF_BID_HEADER_SNO
     */
    public void setP_ADF_BID_HEADER_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_BID_HEADER_SNO", value);
    }
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        //System.out.println("i am calling after rollback>>+"/*+getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherHeaderByVoucherIDCRUD").first().getAttribute("VoucherHeaderSno")*/);
        // System.out.println("header:>>"+getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherHeaderByVoucherIDCRUD").first().getAttribute("VoucherHeaderSno"));
        setErpPkColumn("BidHeaderSno");
        setErpParameterId("P_ADF_BID_HEADER_SNO");
        setErpViewObjectName("ScmPurchaseBidHeaderCRUD");
        
        super.afterRollback(transactionEvent);
    }


}

