package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecord
 */
public class SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecord   {
  private String centralCashHandlingServiceConfigurationSettingReference = null;

  private String centralCashHandlingServiceConfigurationSettingType = null;

  private SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup = null;


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

  public SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup getCentralCashHandlingServiceConfigurationSetup() {
    return centralCashHandlingServiceConfigurationSetup;
  }

  public void setCentralCashHandlingServiceConfigurationSetup(SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup centralCashHandlingServiceConfigurationSetup) {
    this.centralCashHandlingServiceConfigurationSetup = centralCashHandlingServiceConfigurationSetup;
  }


}

