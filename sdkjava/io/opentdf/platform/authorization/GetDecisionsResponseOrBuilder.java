// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: authorization/authorization.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.authorization;

public interface GetDecisionsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:authorization.GetDecisionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .authorization.DecisionResponse decision_responses = 1 [json_name = "decisionResponses"];</code>
   */
  java.util.List<io.opentdf.platform.authorization.DecisionResponse> 
      getDecisionResponsesList();
  /**
   * <code>repeated .authorization.DecisionResponse decision_responses = 1 [json_name = "decisionResponses"];</code>
   */
  io.opentdf.platform.authorization.DecisionResponse getDecisionResponses(int index);
  /**
   * <code>repeated .authorization.DecisionResponse decision_responses = 1 [json_name = "decisionResponses"];</code>
   */
  int getDecisionResponsesCount();
  /**
   * <code>repeated .authorization.DecisionResponse decision_responses = 1 [json_name = "decisionResponses"];</code>
   */
  java.util.List<? extends io.opentdf.platform.authorization.DecisionResponseOrBuilder> 
      getDecisionResponsesOrBuilderList();
  /**
   * <code>repeated .authorization.DecisionResponse decision_responses = 1 [json_name = "decisionResponses"];</code>
   */
  io.opentdf.platform.authorization.DecisionResponseOrBuilder getDecisionResponsesOrBuilder(
      int index);
}