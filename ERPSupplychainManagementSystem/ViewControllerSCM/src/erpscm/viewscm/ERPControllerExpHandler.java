package erpscm.viewscm;

import javax.faces.context.FacesContext;
import javax.faces.event.PhaseId;

import oracle.adf.view.rich.context.ExceptionHandler;

import oracle.jbo.JboException;

public class ERPControllerExpHandler
  extends ExceptionHandler
{
  public void handleException(FacesContext facesContext,
                              Throwable throwable, PhaseId phaseId)
    throws Throwable
  {

boolean isCustomExp  = false;
    for (int i = 0; i < 10; i++)
    {
      if (throwable instanceof JboException)
      {
        isCustomExp = true;
        break;
      }
      if (throwable != null)
      {
        throwable = throwable.getCause();
      }
   }

    if (isCustomExp)
    {
      if (throwable!= null)
      {
// The below method will show a Faces Message. If client id of xxCustomException is not null then it will show a faces message on that component. It will try to get the message from resource bundle based on resourceBundleKey attribute. Error_type will decide if it is info, warning, severe
        FacesContext.getCurrentInstance().addMessage(throwable.getMessage(), null);
      }
    }
    else
    {
//this will be handled at taskflow level
         FacesContext.getCurrentInstance().addMessage(throwable.getMessage(), null);
     }
 }
}