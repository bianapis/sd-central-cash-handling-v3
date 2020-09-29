package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement;
import org.bian.dto.SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup;
import org.bian.dto.SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingConfigureOutputModelCentralCashHandlingServiceConfigurationRecord
 */
public class SDCentralCashHandlingConfigureOutputModelCentralCashHandlingServiceConfigurationRecord   {
  private String centralCashHandlingServiceConfigurationSettingDescription = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription centralCashHandlingServiceSubscription = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement centralCashHandlingServiceAgreement = null;

  private String centralCashHandlingServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the configuration parameter, allowed values and processing impact 
   * @return centralCashHandlingServiceConfigurationSettingDescription
  **/

  public String getCentralCashHandlingServiceConfigurationSettingDescription() {
    return centralCashHandlingServiceConfigurationSettingDescription;
  }

  public void setCentralCashHandlingServiceConfigurationSettingDescription(String centralCashHandlingServiceConfigurationSettingDescription) {
    this.centralCashHandlingServiceConfigurationSettingDescription = centralCashHandlingServiceConfigurationSettingDescription;
  }


  /**
   * Get centralCashHandlingServiceConfigurationSetup
   * @return centralCashHandlingServiceConfigurationSetup
  **/

  public SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup getCentralCashHandlingServiceConfigurationSetup() {
    return centralCashHandlingServiceConfigurationSetup;
  }

  public void setCentralCashHandlingServiceConfigurationSetup(SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup) {
    this.centralCashHandlingServiceConfigurationSetup = centralCashHandlingServiceConfigurationSetup;
  }


  /**
   * Get centralCashHandlingServiceSubscription
   * @return centralCashHandlingServiceSubscription
  **/

  public SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription getCentralCashHandlingServiceSubscription() {
    return centralCashHandlingServiceSubscription;
  }

  public void setCentralCashHandlingServiceSubscription(SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription centralCashHandlingServiceSubscription) {
    this.centralCashHandlingServiceSubscription = centralCashHandlingServiceSubscription;
  }


  /**
   * Get centralCashHandlingServiceAgreement
   * @return centralCashHandlingServiceAgreement
  **/

  public SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement getCentralCashHandlingServiceAgreement() {
    return centralCashHandlingServiceAgreement;
  }

  public void setCentralCashHandlingServiceAgreement(SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement centralCashHandlingServiceAgreement) {
    this.centralCashHandlingServiceAgreement = centralCashHandlingServiceAgreement;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the offered service (e.g. active, suspended, idle) 
   * @return centralCashHandlingServiceStatus
  **/

  public String getCentralCashHandlingServiceStatus() {
    return centralCashHandlingServiceStatus;
  }

  public void setCentralCashHandlingServiceStatus(String centralCashHandlingServiceStatus) {
    this.centralCashHandlingServiceStatus = centralCashHandlingServiceStatus;
  }


}

