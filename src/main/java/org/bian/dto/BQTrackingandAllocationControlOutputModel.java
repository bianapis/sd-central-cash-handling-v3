package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationControlOutputModel
 */
public class BQTrackingandAllocationControlOutputModel   {
  private String trackingandAllocationPreconditions = null;

  private String trackingandAllocationAllocationSchedule = null;

  private String cashInventoryAllocation = null;

  private String cashInventoryAllocationServiceType = null;

  private String cashInventoryAllocationServiceDescription = null;

  private String cashInventoryAllocationServiceInputsandOuputs = null;

  private String cashInventoryAllocationServiceWorkProduct = null;

  private String cashInventoryAllocationServiceName = null;

  private String trackingandAllocationControlActionTaskReference = null;

  private Object trackingandAllocationControlActionTaskRecord = null;

  private String trackingandAllocationControlActionResponse = null;

  private String trackingandAllocationInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the allocation can be made 
   * @return trackingandAllocationPreconditions
  **/

  public String getTrackingandAllocationPreconditions() {
    return trackingandAllocationPreconditions;
  }

  public void setTrackingandAllocationPreconditions(String trackingandAllocationPreconditions) {
    this.trackingandAllocationPreconditions = trackingandAllocationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of allocation decisions 
   * @return trackingandAllocationAllocationSchedule
  **/

  public String getTrackingandAllocationAllocationSchedule() {
    return trackingandAllocationAllocationSchedule;
  }

  public void setTrackingandAllocationAllocationSchedule(String trackingandAllocationAllocationSchedule) {
    this.trackingandAllocationAllocationSchedule = trackingandAllocationAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Central Cash Allocation specific Business Service 
   * @return cashInventoryAllocation
  **/

  public String getCashInventoryAllocation() {
    return cashInventoryAllocation;
  }

  public void setCashInventoryAllocation(String cashInventoryAllocation) {
    this.cashInventoryAllocation = cashInventoryAllocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return cashInventoryAllocationServiceType
  **/

  public String getCashInventoryAllocationServiceType() {
    return cashInventoryAllocationServiceType;
  }

  public void setCashInventoryAllocationServiceType(String cashInventoryAllocationServiceType) {
    this.cashInventoryAllocationServiceType = cashInventoryAllocationServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return cashInventoryAllocationServiceDescription
  **/

  public String getCashInventoryAllocationServiceDescription() {
    return cashInventoryAllocationServiceDescription;
  }

  public void setCashInventoryAllocationServiceDescription(String cashInventoryAllocationServiceDescription) {
    this.cashInventoryAllocationServiceDescription = cashInventoryAllocationServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return cashInventoryAllocationServiceInputsandOuputs
  **/

  public String getCashInventoryAllocationServiceInputsandOuputs() {
    return cashInventoryAllocationServiceInputsandOuputs;
  }

  public void setCashInventoryAllocationServiceInputsandOuputs(String cashInventoryAllocationServiceInputsandOuputs) {
    this.cashInventoryAllocationServiceInputsandOuputs = cashInventoryAllocationServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return cashInventoryAllocationServiceWorkProduct
  **/

  public String getCashInventoryAllocationServiceWorkProduct() {
    return cashInventoryAllocationServiceWorkProduct;
  }

  public void setCashInventoryAllocationServiceWorkProduct(String cashInventoryAllocationServiceWorkProduct) {
    this.cashInventoryAllocationServiceWorkProduct = cashInventoryAllocationServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info:  
   * @return cashInventoryAllocationServiceName
  **/

  public String getCashInventoryAllocationServiceName() {
    return cashInventoryAllocationServiceName;
  }

  public void setCashInventoryAllocationServiceName(String cashInventoryAllocationServiceName) {
    this.cashInventoryAllocationServiceName = cashInventoryAllocationServiceName;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tracking and Allocation instance control processing service call 
   * @return trackingandAllocationControlActionTaskReference
  **/

  public String getTrackingandAllocationControlActionTaskReference() {
    return trackingandAllocationControlActionTaskReference;
  }

  public void setTrackingandAllocationControlActionTaskReference(String trackingandAllocationControlActionTaskReference) {
    this.trackingandAllocationControlActionTaskReference = trackingandAllocationControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return trackingandAllocationControlActionTaskRecord
  **/

  public Object getTrackingandAllocationControlActionTaskRecord() {
    return trackingandAllocationControlActionTaskRecord;
  }

  public void setTrackingandAllocationControlActionTaskRecord(Object trackingandAllocationControlActionTaskRecord) {
    this.trackingandAllocationControlActionTaskRecord = trackingandAllocationControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return trackingandAllocationControlActionResponse
  **/

  public String getTrackingandAllocationControlActionResponse() {
    return trackingandAllocationControlActionResponse;
  }

  public void setTrackingandAllocationControlActionResponse(String trackingandAllocationControlActionResponse) {
    this.trackingandAllocationControlActionResponse = trackingandAllocationControlActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Tracking and Allocation instance (e.g. initialised, pending, active) 
   * @return trackingandAllocationInstanceStatus
  **/

  public String getTrackingandAllocationInstanceStatus() {
    return trackingandAllocationInstanceStatus;
  }

  public void setTrackingandAllocationInstanceStatus(String trackingandAllocationInstanceStatus) {
    this.trackingandAllocationInstanceStatus = trackingandAllocationInstanceStatus;
  }


}

