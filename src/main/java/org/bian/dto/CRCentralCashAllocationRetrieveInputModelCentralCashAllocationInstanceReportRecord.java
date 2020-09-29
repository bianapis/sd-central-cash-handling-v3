package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceReportRecord
 */
public class CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceReportRecord   {
  private String centralCashAllocationInstanceReportReference = null;

  private String centralCashAllocationInstanceReportType = null;

  private String centralCashAllocationInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return centralCashAllocationInstanceReportReference
  **/

  public String getCentralCashAllocationInstanceReportReference() {
    return centralCashAllocationInstanceReportReference;
  }

  public void setCentralCashAllocationInstanceReportReference(String centralCashAllocationInstanceReportReference) {
    this.centralCashAllocationInstanceReportReference = centralCashAllocationInstanceReportReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return centralCashAllocationInstanceReportParameters
  **/

  public String getCentralCashAllocationInstanceReportParameters() {
    return centralCashAllocationInstanceReportParameters;
  }

  public void setCentralCashAllocationInstanceReportParameters(String centralCashAllocationInstanceReportParameters) {
    this.centralCashAllocationInstanceReportParameters = centralCashAllocationInstanceReportParameters;
  }


}

