package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceAnalysis;
import org.bian.dto.BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQProjectionandAllocationRetrieveInputModel
 */
public class BQProjectionandAllocationRetrieveInputModel   {
  private Object projectionandAllocationRetrieveActionTaskRecord = null;

  private String projectionandAllocationRetrieveActionRequest = null;

  private BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceReport projectionandAllocationInstanceReport = null;

  private BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceAnalysis projectionandAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return projectionandAllocationRetrieveActionRequest
  **/

  public String getProjectionandAllocationRetrieveActionRequest() {
    return projectionandAllocationRetrieveActionRequest;
  }

  public void setProjectionandAllocationRetrieveActionRequest(String projectionandAllocationRetrieveActionRequest) {
    this.projectionandAllocationRetrieveActionRequest = projectionandAllocationRetrieveActionRequest;
  }


  /**
   * Get projectionandAllocationInstanceReport
   * @return projectionandAllocationInstanceReport
  **/

  public BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceReport getProjectionandAllocationInstanceReport() {
    return projectionandAllocationInstanceReport;
  }

  public void setProjectionandAllocationInstanceReport(BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceReport projectionandAllocationInstanceReport) {
    this.projectionandAllocationInstanceReport = projectionandAllocationInstanceReport;
  }


  /**
   * Get projectionandAllocationInstanceAnalysis
   * @return projectionandAllocationInstanceAnalysis
  **/

  public BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceAnalysis getProjectionandAllocationInstanceAnalysis() {
    return projectionandAllocationInstanceAnalysis;
  }

  public void setProjectionandAllocationInstanceAnalysis(BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceAnalysis projectionandAllocationInstanceAnalysis) {
    this.projectionandAllocationInstanceAnalysis = projectionandAllocationInstanceAnalysis;
  }


}

