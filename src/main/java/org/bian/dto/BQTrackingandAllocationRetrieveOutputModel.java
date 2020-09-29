package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceAnalysis;
import org.bian.dto.BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationRetrieveOutputModel
 */
public class BQTrackingandAllocationRetrieveOutputModel   {
  private String trackingandAllocationPreconditions = null;

  private String trackingandAllocationAllocationSchedule = null;

  private String cashInventoryAllocation = null;

  private String cashInventoryAllocationServiceType = null;

  private String cashInventoryAllocationServiceDescription = null;

  private String cashInventoryAllocationServiceInputsandOuputs = null;

  private String cashInventoryAllocationServiceWorkProduct = null;

  private String cashInventoryAllocationServiceName = null;

  private String trackingandAllocationRetrieveActionTaskReference = null;

  private Object trackingandAllocationRetrieveActionTaskRecord = null;

  private String trackingandAllocationRetrieveActionResponse = null;

  private BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceReport trackingandAllocationInstanceReport = null;

  private BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceAnalysis trackingandAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Tracking and Allocation instance retrieve service call 
   * @return trackingandAllocationRetrieveActionTaskReference
  **/

  public String getTrackingandAllocationRetrieveActionTaskReference() {
    return trackingandAllocationRetrieveActionTaskReference;
  }

  public void setTrackingandAllocationRetrieveActionTaskReference(String trackingandAllocationRetrieveActionTaskReference) {
    this.trackingandAllocationRetrieveActionTaskReference = trackingandAllocationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return trackingandAllocationRetrieveActionTaskRecord
  **/

  public Object getTrackingandAllocationRetrieveActionTaskRecord() {
    return trackingandAllocationRetrieveActionTaskRecord;
  }

  public void setTrackingandAllocationRetrieveActionTaskRecord(Object trackingandAllocationRetrieveActionTaskRecord) {
    this.trackingandAllocationRetrieveActionTaskRecord = trackingandAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return trackingandAllocationRetrieveActionResponse
  **/

  public String getTrackingandAllocationRetrieveActionResponse() {
    return trackingandAllocationRetrieveActionResponse;
  }

  public void setTrackingandAllocationRetrieveActionResponse(String trackingandAllocationRetrieveActionResponse) {
    this.trackingandAllocationRetrieveActionResponse = trackingandAllocationRetrieveActionResponse;
  }


  /**
   * Get trackingandAllocationInstanceReport
   * @return trackingandAllocationInstanceReport
  **/

  public BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceReport getTrackingandAllocationInstanceReport() {
    return trackingandAllocationInstanceReport;
  }

  public void setTrackingandAllocationInstanceReport(BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceReport trackingandAllocationInstanceReport) {
    this.trackingandAllocationInstanceReport = trackingandAllocationInstanceReport;
  }


  /**
   * Get trackingandAllocationInstanceAnalysis
   * @return trackingandAllocationInstanceAnalysis
  **/

  public BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceAnalysis getTrackingandAllocationInstanceAnalysis() {
    return trackingandAllocationInstanceAnalysis;
  }

  public void setTrackingandAllocationInstanceAnalysis(BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceAnalysis trackingandAllocationInstanceAnalysis) {
    this.trackingandAllocationInstanceAnalysis = trackingandAllocationInstanceAnalysis;
  }


}

