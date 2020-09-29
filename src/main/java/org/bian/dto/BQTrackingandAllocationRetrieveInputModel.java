package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceAnalysis;
import org.bian.dto.BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceReport;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationRetrieveInputModel
 */
public class BQTrackingandAllocationRetrieveInputModel   {
  private Object trackingandAllocationRetrieveActionTaskRecord = null;

  private String trackingandAllocationRetrieveActionRequest = null;

  private BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceReport trackingandAllocationInstanceReport = null;

  private BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceAnalysis trackingandAllocationInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return trackingandAllocationRetrieveActionRequest
  **/

  public String getTrackingandAllocationRetrieveActionRequest() {
    return trackingandAllocationRetrieveActionRequest;
  }

  public void setTrackingandAllocationRetrieveActionRequest(String trackingandAllocationRetrieveActionRequest) {
    this.trackingandAllocationRetrieveActionRequest = trackingandAllocationRetrieveActionRequest;
  }


  /**
   * Get trackingandAllocationInstanceReport
   * @return trackingandAllocationInstanceReport
  **/

  public BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceReport getTrackingandAllocationInstanceReport() {
    return trackingandAllocationInstanceReport;
  }

  public void setTrackingandAllocationInstanceReport(BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceReport trackingandAllocationInstanceReport) {
    this.trackingandAllocationInstanceReport = trackingandAllocationInstanceReport;
  }


  /**
   * Get trackingandAllocationInstanceAnalysis
   * @return trackingandAllocationInstanceAnalysis
  **/

  public BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceAnalysis getTrackingandAllocationInstanceAnalysis() {
    return trackingandAllocationInstanceAnalysis;
  }

  public void setTrackingandAllocationInstanceAnalysis(BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceAnalysis trackingandAllocationInstanceAnalysis) {
    this.trackingandAllocationInstanceAnalysis = trackingandAllocationInstanceAnalysis;
  }


}

