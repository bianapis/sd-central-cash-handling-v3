package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceReport
 */
public class BQTrackingandAllocationRetrieveInputModelTrackingandAllocationInstanceReport   {
  private String trackingandAllocationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return trackingandAllocationInstanceReportReference
  **/

  public String getTrackingandAllocationInstanceReportReference() {
    return trackingandAllocationInstanceReportReference;
  }

  public void setTrackingandAllocationInstanceReportReference(String trackingandAllocationInstanceReportReference) {
    this.trackingandAllocationInstanceReportReference = trackingandAllocationInstanceReportReference;
  }


}

