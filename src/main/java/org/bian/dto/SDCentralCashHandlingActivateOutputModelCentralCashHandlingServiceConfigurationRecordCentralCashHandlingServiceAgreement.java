package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement
 */
public class SDCentralCashHandlingActivateOutputModelCentralCashHandlingServiceConfigurationRecordCentralCashHandlingServiceAgreement   {
  private String centralCashHandlingServiceAgreementReference = null;

  private String centralCashHandlingServiceUserReference = null;

  private String centralCashHandlingServiceAgreementTermsandConditions = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the offered service agreement 
   * @return centralCashHandlingServiceAgreementReference
  **/

  public String getCentralCashHandlingServiceAgreementReference() {
    return centralCashHandlingServiceAgreementReference;
  }

  public void setCentralCashHandlingServiceAgreementReference(String centralCashHandlingServiceAgreementReference) {
    this.centralCashHandlingServiceAgreementReference = centralCashHandlingServiceAgreementReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the user covered by the contract 
   * @return centralCashHandlingServiceUserReference
  **/

  public String getCentralCashHandlingServiceUserReference() {
    return centralCashHandlingServiceUserReference;
  }

  public void setCentralCashHandlingServiceUserReference(String centralCashHandlingServiceUserReference) {
    this.centralCashHandlingServiceUserReference = centralCashHandlingServiceUserReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Terms and conditions covering the service agreement 
   * @return centralCashHandlingServiceAgreementTermsandConditions
  **/

  public String getCentralCashHandlingServiceAgreementTermsandConditions() {
    return centralCashHandlingServiceAgreementTermsandConditions;
  }

  public void setCentralCashHandlingServiceAgreementTermsandConditions(String centralCashHandlingServiceAgreementTermsandConditions) {
    this.centralCashHandlingServiceAgreementTermsandConditions = centralCashHandlingServiceAgreementTermsandConditions;
  }


}

