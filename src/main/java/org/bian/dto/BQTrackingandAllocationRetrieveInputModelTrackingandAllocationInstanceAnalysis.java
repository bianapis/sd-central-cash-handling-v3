package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceAnalysis
 */
public class BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceAnalysis   {
  private String trackingandAllocationInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return trackingandAllocationInstanceAnalysisReference
  **/

  public String getTrackingandAllocationInstanceAnalysisReference() {
    return trackingandAllocationInstanceAnalysisReference;
  }

  public void setTrackingandAllocationInstanceAnalysisReference(String trackingandAllocationInstanceAnalysisReference) {
    this.trackingandAllocationInstanceAnalysisReference = trackingandAllocationInstanceAnalysisReference;
  }


}

