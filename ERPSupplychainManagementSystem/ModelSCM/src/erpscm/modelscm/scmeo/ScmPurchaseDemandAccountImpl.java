package erpscm.modelscm.scmeo;

import erpfms.modelfms.fmseo.GlChartOfAccountsImpl;

import erpglobals.modelglobals.ERPEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Jul 02 17:09:11 PKT 2022
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ScmPurchaseDemandAccountImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        DemandAccountSno,
        DemandLinesSno,
        Quantity,
        ChartOfAccountId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtChartOfAccountName,
        ScmPurchaseDemandLines,
        GlChartOfAccounts;
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


    public static final int DEMANDACCOUNTSNO = AttributesEnum.DemandAccountSno.index();
    public static final int DEMANDLINESSNO = AttributesEnum.DemandLinesSno.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int CHARTOFACCOUNTID = AttributesEnum.ChartOfAccountId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTCHARTOFACCOUNTNAME = AttributesEnum.txtChartOfAccountName.index();
    public static final int SCMPURCHASEDEMANDLINES = AttributesEnum.ScmPurchaseDemandLines.index();
    public static final int GLCHARTOFACCOUNTS = AttributesEnum.GlChartOfAccounts.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ScmPurchaseDemandAccountImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpscm.modelscm.scmeo.ScmPurchaseDemandAccount");
    }


    /**
     * Gets the attribute value for DemandAccountSno, using the alias name DemandAccountSno.
     * @return the value of DemandAccountSno
     */
    public Integer getDemandAccountSno() {
        return (Integer) getAttributeInternal(DEMANDACCOUNTSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandAccountSno.
     * @param value value to set the DemandAccountSno
     */
    public void setDemandAccountSno(Integer value) {
        setAttributeInternal(DEMANDACCOUNTSNO, value);
    }

    /**
     * Gets the attribute value for DemandLinesSno, using the alias name DemandLinesSno.
     * @return the value of DemandLinesSno
     */
    public Integer getDemandLinesSno() {
        return (Integer) getAttributeInternal(DEMANDLINESSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for DemandLinesSno.
     * @param value value to set the DemandLinesSno
     */
    public void setDemandLinesSno(Integer value) {
        setAttributeInternal(DEMANDLINESSNO, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public BigDecimal getQuantity() {
        return (BigDecimal) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(BigDecimal value) {
        setAttributeInternal(QUANTITY, value);
    }

    /**
     * Gets the attribute value for ChartOfAccountId, using the alias name ChartOfAccountId.
     * @return the value of ChartOfAccountId
     */
    public Integer getChartOfAccountId() {
        return (Integer) getAttributeInternal(CHARTOFACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChartOfAccountId.
     * @param value value to set the ChartOfAccountId
     */
    public void setChartOfAccountId(Integer value) {
        setAttributeInternal(CHARTOFACCOUNTID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for txtChartOfAccountName, using the alias name txtChartOfAccountName.
     * @return the value of txtChartOfAccountName
     */
    public String gettxtChartOfAccountName() {
        return (String) getAttributeInternal(TXTCHARTOFACCOUNTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtChartOfAccountName.
     * @param value value to set the txtChartOfAccountName
     */
    public void settxtChartOfAccountName(String value) {
        setAttributeInternal(TXTCHARTOFACCOUNTNAME, value);
    }

    /**
     * @return the associated entity ScmPurchaseDemandLinesImpl.
     */
    public ScmPurchaseDemandLinesImpl getScmPurchaseDemandLines() {
        return (ScmPurchaseDemandLinesImpl) getAttributeInternal(SCMPURCHASEDEMANDLINES);
    }

    /**
     * Sets <code>value</code> as the associated entity ScmPurchaseDemandLinesImpl.
     */
    public void setScmPurchaseDemandLines(ScmPurchaseDemandLinesImpl value) {
        setAttributeInternal(SCMPURCHASEDEMANDLINES, value);
    }

    /**
     * @return the associated entity erpfms.modelfms.fmseo.GlChartOfAccountsImpl.
     */
    public GlChartOfAccountsImpl getGlChartOfAccounts() {
        return (GlChartOfAccountsImpl) getAttributeInternal(GLCHARTOFACCOUNTS);
    }

    /**
     * Sets <code>value</code> as the associated entity erpfms.modelfms.fmseo.GlChartOfAccountsImpl.
     */
    public void setGlChartOfAccounts(GlChartOfAccountsImpl value) {
        setAttributeInternal(GLCHARTOFACCOUNTS, value);
    }


    /**
     * @param demandAccountSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer demandAccountSno) {
        return new Key(new Object[] { demandAccountSno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {
        super.doDML(operation, e);
    }
}
