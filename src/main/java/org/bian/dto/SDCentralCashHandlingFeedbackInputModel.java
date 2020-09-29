package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingFeedbackInputModelCentralCashHandlingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingFeedbackInputModel
 */
public class SDCentralCashHandlingFeedbackInputModel   {
  private Object centralCashHandlingFeedbackActionTaskRecord = null;

  private SDCentralCashHandlingFeedbackInputModelCentralCashHandlingFeedbackActionRecord centralCashHandlingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The feedback service call consolidated processing record 
   * @return centralCashHandlingFeedbackActionTaskRecord
  **/

  public Object getCentralCashHandlingFeedbackActionTaskRecord() {
    return centralCashHandlingFeedbackActionTaskRecord;
  }

  public void setCentralCashHandlingFeedbackActionTaskRecord(Object centralCashHandlingFeedbackActionTaskRecord) {
    this.centralCashHandlingFeedbackActionTaskRecord = centralCashHandlingFeedbackActionTaskRecord;
  }


  /**
   * Get centralCashHandlingFeedbackActionRecord
   * @return centralCashHandlingFeedbackActionRecord
  **/

  public SDCentralCashHandlingFeedbackInputModelCentralCashHandlingFeedbackActionRecord getCentralCashHandlingFeedbackActionRecord() {
    return centralCashHandlingFeedbackActionRecord;
  }

  public void setCentralCashHandlingFeedbackActionRecord(SDCentralCashHandlingFeedbackInputModelCentralCashHandlingFeedbackActionRecord centralCashHandlingFeedbackActionRecord) {
    this.centralCashHandlingFeedbackActionRecord = centralCashHandlingFeedbackActionRecord;
  }


}

