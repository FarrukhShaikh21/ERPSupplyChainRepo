package erpscm.modelscm.scmvo;

import erpscm.modelscm.scmvo.common.ScmPurchaseRfqSupplierVO;

import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Apr 29 10:40:48 PKT 2023
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqSupplierVOImpl extends ViewObjectImpl implements ScmPurchaseRfqSupplierVO {
    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqSupplierVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_SUPPLIER_SNO.
     * @return variable value for P_ADF_SUPPLIER_SNO
     */
    public Integer getP_ADF_SUPPLIER_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_SUPPLIER_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_SUPPLIER_SNO.
     * @param value value to bind as P_ADF_SUPPLIER_SNO
     */
    public void setP_ADF_SUPPLIER_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_SUPPLIER_SNO", value);
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

    public void doShowBalancePOSupplier()
    {
        Integer erpRfqHeaderSno=(Integer)this.getRootApplicationModule().findViewObject("ScmPurchaseBidCompHeaderCRUD").getCurrentRow().getAttribute("RfqHeaderSno");
        String pERPWhereClahse=" exists (select '' from scm_purchase_bid_comp_supplier bs  ";
        pERPWhereClahse+=" where bs.RFQ_SUPPLIER_SNO=ScmPurchaseRfqSupplier.RFQ_SUPPLIER_SNO ";
        pERPWhereClahse+=" and bs.is_select='Y' and exists ";
        pERPWhereClahse+=" (select null from scm_purchase_bid_comp_header sh where sh.compare_header_sno=bs.compare_header_sno and sh.rfq_header_sno="+erpRfqHeaderSno+")";
        pERPWhereClahse+=" and Quantity-(select coalesce(sum(Po_Approve_Quantity),0)+coalesce(sum(Cancel_Quantity),0) from scm_purchase_order_lines pol where pol.bid_lines_sno=bs.bid_lines_sno)>0) ";                                                                                      
        this.setWhereClause(pERPWhereClahse);
        this.executeQuery();
        this.setWhereClause(null);
        
    }
}
