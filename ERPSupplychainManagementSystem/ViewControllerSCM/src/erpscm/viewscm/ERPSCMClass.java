package erpscm.viewscm;

import erpglobals.modelglobals.ERPUserAttribute;

import erpglobals.viewglobals.ERPGlobalsClass;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.myfaces.trinidad.util.Service;


public class ERPSCMClass {
    private Integer ERPuserId;
    private String ERPuserCode = "";
    private ERPUserAttribute ERPUserAttributes;
    private String lIteratorDetailName;
    private String ERPBackActionName="ERPBACKCRUD";
    private String lIteratorName="SysUsersCRUDIterator";
    
    public ERPSCMClass() {
        super();
    }

    public void setERPBackActionName(String ERPBackActionName) {
        this.ERPBackActionName = ERPBackActionName;
    }

    public String getERPBackActionName() {
        return ERPBackActionName;
    }

    public void setLIteratorName(String lIteratorName) {
        this.lIteratorName = lIteratorName;
    }

    public String getLIteratorName() {
        return lIteratorName;
    }

    public void setLIteratorDetailName(String lIteratorDetailName) {
        this.lIteratorDetailName = lIteratorDetailName;
    }

    public String getLIteratorDetailName() {
        return lIteratorDetailName;
    }

    public void setERPuserId(Integer ERPuserId) {
        this.ERPuserId = ERPuserId;
    }

    public Integer getERPuserId() {
        return ERPuserId;
    }

    public void setERPuserCode(String ERPuserCode) {
        this.ERPuserCode = ERPuserCode;
    }

    public String getERPuserCode() {
        return ERPuserCode;
    }

    public void setERPUserAttributes(ERPUserAttribute ERPUserAttributes) {
        this.ERPUserAttributes = ERPUserAttributes;
    }

    public ERPUserAttribute getERPUserAttributes() {
        return ERPUserAttributes;
    }

    public void doSetSCMErpApplicationGlobals() {

        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE","FARRUKH");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_MODULE_ACTION","SEC_0011");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE","temp_admin_company_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_DEPT_ACCESS_TABLE","temp_admin_department_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME","FARRUKH SHAIKH");
        System.out.println("five erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE","PICTURE NAME");
       
         if (1==1) {
            return;
         }

        //System.out.println("one erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",getERPUserAttributes().getUserId());
        //System.out.println("two erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE",getERPUserAttributes().getUserCode());
        //System.out.println("three erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",getERPUserAttributes().getErpDefGloalCompany());
        //System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE",getERPUserAttributes().getErpTempCompanyAccessTable());
        //System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_DEPT_ACCESS_TABLE",getERPUserAttributes().getErpTempDepartAccessTable());
        ////////////////
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME",getERPUserAttributes().getERPUserName());
        System.out.println("five erp");
        getERPUserAttributes().setUserCode(getERPuserCode());
        getERPUserAttributes().setUserId(getERPuserId());
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE",getERPUserAttributes().getERPUserPicture());
        System.out.println("six erp-01-new:"+getERPuserId());
       ////////

    }
  
    public String doERPAddRecordWithPara() {
    
        if (ERPGlobalsClass.doCheckERPTransactionDirty() ) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Adding Record.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           return null;
        }        
        OperationBinding ob=ERPGlobalsClass.doGetERPOperation("CreateWithParams");
        ob.execute();
                
        return null;
    }
    
    public void doERPConfirmDelete(DialogEvent erpde) {
         //this is using on form sec_0006_edit
         if (erpde.getOutcome()==DialogEvent.Outcome.yes) {
             OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Delete");
             ob.execute();
             ob = ERPGlobalsClass.doGetERPOperation("Commit");
             Object o= ob.execute();
             doERPShowSaveMessage("Record Deleted Successfully.");      
         }
     }    

    public void doERPShowSaveMessage(String pMessage){
           FacesContext context = FacesContext.getCurrentInstance();
           ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
           erks.addScript(context, "showNotificationCallback('"+pMessage+"')");
       }

    public String doBackFromEdit() {
        
        if (ERPGlobalsClass.doCheckERPTransactionDirty()) {
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
                }
        /*if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ||(lIteratorDetailName!=null && ERPGlobalsClass.isRecordChanged(lIteratorDetailName).equals("YES"))) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
        } */       
        return ERPBackActionName;
    }
  
    public String doErpUndoRecord() {
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Rollback");
        ob.execute();
        doERPShowSaveMessage("Record Undo Successfully.");
        return null;
    }  
}
