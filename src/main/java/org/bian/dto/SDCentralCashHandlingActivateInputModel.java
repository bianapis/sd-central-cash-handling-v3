package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingActivateInputModel
 */
public class SDCentralCashHandlingActivateInputModel   {
  private Object centralCashHandlingActivationActionTaskRecord = null;

  private String centralCashHandlingCenterReference = null;

  private String centralCashHandlingServiceReference = null;

  private SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The activation service call consolidated processing record 
   * @return centralCashHandlingActivationActionTaskRecord
  **/

  public Object getCentralCashHandlingActivationActionTaskRecord() {
    return centralCashHandlingActivationActionTaskRecord;
  }

  public void setCentralCashHandlingActivationActionTaskRecord(Object centralCashHandlingActivationActionTaskRecord) {
    this.centralCashHandlingActivationActionTaskRecord = centralCashHandlingActivationActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service center/operational unit 
   * @return centralCashHandlingCenterReference
  **/

  public String getCentralCashHandlingCenterReference() {
    return centralCashHandlingCenterReference;
  }

  public void setCentralCashHandlingCenterReference(String centralCashHandlingCenterReference) {
    this.centralCashHandlingCenterReference = centralCashHandlingCenterReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service offered by the service center 
   * @return centralCashHandlingServiceReference
  **/

  public String getCentralCashHandlingServiceReference() {
    return centralCashHandlingServiceReference;
  }

  public void setCentralCashHandlingServiceReference(String centralCashHandlingServiceReference) {
    this.centralCashHandlingServiceReference = centralCashHandlingServiceReference;
  }


  /**
   * Get centralCashHandlingServiceConfigurationRecord
   * @return centralCashHandlingServiceConfigurationRecord
  **/

  public SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecord getCentralCashHandlingServiceConfigurationRecord() {
    return centralCashHandlingServiceConfigurationRecord;
  }

  public void setCentralCashHandlingServiceConfigurationRecord(SDCentralCashHandlingActivateInputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord) {
    this.centralCashHandlingServiceConfigurationRecord = centralCashHandlingServiceConfigurationRecord;
  }


}

