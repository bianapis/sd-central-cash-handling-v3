package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis;
import org.bian.dto.SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis;
import org.bian.dto.SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecord
 */
public class SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecord   {
  private SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis centralCashHandlingActivityAnalysis = null;

  private SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis centralCashHandlingPerformanceAnalysis = null;

  private SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get centralCashHandlingActivityAnalysis
   * @return centralCashHandlingActivityAnalysis
  **/

  public SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis getCentralCashHandlingActivityAnalysis() {
    return centralCashHandlingActivityAnalysis;
  }

  public void setCentralCashHandlingActivityAnalysis(SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis centralCashHandlingActivityAnalysis) {
    this.centralCashHandlingActivityAnalysis = centralCashHandlingActivityAnalysis;
  }


  /**
   * Get centralCashHandlingPerformanceAnalysis
   * @return centralCashHandlingPerformanceAnalysis
  **/

  public SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis getCentralCashHandlingPerformanceAnalysis() {
    return centralCashHandlingPerformanceAnalysis;
  }

  public void setCentralCashHandlingPerformanceAnalysis(SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis centralCashHandlingPerformanceAnalysis) {
    this.centralCashHandlingPerformanceAnalysis = centralCashHandlingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCentralCashHandlingRetrieveOutputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

