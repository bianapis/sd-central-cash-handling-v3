package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingConfigureInputModel
 */
public class SDCentralCashHandlingConfigureInputModel   {
  private Object centralCashHandlingConfigurationActionTaskRecord = null;

  private String centralCashHandlingServicingSessionReference = null;

  private String centralCashHandlingServiceReference = null;

  private SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord = null;


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

  public SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecord getCentralCashHandlingServiceConfigurationRecord() {
    return centralCashHandlingServiceConfigurationRecord;
  }

  public void setCentralCashHandlingServiceConfigurationRecord(SDCentralCashHandlingConfigureInputModelCentralCashHandlingServiceConfigurationRecord centralCashHandlingServiceConfigurationRecord) {
    this.centralCashHandlingServiceConfigurationRecord = centralCashHandlingServiceConfigurationRecord;
  }


}

