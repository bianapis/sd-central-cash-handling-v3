package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProjectionandAllocationCaptureOutputModel
 */
public class BQProjectionandAllocationCaptureOutputModel   {
  private String projectionandAllocationPreconditions = null;

  private String projectionandAllocationAllocationSchedule = null;

  private String cashInventoryProjection = null;

  private String cashInventoryProjectionServiceType = null;

  private String cashInventoryProjectionServiceDescription = null;

  private String cashInventoryProjectionServiceInputsandOuputs = null;

  private String cashInventoryProjectionServiceWorkProduct = null;

  private String projectionandAllocationCaptureActionTaskReference = null;

  private Object projectionandAllocationCaptureActionTaskRecord = null;

  private String projectionandAllocationCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The required status/situation before the allocation can be made 
   * @return projectionandAllocationPreconditions
  **/

  public String getProjectionandAllocationPreconditions() {
    return projectionandAllocationPreconditions;
  }

  public void setProjectionandAllocationPreconditions(String projectionandAllocationPreconditions) {
    this.projectionandAllocationPreconditions = projectionandAllocationPreconditions;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule and timing of allocation decisions 
   * @return projectionandAllocationAllocationSchedule
  **/

  public String getProjectionandAllocationAllocationSchedule() {
    return projectionandAllocationAllocationSchedule;
  }

  public void setProjectionandAllocationAllocationSchedule(String projectionandAllocationAllocationSchedule) {
    this.projectionandAllocationAllocationSchedule = projectionandAllocationAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Central Cash Allocation specific Business Service 
   * @return cashInventoryProjection
  **/

  public String getCashInventoryProjection() {
    return cashInventoryProjection;
  }

  public void setCashInventoryProjection(String cashInventoryProjection) {
    this.cashInventoryProjection = cashInventoryProjection;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the specific business service type 
   * @return cashInventoryProjectionServiceType
  **/

  public String getCashInventoryProjectionServiceType() {
    return cashInventoryProjectionServiceType;
  }

  public void setCashInventoryProjectionServiceType(String cashInventoryProjectionServiceType) {
    this.cashInventoryProjectionServiceType = cashInventoryProjectionServiceType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the performed business service 
   * @return cashInventoryProjectionServiceDescription
  **/

  public String getCashInventoryProjectionServiceDescription() {
    return cashInventoryProjectionServiceDescription;
  }

  public void setCashInventoryProjectionServiceDescription(String cashInventoryProjectionServiceDescription) {
    this.cashInventoryProjectionServiceDescription = cashInventoryProjectionServiceDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Mandatory and optional inputs and output information for the business service 
   * @return cashInventoryProjectionServiceInputsandOuputs
  **/

  public String getCashInventoryProjectionServiceInputsandOuputs() {
    return cashInventoryProjectionServiceInputsandOuputs;
  }

  public void setCashInventoryProjectionServiceInputsandOuputs(String cashInventoryProjectionServiceInputsandOuputs) {
    this.cashInventoryProjectionServiceInputsandOuputs = cashInventoryProjectionServiceInputsandOuputs;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service 
   * @return cashInventoryProjectionServiceWorkProduct
  **/

  public String getCashInventoryProjectionServiceWorkProduct() {
    return cashInventoryProjectionServiceWorkProduct;
  }

  public void setCashInventoryProjectionServiceWorkProduct(String cashInventoryProjectionServiceWorkProduct) {
    this.cashInventoryProjectionServiceWorkProduct = cashInventoryProjectionServiceWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Projection and Allocation instance capture service call 
   * @return projectionandAllocationCaptureActionTaskReference
  **/

  public String getProjectionandAllocationCaptureActionTaskReference() {
    return projectionandAllocationCaptureActionTaskReference;
  }

  public void setProjectionandAllocationCaptureActionTaskReference(String projectionandAllocationCaptureActionTaskReference) {
    this.projectionandAllocationCaptureActionTaskReference = projectionandAllocationCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return projectionandAllocationCaptureActionTaskRecord
  **/

  public Object getProjectionandAllocationCaptureActionTaskRecord() {
    return projectionandAllocationCaptureActionTaskRecord;
  }

  public void setProjectionandAllocationCaptureActionTaskRecord(Object projectionandAllocationCaptureActionTaskRecord) {
    this.projectionandAllocationCaptureActionTaskRecord = projectionandAllocationCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Projection and Allocation structured input transaction/record 
   * @return projectionandAllocationCaptureRecordReference
  **/

  public String getProjectionandAllocationCaptureRecordReference() {
    return projectionandAllocationCaptureRecordReference;
  }

  public void setProjectionandAllocationCaptureRecordReference(String projectionandAllocationCaptureRecordReference) {
    this.projectionandAllocationCaptureRecordReference = projectionandAllocationCaptureRecordReference;
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

