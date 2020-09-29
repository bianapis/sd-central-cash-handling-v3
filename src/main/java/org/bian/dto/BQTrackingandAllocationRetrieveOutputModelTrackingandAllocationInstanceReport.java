package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceReport
 */
public class BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceReport   {
  private Object trackingandAllocationInstanceReportRecord = null;

  private String trackingandAllocationInstanceReportType = null;

  private String trackingandAllocationInstanceReportParameters = null;

  private Object trackingandAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return trackingandAllocationInstanceReportRecord
  **/

  public Object getTrackingandAllocationInstanceReportRecord() {
    return trackingandAllocationInstanceReportRecord;
  }

  public void setTrackingandAllocationInstanceReportRecord(Object trackingandAllocationInstanceReportRecord) {
    this.trackingandAllocationInstanceReportRecord = trackingandAllocationInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return trackingandAllocationInstanceReportType
  **/

  public String getTrackingandAllocationInstanceReportType() {
    return trackingandAllocationInstanceReportType;
  }

  public void setTrackingandAllocationInstanceReportType(String trackingandAllocationInstanceReportType) {
    this.trackingandAllocationInstanceReportType = trackingandAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return trackingandAllocationInstanceReportParameters
  **/

  public String getTrackingandAllocationInstanceReportParameters() {
    return trackingandAllocationInstanceReportParameters;
  }

  public void setTrackingandAllocationInstanceReportParameters(String trackingandAllocationInstanceReportParameters) {
    this.trackingandAllocationInstanceReportParameters = trackingandAllocationInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return trackingandAllocationInstanceReport
  **/

  public Object getTrackingandAllocationInstanceReport() {
    return trackingandAllocationInstanceReport;
  }

  public void setTrackingandAllocationInstanceReport(Object trackingandAllocationInstanceReport) {
    this.trackingandAllocationInstanceReport = trackingandAllocationInstanceReport;
  }


}

