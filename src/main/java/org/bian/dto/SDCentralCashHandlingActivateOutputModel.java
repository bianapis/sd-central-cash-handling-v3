package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingActivateOutputModel
 */
public class SDCentralCashHandlingActivateOutputModel   {
  private String centralCashHandlingActivationActionTaskReference = null;

  private Object centralCashHandlingActivationActionTaskRecord = null;

  private String centralCashHandlingServicingSessionReference = null;

  private Object centralCashHandlingServicingSessionRecord = null;

  private SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord = null;

  private String centralCashHandlingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service activation service call 
   * @return centralCashHandlingActivationActionTaskReference
  **/

  public String getCentralCashHandlingActivationActionTaskReference() {
    return centralCashHandlingActivationActionTaskReference;
  }

  public void setCentralCashHandlingActivationActionTaskReference(String centralCashHandlingActivationActionTaskReference) {
    this.centralCashHandlingActivationActionTaskReference = centralCashHandlingActivationActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return centralCashHandlingServicingSessionReference
  **/

  public String getCentralCashHandlingServicingSessionReference() {
    return centralCashHandlingServicingSessionReference;
  }

  public void setCentralCashHandlingServicingSessionReference(String centralCashHandlingServicingSessionReference) {
    this.centralCashHandlingServicingSessionReference = centralCashHandlingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Consolidated information record for the servicing session 
   * @return centralCashHandlingServicingSessionRecord
  **/

  public Object getCentralCashHandlingServicingSessionRecord() {
    return centralCashHandlingServicingSessionRecord;
  }

  public void setCentralCashHandlingServicingSessionRecord(Object centralCashHandlingServicingSessionRecord) {
    this.centralCashHandlingServicingSessionRecord = centralCashHandlingServicingSessionRecord;
  }


  /**
   * Get centralCashHandlingServiceConfigurationRecord
   * @return centralCashHandlingServiceConfigurationRecord
  **/

  public SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecord getCentralCashHandlingServiceConfigurationRecord() {
    return centralCashHandlingServiceConfigurationRecord;
  }

  public void setCentralCashHandlingServiceConfigurationRecord(SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord) {
    this.centralCashHandlingServiceConfigurationRecord = centralCashHandlingServiceConfigurationRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The current operating status of the overall servicing session 
   * @return centralCashHandlingServicingSessionStatus
  **/

  public String getCentralCashHandlingServicingSessionStatus() {
    return centralCashHandlingServicingSessionStatus;
  }

  public void setCentralCashHandlingServicingSessionStatus(String centralCashHandlingServicingSessionStatus) {
    this.centralCashHandlingServicingSessionStatus = centralCashHandlingServicingSessionStatus;
  }


}

