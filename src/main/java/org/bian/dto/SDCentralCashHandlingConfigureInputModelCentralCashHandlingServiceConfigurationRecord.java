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
 * SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecord
 */
public class SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecord   {
  private String centralCashHandlingServiceConfigurationSettingReference = null;

  private String centralCashHandlingServiceConfigurationSettingType = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceSubscription centralCashHandlingServiceSubscription = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement centralCashHandlingServiceAgreement = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of service configuration parameter 
   * @return centralCashHandlingServiceConfigurationSettingType
  **/

  public String getCentralCashHandlingServiceConfigurationSettingType() {
    return centralCashHandlingServiceConfigurationSettingType;
  }

  public void setCentralCashHandlingServiceConfigurationSettingType(String centralCashHandlingServiceConfigurationSettingType) {
    this.centralCashHandlingServiceConfigurationSettingType = centralCashHandlingServiceConfigurationSettingType;
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


}

