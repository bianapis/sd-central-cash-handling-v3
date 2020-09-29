package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedService;
import org.bian.dto.SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveInputModel
 */
public class SDCentralCashHandlingRetrieveInputModel   {
  private Object centralCashHandlingRetrieveActionTaskRecord = null;

  private String centralCashHandlingRetrieveActionRequest = null;

  private SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecord centralCashHandlingRetrieveActionRecord = null;

  private SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedService centralCashHandlingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return centralCashHandlingRetrieveActionTaskRecord
  **/

  public Object getCentralCashHandlingRetrieveActionTaskRecord() {
    return centralCashHandlingRetrieveActionTaskRecord;
  }

  public void setCentralCashHandlingRetrieveActionTaskRecord(Object centralCashHandlingRetrieveActionTaskRecord) {
    this.centralCashHandlingRetrieveActionTaskRecord = centralCashHandlingRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return centralCashHandlingRetrieveActionRequest
  **/

  public String getCentralCashHandlingRetrieveActionRequest() {
    return centralCashHandlingRetrieveActionRequest;
  }

  public void setCentralCashHandlingRetrieveActionRequest(String centralCashHandlingRetrieveActionRequest) {
    this.centralCashHandlingRetrieveActionRequest = centralCashHandlingRetrieveActionRequest;
  }


  /**
   * Get centralCashHandlingRetrieveActionRecord
   * @return centralCashHandlingRetrieveActionRecord
  **/

  public SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecord getCentralCashHandlingRetrieveActionRecord() {
    return centralCashHandlingRetrieveActionRecord;
  }

  public void setCentralCashHandlingRetrieveActionRecord(SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecord centralCashHandlingRetrieveActionRecord) {
    this.centralCashHandlingRetrieveActionRecord = centralCashHandlingRetrieveActionRecord;
  }


  /**
   * Get centralCashHandlingOfferedService
   * @return centralCashHandlingOfferedService
  **/

  public SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedService getCentralCashHandlingOfferedService() {
    return centralCashHandlingOfferedService;
  }

  public void setCentralCashHandlingOfferedService(SDCentralCashHandlingRetrieveInputModelCentralCashHandlingOfferedService centralCashHandlingOfferedService) {
    this.centralCashHandlingOfferedService = centralCashHandlingOfferedService;
  }


}

