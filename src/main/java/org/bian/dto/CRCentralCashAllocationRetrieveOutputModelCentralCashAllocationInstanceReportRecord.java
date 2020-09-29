package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationRetrieveOutputModelCentralCashAllocationInstanceReportRecord
 */
public class CRCentralCashAllocationRetrieveOutputModelCentralCashAllocationInstanceReportRecord   {
  private String centralCashAllocationInstanceReportData = null;

  private String centralCashAllocationInstanceReportType = null;

  private Object centralCashAllocationInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return centralCashAllocationInstanceReportData
  **/

  public String getCentralCashAllocationInstanceReportData() {
    return centralCashAllocationInstanceReportData;
  }

  public void setCentralCashAllocationInstanceReportData(String centralCashAllocationInstanceReportData) {
    this.centralCashAllocationInstanceReportData = centralCashAllocationInstanceReportData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return centralCashAllocationInstanceReportType
  **/

  public String getCentralCashAllocationInstanceReportType() {
    return centralCashAllocationInstanceReportType;
  }

  public void setCentralCashAllocationInstanceReportType(String centralCashAllocationInstanceReportType) {
    this.centralCashAllocationInstanceReportType = centralCashAllocationInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return centralCashAllocationInstanceReport
  **/

  public Object getCentralCashAllocationInstanceReport() {
    return centralCashAllocationInstanceReport;
  }

  public void setCentralCashAllocationInstanceReport(Object centralCashAllocationInstanceReport) {
    this.centralCashAllocationInstanceReport = centralCashAllocationInstanceReport;
  }


}

