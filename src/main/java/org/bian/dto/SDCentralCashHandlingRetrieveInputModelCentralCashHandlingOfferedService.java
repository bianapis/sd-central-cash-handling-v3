package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedService
 */
public class SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedService   {
  private String centralCashHandlingServiceReference = null;

  private SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecord centralCashHandlingServiceRecord = null;


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
   * Get centralCashHandlingServiceRecord
   * @return centralCashHandlingServiceRecord
  **/

  public SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecord getCentralCashHandlingServiceRecord() {
    return centralCashHandlingServiceRecord;
  }

  public void setCentralCashHandlingServiceRecord(SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedServiceCentralCashHandlingServiceRecord centralCashHandlingServiceRecord) {
    this.centralCashHandlingServiceRecord = centralCashHandlingServiceRecord;
  }


}

