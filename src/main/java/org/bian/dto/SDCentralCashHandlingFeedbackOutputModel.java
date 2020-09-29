package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.SDCentralCashHandlingFeedbackOutputModelCentralCashHandlingFeedbackActionRecord;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingFeedbackOutputModel
 */
public class SDCentralCashHandlingFeedbackOutputModel   {
  private String centralCashHandlingFeedbackActionTaskReference = null;

  private Object centralCashHandlingFeedbackActionTaskRecord = null;

  private SDCentralCashHandlingFeedbackOutputModelCentralCashHandlingFeedbackActionRecord centralCashHandlingFeedbackActionRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a feedback service call 
   * @return centralCashHandlingFeedbackActionTaskReference
  **/

  public String getCentralCashHandlingFeedbackActionTaskReference() {
    return centralCashHandlingFeedbackActionTaskReference;
  }

  public void setCentralCashHandlingFeedbackActionTaskReference(String centralCashHandlingFeedbackActionTaskReference) {
    this.centralCashHandlingFeedbackActionTaskReference = centralCashHandlingFeedbackActionTaskReference;
  }


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

  public SDCentralCashHandlingFeedbackOutputModelCentralCashHandlingFeedbackActionRecord getCentralCashHandlingFeedbackActionRecord() {
    return centralCashHandlingFeedbackActionRecord;
  }

  public void setCentralCashHandlingFeedbackActionRecord(SDCentralCashHandlingFeedbackOutputModelCentralCashHandlingFeedbackActionRecord centralCashHandlingFeedbackActionRecord) {
    this.centralCashHandlingFeedbackActionRecord = centralCashHandlingFeedbackActionRecord;
  }


}

