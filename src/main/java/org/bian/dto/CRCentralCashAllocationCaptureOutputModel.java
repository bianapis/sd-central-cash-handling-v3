package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationCaptureOutputModel
 */
public class CRCentralCashAllocationCaptureOutputModel   {
  private String centralCashAllocationParameterType = null;

  private String centralCashAllocationSelectedOption = null;

  private String centralCashAllocationRequest = null;

  private String centralCashAllocationSchedule = null;

  private String centralCashAllocationStatus = null;

  private String centralCashAllocationCustomerReference = null;

  private String centralCashAllocationCaptureActionTaskReference = null;

  private Object centralCashAllocationCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Central Cash Allocation instance capture service call 
   * @return centralCashAllocationCaptureActionTaskReference
  **/

  public String getCentralCashAllocationCaptureActionTaskReference() {
    return centralCashAllocationCaptureActionTaskReference;
  }

  public void setCentralCashAllocationCaptureActionTaskReference(String centralCashAllocationCaptureActionTaskReference) {
    this.centralCashAllocationCaptureActionTaskReference = centralCashAllocationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return centralCashAllocationCaptureActionTaskRecord
  **/

  public Object getCentralCashAllocationCaptureActionTaskRecord() {
    return centralCashAllocationCaptureActionTaskRecord;
  }

  public void setCentralCashAllocationCaptureActionTaskRecord(Object centralCashAllocationCaptureActionTaskRecord) {
    this.centralCashAllocationCaptureActionTaskRecord = centralCashAllocationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

