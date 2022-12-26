package erpscm.modelscm.scmvo;

import erpscm.modelscm.scmvo.common.ScmPurchaseRfqLinesVO;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sun Oct 09 11:36:26 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseRfqLinesVOImpl extends ViewObjectImpl implements ScmPurchaseRfqLinesVO {
    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseRfqLinesVOImpl() {
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
    
    public void doERPGenerateBidFromRFQ() {
        
        this.setRangeSize(-1);
        ViewObject rfqvo=this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD");
        Integer isMasterGenerated=0;
        System.out.println(rfqvo.getCurrentRow().getAttribute("txtBidHeaderSno")+ "bid header sno");
        ViewObject bidDetvoForInsert=this.getApplicationModule().findViewObject("ScmPurchaseBidLinesDetForRFQMergeRO");
        //in case we want to merge into existing bid then it will merge in it
        Integer erpMergeBidHeaderSno=(Integer)rfqvo.getCurrentRow().getAttribute("txtMergeBidHeaderSno");
        ViewObject bidvoForInsert=this.getApplicationModule().findViewObject("ScmPurchaseBidHeaderForRFQMergeRO");
//        this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtBidHeaderCode",null);
        if (rfqvo.getCurrentRow().getAttribute("txtIsMerge")==null) {
           rfqvo.getCurrentRow().setAttribute("txtIsMerge","N");
       }
        
        Row rfqRow=null;
        for (int i = 0; i < this.getRowCount(); i++) {
            Row nextRow=this.getRowAtRangeIndex(i);
            if (nextRow.getAttribute("txtGenerateBID")!=null && nextRow.getAttribute("txtGenerateBID").toString().equals("Y") ) {
                //////////////
                if(isMasterGenerated==0 &&(rfqvo.getCurrentRow().getAttribute("txtIsMerge").equals("N"))){//checking if going to merge or header is already been generated
                    isMasterGenerated=1;    
                rfqRow=rfqvo.getCurrentRow();
                rfqRow.setAttribute("txtBidHeaderCode",null);
                ViewObject bidvoForSupplier=this.getApplicationModule().findViewObject("ScmPurchaseRfqSupplierDetCRUD");
                Integer erpSupplierSno =(Integer)bidvoForSupplier.getCurrentRow().getAttribute("SupplierSno");
                System.out.println("erpSupplierSno"+erpSupplierSno);
                Row newRow=bidvoForInsert.createRow();
                System.out.println("one");
                newRow.setAttribute("RfqHeaderSno",rfqRow.getAttribute("RfqHeaderSno"));
                System.out.println("two");
                newRow.setAttribute("SupplierSno",erpSupplierSno);
                System.out.println("three");
                newRow.setAttribute("DemandHeaderSno",rfqRow.getAttribute("DemandHeaderSno"));
                    
                newRow.setAttribute("LocationId",rfqRow.getAttribute("LocationId"));        
                System.out.println("four");
                newRow.setAttribute("CompanyId",rfqRow.getAttribute("CompanyId"));
                System.out.println("five");
                newRow.setAttribute("TempProjectId",rfqRow.getAttribute("TempProjectId"));
                System.out.println("six");
                newRow.setAttribute("TempDepartmentId",rfqRow.getAttribute("TempDepartmentId"));
                System.out.println("seven");
                newRow.setAttribute("ApprovalStatusSno",1);
                newRow.setAttribute("StatusId",1);
                System.out.println("eight");
                bidvoForInsert.insertRow(newRow);
                System.out.println("before commit");
                bidvoForInsert.setCurrentRow(newRow);
                erpMergeBidHeaderSno=(Integer)bidvoForInsert.getCurrentRow().getAttribute("BidHeaderSno");
                }
                
                Row DetnewRow=bidDetvoForInsert.createRow();
                DetnewRow.setAttribute("BidHeaderSno", erpMergeBidHeaderSno);
                DetnewRow.setAttribute("RfqLinesSno", nextRow.getAttribute("RfqLinesSno"));
                DetnewRow.setAttribute("DemandLinesSno", nextRow.getAttribute("DemandLinesSno"));
                DetnewRow.setAttribute("ItemId", nextRow.getAttribute("ItemId"));
                DetnewRow.setAttribute("UnitTypeSno", nextRow.getAttribute("UnitTypeSno"));
                DetnewRow.setAttribute("Quantity", nextRow.getAttribute("Quantity"));
                DetnewRow.setAttribute("BidPrice", nextRow.getAttribute("AproxPrice"));
                DetnewRow.setAttribute("ProjectId", nextRow.getAttribute("ProjectId"));
                DetnewRow.setAttribute("DepartmentId", nextRow.getAttribute("DepartmentId"));
                DetnewRow.setAttribute("StatusSno", nextRow.getAttribute("StatusSno"));
                DetnewRow.setAttribute("DemandLinesSno", nextRow.getAttribute("DemandLinesSno"));
//               nextRow.setAttribute("txtGenerateBID", "G");
               bidDetvoForInsert.insertRow(DetnewRow);
               
                
           }
        }
        
        if (isMasterGenerated==1 && rfqvo.getCurrentRow().getAttribute("txtIsMerge").equals("N")) {
            getDBTransaction().commit();
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtBidHeaderCode",bidvoForInsert.getCurrentRow().getAttribute("BidHeaderCode"));
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtBidHeaderSno",erpMergeBidHeaderSno);
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtMergeBidHeaderCode",null);
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtMergeBidHeaderSno",null);
                        
            getDBTransaction().commit();
        }
        else if(rfqvo.getCurrentRow().getAttribute("txtIsMerge").equals("Y")) {
            rfqvo.getCurrentRow().setAttribute("txtIsMerge","N");
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtMergeBidHeaderCode",bidvoForInsert.getCurrentRow().getAttribute("BidHeaderCode"));
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtMergeBidHeaderSno",erpMergeBidHeaderSno);
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtBidHeaderCode",null);
            this.getApplicationModule().findViewObject("ScmPurchaseRfqHeaderCRUD").getCurrentRow().setAttribute("txtBidHeaderSno",null);

            getDBTransaction().commit();
        }
        
        this.executeQuery();
    }
}