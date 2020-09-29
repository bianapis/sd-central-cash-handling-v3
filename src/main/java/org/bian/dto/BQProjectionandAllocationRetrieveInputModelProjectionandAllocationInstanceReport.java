package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceReport
 */
public class BQProjectionandAllocationRetrieveInputModelProjectionandAllocationInstanceReport   {
  private String projectionandAllocationInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return projectionandAllocationInstanceReportReference
  **/

  public String getProjectionandAllocationInstanceReportReference() {
    return projectionandAllocationInstanceReportReference;
  }

  public void setProjectionandAllocationInstanceReportReference(String projectionandAllocationInstanceReportReference) {
    this.projectionandAllocationInstanceReportReference = projectionandAllocationInstanceReportReference;
  }


}

