package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationControlOutputModel
 */
public class CRCentralCashAllocationControlOutputModel   {
  private String centralCashAllocationParameterType = null;

  private String centralCashAllocationSelectedOption = null;

  private String centralCashAllocationRequest = null;

  private String centralCashAllocationSchedule = null;

  private String centralCashAllocationStatus = null;

  private String centralCashAllocationCustomerReference = null;

  private String centralCashAllocationControlActionTaskReference = null;

  private Object centralCashAllocationControlActionTaskRecord = null;

  private String centralCashAllocationControlActionResponse = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Central Cash Allocation instance control processing service call 
   * @return centralCashAllocationControlActionTaskReference
  **/

  public String getCentralCashAllocationControlActionTaskReference() {
    return centralCashAllocationControlActionTaskReference;
  }

  public void setCentralCashAllocationControlActionTaskReference(String centralCashAllocationControlActionTaskReference) {
    this.centralCashAllocationControlActionTaskReference = centralCashAllocationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return centralCashAllocationControlActionTaskRecord
  **/

  public Object getCentralCashAllocationControlActionTaskRecord() {
    return centralCashAllocationControlActionTaskRecord;
  }

  public void setCentralCashAllocationControlActionTaskRecord(Object centralCashAllocationControlActionTaskRecord) {
    this.centralCashAllocationControlActionTaskRecord = centralCashAllocationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return centralCashAllocationControlActionResponse
  **/

  public String getCentralCashAllocationControlActionResponse() {
    return centralCashAllocationControlActionResponse;
  }

  public void setCentralCashAllocationControlActionResponse(String centralCashAllocationControlActionResponse) {
    this.centralCashAllocationControlActionResponse = centralCashAllocationControlActionResponse;
  }


}

