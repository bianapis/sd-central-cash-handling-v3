package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup;
import org.bian.dto.SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement;
import org.bian.dto.SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecord
 */
public class SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecord   {
  private String centralCashHandlingServiceConfigurationSettingReference = null;

  private String centralCashHandlingServiceConfigurationSettingDescription = null;

  private SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup = null;

  private SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription centralCashHandlingServiceSubscription = null;

  private SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement centralCashHandlingServiceAgreement = null;

  private String centralCashHandlingServiceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Refers to the service configuration parameter for the service 
   * @return centralCashHandlingServiceConfigurationSettingReference
  **/

  public String getCentralCashHandlingServiceConfigurationSettingReference() {
    return centralCashHandlingServiceConfigurationSettingReference;
  }

  public void setCentralCashHandlingServiceConfigurationSettingReference(String centralCashHandlingServiceConfigurationSettingReference) {
    this.centralCashHandlingServiceConfigurationSettingReference = centralCashHandlingServiceConfigurationSettingReference;
  }


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

  public SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup getCentralCashHandlingServiceConfigurationSetup() {
    return centralCashHandlingServiceConfigurationSetup;
  }

  public void setCentralCashHandlingServiceConfigurationSetup(SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup) {
    this.centralCashHandlingServiceConfigurationSetup = centralCashHandlingServiceConfigurationSetup;
  }


  /**
   * Get centralCashHandlingServiceSubscription
   * @return centralCashHandlingServiceSubscription
  **/

  public SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription getCentralCashHandlingServiceSubscription() {
    return centralCashHandlingServiceSubscription;
  }

  public void setCentralCashHandlingServiceSubscription(SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription centralCashHandlingServiceSubscription) {
    this.centralCashHandlingServiceSubscription = centralCashHandlingServiceSubscription;
  }


  /**
   * Get centralCashHandlingServiceAgreement
   * @return centralCashHandlingServiceAgreement
  **/

  public SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement getCentralCashHandlingServiceAgreement() {
    return centralCashHandlingServiceAgreement;
  }

  public void setCentralCashHandlingServiceAgreement(SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement centralCashHandlingServiceAgreement) {
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

