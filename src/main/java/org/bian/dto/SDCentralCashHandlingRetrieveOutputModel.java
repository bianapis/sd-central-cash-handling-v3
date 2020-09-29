package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedService;
import org.bian.dto.SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveOutputModel
 */
public class SDCentralCashHandlingRetrieveOutputModel   {
  private String centralCashHandlingRetrieveActionTaskReference = null;

  private Object centralCashHandlingRetrieveActionTaskRecord = null;

  private String centralCashHandlingRetrieveActionResponse = null;

  private SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecord centralCashHandlingRetrieveActionRecord = null;

  private SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedService centralCashHandlingOfferedService = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a retrieve service call 
   * @return centralCashHandlingRetrieveActionTaskReference
  **/

  public String getCentralCashHandlingRetrieveActionTaskReference() {
    return centralCashHandlingRetrieveActionTaskReference;
  }

  public void setCentralCashHandlingRetrieveActionTaskReference(String centralCashHandlingRetrieveActionTaskReference) {
    this.centralCashHandlingRetrieveActionTaskReference = centralCashHandlingRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return centralCashHandlingRetrieveActionResponse
  **/

  public String getCentralCashHandlingRetrieveActionResponse() {
    return centralCashHandlingRetrieveActionResponse;
  }

  public void setCentralCashHandlingRetrieveActionResponse(String centralCashHandlingRetrieveActionResponse) {
    this.centralCashHandlingRetrieveActionResponse = centralCashHandlingRetrieveActionResponse;
  }


  /**
   * Get centralCashHandlingRetrieveActionRecord
   * @return centralCashHandlingRetrieveActionRecord
  **/

  public SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecord getCentralCashHandlingRetrieveActionRecord() {
    return centralCashHandlingRetrieveActionRecord;
  }

  public void setCentralCashHandlingRetrieveActionRecord(SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecord centralCashHandlingRetrieveActionRecord) {
    this.centralCashHandlingRetrieveActionRecord = centralCashHandlingRetrieveActionRecord;
  }


  /**
   * Get centralCashHandlingOfferedService
   * @return centralCashHandlingOfferedService
  **/

  public SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedService getCentralCashHandlingOfferedService() {
    return centralCashHandlingOfferedService;
  }

  public void setCentralCashHandlingOfferedService(SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingOfferedService centralCashHandlingOfferedService) {
    this.centralCashHandlingOfferedService = centralCashHandlingOfferedService;
  }


}

