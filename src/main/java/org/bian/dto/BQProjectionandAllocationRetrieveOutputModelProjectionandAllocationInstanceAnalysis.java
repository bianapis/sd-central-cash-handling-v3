package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceAnalysis
 */
public class BQProjectionandAllocationRetrieveOutputModelProjectionandAllocationInstanceAnalysis   {
  private Object projectionandAllocationInstanceAnalysisRecord = null;

  private String projectionandAllocationInstanceAnalysisReportType = null;

  private String projectionandAllocationInstanceAnalysisParameters = null;

  private Object projectionandAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return projectionandAllocationInstanceAnalysisRecord
  **/

  public Object getProjectionandAllocationInstanceAnalysisRecord() {
    return projectionandAllocationInstanceAnalysisRecord;
  }

  public void setProjectionandAllocationInstanceAnalysisRecord(Object projectionandAllocationInstanceAnalysisRecord) {
    this.projectionandAllocationInstanceAnalysisRecord = projectionandAllocationInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return projectionandAllocationInstanceAnalysisReportType
  **/

  public String getProjectionandAllocationInstanceAnalysisReportType() {
    return projectionandAllocationInstanceAnalysisReportType;
  }

  public void setProjectionandAllocationInstanceAnalysisReportType(String projectionandAllocationInstanceAnalysisReportType) {
    this.projectionandAllocationInstanceAnalysisReportType = projectionandAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return projectionandAllocationInstanceAnalysisParameters
  **/

  public String getProjectionandAllocationInstanceAnalysisParameters() {
    return projectionandAllocationInstanceAnalysisParameters;
  }

  public void setProjectionandAllocationInstanceAnalysisParameters(String projectionandAllocationInstanceAnalysisParameters) {
    this.projectionandAllocationInstanceAnalysisParameters = projectionandAllocationInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return projectionandAllocationInstanceAnalysisReport
  **/

  public Object getProjectionandAllocationInstanceAnalysisReport() {
    return projectionandAllocationInstanceAnalysisReport;
  }

  public void setProjectionandAllocationInstanceAnalysisReport(Object projectionandAllocationInstanceAnalysisReport) {
    this.projectionandAllocationInstanceAnalysisReport = projectionandAllocationInstanceAnalysisReport;
  }


}

