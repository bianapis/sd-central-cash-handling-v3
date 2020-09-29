package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingConfigureOutputModelCentralCashHandlingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingConfigureOutputModel
 */
public class SDCentralCashHandlingConfigureOutputModel   {
  private String centralCashHandlingConfigurationActionTaskReference = null;

  private Object centralCashHandlingConfigurationActionTaskRecord = null;

  private SDCentralCashHandlingConfigureOutputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord = null;

  private String centralCashHandlingServicingSessionStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a service configuration service call 
   * @return centralCashHandlingConfigurationActionTaskReference
  **/

  public String getCentralCashHandlingConfigurationActionTaskReference() {
    return centralCashHandlingConfigurationActionTaskReference;
  }

  public void setCentralCashHandlingConfigurationActionTaskReference(String centralCashHandlingConfigurationActionTaskReference) {
    this.centralCashHandlingConfigurationActionTaskReference = centralCashHandlingConfigurationActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The configuration service call consolidated processing record 
   * @return centralCashHandlingConfigurationActionTaskRecord
  **/

  public Object getCentralCashHandlingConfigurationActionTaskRecord() {
    return centralCashHandlingConfigurationActionTaskRecord;
  }

  public void setCentralCashHandlingConfigurationActionTaskRecord(Object centralCashHandlingConfigurationActionTaskRecord) {
    this.centralCashHandlingConfigurationActionTaskRecord = centralCashHandlingConfigurationActionTaskRecord;
  }


  /**
   * Get centralCashHandlingServiceConfigurationRecord
   * @return centralCashHandlingServiceConfigurationRecord
  **/

  public SDCentralCashHandlingConfigureOutputModelCentralCashHandlingServiceConfigurationRecord getCentralCashHandlingServiceConfigurationRecord() {
    return centralCashHandlingServiceConfigurationRecord;
  }

  public void setCentralCashHandlingServiceConfigurationRecord(SDCentralCashHandlingConfigureOutputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord) {
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

