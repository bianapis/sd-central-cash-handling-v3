package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCentralCashAllocationControlInputModelCentralCashAllocationControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCentralCashAllocationControlInputModel
 */
public class CRCentralCashAllocationControlInputModel   {
  private String centralCashHandlingServicingSessionReference = null;

  private String centralCashAllocationInstanceReference = null;

  private String centralCashAllocationParameterType = null;

  private String centralCashAllocationSelectedOption = null;

  private String centralCashAllocationSubjectAreaType = null;

  private String centralCashAllocationDescription = null;

  private String centralCashAllocationRequest = null;

  private String centralCashAllocationSchedule = null;

  private String centralCashAllocationStatus = null;

  private String centralCashAllocationReference = null;

  private String centralCashAllocationCustomerReference = null;

  private String centralCashAllocationCurrency = null;

  private String centralCashAllocationRegulationReference = null;

  private String centralCashAllocationRegulationType = null;

  private String centralCashAllocationJurisdiction = null;

  private String centralCashAllocationBookingLocation = null;

  private String centralCashAllocationAccountType = null;

  private String centralCashAllocationAccountReference = null;

  private Object centralCashAllocationControlActionTaskRecord = null;

  private CRCentralCashAllocationControlInputModelCentralCashAllocationControlActionRequest centralCashAllocationControlActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return centralCashHandlingServicingSessionReference
  **/

  public String getCentralCashHandlingServicingSessionReference() {
    return centralCashHandlingServicingSessionReference;
  }

  public void setCentralCashHandlingServicingSessionReference(String centralCashHandlingServicingSessionReference) {
    this.centralCashHandlingServicingSessionReference = centralCashHandlingServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Central Cash Allocation instance 
   * @return centralCashAllocationInstanceReference
  **/

  public String getCentralCashAllocationInstanceReference() {
    return centralCashAllocationInstanceReference;
  }

  public void setCentralCashAllocationInstanceReference(String centralCashAllocationInstanceReference) {
    this.centralCashAllocationInstanceReference = centralCashAllocationInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value that distinguishes between allocation Options according to the optional business services defined within Central Cash Allocation 
   * @return centralCashAllocationParameterType
  **/

  public String getCentralCashAllocationParameterType() {
    return centralCashAllocationParameterType;
  }

  public void setCentralCashAllocationParameterType(String centralCashAllocationParameterType) {
    this.centralCashAllocationParameterType = centralCashAllocationParameterType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A selected optional business service for which resources are allocated 
   * @return centralCashAllocationSelectedOption
  **/

  public String getCentralCashAllocationSelectedOption() {
    return centralCashAllocationSelectedOption;
  }

  public void setCentralCashAllocationSelectedOption(String centralCashAllocationSelectedOption) {
    this.centralCashAllocationSelectedOption = centralCashAllocationSelectedOption;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification value, that distinguishes between the the type of resource allocated withing the Central Cash Allocation 
   * @return centralCashAllocationSubjectAreaType
  **/

  public String getCentralCashAllocationSubjectAreaType() {
    return centralCashAllocationSubjectAreaType;
  }

  public void setCentralCashAllocationSubjectAreaType(String centralCashAllocationSubjectAreaType) {
    this.centralCashAllocationSubjectAreaType = centralCashAllocationSubjectAreaType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Documentation of Central Cash Allocation 
   * @return centralCashAllocationDescription
  **/

  public String getCentralCashAllocationDescription() {
    return centralCashAllocationDescription;
  }

  public void setCentralCashAllocationDescription(String centralCashAllocationDescription) {
    this.centralCashAllocationDescription = centralCashAllocationDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Request to allocate CentralCash 
   * @return centralCashAllocationRequest
  **/

  public String getCentralCashAllocationRequest() {
    return centralCashAllocationRequest;
  }

  public void setCentralCashAllocationRequest(String centralCashAllocationRequest) {
    this.centralCashAllocationRequest = centralCashAllocationRequest;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Timetable to allocate CentralCash 
   * @return centralCashAllocationSchedule
  **/

  public String getCentralCashAllocationSchedule() {
    return centralCashAllocationSchedule;
  }

  public void setCentralCashAllocationSchedule(String centralCashAllocationSchedule) {
    this.centralCashAllocationSchedule = centralCashAllocationSchedule;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of Central Cash Allocation 
   * @return centralCashAllocationStatus
  **/

  public String getCentralCashAllocationStatus() {
    return centralCashAllocationStatus;
  }

  public void setCentralCashAllocationStatus(String centralCashAllocationStatus) {
    this.centralCashAllocationStatus = centralCashAllocationStatus;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the party who is involved in Central Cash Allocation 
   * @return centralCashAllocationReference
  **/

  public String getCentralCashAllocationReference() {
    return centralCashAllocationReference;
  }

  public void setCentralCashAllocationReference(String centralCashAllocationReference) {
    this.centralCashAllocationReference = centralCashAllocationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the customer who is involved in Central Cash Allocation 
   * @return centralCashAllocationCustomerReference
  **/

  public String getCentralCashAllocationCustomerReference() {
    return centralCashAllocationCustomerReference;
  }

  public void setCentralCashAllocationCustomerReference(String centralCashAllocationCustomerReference) {
    this.centralCashAllocationCustomerReference = centralCashAllocationCustomerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Currency  general-info: The curreny which is arranged/used for Central Cash Allocation 
   * @return centralCashAllocationCurrency
  **/

  public String getCentralCashAllocationCurrency() {
    return centralCashAllocationCurrency;
  }

  public void setCentralCashAllocationCurrency(String centralCashAllocationCurrency) {
    this.centralCashAllocationCurrency = centralCashAllocationCurrency;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the regulation which is defined for Central Cash Allocation 
   * @return centralCashAllocationRegulationReference
  **/

  public String getCentralCashAllocationRegulationReference() {
    return centralCashAllocationRegulationReference;
  }

  public void setCentralCashAllocationRegulationReference(String centralCashAllocationRegulationReference) {
    this.centralCashAllocationRegulationReference = centralCashAllocationRegulationReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A Classification that distinguishes between the regularity domains of Central Cash Allocation 
   * @return centralCashAllocationRegulationType
  **/

  public String getCentralCashAllocationRegulationType() {
    return centralCashAllocationRegulationType;
  }

  public void setCentralCashAllocationRegulationType(String centralCashAllocationRegulationType) {
    this.centralCashAllocationRegulationType = centralCashAllocationRegulationType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Reference to the jurisdiction that is assigned to Central Cash Allocation in case of legal dispute. 
   * @return centralCashAllocationJurisdiction
  **/

  public String getCentralCashAllocationJurisdiction() {
    return centralCashAllocationJurisdiction;
  }

  public void setCentralCashAllocationJurisdiction(String centralCashAllocationJurisdiction) {
    this.centralCashAllocationJurisdiction = centralCashAllocationJurisdiction;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement, are entered. 
   * @return centralCashAllocationBookingLocation
  **/

  public String getCentralCashAllocationBookingLocation() {
    return centralCashAllocationBookingLocation;
  }

  public void setCentralCashAllocationBookingLocation(String centralCashAllocationBookingLocation) {
    this.centralCashAllocationBookingLocation = centralCashAllocationBookingLocation;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of account which is linked to Central Cash Allocation 
   * @return centralCashAllocationAccountType
  **/

  public String getCentralCashAllocationAccountType() {
    return centralCashAllocationAccountType;
  }

  public void setCentralCashAllocationAccountType(String centralCashAllocationAccountType) {
    this.centralCashAllocationAccountType = centralCashAllocationAccountType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the account which is linked to Central Cash Allocation 
   * @return centralCashAllocationAccountReference
  **/

  public String getCentralCashAllocationAccountReference() {
    return centralCashAllocationAccountReference;
  }

  public void setCentralCashAllocationAccountReference(String centralCashAllocationAccountReference) {
    this.centralCashAllocationAccountReference = centralCashAllocationAccountReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return centralCashAllocationControlActionTaskRecord
  **/

  public Object getCentralCashAllocationControlActionTaskRecord() {
    return centralCashAllocationControlActionTaskRecord;
  }

  public void setCentralCashAllocationControlActionTaskRecord(Object centralCashAllocationControlActionTaskRecord) {
    this.centralCashAllocationControlActionTaskRecord = centralCashAllocationControlActionTaskRecord;
  }


  /**
   * Get centralCashAllocationControlActionRequest
   * @return centralCashAllocationControlActionRequest
  **/

  public CRCentralCashAllocationControlInputModelCentralCashAllocationControlActionRequest getCentralCashAllocationControlActionRequest() {
    return centralCashAllocationControlActionRequest;
  }

  public void setCentralCashAllocationControlActionRequest(CRCentralCashAllocationControlInputModelCentralCashAllocationControlActionRequest centralCashAllocationControlActionRequest) {
    this.centralCashAllocationControlActionRequest = centralCashAllocationControlActionRequest;
  }


}

