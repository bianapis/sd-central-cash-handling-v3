package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceAnalysis
 */
public class BQTrackingandAllocationRetrieveOutputModelTrackingandAllocationInstanceAnalysis   {
  private Object trackingandAllocationInstanceAnalysisRecord = null;

  private String trackingandAllocationInstanceAnalysisReportType = null;

  private String trackingandAllocationInstanceAnalysisParameters = null;

  private Object trackingandAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return trackingandAllocationInstanceAnalysisRecord
  **/

  public Object getTrackingandAllocationInstanceAnalysisRecord() {
    return trackingandAllocationInstanceAnalysisRecord;
  }

  public void setTrackingandAllocationInstanceAnalysisRecord(Object trackingandAllocationInstanceAnalysisRecord) {
    this.trackingandAllocationInstanceAnalysisRecord = trackingandAllocationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return trackingandAllocationInstanceAnalysisReportType
  **/

  public String getTrackingandAllocationInstanceAnalysisReportType() {
    return trackingandAllocationInstanceAnalysisReportType;
  }

  public void setTrackingandAllocationInstanceAnalysisReportType(String trackingandAllocationInstanceAnalysisReportType) {
    this.trackingandAllocationInstanceAnalysisReportType = trackingandAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return trackingandAllocationInstanceAnalysisParameters
  **/

  public String getTrackingandAllocationInstanceAnalysisParameters() {
    return trackingandAllocationInstanceAnalysisParameters;
  }

  public void setTrackingandAllocationInstanceAnalysisParameters(String trackingandAllocationInstanceAnalysisParameters) {
    this.trackingandAllocationInstanceAnalysisParameters = trackingandAllocationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return trackingandAllocationInstanceAnalysisReport
  **/

  public Object getTrackingandAllocationInstanceAnalysisReport() {
    return trackingandAllocationInstanceAnalysisReport;
  }

  public void setTrackingandAllocationInstanceAnalysisReport(Object trackingandAllocationInstanceAnalysisReport) {
    this.trackingandAllocationInstanceAnalysisReport = trackingandAllocationInstanceAnalysisReport;
  }


}

