package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object CS_Email
     
    /**
     * <p></p>
     */
    public static Object CS_Password
     
    /**
     * <p></p>
     */
    public static Object CRM_Email
     
    /**
     * <p></p>
     */
    public static Object CRM_Password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            baseUrl = selectedVariables['baseUrl']
            CS_Email = selectedVariables['CS_Email']
            CS_Password = selectedVariables['CS_Password']
            CRM_Email = selectedVariables['CRM_Email']
            CRM_Password = selectedVariables['CRM_Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
