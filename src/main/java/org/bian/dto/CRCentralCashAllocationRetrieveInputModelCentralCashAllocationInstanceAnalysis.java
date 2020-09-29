package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceAnalysis
 */
public class CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceAnalysis   {
  private String centralCashAllocationInstanceAnalysisReference = null;

  private String centralCashAllocationInstanceAnalysisReportType = null;

  private String centralCashAllocationInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return centralCashAllocationInstanceAnalysisReference
  **/

  public String getCentralCashAllocationInstanceAnalysisReference() {
    return centralCashAllocationInstanceAnalysisReference;
  }

  public void setCentralCashAllocationInstanceAnalysisReference(String centralCashAllocationInstanceAnalysisReference) {
    this.centralCashAllocationInstanceAnalysisReference = centralCashAllocationInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return centralCashAllocationInstanceAnalysisParameters
  **/

  public String getCentralCashAllocationInstanceAnalysisParameters() {
    return centralCashAllocationInstanceAnalysisParameters;
  }

  public void setCentralCashAllocationInstanceAnalysisParameters(String centralCashAllocationInstanceAnalysisParameters) {
    this.centralCashAllocationInstanceAnalysisParameters = centralCashAllocationInstanceAnalysisParameters;
  }


}

