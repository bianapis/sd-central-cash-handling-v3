package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis;
import org.bian.dto.SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis;
import org.bian.dto.SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecord
 */
public class SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecord   {
  private SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis centralCashHandlingActivityAnalysis = null;

  private SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis centralCashHandlingPerformanceAnalysis = null;

  private SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis = null;


  /**
   * Get centralCashHandlingActivityAnalysis
   * @return centralCashHandlingActivityAnalysis
  **/

  public SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis getCentralCashHandlingActivityAnalysis() {
    return centralCashHandlingActivityAnalysis;
  }

  public void setCentralCashHandlingActivityAnalysis(SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingActivityAnalysis centralCashHandlingActivityAnalysis) {
    this.centralCashHandlingActivityAnalysis = centralCashHandlingActivityAnalysis;
  }


  /**
   * Get centralCashHandlingPerformanceAnalysis
   * @return centralCashHandlingPerformanceAnalysis
  **/

  public SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis getCentralCashHandlingPerformanceAnalysis() {
    return centralCashHandlingPerformanceAnalysis;
  }

  public void setCentralCashHandlingPerformanceAnalysis(SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordCentralCashHandlingPerformanceAnalysis centralCashHandlingPerformanceAnalysis) {
    this.centralCashHandlingPerformanceAnalysis = centralCashHandlingPerformanceAnalysis;
  }


  /**
   * Get controlRecordPortfolioAnalysis
   * @return controlRecordPortfolioAnalysis
  **/

  public SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis getControlRecordPortfolioAnalysis() {
    return controlRecordPortfolioAnalysis;
  }

  public void setControlRecordPortfolioAnalysis(SDCentralCashHandlingRetrieveInputModelCentralCashHandlingRetrieveActionRecordControlRecordPortfolioAnalysis controlRecordPortfolioAnalysis) {
    this.controlRecordPortfolioAnalysis = controlRecordPortfolioAnalysis;
  }


}

