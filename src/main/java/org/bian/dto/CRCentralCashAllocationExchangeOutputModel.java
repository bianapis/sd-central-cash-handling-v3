package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationExchangeOutputModel
 */
public class CRCentralCashAllocationExchangeOutputModel   {
  private String centralCashAllocationParameterType = null;

  private String centralCashAllocationSelectedOption = null;

  private String centralCashAllocationRequest = null;

  private String centralCashAllocationSchedule = null;

  private String centralCashAllocationStatus = null;

  private String centralCashAllocationCustomerReference = null;

  private String centralCashAllocationExchangeActionTaskReference = null;

  private Object centralCashAllocationExchangeActionTaskRecord = null;

  private String centralCashAllocationExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between allocation Options according to the optional business services defined within Central Cash Allocation 
   * @return centralCashAllocationParameterType
  **/

  public String getCentralCashAllocationParameterType() {
    return centralCashAllocationParameterType;
  }

  public void setCentralCashAllocationParameterType(String centralCashAllocationParameterType) {
    this.centralCashAllocationParameterType = centralCashAllocationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service for which resources are allocated 
   * @return centralCashAllocationSelectedOption
  **/

  public String getCentralCashAllocationSelectedOption() {
    return centralCashAllocationSelectedOption;
  }

  public void setCentralCashAllocationSelectedOption(String centralCashAllocationSelectedOption) {
    this.centralCashAllocationSelectedOption = centralCashAllocationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to allocate CentralCash 
   * @return centralCashAllocationRequest
  **/

  public String getCentralCashAllocationRequest() {
    return centralCashAllocationRequest;
  }

  public void setCentralCashAllocationRequest(String centralCashAllocationRequest) {
    this.centralCashAllocationRequest = centralCashAllocationRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to allocate CentralCash 
   * @return centralCashAllocationSchedule
  **/

  public String getCentralCashAllocationSchedule() {
    return centralCashAllocationSchedule;
  }

  public void setCentralCashAllocationSchedule(String centralCashAllocationSchedule) {
    this.centralCashAllocationSchedule = centralCashAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Central Cash Allocation 
   * @return centralCashAllocationStatus
  **/

  public String getCentralCashAllocationStatus() {
    return centralCashAllocationStatus;
  }

  public void setCentralCashAllocationStatus(String centralCashAllocationStatus) {
    this.centralCashAllocationStatus = centralCashAllocationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Central Cash Allocation 
   * @return centralCashAllocationCustomerReference
  **/

  public String getCentralCashAllocationCustomerReference() {
    return centralCashAllocationCustomerReference;
  }

  public void setCentralCashAllocationCustomerReference(String centralCashAllocationCustomerReference) {
    this.centralCashAllocationCustomerReference = centralCashAllocationCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Central Cash Allocation instance exchange service call 
   * @return centralCashAllocationExchangeActionTaskReference
  **/

  public String getCentralCashAllocationExchangeActionTaskReference() {
    return centralCashAllocationExchangeActionTaskReference;
  }

  public void setCentralCashAllocationExchangeActionTaskReference(String centralCashAllocationExchangeActionTaskReference) {
    this.centralCashAllocationExchangeActionTaskReference = centralCashAllocationExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return centralCashAllocationExchangeActionTaskRecord
  **/

  public Object getCentralCashAllocationExchangeActionTaskRecord() {
    return centralCashAllocationExchangeActionTaskRecord;
  }

  public void setCentralCashAllocationExchangeActionTaskRecord(Object centralCashAllocationExchangeActionTaskRecord) {
    this.centralCashAllocationExchangeActionTaskRecord = centralCashAllocationExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return centralCashAllocationExchangeActionResponse
  **/

  public String getCentralCashAllocationExchangeActionResponse() {
    return centralCashAllocationExchangeActionResponse;
  }

  public void setCentralCashAllocationExchangeActionResponse(String centralCashAllocationExchangeActionResponse) {
    this.centralCashAllocationExchangeActionResponse = centralCashAllocationExchangeActionResponse;
  }


}

