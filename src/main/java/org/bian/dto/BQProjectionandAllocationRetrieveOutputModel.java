package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceAnalysis;
import org.bian.dto.BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProjectionandAllocationRetrieveOutputModel
 */
public class BQProjectionandAllocationRetrieveOutputModel   {
  private String projectionandAllocationPreconditions = null;

  private String projectionandAllocationAllocationSchedule = null;

  private String cashInventoryProjection = null;

  private String cashInventoryProjectionServiceType = null;

  private String cashInventoryProjectionServiceDescription = null;

  private String cashInventoryProjectionServiceInputsandOuputs = null;

  private String cashInventoryProjectionServiceWorkProduct = null;

  private String projectionandAllocationRetrieveActionTaskReference = null;

  private Object projectionandAllocationRetrieveActionTaskRecord = null;

  private String projectionandAllocationRetrieveActionResponse = null;

  private BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceReport projectionandAllocationInstanceReport = null;

  private BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceAnalysis projectionandAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Projection and Allocation instance retrieve service call 
   * @return projectionandAllocationRetrieveActionTaskReference
  **/

  public String getProjectionandAllocationRetrieveActionTaskReference() {
    return projectionandAllocationRetrieveActionTaskReference;
  }

  public void setProjectionandAllocationRetrieveActionTaskReference(String projectionandAllocationRetrieveActionTaskReference) {
    this.projectionandAllocationRetrieveActionTaskReference = projectionandAllocationRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return projectionandAllocationRetrieveActionTaskRecord
  **/

  public Object getProjectionandAllocationRetrieveActionTaskRecord() {
    return projectionandAllocationRetrieveActionTaskRecord;
  }

  public void setProjectionandAllocationRetrieveActionTaskRecord(Object projectionandAllocationRetrieveActionTaskRecord) {
    this.projectionandAllocationRetrieveActionTaskRecord = projectionandAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return projectionandAllocationRetrieveActionResponse
  **/

  public String getProjectionandAllocationRetrieveActionResponse() {
    return projectionandAllocationRetrieveActionResponse;
  }

  public void setProjectionandAllocationRetrieveActionResponse(String projectionandAllocationRetrieveActionResponse) {
    this.projectionandAllocationRetrieveActionResponse = projectionandAllocationRetrieveActionResponse;
  }


  /**
   * Get projectionandAllocationInstanceReport
   * @return projectionandAllocationInstanceReport
  **/

  public BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceReport getProjectionandAllocationInstanceReport() {
    return projectionandAllocationInstanceReport;
  }

  public void setProjectionandAllocationInstanceReport(BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceReport projectionandAllocationInstanceReport) {
    this.projectionandAllocationInstanceReport = projectionandAllocationInstanceReport;
  }


  /**
   * Get projectionandAllocationInstanceAnalysis
   * @return projectionandAllocationInstanceAnalysis
  **/

  public BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceAnalysis getProjectionandAllocationInstanceAnalysis() {
    return projectionandAllocationInstanceAnalysis;
  }

  public void setProjectionandAllocationInstanceAnalysis(BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceAnalysis projectionandAllocationInstanceAnalysis) {
    this.projectionandAllocationInstanceAnalysis = projectionandAllocationInstanceAnalysis;
  }


}

