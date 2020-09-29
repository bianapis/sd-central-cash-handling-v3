package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceAnalysis;
import org.bian.dto.CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationRetrieveInputModel
 */
public class CRCentralCashAllocationRetrieveInputModel   {
  private Object centralCashAllocationRetrieveActionTaskRecord = null;

  private String centralCashAllocationRetrieveActionRequest = null;

  private CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceReportRecord centralCashAllocationInstanceReportRecord = null;

  private CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceAnalysis centralCashAllocationInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return centralCashAllocationRetrieveActionTaskRecord
  **/

  public Object getCentralCashAllocationRetrieveActionTaskRecord() {
    return centralCashAllocationRetrieveActionTaskRecord;
  }

  public void setCentralCashAllocationRetrieveActionTaskRecord(Object centralCashAllocationRetrieveActionTaskRecord) {
    this.centralCashAllocationRetrieveActionTaskRecord = centralCashAllocationRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return centralCashAllocationRetrieveActionRequest
  **/

  public String getCentralCashAllocationRetrieveActionRequest() {
    return centralCashAllocationRetrieveActionRequest;
  }

  public void setCentralCashAllocationRetrieveActionRequest(String centralCashAllocationRetrieveActionRequest) {
    this.centralCashAllocationRetrieveActionRequest = centralCashAllocationRetrieveActionRequest;
  }


  /**
   * Get centralCashAllocationInstanceReportRecord
   * @return centralCashAllocationInstanceReportRecord
  **/

  public CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceReportRecord getCentralCashAllocationInstanceReportRecord() {
    return centralCashAllocationInstanceReportRecord;
  }

  public void setCentralCashAllocationInstanceReportRecord(CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceReportRecord centralCashAllocationInstanceReportRecord) {
    this.centralCashAllocationInstanceReportRecord = centralCashAllocationInstanceReportRecord;
  }


  /**
   * Get centralCashAllocationInstanceAnalysis
   * @return centralCashAllocationInstanceAnalysis
  **/

  public CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceAnalysis getCentralCashAllocationInstanceAnalysis() {
    return centralCashAllocationInstanceAnalysis;
  }

  public void setCentralCashAllocationInstanceAnalysis(CRCentralCashAllocationRetrieveInputModelCentralCashAllocationInstanceAnalysis centralCashAllocationInstanceAnalysis) {
    this.centralCashAllocationInstanceAnalysis = centralCashAllocationInstanceAnalysis;
  }


}

