package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup
 */
public class SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceConfigurationSetup   {
  private String centralCashHandlingServiceConfigurationParameter = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The default activation setting for the offered service configuration parameter  
   * @return centralCashHandlingServiceConfigurationParameter
  **/

  public String getCentralCashHandlingServiceConfigurationParameter() {
    return centralCashHandlingServiceConfigurationParameter;
  }

  public void setCentralCashHandlingServiceConfigurationParameter(String centralCashHandlingServiceConfigurationParameter) {
    this.centralCashHandlingServiceConfigurationParameter = centralCashHandlingServiceConfigurationParameter;
  }


}

