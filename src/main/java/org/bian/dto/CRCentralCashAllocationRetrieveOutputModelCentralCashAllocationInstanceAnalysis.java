package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationRetrieveOutputModelCentralCashAllocationInstanceAnalysis
 */
public class CRCentralCashAllocationRetrieveOutputModelCentralCashAllocationInstanceAnalysis   {
  private String centralCashAllocationInstanceAnalysisData = null;

  private String centralCashAllocationInstanceAnalysisReportType = null;

  private Object centralCashAllocationInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return centralCashAllocationInstanceAnalysisData
  **/

  public String getCentralCashAllocationInstanceAnalysisData() {
    return centralCashAllocationInstanceAnalysisData;
  }

  public void setCentralCashAllocationInstanceAnalysisData(String centralCashAllocationInstanceAnalysisData) {
    this.centralCashAllocationInstanceAnalysisData = centralCashAllocationInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return centralCashAllocationInstanceAnalysisReportType
  **/

  public String getCentralCashAllocationInstanceAnalysisReportType() {
    return centralCashAllocationInstanceAnalysisReportType;
  }

  public void setCentralCashAllocationInstanceAnalysisReportType(String centralCashAllocationInstanceAnalysisReportType) {
    this.centralCashAllocationInstanceAnalysisReportType = centralCashAllocationInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return centralCashAllocationInstanceAnalysisReport
  **/

  public Object getCentralCashAllocationInstanceAnalysisReport() {
    return centralCashAllocationInstanceAnalysisReport;
  }

  public void setCentralCashAllocationInstanceAnalysisReport(Object centralCashAllocationInstanceAnalysisReport) {
    this.centralCashAllocationInstanceAnalysisReport = centralCashAllocationInstanceAnalysisReport;
  }


}

